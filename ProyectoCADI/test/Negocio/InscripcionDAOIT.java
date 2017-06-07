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
    
    /**
     * Test of crearInscripcion method, of class InscripcionDAO.
     */
    @Test //APROBADO 
    public void testCrearInscripcion() {
        System.out.println("crearInscripcion");
        String matricula = "S15011613";
        String claveSeccionCurso = "CS200";
        InscripcionDAO instance = new InscripcionDAO();
        InformacionInscripcion expResult = InformacionInscripcion.inscripcionCreadaCorrectamente;
        InformacionInscripcion result = instance.crearInscripcion(matricula, claveSeccionCurso);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of crearInscripcion method, of class InscripcionDAO.
     */
    @Test //APROBADO 
    public void testCrearInscripcionNoValida() {
        System.out.println("crearInscripcion");
        String matricula = "S15011607";
        String claveSeccionCurso = "CS200";
        InscripcionDAO instance = new InscripcionDAO();
        InformacionInscripcion expResult = InformacionInscripcion.inscripcionNoCreada;
        InformacionInscripcion result = instance.crearInscripcion(matricula, claveSeccionCurso);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of validarExistenciaInscripcion method, of class InscripcionDAO.
     */
   @Test //APROBADO 
    public void testValidarExistenciaInscripcion() {
        System.out.println("validarExistenciaInscripcion");
        String matricula = "S15011613";
        String claveSeccionCurso = "CS100";
        InscripcionDAO instance = new InscripcionDAO();
        boolean expResult = true;
        boolean result = instance.validarExistenciaInscripcion(matricula, claveSeccionCurso);
        assertEquals(expResult, result);
       
    }
    
     /**
     * Test of validarExistenciaInscripcion method, of class InscripcionDAO.
     */
   @Test //APROBADO 
    public void testValidarInexistenciaInscripcion() {
        System.out.println("validarExistenciaInscripcion");
        String matricula = "S15011607";
        String claveSeccionCurso = "CS100";
        InscripcionDAO instance = new InscripcionDAO();
        boolean expResult = false;
        boolean result = instance.validarExistenciaInscripcion(matricula, claveSeccionCurso);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of buscarInscripcion method, of class InscripcionDAO.
     */
    @Test //APROBADO 
    public void testBuscarInscripcion() {
        System.out.println("buscarInscripcion");
        String nrc = "39870";
        String matricula = "S15011613";
        InscripcionDAO instance = new InscripcionDAO();
        String expResult = "CS100";
        String result = instance.buscarSeccionPorInscripcion(matricula,nrc);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of eliminarInscripcion method, of class InscripcionDAO.
     */
    @Test //APROBADO 
    public void testEliminarInscripcion() {
        System.out.println("eliminarInscripcion");
        String matricula = "S15011607";
        String claveSeccion = "CS100";
        InscripcionDAO instance = new InscripcionDAO();
        InformacionInscripcion expResult = InformacionInscripcion.inscripcionNoEliminada;
        InformacionInscripcion result = instance.eliminarInscripcion(matricula, claveSeccion);
        assertEquals(expResult, result);
       
    }
    
}
