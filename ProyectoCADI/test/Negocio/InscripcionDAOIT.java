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
public class InscripcionDAOIT {
    
    public InscripcionDAOIT() {
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
     * Test of crearInscripcion method, of class InscripcionDAO.
     */
    @Test
    public void testCrearInscripcion() {
        System.out.println("crearInscripcion");
        String matricula = "zS15011613";
        String claveSeccionCurso = "CS100";
        InscripcionDAO instance = new InscripcionDAO();
        InformacionInscripcion expResult = InformacionInscripcion.inscripcionNoCreada;
        InformacionInscripcion result = instance.crearInscripcion(matricula, claveSeccionCurso);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of validarExistenciaInscripcion method, of class InscripcionDAO.
     */
   @Test
    public void testValidarExistenciaInscripcion() {
        System.out.println("validarExistenciaInscripcion");
        String matricula = "zS15011613";
        String claveSeccionCurso = "CS100";
        InscripcionDAO instance = new InscripcionDAO();
        boolean expResult = false;
        boolean result = instance.validarExistenciaInscripcion(matricula, claveSeccionCurso);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of buscarInscripcion method, of class InscripcionDAO.
     */
    @Test
    public void testBuscarInscripcion() {
        System.out.println("buscarInscripcion");
        String nrc = "39870";
        InscripcionDAO instance = new InscripcionDAO();
        String expResult = "CS100";
        String result = instance.buscarInscripcion(nrc);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of eliminarInscripcion method, of class InscripcionDAO.
     */
    @Test
    public void testEliminarInscripcion() {
        System.out.println("eliminarInscripcion");
        String matricula = "zS15011613";
        String claveSeccion = "CS100";
        InscripcionDAO instance = new InscripcionDAO();
        InformacionInscripcion expResult = InformacionInscripcion.inscripcionNoEliminada;
        InformacionInscripcion result = instance.eliminarInscripcion(matricula, claveSeccion);
        assertEquals(expResult, result);
       
    }
    
}
