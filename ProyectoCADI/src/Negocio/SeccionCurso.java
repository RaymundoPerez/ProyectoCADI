package Negocio;

/**
 * Plantilla con la información de la Sección del curso.
 *
 * @author Irvin Vera
 * @author Alonso Lora
 * @author Raymundo Pérez
 */
public class SeccionCurso {

    private String claveSeccion;
    private int numeroIntegrantes;
    private String nombreAsesor;

    public String getClaveSeccion() {
        return claveSeccion;
    }

    public void setClaveSeccion(String claveSeccion) {
        this.claveSeccion = claveSeccion;
    }

    public int getNumeroIntegrantes() {
        return numeroIntegrantes;
    }

    public void setNumeroIntegrantes(int numeroIntegrantes) {
        this.numeroIntegrantes = numeroIntegrantes;
    }

    public String getNombreAsesor() {
        return nombreAsesor;
    }

    public void setNombreAsesor(String nombreAsesor) {
        this.nombreAsesor = nombreAsesor;
    }

}
