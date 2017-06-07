package Negocio;

import Datos.ConexionSQL;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Permite realizar todas las acciones vinculadas con  Aula.
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public class AulaDAO implements IAulaDAO {

    /**
     * Permite obtener las aulas disponibles a partir de un hora y fecha.
     *
     * @param horaInicio hora de inicio de la actividad.
     * @param horaFin hora de finalizaciòn de la actividad.
     * @param fecha la fecha de la actividad.
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos.
     * @return regresa una lista de aulas disponibles.
     */
    @Override
    public ArrayList<Aula> obtenerAulasDisponibles(Time horaInicio, Time horaFin, Date fecha) {
        ArrayList<Aula> aulasDisponibles = new ArrayList();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select aula.idAula, aula.cupo from aula where aula.idAula not in(select publicacionactividad.idAula "
                + "from publicacionactividad, aula where aula.idAula = publicacionactividad.idAula and (? = horaInicio "
                + "or (?>horaInicio and ? < horaFin) or (?<=horafin and ?>horaInicio) "
                + "or (?<horaFin and ?>horaFin)) and ? = fecha)";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setTime(1, horaInicio);
            sentenciaConsulta.setTime(2, horaInicio);
            sentenciaConsulta.setTime(3, horaInicio);
            sentenciaConsulta.setTime(4, horaFin);
            sentenciaConsulta.setTime(5, horaFin);
            sentenciaConsulta.setTime(6, horaInicio);
            sentenciaConsulta.setTime(7, horaFin);
            sentenciaConsulta.setDate(8, fecha);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            while (resultadoConsulta.next()) {
                Aula aula = new Aula();
                aula.setIdAula(resultadoConsulta.getString(1));
                aula.setCupo(resultadoConsulta.getInt(2));
                aulasDisponibles.add(aula);
            }
        } catch (SQLException exception) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, exception);
        } finally {
            conexionBD.cerrarConexion();
        }
        return aulasDisponibles;
    }

}
