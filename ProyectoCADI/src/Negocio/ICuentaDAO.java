package Negocio;

/**
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public interface ICuentaDAO {
    
    public InformacionCuenta crearCuenta(Cuenta cuenta);
    
    public InformacionInicioSesion iniciarSesion(Cuenta cuenta);
    
    public boolean cerrarSesión();
    
    public InformacionInicioSesion validarCuenta(String tipoUsuario);
    
}
