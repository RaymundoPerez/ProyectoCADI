package Negocio;

import java.util.ArrayList;


/**
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public interface IExperienciaEducativaDAO {
    
    public String[] obtenerTodasLasExperienciasEducativas();
    public ArrayList<ExperienciaEducativa> obtenerExperienciasEducativasUsuarioAutonomo(String matricula);
       public ArrayList<ExperienciaEducativa> obtenerExperienciaEducativaPorIdioma(String idIdioma);
}
