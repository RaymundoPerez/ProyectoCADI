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
public class UsuarioAutonomoDAO implements IUsuarioAutonomoDAO{

    @Override
    public UsuarioAutonomo obtenerUsuarioAutonomo(String nombreUsuario) {
        UsuarioAutonomo usuarioAutonomo = new UsuarioAutonomo();
         ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select *from USUARIOAUTONOMO where nombreUsuario=?";
        try{
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, nombreUsuario);
             ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
                resultadoConsulta.next();
                usuarioAutonomo.setNombres(resultadoConsulta.getString(1));
                usuarioAutonomo.setApellidos(resultadoConsulta.getString(2));
                usuarioAutonomo.setProgramaEducativo(resultadoConsulta.getString(3));
                usuarioAutonomo.setCorreoElectronico(resultadoConsulta.getString(4));
                usuarioAutonomo.setFechaNac(resultadoConsulta.getDate(5));
                usuarioAutonomo.setMatricula(resultadoConsulta.getString(6));
        }catch(SQLException exception){
        
        }finally{
        conexionBD.cerrarConexion();
        }
        return usuarioAutonomo;
    }
    
}
