package Negocio;

import java.util.ArrayList;

/**
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public interface ISeccionDAO {
    public ArrayList<Seccion> obtenerSeccionPorModulo(String idModulo);
}
