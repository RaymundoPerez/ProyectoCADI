package Negocio;

import Datos.ConexionSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Permite realizar todas las acciones vinculadas con <Cuenta>
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public class CuentaDAO implements ICuentaDAO {

    /**
     * Perminte crear una cuenta para un nuevo usuario.
     *
     * @param cuenta.
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos.
     * @return Un objeto de la clase <InformacionCuenta>.
     */
    @Override
    public InformacionCuenta crearCuenta(Cuenta cuenta) {
        InformacionCuenta mensaje = InformacionCuenta.cuentaNoCreada;
        ConexionSQL conexionBD = new ConexionSQL();
        conexionBD.conectarBaseDatos();
        PreparedStatement sentenciaConsulta;
        String consultaSQL = "insert into CUENTA values(?,sha2(?,256),?)";
        try {
            sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
            sentenciaConsulta.setString(1, cuenta.getNombreUsuario());
            sentenciaConsulta.setString(2, cuenta.getConstraseña());
            sentenciaConsulta.setString(3, cuenta.getTipoUsuario());
            sentenciaConsulta.executeUpdate();
            mensaje = InformacionCuenta.cuentaCreadaCorrectamente;
        } catch (SQLException exception) {

        } finally {
            conexionBD.cerrarConexion();
        }
        return mensaje;
    }

    /**
     * Permite a un usuario iniciar sesión en el sistema.
     *
     * @param cuenta.
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos.
     * @return Un objeto de la clase <InformacionInicioSesion>.
     */
    @Override
    public InformacionInicioSesion iniciarSesion(Cuenta cuenta) {
        InformacionInicioSesion mensaje = InformacionInicioSesion.errorConexionBD;
        String tipoUsuario;
        ConexionSQL conexionBD = new ConexionSQL();
        PreparedStatement sentenciaConsulta;
        if (conexionBD.conectarBaseDatos() == InformacionConexion.conexionBDExitosa) {
            mensaje = InformacionInicioSesion.usuarioNoValido;
            String consultaSQL = "select tipoUsuario from CUENTA where nombreUsuario =? and contrasena = sha2(?,256)";
            try {
                sentenciaConsulta = conexionBD.getConexion().prepareStatement(consultaSQL);
                sentenciaConsulta.setString(1, cuenta.getNombreUsuario());
                sentenciaConsulta.setString(2, cuenta.getConstraseña());
                ResultSet resultadoConsulta = sentenciaConsulta.executeQuery();
                resultadoConsulta.next();
                tipoUsuario = resultadoConsulta.getString(1);
                mensaje = validarCuenta(tipoUsuario);
            } catch (SQLException exception) {

            } finally {
                conexionBD.cerrarConexion();
            }
        }
        return mensaje;
    }

    @Override
    public boolean cerrarSesión() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Permite validar el tipo de usuario que inicio sesión en sistema.
     *
     * @param tipoUsuario.
     * @return Un objeto de la clase <InformacionInicioSesion>.
     */
    @Override
    public InformacionInicioSesion validarCuenta(String tipoUsuario) {
        InformacionInicioSesion mensaje = null;
        switch (tipoUsuario) {
            case "UsuarioAutonomo":
                mensaje = InformacionInicioSesion.usuarioAutonomo;
                break;
            case "Coordinador":
                mensaje = InformacionInicioSesion.coordinador;
                break;
            case "Recepcionista":
                mensaje = InformacionInicioSesion.recepcionista;
                break;
        }
        return mensaje;
    }

}
