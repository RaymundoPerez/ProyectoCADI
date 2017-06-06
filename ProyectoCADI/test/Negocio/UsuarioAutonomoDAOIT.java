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
public class UsuarioAutonomoDAOIT {
    
    public UsuarioAutonomoDAOIT() {
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
     * Test of crearUsuarioAutonomo method, of class UsuarioAutonomoDAO.
     */
    @Test
    public void testCrearUsuarioAutonomo() {
        System.out.println("crearUsuarioAutonomo");
        UsuarioAutonomo usuarioAutonomo = null;
        UsuarioAutonomoDAO instance = new UsuarioAutonomoDAO();
        InformacionUsuarioAutonomo expResult = null;
        InformacionUsuarioAutonomo result = instance.crearUsuarioAutonomo(usuarioAutonomo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUsuarioAutonomo method, of class UsuarioAutonomoDAO.
     */
    @Test
    public void testObtenerUsuarioAutonomo() {
        System.out.println("obtenerUsuarioAutonomo");
        String nombreUsuario = "";
        UsuarioAutonomoDAO instance = new UsuarioAutonomoDAO();
        UsuarioAutonomo expResult = null;
        UsuarioAutonomo result = instance.obtenerUsuarioAutonomo(nombreUsuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarExistenciaUsuarioAutonomo method, of class UsuarioAutonomoDAO.
     */
    @Test
    public void testValidarExistenciaUsuarioAutonomo() {
        System.out.println("validarExistenciaUsuarioAutonomo");
        String matricula = "";
        UsuarioAutonomoDAO instance = new UsuarioAutonomoDAO();
        boolean expResult = false;
        boolean result = instance.validarExistenciaUsuarioAutonomo(matricula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerTodosLosAlumnosInscritos method, of class UsuarioAutonomoDAO.
     */
    @Test
    public void testObtenerTodosLosAlumnosInscritos() {
        System.out.println("obtenerTodosLosAlumnosInscritos");
        UsuarioAutonomoDAO instance = new UsuarioAutonomoDAO();
        ArrayList<UsuarioAutonomo> expResult = null;
        ArrayList<UsuarioAutonomo> result = instance.obtenerTodosLosAlumnosInscritos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarExistenciaUsuarioAutonomoConInscripcion method, of class UsuarioAutonomoDAO.
     */
    @Test
    public void testValidarExistenciaUsuarioAutonomoConInscripcion() {
        System.out.println("validarExistenciaUsuarioAutonomoConInscripcion");
        String matricula = "";
        UsuarioAutonomoDAO instance = new UsuarioAutonomoDAO();
        boolean expResult = false;
        boolean result = instance.validarExistenciaUsuarioAutonomoConInscripcion(matricula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUsuarioAutonomoPorMatricula method, of class UsuarioAutonomoDAO.
     */
    @Test
    public void testObtenerUsuarioAutonomoPorMatricula() {
        System.out.println("obtenerUsuarioAutonomoPorMatricula");
        String matricula = "";
        UsuarioAutonomoDAO instance = new UsuarioAutonomoDAO();
        UsuarioAutonomo expResult = null;
        UsuarioAutonomo result = instance.obtenerUsuarioAutonomoPorMatricula(matricula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
