package Negocio;

import Datos.ConexionSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Permite realizar todas las acciones vinculadas con la clase
 * UsuarioAutonomo.
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public class UsuarioAutonomoDAO implements IUsuarioAutonomoDAO {

    /**
     * Permite crear un nuevo UsuarioAutonomo.
     *
     * @param usuarioAutonomo
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos
     * @return Un objeto de la clase InformacionUsuarioAutonomo.
     */
    @Override
    public InformacionUsuarioAutonomo crearUsuarioAutonomo(UsuarioAutonomo usuarioAutonomo) {
        InformacionUsuarioAutonomo mensaje = InformacionUsuarioAutonomo.usuarioAutonomoNoCreado;
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "insert into USUARIOAUTONOMO values(?,?,?,?,?,?,?)";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, usuarioAutonomo.getNombres());
            sentenciaConsulta.setString(2, usuarioAutonomo.getApellidos());
            sentenciaConsulta.setString(3, usuarioAutonomo.getProgramaEducativo());
            sentenciaConsulta.setString(4, usuarioAutonomo.getCorreoElectronico());
            sentenciaConsulta.setDate(5, usuarioAutonomo.getFechaNac());
            sentenciaConsulta.setString(6, usuarioAutonomo.getMatricula());
            sentenciaConsulta.setString(7, "z" + usuarioAutonomo.getMatricula());
            sentenciaConsulta.executeUpdate();
            mensaje = InformacionUsuarioAutonomo.usuarioAutonomoCreadoCorrectamente;
        } catch (SQLException exception) {
            Logger.getLogger(UsuarioAutonomoDAO.class.getName()).log(Level.SEVERE, null, exception);
        } finally {
            conexionBD.cerrarConexion();
        }
        return mensaje;
    }

    /**
     * Permite obtener la inforamción de un UsuarioAutonomo.
     *
     * @param nombreUsuario
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos
     * @return Un objeto de la clase UsuarioAutonomo.
     */
    @Override
    public UsuarioAutonomo obtenerUsuarioAutonomo(String nombreUsuario) {
        UsuarioAutonomo usuarioAutonomo = new UsuarioAutonomo();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select *from USUARIOAUTONOMO where nombreUsuario=?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, nombreUsuario);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            resultadoConsulta.next();
            usuarioAutonomo.setNombres(resultadoConsulta.getString(1));
            usuarioAutonomo.setApellidos(resultadoConsulta.getString(2));
            usuarioAutonomo.setProgramaEducativo(resultadoConsulta.getString(3));
            usuarioAutonomo.setCorreoElectronico(resultadoConsulta.getString(4));
            usuarioAutonomo.setFechaNac(resultadoConsulta.getDate(5));
            usuarioAutonomo.setMatricula(resultadoConsulta.getString(6));
        } catch (SQLException exception) {
            Logger.getLogger(UsuarioAutonomoDAO.class.getName()).log(Level.SEVERE, null, exception);
        } finally {
            conexionBD.cerrarConexion();
        }
        return usuarioAutonomo;
    }

    /**
     * Permite validar la existencia de un UsuarioAutonomo.
     *
     * @param matricula
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos
     * @return Un valor verdadero si el usuario existe o un valor falso si es lo
     * contrario.
     */
    @Override
    public boolean validarExistenciaUsuarioAutonomo(String matricula) {
        boolean existeUsuarioAutonomo = false;
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select *from USUARIOAUTONOMO where matricula=?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, matricula);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            existeUsuarioAutonomo = resultadoConsulta.next();
        } catch (SQLException exception) {
            Logger.getLogger(UsuarioAutonomoDAO.class.getName()).log(Level.SEVERE, null, exception);
        } finally {
            conexionBD.cerrarConexion();
        }
        return existeUsuarioAutonomo;
    }

    /**
     * Permite obtener todos los UsuariosAutonomos inscritos en alguna
     * ExperienciaEducativa.
     *
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos
     * @return Una lista de objetos de la clase UsuarioAutonomo.
     */
    @Override
    public ArrayList<UsuarioAutonomo> obtenerTodosLosAlumnosInscritos() {
        ArrayList<UsuarioAutonomo> usuariosAutonomos = new ArrayList<>();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select USUARIOAUTONOMO.nombres, USUARIOAUTONOMO.apellidos, "
                + "USUARIOAUTONOMO.matricula,EXPERIENCIAEDUCATIVA.nombreExperienciaEducativa "
                + "from USUARIOAUTONOMO,EXPERIENCIAEDUCATIVA,INSCRIPCION, SECCIONCURSO,CURSO, MODULO where USUARIOAUTONOMO.matricula = INSCRIPCION.matricula "
                + "and INSCRIPCION.claveSeccion = SECCIONCURSO.claveSeccion and SECCIONCURSO.idCurso = CURSO.idCurso and CURSO.nrc = EXPERIENCIAEDUCATIVA.nrc;";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            while (resultadoConsulta.next()) {
                UsuarioAutonomo usuario = new UsuarioAutonomo();
                usuario.setNombres(resultadoConsulta.getString(1));
                usuario.setApellidos(resultadoConsulta.getString(2));
                usuario.setMatricula(resultadoConsulta.getString(3));
                usuario.setExperienciaEducativa(resultadoConsulta.getString(4));
                usuariosAutonomos.add(usuario);
            }
        } catch (SQLException exception) {
            Logger.getLogger(UsuarioAutonomoDAO.class.getName()).log(Level.SEVERE, null, exception);
        } finally {
            conexionBD.cerrarConexion();
        }
        return usuariosAutonomos;
    }

    /**
     * Permite validar la existencia de un UsuarioAutonomo
     *
     * @param matricula
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos
     * @return Un valor verdadero si el UsuarioAutonomo ya está insrito o un
     * valor falso de lo contrario.
     */
    @Override
    public boolean validarExistenciaUsuarioAutonomoConInscripcion(String matricula) {
        boolean usuarioExistente = false;
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select *from USUARIOAUTONOMO where matricula=?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, matricula);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            usuarioExistente = resultadoConsulta.next();
        } catch (SQLException exception) {
            Logger.getLogger(UsuarioAutonomoDAO.class.getName()).log(Level.SEVERE, null, exception);
        } finally {
            conexionBD.cerrarConexion();
        }
        return usuarioExistente;

    }

    /**
     * Permite obtener la información de un UsuarioAutonomo dada su matrícula.
     *
     * @param matricula
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos
     * @return Un objeto de la clase UsuarioAutonomo.
     */
    @Override
    public UsuarioAutonomo obtenerUsuarioAutonomoPorMatricula(String matricula) {
        UsuarioAutonomo usuarioAutonomo = new UsuarioAutonomo();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select *from USUARIOAUTONOMO where matricula=?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, matricula);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            resultadoConsulta.next();
            usuarioAutonomo.setNombres(resultadoConsulta.getString(1));
            usuarioAutonomo.setApellidos(resultadoConsulta.getString(2));
            usuarioAutonomo.setProgramaEducativo(resultadoConsulta.getString(3));
            usuarioAutonomo.setCorreoElectronico(resultadoConsulta.getString(4));
            usuarioAutonomo.setFechaNac(resultadoConsulta.getDate(5));
            usuarioAutonomo.setMatricula(resultadoConsulta.getString(6));
        } catch (SQLException exception) {
            Logger.getLogger(UsuarioAutonomoDAO.class.getName()).log(Level.SEVERE, null, exception);
        } finally {
            conexionBD.cerrarConexion();
        }
        return usuarioAutonomo;

    }
}
