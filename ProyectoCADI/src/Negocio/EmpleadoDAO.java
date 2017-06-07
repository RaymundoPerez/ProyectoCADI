package Negocio;

import Datos.ConexionSQL;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

/**
 * Permite realizar todas las acciones vinculadas con <Empleado>.
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public class EmpleadoDAO implements IEmpleadoDAO {

    /**
     * Permite obtener la informacion de un empleado.
     *
     * @param nombreUsuario
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos.
     * @return Un Objeto de la clase <Empleado>.
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

        } finally {
            conexionBD.cerrarConexion();
        }

        return empleado;
    }

    /**
     * Permite obtener el nombre de un empleado.
     *
     * @param noPersonal
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

        } finally {
            conexionBD.cerrarConexion();
        }

        return nombreEmpleado;
    }

    /**
     * Permite obtener a partir de una hora, un idioma y una fecha los asesores
     * dsponibles.
     *
     * @param hora
     * @param idIdioma
     * @param fecha
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos.
     * @return Una lista con objetos de la clase <Empleado>.
     */
    @Override
    public ArrayList<Empleado> obtenerEmpleadosDisponibles(Time hora, String idIdioma, Date fecha) {
        ArrayList<Empleado> asesoresDisponibles = new ArrayList();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select empleado.noPersonal, empleado.nombres, empleado.apellidos "
                + "from empleado where empleado.noPersonal not in(select publicacionactividad.noPersonal "
                + "from publicacionactividad, empleado where empleado.noPersonal = publicacionactividad.noPersonal"
                + " and ? = publicacionactividad.horaInicio and fecha = ?) and idIdioma = ?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setTime(1, hora);
            sentenciaConsulta.setDate(2, fecha);
            sentenciaConsulta.setString(3, idIdioma);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            while (resultadoConsulta.next()) {
                Empleado empleado = new Empleado();
                empleado.setNoPersonal(resultadoConsulta.getString(1));
                empleado.setNombres(resultadoConsulta.getString(2));
                empleado.setApellidos(resultadoConsulta.getString(3));
                asesoresDisponibles.add(empleado);
            }
        } catch (SQLException exception) {

        } finally {
            conexionBD.cerrarConexion();
        }

        return asesoresDisponibles;
    }

}
