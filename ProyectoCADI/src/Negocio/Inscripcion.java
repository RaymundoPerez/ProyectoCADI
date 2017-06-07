package Negocio;

/**
 * Plantilla con la información de la Inscripción del UsuarioAutonomo.
 *
 * @author Irvin Vera
 * @author Alonso Lora
 * @author Raymundo Pérez
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
