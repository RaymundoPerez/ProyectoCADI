
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
}
