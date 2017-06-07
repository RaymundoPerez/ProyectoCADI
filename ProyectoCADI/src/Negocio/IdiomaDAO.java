package Negocio;

import Datos.ConexionSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Permite realizar todas las acciones vinculadas con Idioma.
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public class IdiomaDAO implements IIdiomaDAO {

    /**
     * Permite obtener todos los idiomas que se imparten en el Centro de
     * idiomas.
     *
     * @return Una lista con Objetos de la clase Idioma
     */
    @Override
    public ArrayList<Idioma> obtenerTodosLosIdiomas() {
        ArrayList<Idioma> idiomas = new ArrayList();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select * from idioma";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            while (resultadoConsulta.next()) {
                Idioma idioma = new Idioma();
                idioma.setIdIdioma(resultadoConsulta.getString(1));
                idioma.setNombreIdioma(resultadoConsulta.getString(2));
                idiomas.add(idioma);
            }

        } catch (SQLException exception) {
             Logger.getLogger(IdiomaDAO.class.getName()).log(Level.SEVERE, null, exception);
        } finally {
            conexionBD.cerrarConexion();
        }

        return idiomas;
    }

}
