
package Negocio;

import java.util.ArrayList;

/**
 *
 * @author alonso
 */
public interface IPublicacionActividadDAO {
    public ArrayList<Actividad> mostrarActividadesDisponibles();
    public InformacionPublicacionActividad publicarActividad();
    public String buscarAsesorDisponible();
    public String buscarAulaDisponible();
}
