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
public class CuentaDAOIT {

    public CuentaDAOIT() {
    }

    

    /**
     * Test of crearCuenta method, of class CuentaDAO.
     */
    @Test
    public void testCrearCuenta() {
        System.out.println("crearCuenta");
        Cuenta cuenta = new Cuenta();
        cuenta.setNombreUsuario("14800");
        cuenta.setConstraseña("14800");
        cuenta.setTipoUsuario("Coordinador");
        CuentaDAO instance = new CuentaDAO();
        InformacionCuenta expResult = InformacionCuenta.cuentaNoCreada;
        InformacionCuenta result = instance.crearCuenta(cuenta);
        assertEquals(expResult, result);
      
    }
    
    @Test
    public void testCrearCuentaValida() {
        System.out.println("crearCuenta");
        Cuenta cuenta = new Cuenta();
        cuenta.setNombreUsuario("15800");
        cuenta.setConstraseña("15800");
        cuenta.setTipoUsuario("Coordinador");
        CuentaDAO instance = new CuentaDAO();
        InformacionCuenta expResult = InformacionCuenta.cuentaCreadaCorrectamente;
        InformacionCuenta result = instance.crearCuenta(cuenta);
        assertEquals(expResult, result);
      
    }
    /**
     * Test of iniciarSesion method, of class CuentaDAO.
     */
    @Test
    public void testIniciarSesion() {
        System.out.println("iniciarSesion");
        Cuenta cuenta = new Cuenta();
        cuenta.setNombreUsuario("27160");
        cuenta.setConstraseña("27160");
        CuentaDAO instance = new CuentaDAO();
        InformacionInicioSesion expResult = InformacionInicioSesion.coordinador;
        InformacionInicioSesion result = instance.iniciarSesion(cuenta);
        assertEquals(expResult, result);

    }

    /**
     * Test of cerrarSesión method, of class CuentaDAO.
     */
    /* @Test
    public void testCerrarSesión() {
        System.out.println("cerrarSesi\u00f3n");
        CuentaDAO instance = new CuentaDAO();
        boolean expResult = false;
        boolean result = instance.cerrarSesión();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarCuenta method, of class CuentaDAO.
     */
    @Test
    public void testValidarCuenta() {
        System.out.println("validarCuenta");
        String tipoUsuario = "Coordinador";
        CuentaDAO instance = new CuentaDAO();
        InformacionInicioSesion expResult = InformacionInicioSesion.coordinador;
        InformacionInicioSesion result = instance.validarCuenta(tipoUsuario);
        assertEquals(expResult, result);

    }

}
