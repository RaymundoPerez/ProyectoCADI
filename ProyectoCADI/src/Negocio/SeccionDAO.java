package Negocio;

import Datos.ConexionSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Permite realizar las acciones vinculadas con la clase Seccion.
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public class SeccionDAO implements ISeccionDAO {

    /**
     * Permite obtener secciones dado un idModulo
     *
     * @param idModulo
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos
     * @return Una lista de objetos de la clase Seccion.
     */

    @Override
    public ArrayList<Seccion> obtenerSeccionPorModulo(String idModulo) {
        ArrayList<Seccion> secciones = new ArrayList();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select idSeccion, nombreSeccion from SECCION where idModulo = ?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, idModulo);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            while (resultadoConsulta.next()) {
                Seccion seccion = new Seccion();
                seccion.setIdSeccion(resultadoConsulta.getString(1));
                seccion.setNombreSeccion(resultadoConsulta.getString(2));
                secciones.add(seccion);
            }

        } catch (SQLException exception) {
            Logger.getLogger(SeccionDAO.class.getName()).log(Level.SEVERE, null, exception);
        } finally {
            conexionBD.cerrarConexion();
        }

        return secciones;
    }

}
