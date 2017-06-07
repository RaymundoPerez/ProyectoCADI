/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;


/**
 *
 * @author Irdevelo
 */
public interface IExperienciaEducativaDAO {
    
    public String[] obtenerTodasLasExperienciasEducativas();
    public ArrayList<ExperienciaEducativa> obtenerExperienciasEducativasUsuarioAutonomo(String matricula);
       public ArrayList<ExperienciaEducativa> obtenerExperienciaEducativaPorIdioma(String idIdioma);
}
