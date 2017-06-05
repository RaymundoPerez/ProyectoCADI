/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.ConexionSQL;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author alonso
 */
public class AulaDAO implements IAulaDAO{

    @Override
    public ArrayList<Aula> obtenerAulasDisponibles(Time hora, Date fecha) {
        ArrayList<Aula> aulasDisponibles = new ArrayList();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "select aula.idAula, aula.cupo from aula where aula.idAula not in(select publicacionactividad.idAula "
                + "from publicacionactividad, aula where aula.idAula = publicacionactividad.idAula and ? = publicacionactividad.horaInicio "
                + "and ? = publicacionactividad.fecha);";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setTime(1, hora);
            sentenciaConsulta.setDate(2, fecha);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            while (resultadoConsulta.next()) {
                Aula aula = new Aula();
                aula.setIdAula(resultadoConsulta.getString(1));
                aula.setCupo(resultadoConsulta.getInt(2));
                aulasDisponibles.add(aula);
            }
        } catch (SQLException exception) {

        } finally {
            conexionBD.cerrarConexion();
        }
        return aulasDisponibles;
    }
    
}
