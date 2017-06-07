package Negocio;

/**
 * Plantilla con la información de las experiencias educaticas existentes en el
 * Centro de AutoAcceso.
 *
 * @author Irvin Vera
 * @author Alonso Lora
 * @author Raymundo Pérez
 */
public class ExperienciaEducativa {

    private String nrc;
    private String nombreExperienciaEducativa;
    private String horasPorCubrir;
    private String creditos;

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public String getNombreExperienciaEducativa() {
        return nombreExperienciaEducativa;
    }

    public void setNombreExperienciaEducativa(String nombreExperienciaEducativa) {
        this.nombreExperienciaEducativa = nombreExperienciaEducativa;
    }

    public String getHorasPorCubrir() {
        return horasPorCubrir;
    }

    public void setHorasPorCubrir(String horasPorCubrir) {
        this.horasPorCubrir = horasPorCubrir;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

}
