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
public class SeccionCursoDAO implements ISeccionCursoDAO{

    @Override
    public String[] obtenerTodasLasSeecionesPorEE(String nombreEE) {
        ArrayList<String> nombreSeccionCurso = new ArrayList<>();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String[] arregloNombreSeccionCurso = null;
        String consultaSQL = "select claveSeccion from SeccionCurso,ExperienciaEducativa,Curso where ExperienciaEducativa.nombreExperienciaEducativa ="
                + "? and ExperienciaEducativa.nrc = Curso.nrc and Curso.idCurso = SeccionCurso.idCurso";
        try{
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, nombreEE);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            while(resultadoConsulta.next()){
                nombreSeccionCurso.add(resultadoConsulta.getString(1));
            }
            
            arregloNombreSeccionCurso = new String[nombreSeccionCurso.size()];
            arregloNombreSeccionCurso = nombreSeccionCurso.toArray(arregloNombreSeccionCurso);
            
        }catch(SQLException exception){
        
        }finally{
        conexionBD.cerrarConexion();
        }
        
        return arregloNombreSeccionCurso;
    }

  
}
