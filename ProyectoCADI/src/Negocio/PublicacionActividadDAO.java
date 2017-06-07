package Negocio;

import Datos.ConexionSQL;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

/**
 * Permite realizar las acciones vinculadas con <PublicacionActividad>.
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public class PublicacionActividadDAO implements IPublicacionActividadDAO {

    /**
     * Permite obtener las actividades disponibles para un <UsuarioAutonomo>.
     *
     * @param matricula
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos
     * @return Una lista de objetos de la clase <PublicacionActividad>.
     */
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
                        + "where PUBLICACIONACTIVIDAD.cupo>0 and PUBLICACIONACTIVIDAD.idActividad=ACTIVIDAD.idActividad and "
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
                    publicacionActividad.setIdPublicacion(resultadoPublicacionActividad.getInt(1));
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

    /**
     * Permite obtener las reservaciones que tiene un <UsuarioAutonomo>.
     *
     * @param matricula
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos
     * @return Una lista con objetos de la clase <PublicacionActividad>.
     */
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
                    publicacionActividad.setIdPublicacion(resultadoPublicacionActividad.getInt(1));
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

    /**
     * Permite agregar una nueva publicación de alguna <Actividad>
     *
     * @param idPublicacionActividad
     * @param matricula
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos
     * @return Un objeto de la clase <InformacionPublicacionActividad>.
     */
    @Override
    public InformacionPublicacionActividad agregarReservacionPublicacionActividad(int idPublicacionActividad, String matricula) {
        InformacionPublicacionActividad mensaje = InformacionPublicacionActividad.reservacionNoguardada;
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "insert into RESERVACION values(?,?)";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setInt(1, idPublicacionActividad);
            sentenciaConsulta.setString(2, matricula);
            sentenciaConsulta.executeUpdate();
            reducirCupoPublicacionActividad(idPublicacionActividad);
            mensaje = InformacionPublicacionActividad.reservacionGuardada;
        } catch (SQLException exception) {

        } finally {
            conexionBD.cerrarConexion();
        }
        return mensaje;
    }

    /**
     * Permite eliminar una reservación de algún <UsuarioAutonmo>.
     *
     * @param idPublicacionActividad
     * @param matricula
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos
     * @return Un objeto de la clase <InformacionPublicacionActividad>.
     */
    @Override
    public InformacionPublicacionActividad eliminarReservacionPublicacionActividad(int idPublicacionActividad, String matricula) {
        InformacionPublicacionActividad mensaje = InformacionPublicacionActividad.reservacionNoEliminada;
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "delete from RESERVACION WHERE idPublicacion=? and matricula=?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setInt(1, idPublicacionActividad);
            sentenciaConsulta.setString(2, matricula);
            sentenciaConsulta.executeUpdate();
            aumentarCupoPublicacionActividad(idPublicacionActividad);
            mensaje = InformacionPublicacionActividad.reservacionEliminada;
        } catch (SQLException exception) {

        } finally {
            conexionBD.cerrarConexion();
        }
        return mensaje;
    }

    /**
     * Permite publicar una actividad.
     *
     * @param publicacionActividad
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos.
     * @return Un objeto de la clase <InformacionPublicacionActividad>.
     */
    @Override
    public InformacionPublicacionActividad publicarActividad(PublicacionActividad publicacionActividad) {
        InformacionPublicacionActividad mensaje = InformacionPublicacionActividad.actividadNoPublicada;
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "insert into PUBLICACIONACTIVIDAD values(null,?,?,?,?,?,?,?)";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setDate(1, new java.sql.Date(publicacionActividad.getFecha().getTime()));
            sentenciaConsulta.setTime(2, publicacionActividad.getHoraInicio());
            sentenciaConsulta.setTime(3, publicacionActividad.getHoraFin());
            sentenciaConsulta.setString(4, publicacionActividad.getIdAula());
            sentenciaConsulta.setString(5, publicacionActividad.getNombreActividad());
            sentenciaConsulta.setString(6, publicacionActividad.getNombreAsesor());
            sentenciaConsulta.setInt(7, publicacionActividad.getCupo());
            sentenciaConsulta.executeUpdate();
            mensaje = InformacionPublicacionActividad.actividadPublicada;
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        } finally {
            conexionBD.cerrarConexion();
        }
        return mensaje;
    }

    /**
     * Permite obtener las actividades disponibles.
     *
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos
     * @return Una lista con objetos de la clase <PublicacionActividad>.
     */
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
                publicacionActividad.setIdPublicacion(resultadoPublicacionActividad.getInt(1));
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

    /**
     * Permite eliminar alguna Publicacion de actividad.
     *
     * @param idPublicacion
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos
     * @return Un objeto de la clase <InformacionPublicacionActividad>.
     */
    @Override
    public InformacionPublicacionActividad eliminarPublicacionActividad(int idPublicacion) {
        InformacionPublicacionActividad mensaje = InformacionPublicacionActividad.publicacionNoEliminada;
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "delete from PUBLICACIONACTIVIDAD WHERE idPublicacion=?";
        try {
            eliminarTodasLasReservacionesDeUnaPublicacion(idPublicacion);
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setInt(1, idPublicacion);
            int resultadoConsulta = sentenciaConsulta.executeUpdate();
            if (resultadoConsulta == 1) {
                mensaje = InformacionPublicacionActividad.publicacionEliminada;
            }
        } catch (SQLException exception) {
            mensaje = InformacionPublicacionActividad.publicacionNoEliminada;
        } finally {
            conexionBD.cerrarConexion();
        }
        return mensaje;
    }

    /**
     * Permite obtener las actividades disponibles por <ExperienciaEducativa>
     *
     * @param nrc
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos
     * @return Una lista de obejtos de tipo <PublicacionActividad>.
     */
    @Override
    public ArrayList<PublicacionActividad> obtenerActividadesDisponiblesPorEE(String nrc) {
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
                    + "MODULO.nrc=EXPERIENCIAEDUCATIVA.nrc and EXPERIENCIAEDUCATIVA.nrc = ?";
            sentenciaConsultaPublicacionActividad = conexionBD.getConexion().prepareStatement(consultaSQLPublicacionActividad);
            sentenciaConsultaPublicacionActividad.setString(1, nrc);
            resultadoPublicacionActividad = sentenciaConsultaPublicacionActividad.executeQuery();
            while (resultadoPublicacionActividad.next()) {
                PublicacionActividad publicacionActividad = new PublicacionActividad();
                publicacionActividad.setIdPublicacion(resultadoPublicacionActividad.getInt(1));
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

    /**
     * Permite reducir el cupo de una <Actividad> cuando es reservada.
     *
     * @param idPublicacionActividad
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos
     * @return Un objeto de la clase <InformacionPublicacionActividad>.
     */
    @Override
    public InformacionPublicacionActividad reducirCupoPublicacionActividad(int idPublicacionActividad) {
        InformacionPublicacionActividad mensaje = InformacionPublicacionActividad.cupoNoRestado;
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "update PUBLICACIONACTIVIDAD set cupo=cupo-1 where PUBLICACIONACTIVIDAD.idPublicacion=?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setInt(1, idPublicacionActividad);
            sentenciaConsulta.executeUpdate();
            mensaje = InformacionPublicacionActividad.cupoRestado;
        } catch (SQLException exception) {

        } finally {
            conexionBD.cerrarConexion();
        }
        return mensaje;
    }

    /**
     * Permite aumentar el cupo de una <Actividad> cuando se elimina alguna
     * reservación.
     *
     * @param idPublicacionActividad
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos
     * @return Un objeto de la clase <InformacionPublicacionActividad>.
     */
    @Override
    public InformacionPublicacionActividad aumentarCupoPublicacionActividad(int idPublicacionActividad) {
        InformacionPublicacionActividad mensaje = InformacionPublicacionActividad.cupoNoAumentado;
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "update PUBLICACIONACTIVIDAD set cupo=cupo+1 where PUBLICACIONACTIVIDAD.idPublicacion=?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setInt(1, idPublicacionActividad);
            sentenciaConsulta.executeUpdate();
            mensaje = InformacionPublicacionActividad.cupoAumentado;
        } catch (SQLException exception) {

        } finally {
            conexionBD.cerrarConexion();
        }
        return mensaje;
    }

    /**
     * Permite eliminar todas las reservaciones de una <Actividad>.
     *
     * @param idPublicacionActividad
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos
     * @return Un objeto de la clase <InformacionPublicacionActividad>.
     */
    @Override
    public InformacionPublicacionActividad eliminarTodasLasReservacionesDeUnaPublicacion(int idPublicacionActividad) {
        InformacionPublicacionActividad mensaje = InformacionPublicacionActividad.reservacionNoEliminada;
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "delete from RESERVACION WHERE idPublicacion=?";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setInt(1, idPublicacionActividad);
            sentenciaConsulta.executeUpdate();
            aumentarCupoPublicacionActividad(idPublicacionActividad);
            mensaje = InformacionPublicacionActividad.reservacionEliminada;
        } catch (SQLException exception) {
            mensaje = InformacionPublicacionActividad.reservacionNoEliminada;
        } finally {
            conexionBD.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public int validarCruceHorarios(String matricula, Time horaInicio, Time horaFin,Date fecha) {
        int numeroActividadesValidas = 0;
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
                        + "MODULO.nrc=EXPERIENCIAEDUCATIVA.nrc and EXPERIENCIAEDUCATIVA.nrc=? and publicacionactividad.idPublicacion "
                        + "not in(select publicacionactividad.idPublicacion from publicacionactividad where (? = horaInicio "
                        + "or (?>horaInicio and ? < horaFin) or (?<=horafin and ?>horaInicio) "
                        + "or (?<horaFin and ?>horaFin)) and ? = fecha)";
                sentenciaConsultaPublicacionActividad = conexionBD.getConexion().prepareStatement(consultaSQLPublicacionActividad);
                sentenciaConsultaPublicacionActividad.setString(1, matricula);
                sentenciaConsultaPublicacionActividad.setString(2, experienciaEducativa.getNrc());
                sentenciaConsultaPublicacionActividad.setTime(3,horaInicio);
                sentenciaConsultaPublicacionActividad.setTime(4,horaInicio);
                sentenciaConsultaPublicacionActividad.setTime(5,horaInicio);
                sentenciaConsultaPublicacionActividad.setTime(6,horaFin);
                sentenciaConsultaPublicacionActividad.setTime(7,horaFin);
                sentenciaConsultaPublicacionActividad.setTime(8,horaInicio);
                sentenciaConsultaPublicacionActividad.setTime(9,horaFin);
                sentenciaConsultaPublicacionActividad.setDate(10, fecha);
                resultadoPublicacionActividad = sentenciaConsultaPublicacionActividad.executeQuery();
                while (resultadoPublicacionActividad.next()) {
                    numeroActividadesValidas++;
                }
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        } finally {
            conexionBD.cerrarConexion();
        }
        return numeroActividadesValidas;
    }

}
