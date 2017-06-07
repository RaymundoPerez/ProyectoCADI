package Negocio;

import Datos.ConexionSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Permite realizar todas las acciones vinculadas a <Actividad>.
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public class ActividadDAO implements IActividadDAO {

    /**
     * Permite obtener una Actividad a partir del ID de una sección.
     *
     * @author Irvin Vera.
     * @author Alonso Lora.
     * @author Raymundo Pérez.
     * @param idSeccion.
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos.
     * @return Una lista de objetos de la clase <Actividad>
     */
    @Override
    public ArrayList<Actividad> obtenerActividadPorSeccion(String idSeccion) {
        ArrayList<Actividad> actividades = new ArrayList();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select idActividad, nombreActividad from Actividad where idSeccion = ?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, idSeccion);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            while (resultadoConsulta.next()) {
                Actividad actividad = new Actividad();
                actividad.setIdActividad(resultadoConsulta.getString(1));
                actividad.setNombreActividad(resultadoConsulta.getString(2));
                actividades.add(actividad);
            }

        } catch (SQLException exception) {

        } finally {
            conexionBD.cerrarConexion();
        }

        return actividades;
    }

}
