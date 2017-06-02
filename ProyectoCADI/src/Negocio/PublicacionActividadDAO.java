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
 * @author raymu
 */
public class PublicacionActividadDAO implements IPublicacionActividadDAO{

    @Override
    public ArrayList<PublicacionActividad> mostrarActividadesDisponiblesUsuarioAutonomo(String matricula){
        ArrayList<PublicacionActividad> publicacionesActividades = new ArrayList();
        ArrayList<String> nrcsExperienciasEducativas = new ArrayList();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsultaExperienciaEducativa;
        String consultaSQLExperienciaEducativa = "select ExperienciaEducativa.nrc from USUARIOAUTONOMO,INSCRIPCION,"
                + "SECCIONCURSO,CURSO,EXPERIENCIAEDUCATIVA where USUARIOAUTONOMO.matricula=? and "
                + "USUARIOAUTONOMO.matricula = INSCRIPCION.matricula and"
                + "INSCRIPCION.claveSeccion = SECCIONCURSO.claveSeccion and SECCIONCURSO.idCurso = CURSO.idCurso and "
                + "CURSO.nrc= EXPERIENCIAEDUCATIVA.nrc";
        try{
            sentenciaConsultaExperienciaEducativa = conexionBD.getConexion().prepareStatement(consultaSQLExperienciaEducativa);
            sentenciaConsultaExperienciaEducativa.setString(1, matricula);
            ResultSet resultadoConsultaExperienciaEducativa = sentenciaConsultaExperienciaEducativa.executeQuery();
            while(resultadoConsultaExperienciaEducativa.next()){
                String nrcExperienciaEducativa = resultadoConsultaExperienciaEducativa.getString(1);
                nrcsExperienciasEducativas.add(nrcExperienciaEducativa);
            }
            PreparedStatement sentenciaConsultaPublicacionActividad;
            String consultaSQLPublicacionActividad;
            ResultSet resultadoPublicacionActividad;
            for (String nrcsExperienciasEducativa : nrcsExperienciasEducativas) {
                consultaSQLPublicacionActividad = "";
                sentenciaConsultaPublicacionActividad = conexionBD.getConexion().prepareStatement(consultaSQLPublicacionActividad);
                resultadoPublicacionActividad = sentenciaConsultaPublicacionActividad.executeQuery();
                while(resultadoPublicacionActividad.next()){
                    
                }
            }   
         
        }catch(SQLException exception){
            
        }finally{
            conexionBD.cerrarConexion();
        }
        
        return publicacionesActividades;
    }

    
    @Override
    public InformacionPublicacionActividad publicarActividad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String buscarAsesorDisponible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String buscarAulaDisponible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
