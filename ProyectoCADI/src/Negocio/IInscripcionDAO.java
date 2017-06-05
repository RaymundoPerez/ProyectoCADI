/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Irdevelo
 */
public interface IInscripcionDAO {
    
    public InformacionInscripcion crearInscripcion(String matricula, String claveSeccionCurso);    
    public boolean validarExistenciaInscripcion(String matricula, String claveSeccionCurso);
    public String buscarInscripcion(String nrc);
    public InformacionInscripcion eliminarInscripcion(String matricula,String claveSeccion);
    
    
}
