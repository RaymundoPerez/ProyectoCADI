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
public class ModuloDAO implements IModuloDAO{

    @Override
    public ArrayList<Modulo> obtenerModulosPorEE(String NRC) {
        ArrayList<Modulo> modulos = new ArrayList();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select idModulo, nombreModulo from MODULO where nrc = ?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, NRC);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            while(resultadoConsulta.next()){
                Modulo modulo = new Modulo();
                modulo.setIdModulo(resultadoConsulta.getString(1));
                modulo.setNombreModulo(resultadoConsulta.getString(2));
                modulos.add(modulo);
            }
           
        } catch (SQLException exception) {
            
        } finally {
            conexionBD.cerrarConexion();
        }
        return modulos;
    }
    
}
