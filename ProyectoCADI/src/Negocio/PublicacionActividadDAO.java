/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.ConexionSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raymu
 */
public class PublicacionActividadDAO implements IPublicacionActividadDAO {

    @Override
    public ArrayList<PublicacionActividad> obtenerActividadesDisponiblesUsuarioAutonomo(String matricula) {
        ArrayList<PublicacionActividad> publicacionesActividades = new ArrayList<>();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsultaPublicacionActividad;
        String consultaSQLPublicacionActividad;
        ResultSet resultadoPublicacionActividad;
        try {
            ExperienciaEducativaDAO experienciaEducativaDAO = new ExperienciaEducativaDAO();
            EmpleadoDAO empleadoDAO = new EmpleadoDAO();
            ArrayList<ExperienciaEducativa> experienciasEducativas = experienciaEducativaDAO.obtenerExperienciasEducativasUsuarioAutonomo(matricula);
            for (ExperienciaEducativa experienciaEducativa : experienciasEducativas) {
                consultaSQLPublicacionActividad = "select PUBLICACIONACTIVIDAD.idPublicacion,"
                        + "PUBLICACIONACTIVIDAD.fecha, PUBLICACIONACTIVIDAD.horainicio, PUBLICACIONACTIVIDAD.horaFin,"
                        + "PUBLICACIONACTIVIDAD.idAula, ACTIVIDAD.nombreActividad, PUBLICACIONACTIVIDAD.noPersonal "
                        + "from PUBLICACIONACTIVIDAD,ACTIVIDAD,SECCION,MODULO,EXPERIENCIAEDUCATIVA "
                        + "where PUBLICACIONACTIVIDAD.idActividad=ACTIVIDAD.idActividad and "
                        + "ACTIVIDAD.idSeccion=SECCION.idSeccion and SECCION.idModulo = MODULO.idModulo and "
                        + "MODULO.nrc=EXPERIENCIAEDUCATIVA.nrc and EXPERIENCIAEDUCATIVA.nrc=? and "
                        + "PUBLICACIONACTIVIDAD.idPublicacion not in(select RESERVACION.idPublicacion from "
                        + "RESERVACION where ?=RESERVACION.matricula)";
                sentenciaConsultaPublicacionActividad = conexionBD.getConexion().prepareStatement(consultaSQLPublicacionActividad);
                sentenciaConsultaPublicacionActividad.setString(1, experienciaEducativa.getNrc());
                sentenciaConsultaPublicacionActividad.setString(2, matricula);
                resultadoPublicacionActividad = sentenciaConsultaPublicacionActividad.executeQuery();
                while (resultadoPublicacionActividad.next()) {
                    PublicacionActividad publicacionActividad = new PublicacionActividad();
                    publicacionActividad.setIdPublicacion(resultadoPublicacionActividad.getString(1));
                    publicacionActividad.setFecha(resultadoPublicacionActividad.getDate(2));
                    publicacionActividad.setHoraInicio(resultadoPublicacionActividad.getTime(3));
                    publicacionActividad.setHoraFin(resultadoPublicacionActividad.getTime(4));
                    publicacionActividad.setIdAula(resultadoPublicacionActividad.getString(5));
                    publicacionActividad.setNombreActividad(resultadoPublicacionActividad.getString(6));
                    publicacionActividad.setNombreAsesor(empleadoDAO.obtenerNombreEmpleado(resultadoPublicacionActividad.getString(7)));
                    publicacionActividad.setNombreExperienciaEducativa(experienciaEducativa.getNombreExperienciaEducativa());
                    publicacionesActividades.add(publicacionActividad);
                }
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        } finally {
            conexionBD.cerrarConexion();
        }

        return publicacionesActividades;
    }

    @Override
    public ArrayList<PublicacionActividad> obtenerActividadesReservadasUsuarioAutonomo(String matricula) {
        ArrayList<PublicacionActividad> publicacionesActividades = new ArrayList<>();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsultaPublicacionActividad;
        String consultaSQLPublicacionActividad;
        ResultSet resultadoPublicacionActividad;
        try {
            ExperienciaEducativaDAO experienciaEducativaDAO = new ExperienciaEducativaDAO();
            EmpleadoDAO empleadoDAO = new EmpleadoDAO();
            ArrayList<ExperienciaEducativa> experienciasEducativas = experienciaEducativaDAO.obtenerExperienciasEducativasUsuarioAutonomo(matricula);
            for (ExperienciaEducativa experienciaEducativa : experienciasEducativas) {
                consultaSQLPublicacionActividad = "select PUBLICACIONACTIVIDAD.idPublicacion,"
                        + "PUBLICACIONACTIVIDAD.fecha, PUBLICACIONACTIVIDAD.horainicio, PUBLICACIONACTIVIDAD.horaFin,"
                        + "PUBLICACIONACTIVIDAD.idAula, ACTIVIDAD.nombreActividad, PUBLICACIONACTIVIDAD.noPersonal "
                        + "from PUBLICACIONACTIVIDAD,ACTIVIDAD,SECCION,MODULO,EXPERIENCIAEDUCATIVA,RESERVACION "
                        + "where RESERVACION.matricula=? and RESERVACION.idPublicacion=PUBLICACIONACTIVIDAD.idPublicacion and "
                        + "PUBLICACIONACTIVIDAD.idActividad=ACTIVIDAD.idActividad and "
                        + "ACTIVIDAD.idSeccion=SECCION.idSeccion and SECCION.idModulo = MODULO.idModulo and "
                        + "MODULO.nrc=EXPERIENCIAEDUCATIVA.nrc and EXPERIENCIAEDUCATIVA.nrc=?";
                sentenciaConsultaPublicacionActividad = conexionBD.getConexion().prepareStatement(consultaSQLPublicacionActividad);
                sentenciaConsultaPublicacionActividad.setString(1, matricula);
                sentenciaConsultaPublicacionActividad.setString(2, experienciaEducativa.getNrc());
                resultadoPublicacionActividad = sentenciaConsultaPublicacionActividad.executeQuery();
                while (resultadoPublicacionActividad.next()) {
                    PublicacionActividad publicacionActividad = new PublicacionActividad();
                    publicacionActividad.setIdPublicacion(resultadoPublicacionActividad.getString(1));
                    publicacionActividad.setFecha(resultadoPublicacionActividad.getDate(2));
                    publicacionActividad.setHoraInicio(resultadoPublicacionActividad.getTime(3));
                    publicacionActividad.setHoraFin(resultadoPublicacionActividad.getTime(4));
                    publicacionActividad.setIdAula(resultadoPublicacionActividad.getString(5));
                    publicacionActividad.setNombreActividad(resultadoPublicacionActividad.getString(6));
                    publicacionActividad.setNombreAsesor(empleadoDAO.obtenerNombreEmpleado(resultadoPublicacionActividad.getString(7)));
                    publicacionActividad.setNombreExperienciaEducativa(experienciaEducativa.getNombreExperienciaEducativa());
                    publicacionesActividades.add(publicacionActividad);
                }
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        } finally {
            conexionBD.cerrarConexion();
        }

        return publicacionesActividades;
    }

    @Override
    public InformacionPublicacionActividad agregarReservacionPublicacionActividad(String idPublicacionActividad, String matricula) {
        InformacionPublicacionActividad mensaje = InformacionPublicacionActividad.reservacionNoguardada;
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "insert into RESERVACION values(?,?)";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, idPublicacionActividad);
            sentenciaConsulta.setString(2, matricula);
            sentenciaConsulta.executeUpdate();
            mensaje = InformacionPublicacionActividad.reservacionGuardada;
        } catch (SQLException exception) {

        } finally {
            conexionBD.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public InformacionPublicacionActividad eliminarReservacionPublicacionActividad(String idPublicacionActividad, String matricula) {
        InformacionPublicacionActividad mensaje = InformacionPublicacionActividad.reservacionNoEliminada;
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "delete from RESERVACION WHERE idPublicacion=? and matricula=?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, idPublicacionActividad);
            sentenciaConsulta.setString(2, matricula);
            sentenciaConsulta.executeUpdate();
            mensaje = InformacionPublicacionActividad.reservacionEliminada;
        } catch (SQLException exception) {

        } finally {
            conexionBD.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public InformacionPublicacionActividad publicarActividad(PublicacionActividad publicacionActividad) {
       InformacionPublicacionActividad mensaje = InformacionPublicacionActividad.actividadNoPublicada;
       ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "insert into PUBLICIACIONACTIVIDAD values('PA0005',?,?,?,?,?,?,?)";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setDate(1,new java.sql.Date(publicacionActividad.getFecha().getTime()));
            sentenciaConsulta.setTime(2, publicacionActividad.getHoraInicio());
            sentenciaConsulta.setTime(3, publicacionActividad.getHoraFin());
            sentenciaConsulta.setString(4, publicacionActividad.getIdAula());
            sentenciaConsulta.setString(5, publicacionActividad.getNombreActividad());
            sentenciaConsulta.setString(6,publicacionActividad.getNombreAsesor());
            sentenciaConsulta.setInt(7, publicacionActividad.getCupo());
            sentenciaConsulta.executeUpdate();
            mensaje = InformacionPublicacionActividad.actividadPublicada;
        } catch (SQLException exception) {

        } finally {
            conexionBD.cerrarConexion();
        }
       return mensaje;
    }


    @Override
    public ArrayList<PublicacionActividad> obtenerActividadesDisponibles() {
        ArrayList<PublicacionActividad> publicacionesActividades = new ArrayList<>();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsultaPublicacionActividad;
        String consultaSQLPublicacionActividad;
        ResultSet resultadoPublicacionActividad;
        try {
            ExperienciaEducativaDAO experienciaEducativaDAO = new ExperienciaEducativaDAO();
            EmpleadoDAO empleadoDAO = new EmpleadoDAO();
                consultaSQLPublicacionActividad = "select PUBLICACIONACTIVIDAD.idPublicacion,"
                        + "PUBLICACIONACTIVIDAD.fecha, PUBLICACIONACTIVIDAD.horainicio, PUBLICACIONACTIVIDAD.horaFin,"
                        + "PUBLICACIONACTIVIDAD.idAula, ACTIVIDAD.nombreActividad, PUBLICACIONACTIVIDAD.noPersonal, "
                        + "EXPERIENCIAEDUCATIVA.nombreExperienciaEducativa from PUBLICACIONACTIVIDAD,ACTIVIDAD,SECCION,MODULO,EXPERIENCIAEDUCATIVA "
                        + "where PUBLICACIONACTIVIDAD.idActividad=ACTIVIDAD.idActividad and "
                        + "ACTIVIDAD.idSeccion=SECCION.idSeccion and SECCION.idModulo = MODULO.idModulo and "
                        + "MODULO.nrc=EXPERIENCIAEDUCATIVA.nrc";
                sentenciaConsultaPublicacionActividad = conexionBD.getConexion().prepareStatement(consultaSQLPublicacionActividad);
                
                resultadoPublicacionActividad = sentenciaConsultaPublicacionActividad.executeQuery();
                while (resultadoPublicacionActividad.next()) {
                    PublicacionActividad publicacionActividad = new PublicacionActividad();
                    publicacionActividad.setIdPublicacion(resultadoPublicacionActividad.getString(1));
                    publicacionActividad.setFecha(resultadoPublicacionActividad.getDate(2));
                    publicacionActividad.setHoraInicio(resultadoPublicacionActividad.getTime(3));
                    publicacionActividad.setHoraFin(resultadoPublicacionActividad.getTime(4));
                    publicacionActividad.setIdAula(resultadoPublicacionActividad.getString(5));
                    publicacionActividad.setNombreActividad(resultadoPublicacionActividad.getString(6));
                    publicacionActividad.setNombreAsesor(empleadoDAO.obtenerNombreEmpleado(resultadoPublicacionActividad.getString(7)));
                    publicacionActividad.setNombreExperienciaEducativa(resultadoPublicacionActividad.getString(8));
                    publicacionesActividades.add(publicacionActividad);
                }
            
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        } finally {
            conexionBD.cerrarConexion();
        }

        return publicacionesActividades;
    }
    
    

}
