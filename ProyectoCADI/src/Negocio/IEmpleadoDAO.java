/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author raymu
 */
public interface IEmpleadoDAO {
    
    public Empleado obtenerEmpleado(String nombreUsuario);
    public String obtenerNombreEmpleado(String noPersonal);
    public ArrayList<Empleado> obtenerEmpleadosDisponibles(Time horaInicio,Time horaFin, String idIdioma, Date fecha);
}
