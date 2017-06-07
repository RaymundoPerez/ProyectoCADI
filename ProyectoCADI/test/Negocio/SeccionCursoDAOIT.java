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

    /**
     * Test of obtenerTodasLasSeecionesPorEE method, of class SeccionCursoDAO.
     */
    @Test //APROBADO 
    public void testObtenerTodasLasSeecionesPorEE() {
        System.out.println("obtenerTodasLasSeecionesPorEE");
        String nombreEE = "Ingles I";
        SeccionCursoDAO instance = new SeccionCursoDAO();
        String[] expResult = {"CS100"};
        String[] result = instance.obtenerTodasLasSeccionesPorEE(nombreEE);
        assertArrayEquals(expResult, result);
    }
    
}
