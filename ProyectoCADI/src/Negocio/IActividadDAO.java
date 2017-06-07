
package Negocio;

import java.util.ArrayList;

/**
 *
 * @author alonso
 */
public interface IActividadDAO {
    public ArrayList<Actividad> obtenerActividadPorSeccion(String idSeccion);
}
