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
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of seleccionarActividadPorSeccion method, of class ActividadDAO.
     */
    @Test
    public void testSeleccionarActividadPorSeccion() {
        System.out.println("seleccionarActividadPorSeccion");
        String idSeccion = "";
        ActividadDAO instance = new ActividadDAO();
        ArrayList<Actividad> expResult = null;
        ArrayList<Actividad> result = instance.seleccionarActividadPorSeccion(idSeccion);
        assertEquals(expResult, result);
      
    }
    
}
