package Negocio;

import Datos.ConexionSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Permite realizar las acciones que están vinculadas con Modulo.
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public class ModuloDAO implements IModuloDAO {

    /**
     * Permite obtener los Módulos por Experiencia Educativa.
     * @param NRC clave de la experiencia educativa.
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos
     * @return Una lista de Objetos de tipo Modulo.
     */
    @Override
    public ArrayList<Modulo> obtenerModulosPorEE(String NRC) {
        ArrayList<Modulo> modulos = new ArrayList();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select idModulo, nombreModulo from MODULO where nrc = ?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, NRC);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            while (resultadoConsulta.next()) {
                Modulo modulo = new Modulo();
                modulo.setIdModulo(resultadoConsulta.getString(1));
                modulo.setNombreModulo(resultadoConsulta.getString(2));
                modulos.add(modulo);
            }

        } catch (SQLException exception) {
            Logger.getLogger(ModuloDAO.class.getName()).log(Level.SEVERE, null, exception);
        } finally {
            conexionBD.cerrarConexion();
        }
        return modulos;
    }

}
