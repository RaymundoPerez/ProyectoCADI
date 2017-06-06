/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;
import java.sql.Date;
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


    /**
     * Test of crearUsuarioAutonomo method, of class UsuarioAutonomoDAO.
     */
    @Test //APROBADO 
    public void testCrearUsuarioAutonomo() {
        System.out.println("crearUsuarioAutonomo");
        UsuarioAutonomo usuarioAutonomo = new UsuarioAutonomo();
        usuarioAutonomo.setNombres("Alonso Derev");
        usuarioAutonomo.setApellidos("Develo Aja");
        usuarioAutonomo.setProgramaEducativo("Ingenieria de Software");
        usuarioAutonomo.setCorreoElectronico("zS16161@hotail.com");
        usuarioAutonomo.setFechaNac(new Date(1992,5,1));
        usuarioAutonomo.setMatricula("S15011670");
        UsuarioAutonomoDAO instance = new UsuarioAutonomoDAO();
        InformacionUsuarioAutonomo expResult = InformacionUsuarioAutonomo.usuarioAutonomoCreadoCorrectamente;
        InformacionUsuarioAutonomo result = instance.crearUsuarioAutonomo(usuarioAutonomo);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of crearUsuarioAutonomo method, of class UsuarioAutonomoDAO.
     */
    @Test //APROBADO 
    public void testCrearUsuarioAutonomoNoValido() {
        System.out.println("crearUsuarioAutonomo");
        UsuarioAutonomo usuarioAutonomo = new UsuarioAutonomo();
        usuarioAutonomo.setNombres("Alonso Derev");
        usuarioAutonomo.setApellidos("Develo Aja");
        usuarioAutonomo.setProgramaEducativo("Ingenieria de Software");
        usuarioAutonomo.setCorreoElectronico("zS16161@hotail.com");
        usuarioAutonomo.setFechaNac(new Date(1992,5,1));
        usuarioAutonomo.setMatricula("S15011670");
        UsuarioAutonomoDAO instance = new UsuarioAutonomoDAO();
        InformacionUsuarioAutonomo expResult = InformacionUsuarioAutonomo.usuarioAutonomoNoCreado;
        InformacionUsuarioAutonomo result = instance.crearUsuarioAutonomo(usuarioAutonomo);
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerUsuarioAutonomo method, of class UsuarioAutonomoDAO.
     */
    @Test //APROBADO 
    public void testObtenerUsuarioAutonomo() {
        System.out.println("obtenerUsuarioAutonomo");
        String nombreUsuario = "zS15011613";
        UsuarioAutonomoDAO instance = new UsuarioAutonomoDAO();
        UsuarioAutonomo expResult = null;
        String resultadoEsperado = "S15011613";
        UsuarioAutonomo result = instance.obtenerUsuarioAutonomo(nombreUsuario);
        String resultado = result.getMatricula();
        assertEquals(resultadoEsperado, resultado);
    }

    /**
     * Test of validarExistenciaUsuarioAutonomo method, of class UsuarioAutonomoDAO.
     */
    @Test //APROBADO 
    public void testValidarExistenciaUsuarioAutonomo() {
        System.out.println("validarExistenciaUsuarioAutonomo");
        String matricula = "S15011613";
        UsuarioAutonomoDAO instance = new UsuarioAutonomoDAO();
        boolean expResult = true;
        boolean result = instance.validarExistenciaUsuarioAutonomo(matricula);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of validarExistenciaUsuarioAutonomo method, of class UsuarioAutonomoDAO.
     */
    @Test //APROBADO 
    public void testValidarInexistenciaUsuarioAutonomo() {
        System.out.println("validarExistenciaUsuarioAutonomo");
        String matricula = "S15011671";
        UsuarioAutonomoDAO instance = new UsuarioAutonomoDAO();
        boolean expResult = false;
        boolean result = instance.validarExistenciaUsuarioAutonomo(matricula);
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerTodosLosAlumnosInscritos method, of class UsuarioAutonomoDAO.
     */
    @Test //APROBADO 
    public void testObtenerTodosLosAlumnosInscritos() {
        System.out.println("obtenerTodosLosAlumnosInscritos");
        UsuarioAutonomoDAO instance = new UsuarioAutonomoDAO();
        ArrayList<UsuarioAutonomo> expResult = null;
        String resultadoEsperado = "S15011663";
        ArrayList<UsuarioAutonomo> result = instance.obtenerTodosLosAlumnosInscritos();
        String resultado = result.get(0).getMatricula();
        assertEquals(resultadoEsperado, resultado);
    }

    /**
     * Test of validarExistenciaUsuarioAutonomoConInscripcion method, of class UsuarioAutonomoDAO.
     */
    @Test //APROBADO 
    public void testValidarExistenciaUsuarioAutonomoConInscripcion() {
        System.out.println("validarExistenciaUsuarioAutonomoConInscripcion");
        String matricula = "S15011663";
        UsuarioAutonomoDAO instance = new UsuarioAutonomoDAO();
        boolean expResult = true;
        boolean result = instance.validarExistenciaUsuarioAutonomoConInscripcion(matricula);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of validarExistenciaUsuarioAutonomoConInscripcion method, of class UsuarioAutonomoDAO.
     */
    @Test //APROBADO 
    public void testValidarInexistenciaUsuarioAutonomoConInscripcion() {
        System.out.println("validarExistenciaUsuarioAutonomoConInscripcion");
        String matricula = "S15011687";
        UsuarioAutonomoDAO instance = new UsuarioAutonomoDAO();
        boolean expResult = false;
        boolean result = instance.validarExistenciaUsuarioAutonomoConInscripcion(matricula);
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerUsuarioAutonomoPorMatricula method, of class UsuarioAutonomoDAO.
     */
    @Test //APROBADO 
    public void testObtenerUsuarioAutonomoPorMatricula() {
        System.out.println("obtenerUsuarioAutonomoPorMatricula");
        String matricula = "S15011663";
        UsuarioAutonomoDAO instance = new UsuarioAutonomoDAO();
        UsuarioAutonomo expResult = null;
        String resultadoEsperado = "S15011663";
        UsuarioAutonomo result = instance.obtenerUsuarioAutonomoPorMatricula(matricula);
        String resultado = result.getMatricula();
        assertEquals(resultadoEsperado, resultado);
    }
    
}
