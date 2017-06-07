package Negocio;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public interface IUsuarioAutonomoDAO {
    
    public InformacionUsuarioAutonomo crearUsuarioAutonomo(UsuarioAutonomo usuarioAutonomo);
    public UsuarioAutonomo obtenerUsuarioAutonomo(String nombreUsuario);
    public UsuarioAutonomo obtenerUsuarioAutonomoPorMatricula(String matricula);
    public boolean validarExistenciaUsuarioAutonomo(String matricula);
    public boolean validarExistenciaUsuarioAutonomoConInscripcion(String matricula);
    public ArrayList<UsuarioAutonomo> obtenerTodosLosAlumnosInscritos();
    
}
