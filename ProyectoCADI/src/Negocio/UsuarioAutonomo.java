package Negocio;

import java.sql.Date;

/**
 * Plantilla con la información del Usuario Autónomo.
 *
 * @author Irvin Vera
 * @author Alonso Lora
 * @author Raymundo Pérez
 */
public class UsuarioAutonomo {

    private String apellidos;
    private String nombres;
    private String correoElectronico;
    private String matricula;
    private String programaEducativo;
    private Date fechaNac;
    private String experienciaEducativa;

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getProgramaEducativo() {
        return programaEducativo;
    }

    public void setProgramaEducativo(String programaEducativo) {
        this.programaEducativo = programaEducativo;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setFechaNac(int año, int mes, int dia) {
        fechaNac = new Date(año, mes, dia);
    }

    public String getExperienciaEducativa() {
        return experienciaEducativa;
    }

    public void setExperienciaEducativa(String experienciaEducativa) {
        this.experienciaEducativa = experienciaEducativa;
    }

}
