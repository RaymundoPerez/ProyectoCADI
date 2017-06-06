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

    /**
     * Test of obtenerSeccionPorModulo method, of class SeccionDAO.
     */
    @Test //APROBADO 
    public void testObtenerSeccionPorModulo() {
        System.out.println("obtenerSeccionPorModulo");
        String idModulo = "M101";
        SeccionDAO instance = new SeccionDAO();
        ArrayList<Seccion> expResult = null;
        String resultadoEsperado = "Sec10";
        ArrayList<Seccion> result = instance.obtenerSeccionPorModulo(idModulo);
        String resultado = result.get(0).getIdSeccion();
        assertEquals(resultadoEsperado, resultado);
    }
    
}
