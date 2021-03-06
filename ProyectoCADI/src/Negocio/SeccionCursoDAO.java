package Negocio;

import Datos.ConexionSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Permite realizar todas las acciones vinculadas con SeccionCurso.
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public class SeccionCursoDAO implements ISeccionCursoDAO {

    /**
     * Permite obtener todas las secciones dada una ExperienciaEducativa
     *
     * @param nombreEE.
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos
     * @return Un arreglo con los nombres de las secciones que tenga una
     * ExperienciaEducativa.
     */
    @Override
    public String[] obtenerTodasLasSeccionesPorEE(String nombreEE) {
        ArrayList<String> nombreSeccionCurso = new ArrayList<>();
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String[] arregloNombreSeccionCurso = null;
        String consultaSQL = "select claveSeccion from SeccionCurso,ExperienciaEducativa,Curso where ExperienciaEducativa.nombreExperienciaEducativa ="
                + "? and ExperienciaEducativa.nrc = Curso.nrc and Curso.idCurso = SeccionCurso.idCurso";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, nombreEE);
            ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
            while (resultadoConsulta.next()) {
                nombreSeccionCurso.add(resultadoConsulta.getString(1));
            }

            arregloNombreSeccionCurso = new String[nombreSeccionCurso.size()];
            arregloNombreSeccionCurso = nombreSeccionCurso.toArray(arregloNombreSeccionCurso);

        } catch (SQLException exception) {
            Logger.getLogger(SeccionCursoDAO.class.getName()).log(Level.SEVERE, null, exception);
        } finally {
            conexionBD.cerrarConexion();
        }

        return arregloNombreSeccionCurso;
    }

}
