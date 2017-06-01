/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author raymu
 */
public interface ICuentaDAO {
    
    public InformacionInicioSesion iniciarSesion(Cuenta cuenta);
    
    public boolean cerrarSesión();
    
    public InformacionInicioSesion validarCuenta(String tipoUsuario);
    
}
