
package Negocio;

import java.util.ArrayList;

/**
 *
 * @author alonso
 */
public interface IPublicacionActividadDAO {
    public ArrayList<PublicacionActividad> mostrarActividadesDisponiblesUsuarioAutonomo(String matricula);
    public InformacionPublicacionActividad publicarActividad();
    public String buscarAsesorDisponible();
    public String buscarAulaDisponible();
}
