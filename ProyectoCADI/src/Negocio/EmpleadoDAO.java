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
 * @author raymu
 */
public class EmpleadoDAO implements IEmpleadoDAO{

    @Override
    public Empleado obtenerEmpleado(String nombreUsuario) {
        Empleado empleado = new Empleado();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
            String consultaSQL = "select *from EMPLEADO where nombreUsuario=?";
            try{
                sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
                sentenciaConsulta.setString(1, nombreUsuario);
                ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
                resultadoConsulta.next();
                empleado.setNoPersonal(resultadoConsulta.getString(1));
                empleado.setNombres(resultadoConsulta.getString(2));
                empleado.setApellidos(resultadoConsulta.getString(3));
            }catch(SQLException exception){
            
            }finally{
                conexionBD.cerrarConexion();
            }
        
        return empleado; 
    }
    
    
}
