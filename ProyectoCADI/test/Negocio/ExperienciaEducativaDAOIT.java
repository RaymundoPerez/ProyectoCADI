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
public class ExperienciaEducativaDAOIT {
    
    public ExperienciaEducativaDAOIT() {
    }
 

    /**
     * Test of obtenerTodasLasExperienciasEducativas method, of class ExperienciaEducativaDAO.
     */
    @Test //APROBADO 
    public void testObtenerTodasLasExperienciasEducativas() {
        System.out.println("obtenerTodasLasExperienciasEducativas");
        ExperienciaEducativaDAO instance = new ExperienciaEducativaDAO();
        String[] expResult = {"Ingles I", "Ingles II"};
        String[] result = instance.obtenerTodasLasExperienciasEducativas();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of obtenerExperienciasEducativasUsuarioAutonomo method, of class ExperienciaEducativaDAO.
     */
    @Test //APROBADO 
    public void testObtenerExperienciasEducativasUsuarioAutonomo() {
        System.out.println("obtenerExperienciasEducativasUsuarioAutonomo");
        String matricula = "S15011613";
        ExperienciaEducativaDAO instance = new ExperienciaEducativaDAO();
        String resultadoEsperado = "39870";
        ArrayList<ExperienciaEducativa> result = instance.obtenerExperienciasEducativasUsuarioAutonomo(matricula);
        String resultado = result.get(0).getNrc();
        assertEquals(resultadoEsperado, resultado);
    }

    /**
     * Test of obtenerExperienciaEducativaPorIdioma method, of class ExperienciaEducativaDAO.
     */
    @Test //APROBADO 
    public void testObtenerExperienciaEducativaPorIdioma() {
        System.out.println("obtenerExperienciaEducativaPorIdioma");
        String idIdioma = "Ing01";
        ExperienciaEducativaDAO instance = new ExperienciaEducativaDAO();
        String resultadoEsperado = "39870";
        ArrayList<ExperienciaEducativa> result = instance.obtenerExperienciaEducativaPorIdioma(idIdioma);
        String resultado = result.get(0).getNrc();
        assertEquals(resultadoEsperado, resultado);
    }
    
}
