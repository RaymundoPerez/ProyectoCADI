/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alonso
 */
public class EmpleadoDAOIT {
    
    public EmpleadoDAOIT() {
    }
    
    

    /**
     * Test of obtenerEmpleado method, of class EmpleadoDAO.
     */
    @Test //APROBADO 
    public void testObtenerEmpleado() {
        System.out.println("obtenerEmpleado");
        String nombreUsuario = "13101";
        EmpleadoDAO instance = new EmpleadoDAO();
        String resEsperada = "13101 Ricardo Solis Salazar 13101";
        Empleado result = instance.obtenerEmpleado(nombreUsuario);
        String resultado = result.getNoPersonal() + " " + result.getNombres() + " "+ result.getApellidos() + " " + result.getNombreUsuario();
        assertEquals(resEsperada, resultado);
    }

    /**
     * Test of obtenerNombreEmpleado method, of class EmpleadoDAO.
     */
    @Test //APROBADO 
    public void testObtenerNombreEmpleado() {
        System.out.println("obtenerNombreEmpleado");
        String noPersonal = "13101";
        EmpleadoDAO instance = new EmpleadoDAO();
        String resEsperada = "Ricardo Solis Salazar";
        String result = instance.obtenerNombreEmpleado(noPersonal);
        assertEquals(resEsperada, result);
    }

    /**
     * Test of obtenerEmpleadosDisponibles method, of class EmpleadoDAO.
     */
    @Test //APROBADO 
    public void testObtenerAsesoresDisponibles() {
        System.out.println("obtenerEmpleadosDisponibles");
        Time horaInicio = new Time(2,0,0);
        Time horaFin = new Time(3,0,0);
        String idIdioma = "Ing01";
        Date fecha = new Date(2017,6,8);
        EmpleadoDAO instance = new EmpleadoDAO();
        String resultadoEsperado = "83500";
        ArrayList<Empleado> result = instance.obtenerAsesoresDisponibles(horaInicio,horaFin, idIdioma, fecha);
        String resultado = result.get(0).getNoPersonal();
        assertEquals(resultadoEsperado, resultado);
        
    }
    
}
