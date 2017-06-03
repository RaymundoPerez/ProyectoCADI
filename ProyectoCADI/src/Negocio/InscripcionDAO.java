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

/**
 *
 * @author Irdevelo
 */
public class InscripcionDAO implements IInscripcionDAO {

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

        } finally {
            conexionBD.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public InformacionInscripcion elimnarInscripcion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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

        } finally {
            conexionBD.cerrarConexion();
        }
        return existeInscripcion;
    }

    @Override
    public void buscarInscripcion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
