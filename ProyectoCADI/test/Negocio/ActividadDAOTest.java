/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alonso
 */
public class ActividadDAOTest {
    
    public ActividadDAOTest() {
    }

    /**
     * Test of seleccionarActividadPorSeccion method, of class ActividadDAO.
     */
    @Test //APROBADO 
    public void testSeleccionarActividadPorSeccion() {
        System.out.println("seleccionarActividadPorSeccion");
        String idSeccion = "Sec10";
        ActividadDAO instance = new ActividadDAO();
        String resultadoEsperado = "Act001";
        ArrayList<Actividad> result = instance.seleccionarActividadPorSeccion(idSeccion);
        String resultado = result.get(0).getIdActividad();
        assertEquals(resultadoEsperado, resultado);
      
    }
    
}
