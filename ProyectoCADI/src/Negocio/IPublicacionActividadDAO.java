
package Negocio;

import java.util.ArrayList;

/**
 *
 * @author alonso
 */
public interface IPublicacionActividadDAO {
    public ArrayList<PublicacionActividad> obtenerActividadesDisponiblesUsuarioAutonomo(String matricula);
    public ArrayList<PublicacionActividad> obtenerActividadesReservadasUsuarioAutonomo(String matricula);
    public InformacionPublicacionActividad agregarReservacionPublicacionActividad(String idPublicacionActividad, String matricula);
    public InformacionPublicacionActividad eliminarReservacionPublicacionActividad(String idPublicacionActividad, String matricula);
    public InformacionPublicacionActividad publicarActividad(PublicacionActividad publicacionActividad);
    public ArrayList<PublicacionActividad> obtenerActividadesDisponibles();
    public InformacionPublicacionActividad eliminarPublicacionActividad(String idPublicacion);
    public ArrayList<PublicacionActividad> obtenerActividadesDisponiblesPorEE(String nrc);
    public InformacionPublicacionActividad reducirCupoPublicacionActividad(String idPublicacionActividad);
    public InformacionPublicacionActividad aumentarCupoPublicacionActividad(String idPublicacionActividad);
    public InformacionPublicacionActividad eliminarTodasLasReservacionesDeUnaPublicacion(String idPublicacionActividad);
}
