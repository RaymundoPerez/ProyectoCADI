package GUI.UsuarioGeneral;

import GUI.Coordinador.MenuCoordinador;
import GUI.Recepcionista.MenuRecepcionista;
import static GUI.Recepcionista.PantallaDarDeAltaInscripcion.limitarCaracteres;
import GUI.UsuarioAutonomo.MenuUsuarioAutonomo;
import Negocio.Cuenta;
import Negocio.CuentaDAO;
import Negocio.EmpleadoDAO;
import Negocio.UsuarioAutonomoDAO;
import javax.swing.JOptionPane;

/**
 *Esta clase permite la visualizacion de la GUI IniciarSesion
 * 
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public class IniciarSesion extends javax.swing.JFrame {

    
    public IniciarSesion() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaNombreUsuario = new javax.swing.JLabel();
        campoTextoNombreUsuario = new javax.swing.JTextField();
        etiquetaContraseña = new javax.swing.JLabel();
        botonIniciarSesion = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        etiquetaInicioSesion = new javax.swing.JLabel();
        campoTextoContraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        etiquetaNombreUsuario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaNombreUsuario.setText("Nombre de usuario");

        campoTextoNombreUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTextoNombreUsuarioKeyTyped(evt);
            }
        });

        etiquetaContraseña.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaContraseña.setText("Contraseña");

        botonIniciarSesion.setText("Iniciar Sesion");
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        etiquetaInicioSesion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        etiquetaInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaInicioSesion.setText("Inicio de Sesión");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaInicioSesion)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaInicioSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        campoTextoContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTextoContraseñaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(botonIniciarSesion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoTextoContraseña)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(etiquetaContraseña)
                                    .addGap(54, 54, 54))
                                .addComponent(campoTextoNombreUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(etiquetaNombreUsuario)
                                    .addGap(33, 33, 33))))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(etiquetaNombreUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoTextoNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaContraseña)
                .addGap(18, 18, 18)
                .addComponent(campoTextoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonIniciarSesion)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed
        if(campoTextoNombreUsuario.getText().isEmpty() || campoTextoContraseña.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Algunos de los campos estan vacios");
    }else{
        Cuenta cuenta = new Cuenta();
        CuentaDAO cuentaDAO = new CuentaDAO();
        cuenta.setNombreUsuario(campoTextoNombreUsuario.getText());
        cuenta.setConstraseña(campoTextoContraseña.getText());
        switch(cuentaDAO.iniciarSesion(cuenta)){
            case usuarioAutonomo:
                UsuarioAutonomoDAO usuarioAutonomo = new UsuarioAutonomoDAO();
                new MenuUsuarioAutonomo(usuarioAutonomo.obtenerUsuarioAutonomo(campoTextoNombreUsuario.getText()));
                dispose();
                break;
            case recepcionista:
                EmpleadoDAO recepcionista = new EmpleadoDAO();
                new MenuRecepcionista(recepcionista.obtenerEmpleado(campoTextoNombreUsuario.getText()));
                dispose();
                break;
            case coordinador:
                EmpleadoDAO coordinador = new EmpleadoDAO();
                new MenuCoordinador(coordinador.obtenerEmpleado(campoTextoNombreUsuario.getText()));
                dispose();
                break;
            case usuarioNoValido:
                JOptionPane.showMessageDialog(null, "El usuario ingresado no es válido");
                break;
            case errorConexionBD:
                JOptionPane.showMessageDialog(null, "Oops... No podemos conectarnos con el servidor"
                        + ", lo sentimos");
                break;
        }
        }   
    }//GEN-LAST:event_botonIniciarSesionActionPerformed

    private void campoTextoNombreUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoNombreUsuarioKeyTyped
        limitarCaracteres(evt, campoTextoNombreUsuario, 10);
    }//GEN-LAST:event_campoTextoNombreUsuarioKeyTyped

    private void campoTextoContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoContraseñaKeyTyped
        limitarCaracteres(evt, campoTextoContraseña, 30);        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoContraseñaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciarSesion;
    private javax.swing.JPasswordField campoTextoContraseña;
    private javax.swing.JTextField campoTextoNombreUsuario;
    private javax.swing.JLabel etiquetaContraseña;
    private javax.swing.JLabel etiquetaInicioSesion;
    private javax.swing.JLabel etiquetaNombreUsuario;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
