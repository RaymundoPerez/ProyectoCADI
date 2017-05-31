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
    
    public InformacionInscripcion CrearInscripcion();
    public InformacionInscripcion elimnarInscripcion();     
    public InformacionInscripcion editarInscripcion();
    public void buscarInscripcion();
    
}
