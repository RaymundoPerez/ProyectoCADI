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
public interface IEmpleadoDAO {
    
    public Empleado obtenerEmpleado(String nombreUsuario);
    public String obtenerNombreEmpleado(String noPersonal);
    
}
