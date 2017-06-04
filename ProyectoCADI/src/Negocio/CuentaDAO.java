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
public class CuentaDAO implements ICuentaDAO{

    @Override
    public InformacionCuenta crearCuenta(Cuenta cuenta) {
        InformacionCuenta mensaje = InformacionCuenta.cuentaNoCreada;
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "insert into CUENTA values(?,sha2(?,256),?)";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, cuenta.getNombreUsuario());
            sentenciaConsulta.setString(2, cuenta.getConstraseña());
            sentenciaConsulta.setString(3, cuenta.getTipoUsuario());
            sentenciaConsulta.executeUpdate();
            mensaje = InformacionCuenta.cuentaCreadaCorrectamente;
        } catch (SQLException exception) {

        } finally {
            conexionBD.cerrarConexion();
        }
        return mensaje;
    }
    
    @Override
    public InformacionInicioSesion iniciarSesion(Cuenta cuenta) {
     InformacionInicioSesion mensaje = InformacionInicioSesion.errorConexionBD; 
     String tipoUsuario;
     ConexionSQL conexionBD = new ConexionSQL();
     PreparedStatement sentenciaConsulta;
     if(conexionBD.conectarBaseDatos()== InformacionConexion.conexionBDExitosa){ 
         mensaje = InformacionInicioSesion.usuarioNoValido;
         String consultaSQL = "select tipoUsuario from CUENTA where nombreUsuario =? and contrasena = sha2(?,256)";
         try{
             sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
             sentenciaConsulta.setString(1, cuenta.getNombreUsuario());
             sentenciaConsulta.setString(2, cuenta.getConstraseña());
             ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
             resultadoConsulta.next();
             tipoUsuario = resultadoConsulta.getString(1);
             mensaje = validarCuenta(tipoUsuario);
         }catch(SQLException exception){
      
         }finally{
             conexionBD.cerrarConexion();
         }      
     }
     return mensaje;
    }

    @Override
    public boolean cerrarSesión() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public InformacionInicioSesion validarCuenta(String tipoUsuario) {
        InformacionInicioSesion mensaje=null;
        switch(tipoUsuario){
            case "UsuarioAutonomo":
                    mensaje = InformacionInicioSesion.usuarioAutonomo;
                break;
            case "Coordinador":
                    mensaje = InformacionInicioSesion.coordinador;
                break;
            case "Recepcionista":
                    mensaje = InformacionInicioSesion.recepcionista;
                break;
        }
        return mensaje;
    }
    
}
