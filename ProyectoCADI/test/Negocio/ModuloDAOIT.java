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
public class ModuloDAOIT {
    
    public ModuloDAOIT() {
    }
    

    /**
     * Test of obtenerModulosPorEE method, of class ModuloDAO.
     */
    @Test //APROBADO 
    public void testObtenerModulosPorEE() {
        System.out.println("obtenerModulosPorEE");
        String NRC = "39870";
        ModuloDAO instance = new ModuloDAO();
        ArrayList<Modulo> expResult = instance.obtenerModulosPorEE(NRC);
        String resultadoEsperado = "M101 Modulo 1";
        ArrayList<Modulo> result = instance.obtenerModulosPorEE(NRC);
        String resultado = result.get(0).getIdModulo() + " " + result.get(0).getNombreModulo();
        assertEquals(resultadoEsperado, resultado);
        
    }
    
}
