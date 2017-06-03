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

/**
 *
 * @author raymu
 */
public class PublicacionActividadDAO implements IPublicacionActividadDAO {

    @Override
    public ArrayList<PublicacionActividad> mostrarActividadesDisponiblesUsuarioAutonomo(String matricula) {
        ArrayList<PublicacionActividad> publicacionesActividades = new ArrayList();
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
                        + "PUBLICACIONACTIVIDAD.idAula, ACTIVIDAD.nombreActividad, PUBLICACIONACTIVIDAD.noPersonal"
                        + "from PUBLICACIONACTIVIDAD,ACTIVIDAD,SECCION,MODULO,EXPERIENCIAEDUCATIVA"
                        + "where PUBLICACIONACTIVIDAD.idActividad=ACTIVIDAD.idActividad and "
                        + "ACTIVIDAD.idSeccion=SECCION.idSeccion and SECCION.idModulo = MODULO.idModulo and "
                        + "MODULO.nrc=EXPERIENCIAEDUCATIVA.nrc and EXPERIENCIAEDUCATIVA.nrc=?";
                sentenciaConsultaPublicacionActividad = conexionBD.getConexion().prepareStatement(consultaSQLPublicacionActividad);
                sentenciaConsultaPublicacionActividad.setString(1, experienciaEducativa.getNrc());
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

        } finally {
            conexionBD.cerrarConexion();
        }

        return publicacionesActividades;
    }

    @Override
    public InformacionPublicacionActividad publicarActividad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String buscarAsesorDisponible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String buscarAulaDisponible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
