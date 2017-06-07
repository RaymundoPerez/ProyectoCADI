package Negocio;

import Datos.ConexionSQL;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Permite realizar todas las acciones vinculadas con Empleado.
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public class EmpleadoDAO implements IEmpleadoDAO {

    /**
     * Permite obtener la informacion de un empleado.
     *
     * @param nombreUsuario nombre del Empleado.
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos.
     * @return Un Objeto de la clase Empleado.
     */
    @Override
    public Empleado obtenerEmpleado(String nombreUsuario) {
        Empleado empleado = new Empleado();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select *from EMPLEADO where nombreUsuario=?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, nombreUsuario);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            resultadoConsulta.next();
            empleado.setNoPersonal(resultadoConsulta.getString(1));
            empleado.setNombres(resultadoConsulta.getString(2));
            empleado.setApellidos(resultadoConsulta.getString(3));
            empleado.setNombreUsuario(resultadoConsulta.getString(4));
        } catch (SQLException exception) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, exception);
        } finally {
            conexionBD.cerrarConexion();
        }

        return empleado;
    }

    /**
     * Permite obtener el nombre de un empleado.
     *
     * @param noPersonal numero de personal del Empleado
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos.
     * @return El nombre del empleado.
     */
    @Override
    public String obtenerNombreEmpleado(String noPersonal) {
        String nombreEmpleado = "";
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select nombres,apellidos from EMPLEADO where noPersonal=?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, noPersonal);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            resultadoConsulta.next();
            nombreEmpleado = resultadoConsulta.getString(1) + " " + resultadoConsulta.getString(2);
        } catch (SQLException exception) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, exception);
        } finally {
            conexionBD.cerrarConexion();
        }

        return nombreEmpleado;
    }

    /**
     * Permite obtener a partir de una hora, un idioma y una fecha los asesores
     * dsponibles.
     *
     * @param horaInicio hora inicio de la actividad
     * @param idIdioma idioma del asesor.
     * @param fecha fecha de la activiad.
     * @param horaFin hora fin de la actividad.
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos.
     * @return Una lista con objetos de la clase Empleado.
     */
    @Override
    public ArrayList<Empleado> obtenerAsesoresDisponibles(Time horaInicio, Time horaFin, String idIdioma, Date fecha) {
        ArrayList<Empleado> asesoresDisponibles = new ArrayList();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select empleado.noPersonal, empleado.nombres, empleado.apellidos "
                + "from empleado where empleado.noPersonal not in(select publicacionactividad.noPersonal "
                + "from publicacionactividad where (? = horaInicio "
                        + "or (?>horaInicio and ? < horaFin) or (?<=horafin and ?>horaInicio) "
                        + "or (?<horaFin and ?>horaFin)) and ? = fecha) and idIdioma = ?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setTime(1,horaInicio);
                sentenciaConsulta.setTime(2,horaInicio);
                sentenciaConsulta.setTime(3,horaInicio);
                sentenciaConsulta.setTime(4,horaFin);
                sentenciaConsulta.setTime(5,horaFin);
                sentenciaConsulta.setTime(6,horaInicio);
                sentenciaConsulta.setTime(7,horaFin);
                sentenciaConsulta.setDate(8, fecha);
            sentenciaConsulta.setString(9, idIdioma);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            while (resultadoConsulta.next()) {
                Empleado empleado = new Empleado();
                empleado.setNoPersonal(resultadoConsulta.getString(1));
                empleado.setNombres(resultadoConsulta.getString(2));
                empleado.setApellidos(resultadoConsulta.getString(3));
                asesoresDisponibles.add(empleado);
            }
        } catch (SQLException exception) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, exception);
        } finally {
            conexionBD.cerrarConexion();
        }

        return asesoresDisponibles;
    }

}
