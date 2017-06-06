/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

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
public class SeccionCursoDAOIT {
    
    public SeccionCursoDAOIT() {
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
     * Test of obtenerTodasLasSeecionesPorEE method, of class SeccionCursoDAO.
     */
    @Test
    public void testObtenerTodasLasSeecionesPorEE() {
        System.out.println("obtenerTodasLasSeecionesPorEE");
        String nombreEE = "";
        SeccionCursoDAO instance = new SeccionCursoDAO();
        String[] expResult = null;
        String[] result = instance.obtenerTodasLasSeecionesPorEE(nombreEE);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
