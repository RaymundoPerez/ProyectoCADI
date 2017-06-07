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
public interface IAulaDAO {
    public ArrayList<Aula> obtenerAulasDisponibles(Time horaInicio,Time horaFin, Date fecha);
}
