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
 * @author alonso
 */
public class IdiomaDAO implements IIdiomaDAO{

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
            while(resultadoConsulta.next()){
                Idioma idioma = new Idioma();
                idioma.setIdIdioma(resultadoConsulta.getString(1));
                idioma.setNombreIdioma(resultadoConsulta.getString(2));
                idiomas.add(idioma);
            }
           
        } catch (SQLException exception) {
            
        } finally {
            conexionBD.cerrarConexion();
        }
        
        return idiomas;
    }
    
}
