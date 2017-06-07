package Negocio;

import Datos.ConexionSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Permite realizar todas las acciones que están vinculadas con las <Experiencia
 * Educativa>.
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public class ExperienciaEducativaDAO implements IExperienciaEducativaDAO {

    /**
     * Permite obtener todas las experiencias educativas que se se encuentran
     * registradas en el sistema
     *
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos.
     * @return Una lista de Experiencias Educativas.
     */
    @Override
    public String[] obtenerTodasLasExperienciasEducativas() {

        ArrayList<String> experienciasEducativas = new ArrayList<>();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String[] arregloExperienciasEducativas = null;
        String consultaSQL = "select nombreExperienciaEducativa from EXPERIENCIAEDUCATIVA";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            while (resultadoConsulta.next()) {
                experienciasEducativas.add(resultadoConsulta.getString(1));
            }

            arregloExperienciasEducativas = new String[experienciasEducativas.size()];
            arregloExperienciasEducativas = experienciasEducativas.toArray(arregloExperienciasEducativas);

        } catch (SQLException exception) {

        } finally {
            conexionBD.cerrarConexion();
        }
        return arregloExperienciasEducativas;
    }

    /**
     * Permite obtener las experiencias eduativas en las que está inscrito un
     * Usuario Autónomo dada su matrícula.
     *
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos.
     * @param matricula
     * @return Una lista de objetos de la clase <ExperienciaEducativa>.
     */
    @Override
    public ArrayList<ExperienciaEducativa> obtenerExperienciasEducativasUsuarioAutonomo(String matricula) {
        ArrayList<ExperienciaEducativa> experienciasEducativas = new ArrayList<>();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsultaExperienciaEducativa;
        String consultaSQLExperienciaEducativa = "select EXPERIENCIAEDUCATIVA.nrc, "
                + "EXPERIENCIAEDUCATIVA.nombreExperienciaEducativa from USUARIOAUTONOMO,INSCRIPCION,"
                + "SECCIONCURSO,CURSO,EXPERIENCIAEDUCATIVA where USUARIOAUTONOMO.matricula=? and "
                + "USUARIOAUTONOMO.matricula = INSCRIPCION.matricula and "
                + "INSCRIPCION.claveSeccion = SECCIONCURSO.claveSeccion and SECCIONCURSO.idCurso = CURSO.idCurso and "
                + "CURSO.nrc= EXPERIENCIAEDUCATIVA.nrc";
        try {
            sentenciaConsultaExperienciaEducativa = conexionBD.getConexion().prepareStatement(consultaSQLExperienciaEducativa);
            sentenciaConsultaExperienciaEducativa.setString(1, matricula);
            ResultSet resultadoConsultaExperienciaEducativa = sentenciaConsultaExperienciaEducativa.executeQuery();
            while (resultadoConsultaExperienciaEducativa.next()) {
                ExperienciaEducativa experienciaEducativa = new ExperienciaEducativa();
                experienciaEducativa.setNrc(resultadoConsultaExperienciaEducativa.getString(1));
                experienciaEducativa.setNombreExperienciaEducativa(resultadoConsultaExperienciaEducativa.getString(2));
                experienciasEducativas.add(experienciaEducativa);
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        } finally {
            conexionBD.cerrarConexion();
        }
        return experienciasEducativas;
    }

    /**
     * Permite obtener las experiencias educativas que tiene creadas un idioma.
     *
     * @param idIdioma
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos.
     * @return Una lista de objetos de la clase <ExperienciaEducativa>.
     */
    @Override
    public ArrayList<ExperienciaEducativa> obtenerExperienciaEducativaPorIdioma(String idIdioma) {
        ArrayList<ExperienciaEducativa> experienciasEducativas = new ArrayList();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select nrc,nombreExperienciaEducativa from EXPERIENCIAEDUCATIVA where idIdioma = ?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, idIdioma);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            while (resultadoConsulta.next()) {
                ExperienciaEducativa experienciaEducativa = new ExperienciaEducativa();
                experienciaEducativa.setNrc(resultadoConsulta.getString(1));
                experienciaEducativa.setNombreExperienciaEducativa(resultadoConsulta.getString(2));
                experienciasEducativas.add(experienciaEducativa);
            }

        } catch (SQLException exception) {

        } finally {
            conexionBD.cerrarConexion();
        }
        return experienciasEducativas;
    }

}
