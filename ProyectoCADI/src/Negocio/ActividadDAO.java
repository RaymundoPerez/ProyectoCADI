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
public class ActividadDAO implements IActividadDAO{

    @Override
    public ArrayList<Actividad> seleccionarActividadPorSeccion(String idSeccion) {
        ArrayList<Actividad> actividades = new ArrayList();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select idActividad, nombreActividad from Actividad where idSeccion = ?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, idSeccion);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            while(resultadoConsulta.next()){
                Actividad actividad = new Actividad();
                actividad.setIdActividad(resultadoConsulta.getString(1));
                actividad.setNombreActividad(resultadoConsulta.getString(2));
                actividades.add(actividad);
            }
           
        } catch (SQLException exception) {
            
        } finally {
            conexionBD.cerrarConexion();
        }
        
        
        return actividades;
    }
    
}
