/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocio.InformacionConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Irdevelo
 */
public class ConexionSQL {
    
       private String usuarioBaseDatos;
	private String contraseñaBaseDatos;
	private String urlBaseDatos;
        private Connection conexion;

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public ConexionSQL(){
    }
       
        
        public InformacionConexion conectarBaseDatos(){
            InformacionConexion mensaje;
            usuarioBaseDatos = "USUARIOPRUEBA";
            contraseñaBaseDatos = "39hm168z$";
            urlBaseDatos = "jdbc:mysql://192.168.0.14:3306/CADI";
            conexion = null;
                try {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    conexion = DriverManager.getConnection(urlBaseDatos, usuarioBaseDatos, contraseñaBaseDatos);
                    mensaje = InformacionConexion.conexionBDExitosa;
		}catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException  e) {
                    Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, e);
                    mensaje = InformacionConexion.errorConexionBD;
		}
            return mensaje;
        }
    
        public void cerrarConexion(){
            try {
                if(!conexion.isClosed()){
                   conexion.close();
                }
            }catch(SQLException ex){
                Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
