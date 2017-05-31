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
public class Inscripcion {
    
    private int calificacionFinal; 
    private int numeroInscripcion;
    private String matricula;
    private String claveSeccion;

    public int getCalificacionFinal() {
        return calificacionFinal;
    }

    public void setCalificacionFinal(int calificacionFinal) {
        this.calificacionFinal = calificacionFinal;
    }

    public int getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public void setNumeroInscripcion(int numeroInscripcion) {
        this.numeroInscripcion = numeroInscripcion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getClaveSeccion() {
        return claveSeccion;
    }

    public void setClaveSeccion(String claveSeccion) {
        this.claveSeccion = claveSeccion;
    }
    
    
    
}
