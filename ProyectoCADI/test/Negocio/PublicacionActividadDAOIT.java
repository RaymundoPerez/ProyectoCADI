/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alonso
 */
public class PublicacionActividadDAOIT {
    
    public PublicacionActividadDAOIT() {
    }
    
    /**
     * Test of obtenerActividadesDisponiblesUsuarioAutonomo method, of class PublicacionActividadDAO.
     */
    @Test //APROBADO 
    public void testObtenerActividadesDisponiblesUsuarioAutonomo() {
        System.out.println("obtenerActividadesDisponiblesUsuarioAutonomo");
        String matricula = "S15011613";
        PublicacionActividadDAO instance = new PublicacionActividadDAO();
        int resultadoEsperado = 6;
        ArrayList<PublicacionActividad> result = instance.obtenerActividadesDisponiblesUsuarioAutonomo(matricula);
        int resultado = result.get(0).getIdPublicacion();
        assertEquals(resultadoEsperado, resultado);
        
    }

    /**
     * Test of obtenerActividadesReservadasUsuarioAutonomo method, of class PublicacionActividadDAO.
     */
    @Test //APROBADO 
    public void testObtenerActividadesReservadasUsuarioAutonomo() {
        System.out.println("obtenerActividadesReservadasUsuarioAutonomo");
        String matricula = "S15011613";
        PublicacionActividadDAO instance = new PublicacionActividadDAO();
        String resultadoEsperado = "PA0008";
        ArrayList<PublicacionActividad> result = instance.obtenerActividadesReservadasUsuarioAutonomo(matricula);
        int resultado = result.get(0).getIdPublicacion();
        assertEquals(resultadoEsperado, resultado);
       
    }

    /**
     * Test of agregarReservacionPublicacionActividad method, of class PublicacionActividadDAO.
     */
    @Test //APROBADO 
    public void testAgregarReservacionPublicacionActividad() {
        System.out.println("agregarReservacionPublicacionActividad");
        int idPublicacionActividad = 5;
        String matricula = "S15011613";
        PublicacionActividadDAO instance = new PublicacionActividadDAO();
        InformacionPublicacionActividad expResult = InformacionPublicacionActividad.reservacionGuardada;
        InformacionPublicacionActividad result = instance.agregarReservacionPublicacionActividad(idPublicacionActividad, matricula);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminarReservacionPublicacionActividad method, of class PublicacionActividadDAO.
     */
    @Test //APROBADO 
    public void testEliminarReservacionPublicacionActividad() {
        System.out.println("eliminarReservacionPublicacionActividad");
        int idPublicacionActividad = 12;
        String matricula = "S15011613";
        PublicacionActividadDAO instance = new PublicacionActividadDAO();
        InformacionPublicacionActividad expResult = InformacionPublicacionActividad.reservacionEliminada;
        InformacionPublicacionActividad result = instance.eliminarReservacionPublicacionActividad(idPublicacionActividad, matricula);
        assertEquals(expResult, result);
    }

    /**
     * Test of publicarActividad method, of class PublicacionActividadDAO.
     */
    @Test //APROBADO 
    public void testPublicarActividad() {
        System.out.println("publicarActividad");
        PublicacionActividad publicacionActividad = new PublicacionActividad();
        PublicacionActividadDAO instance = new PublicacionActividadDAO();
        publicacionActividad.setFecha(new Date(2017,05,07));
        publicacionActividad.setHoraInicio(new Time(8,0,0));
        publicacionActividad.setHoraFin(new Time(9,0,0));
        publicacionActividad.setIdAula("SC1");
        publicacionActividad.setNombreActividad("Act002");
        publicacionActividad.setNombreAsesor("83500");
        publicacionActividad.setCupo(10);
        InformacionPublicacionActividad expResult = InformacionPublicacionActividad.actividadPublicada;
        InformacionPublicacionActividad result = instance.publicarActividad(publicacionActividad);
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerActividadesDisponibles method, of class PublicacionActividadDAO.
     */
    @Test //APROBADO 
    public void testObtenerActividadesDisponibles() {
        System.out.println("obtenerActividadesDisponibles");
        PublicacionActividadDAO instance = new PublicacionActividadDAO();
        ArrayList<PublicacionActividad> expResult = null;
        String resultadoEsperado = "PA0002";
        ArrayList<PublicacionActividad> result = instance.obtenerActividadesDisponibles();
        int resultado = result.get(0).getIdPublicacion();
        assertEquals(resultadoEsperado, resultado);
    }

    /**
     * Test of eliminarPublicacionActividad method, of class PublicacionActividadDAO.
     */
    @Test //APROBADO 
    public void testEliminarPublicacionActividad() {
        System.out.println("eliminarPublicacionActividad");
        int idPublicacion = 4;
        PublicacionActividadDAO instance = new PublicacionActividadDAO();
        InformacionPublicacionActividad expResult = InformacionPublicacionActividad.publicacionEliminada;
        InformacionPublicacionActividad result = instance.eliminarPublicacionActividad(idPublicacion);
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerActividadesDisponiblesPorEE method, of class PublicacionActividadDAO.
     */
    @Test //APROBADO 
    public void testObtenerActividadesDisponiblesPorEE() {
        System.out.println("obtenerActividadesDisponiblesPorEE");
        String nrc = "39870";
        PublicacionActividadDAO instance = new PublicacionActividadDAO();
        String resultadoEsperado = "PA0003";
        ArrayList<PublicacionActividad> result = instance.obtenerActividadesDisponiblesPorEE(nrc);
        int resultado = result.get(0).getIdPublicacion();
        assertEquals(resultadoEsperado, resultado);
    }

    /**
     * Test of reducirCupoPublicacionActividad method, of class PublicacionActividadDAO.
     */
   @Test //APROBADO 
    public void testReducirCupoPublicacionActividad() {
        System.out.println("reducirCupoPublicacionActividad");
        int idPublicacionActividad = 9;
        PublicacionActividadDAO instance = new PublicacionActividadDAO();
        InformacionPublicacionActividad expResult = InformacionPublicacionActividad.cupoRestado;
        InformacionPublicacionActividad result = instance.reducirCupoPublicacionActividad(idPublicacionActividad);
        assertEquals(expResult, result);
    }

    /**
     * Test of aumentarCupoPublicacionActividad method, of class PublicacionActividadDAO.
     */
    @Test //APROBADO 
    public void testAumentarCupoPublicacionActividad() {
        System.out.println("aumentarCupoPublicacionActividad");
        int idPublicacionActividad = 4;
        PublicacionActividadDAO instance = new PublicacionActividadDAO();
        InformacionPublicacionActividad expResult = InformacionPublicacionActividad.cupoAumentado;
        InformacionPublicacionActividad result = instance.aumentarCupoPublicacionActividad(idPublicacionActividad);
        assertEquals(expResult, result);
    }
    
}
