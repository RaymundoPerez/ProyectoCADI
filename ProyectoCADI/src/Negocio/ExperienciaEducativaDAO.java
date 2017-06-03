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
import java.util.ArrayList;

/**
 *
 * @author Irdevelo
 */
public class ExperienciaEducativaDAO implements IExperienciaEducativaDAO {

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

    @Override
    public ArrayList<ExperienciaEducativa> obtenerExperienciasEducativasUsuarioAutonomo(String matricula) {
        ArrayList<ExperienciaEducativa> experienciasEducativas = new ArrayList<>();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsultaExperienciaEducativa;
        String consultaSQLExperienciaEducativa = "select EXPERIENCIAEDUCATIVA.nrc, "
                + "EXPERIENCIAEDUCATIVA.nombreExperienciaEducativa from USUARIOAUTONOMO,INSCRIPCION,"
                + "SECCIONCURSO,CURSO,EXPERIENCIAEDUCATIVA where USUARIOAUTONOMO.matricula=? and "
                + "USUARIOAUTONOMO.matricula = INSCRIPCION.matricula and"
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

        } finally {
            conexionBD.cerrarConexion();
        }
        return experienciasEducativas;
    }

}
