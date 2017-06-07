package Negocio;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public interface IPublicacionActividadDAO {
    public ArrayList<PublicacionActividad> obtenerActividadesDisponiblesUsuarioAutonomo(String matricula);
    public ArrayList<PublicacionActividad> obtenerActividadesReservadasUsuarioAutonomo(String matricula);
    public InformacionPublicacionActividad agregarReservacionPublicacionActividad(int idPublicacionActividad, String matricula);
    public InformacionPublicacionActividad eliminarReservacionPublicacionActividad(int idPublicacionActividad, String matricula);
    public InformacionPublicacionActividad publicarActividad(PublicacionActividad publicacionActividad);
    public ArrayList<PublicacionActividad> obtenerActividadesDisponibles();
    public InformacionPublicacionActividad eliminarPublicacionActividad(int idPublicacion);
    public ArrayList<PublicacionActividad> obtenerActividadesDisponiblesPorEE(String nrc);
    public InformacionPublicacionActividad reducirCupoPublicacionActividad(int idPublicacionActividad);
    public InformacionPublicacionActividad aumentarCupoPublicacionActividad(int idPublicacionActividad);
    public InformacionPublicacionActividad eliminarTodasLasReservacionesDeUnaPublicacion(int idPublicacionActividad);
    public int validarCruceHorarios(String matricula, Time horaInicio,Time horaFin,Date fecha);
}
