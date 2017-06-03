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
public class ExperienciaEducativaDAO implements IExperienciaEducativaDAO{

    @Override
    public String[] obtenerTodasLasExperienciasEducativas() {
       
       ArrayList<String> experienciasEducativas = new ArrayList<>();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String[] arregloExperienciasEducativas = null;
        String consultaSQL = "select nombreExperienciaEducativa from EXPERIENCIAEDUCATIVA";
        try{
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            while(resultadoConsulta.next()){
                experienciasEducativas.add(resultadoConsulta.getString(1));
            }
            
            arregloExperienciasEducativas = new String[experienciasEducativas.size()];
            arregloExperienciasEducativas = experienciasEducativas.toArray(arregloExperienciasEducativas);
            
        }catch(SQLException exception){
        
        }finally{
        conexionBD.cerrarConexion();
        }
        
        return arregloExperienciasEducativas;

    }
    
}
