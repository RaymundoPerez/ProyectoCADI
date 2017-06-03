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
public interface IUsuarioAutonomoDAO {
    
    public InformacionUsuarioAutonomo crearUsuarioAutonomo(UsuarioAutonomo usuarioAutonomo);
    public UsuarioAutonomo obtenerUsuarioAutonomo(String nombreUsuario);
    public boolean validarExistenciaUsuarioAutonomo(String matricula);
    
}
