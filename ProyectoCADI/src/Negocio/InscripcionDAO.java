package Negocio;

import Datos.ConexionSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Permite realizar todas las acciones vinculadas con Inscripción.
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public class InscripcionDAO implements IInscripcionDAO {

    /**
     * Permite inscribir a un UsuarioAutonomo en algun curso.
     *
     * @param matricula clave del UsuarioAutonomo
     * @param claveSeccionCurso seccion del curso en la que se inscribira el usuario.
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos.
     * @return Un objeto de la clase InformacionInscripcion
     */
    @Override
    public InformacionInscripcion crearInscripcion(String matricula, String claveSeccionCurso) {
        InformacionInscripcion mensaje = InformacionInscripcion.inscripcionNoCreada;
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "insert into INSCRIPCION values(1,NULL,?,?)";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, matricula);
            sentenciaConsulta.setString(2, claveSeccionCurso);
            sentenciaConsulta.executeUpdate();
            mensaje = InformacionInscripcion.inscripcionCreadaCorrectamente;
        } catch (SQLException exception) {
             Logger.getLogger(InscripcionDAO.class.getName()).log(Level.SEVERE, null, exception);
        } finally {
            conexionBD.cerrarConexion();
        }
        return mensaje;
    }

    /**
     * Permite validar si un UsuarioAutonomo está inscrito en una Experiencia
     * Educativa.
     *
     * @param matricula clave del UsuarioAutonomo
     * @param claveSeccionCurso seccion del curso a la que se desea inscribir al usuario autonomo.
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos.
     * @return Un valor verdadero si existe la inscripción o un valor falso si
     * no existe la inscripción.
     */
    @Override
    public boolean validarExistenciaInscripcion(String matricula, String claveSeccionCurso) {
        boolean existeInscripcion = false;
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select *from INSCRIPCION where matricula=? and claveSeccion=?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, matricula);
            sentenciaConsulta.setString(2, claveSeccionCurso);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            existeInscripcion = resultadoConsulta.next();
        } catch (SQLException exception) {
            Logger.getLogger(InscripcionDAO.class.getName()).log(Level.SEVERE, null, exception);
        } finally {
            conexionBD.cerrarConexion();
        }
        return existeInscripcion;
    }

    /**
     * Permite buscar la clave secciòn por de una SeccionCurso por
     * Inscripcion
     *
     * @param nrc clave de la materia.
     * @param matricula clave del UsuarioAutonomo
     * @return la claveSeccion del curso
     */
    @Override
    public String buscarSeccionPorInscripcion(String nrc, String matricula) {
        String claveSeccion = null;
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select SECCIONCURSO.claveSeccion from SECCIONCURSO,CURSO,INSCRIPCION where ? = CURSO.nrc and CURSO.idCurso = SECCIONCURSO.idCurso "
                + "and ? = inscripcion.matricula and inscripcion.claveSeccion = seccioncurso.claveSeccion";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, nrc);
            sentenciaConsulta.setString(2, matricula);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            resultadoConsulta.next();
            claveSeccion = resultadoConsulta.getString(1);
        } catch (SQLException exception) {
            Logger.getLogger(InscripcionDAO.class.getName()).log(Level.SEVERE, null, exception);
        } finally {
            conexionBD.cerrarConexion();
        }
        return claveSeccion;
    }

    /**
     * Permite eliminar una Inscripción.
     *
     * @param matricula clave del UsuarioAutonomo.
     * @param claveSeccion clave de la Seccion.
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos.
     * @return Un objeto de tipo InformacionInscripcion.
     */
    @Override
    public InformacionInscripcion eliminarInscripcion(String matricula, String claveSeccion) {
        InformacionInscripcion mensaje = InformacionInscripcion.inscripcionNoEliminada;
        int resultadoConsulta;
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "DELETE from INSCRIPCION where matricula=? and claveSeccion=?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, matricula);
            sentenciaConsulta.setString(2, claveSeccion);
            resultadoConsulta = sentenciaConsulta.executeUpdate();

            if (resultadoConsulta == 1) {
                mensaje = InformacionInscripcion.inscripcionEliminadaCorrectamente;
            }

        } catch (SQLException exception) {
            Logger.getLogger(InscripcionDAO.class.getName()).log(Level.SEVERE, null, exception);
        } finally {
            conexionBD.cerrarConexion();
        }
        return mensaje;
    }

}
