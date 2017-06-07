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
public interface IEmpleadoDAO {
    
    public Empleado obtenerEmpleado(String nombreUsuario);
    public String obtenerNombreEmpleado(String noPersonal);
    public ArrayList<Empleado> obtenerAsesoresDisponibles(Time horaInicio,Time horaFin, String idIdioma, Date fecha);
}
