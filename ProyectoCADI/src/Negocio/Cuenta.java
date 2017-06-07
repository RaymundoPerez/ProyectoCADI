package Negocio;

/**
 * Plantilla con la información de la cuenta que tienen todos los usuarios para
 * ingresar al sistema.
 *
 * @author Irvin Vera
 * @author Alonso Lora
 * @author Raymundo Pérez
 */
public class Cuenta {

    private String constraseña;
    private String nombreUsuario;
    private String tipoUsuario;

    public String getConstraseña() {
        return constraseña;
    }

    public void setConstraseña(String constraseña) {
        this.constraseña = constraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}
