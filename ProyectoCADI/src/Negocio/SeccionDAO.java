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
public class SeccionDAO implements ISeccionDAO{

    @Override
    public ArrayList<Seccion> obtenerSeccionPorModulo(String idModulo) {
        ArrayList<Seccion> secciones = new ArrayList();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select idSeccion, nombreSeccion from SECCION where idModulo = ?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, idModulo);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            while(resultadoConsulta.next()){
                Seccion seccion = new Seccion();
                seccion.setIdSeccion(resultadoConsulta.getString(1));
                seccion.setNombreSeccion(resultadoConsulta.getString(2));
                secciones.add(seccion);
            }
           
        } catch (SQLException exception) {
            
        } finally {
            conexionBD.cerrarConexion();
        }
        
        return secciones;
    }
    
}
