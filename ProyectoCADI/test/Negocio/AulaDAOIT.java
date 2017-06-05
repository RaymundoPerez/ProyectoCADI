/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.sql.Date;
import java.sql.Time;
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
public class AulaDAOIT {
    
    public AulaDAOIT() {
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
     * Test of obtenerAulasDisponibles method, of class AulaDAO.
     */
    @Test
    public void testObtenerAulasDisponibles() {
        System.out.println("obtenerAulasDisponibles");
        Time hora = null;
        Date fecha = null;
        AulaDAO instance = new AulaDAO();
        ArrayList<Aula> expResult = null;
        ArrayList<Aula> result = instance.obtenerAulasDisponibles(hora, fecha);
        assertEquals(expResult, result);
      
    }
    
}
