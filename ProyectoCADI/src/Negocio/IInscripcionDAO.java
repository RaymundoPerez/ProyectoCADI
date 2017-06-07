package Negocio;

/**
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public interface IInscripcionDAO {
    
    public InformacionInscripcion crearInscripcion(String matricula, String claveSeccionCurso);    
    public boolean validarExistenciaInscripcion(String matricula, String claveSeccionCurso);
    public String buscarSeccionPorInscripcion(String nrc,String matricula);
    public InformacionInscripcion eliminarInscripcion(String matricula,String claveSeccion);
    
    
}
