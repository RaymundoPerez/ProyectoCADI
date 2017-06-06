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
public class SeccionDAOIT {
    
    public SeccionDAOIT() {
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
     * Test of obtenerSeccionPorModulo method, of class SeccionDAO.
     */
    @Test
    public void testObtenerSeccionPorModulo() {
        System.out.println("obtenerSeccionPorModulo");
        String idModulo = "";
        SeccionDAO instance = new SeccionDAO();
        ArrayList<Seccion> expResult = null;
        ArrayList<Seccion> result = instance.obtenerSeccionPorModulo(idModulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
