
package Negocio;

import java.util.ArrayList;

/**
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public interface IActividadDAO {
    public ArrayList<Actividad> obtenerActividadesPorSeccion(String idSeccion);
}
