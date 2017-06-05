/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.ConexionSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author raymu
 */
public class UsuarioAutonomoDAO implements IUsuarioAutonomoDAO {

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

        } finally {
            conexionBD.cerrarConexion();
        }
        return mensaje;
    }

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

        } finally {
            conexionBD.cerrarConexion();
        }
        return usuarioAutonomo;
    }

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

        } finally {
            conexionBD.cerrarConexion();
        }
        return existeUsuarioAutonomo;
    }

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

        } finally {
            conexionBD.cerrarConexion();
        }
        return usuariosAutonomos;
    }

    
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

        } finally {
            conexionBD.cerrarConexion();
        }
        return usuarioExistente;

    }

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

        } finally {
            conexionBD.cerrarConexion();
        }
        return usuarioAutonomo;

    }
}
