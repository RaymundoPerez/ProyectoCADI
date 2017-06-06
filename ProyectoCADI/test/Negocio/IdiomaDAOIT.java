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
public class IdiomaDAOIT {
    
    public IdiomaDAOIT() {
    }

    /**
     * Test of obtenerTodosLosIdiomas method, of class IdiomaDAO.
     */
    @Test //APROBADO 
    public void testObtenerTodosLosIdiomas() {
        System.out.println("obtenerTodosLosIdiomas");
        IdiomaDAO instance = new IdiomaDAO();
        ArrayList<Idioma> expResult = null;
        String resultadoEsperado = "Fra02";
        ArrayList<Idioma> result = instance.obtenerTodosLosIdiomas();
        String resultado = result.get(0).getIdIdioma();
        assertEquals(resultadoEsperado, resultado);
    }
    
}
