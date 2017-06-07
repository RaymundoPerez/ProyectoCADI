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
public class AulaDAOIT {
    
    public AulaDAOIT() {
    }
    

    /**
     * Test of obtenerAulasDisponibles method, of class AulaDAO.
     */
    @Test //APROBADO 
    public void testObtenerAulasDisponibles() {
        System.out.println("obtenerAulasDisponibles");
        Time horaInicio = new Time(2,0,0);
        Time horaFin = new Time(3,0,0);
        Date fecha = new Date(2017,05,21);
        AulaDAO instance = new AulaDAO();
        String resultadoEsperado = "SC1";
        ArrayList<Aula> result = instance.obtenerAulasDisponibles(horaInicio,horaFin, fecha);
        String resultado = result.get(0).getIdAula();
        assertEquals(resultadoEsperado, resultado);
      
    }
    
}
