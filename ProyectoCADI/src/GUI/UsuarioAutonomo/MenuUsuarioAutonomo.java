package GUI.UsuarioAutonomo;

import Negocio.UsuarioAutonomo;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 * Permite la visualización de la GUI del MenuUsuarioAutonomo.
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public class MenuUsuarioAutonomo extends javax.swing.JFrame {

    private UsuarioAutonomo usuarioAutonomo;

    public MenuUsuarioAutonomo() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public MenuUsuarioAutonomo(UsuarioAutonomo usuarioAutonomo) {
        this.usuarioAutonomo = usuarioAutonomo;
        initComponents();
        PantallaPrincipalAdministrarReservaciones pantalla = new PantallaPrincipalAdministrarReservaciones(usuarioAutonomo);
        añadirPanelPrincipal(pantalla);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Permite agregar un panel a MenuUsuarioAutonomo.
     *
     * @param pantalla es el panel que se mostrara en la pantalla principal
     */
    public void añadirPanelPrincipal(JPanel pantalla) {
        Dimension dimensiones = pantalla.getPreferredSize();
        pantalla.setBounds(0, 0, dimensiones.width, dimensiones.height);
        panelPrincipalMenuUsuarioAutonomo.add(pantalla);
        panelPrincipalMenuUsuarioAutonomo.repaint();
        panelPrincipalMenuUsuarioAutonomo.revalidate();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuperior = new javax.swing.JPanel();
        botonPerfilUsuario = new java.awt.Button();
        panelMenu = new javax.swing.JPanel();
        etiquetaMenu = new javax.swing.JLabel();
        botonActividades = new java.awt.Button();
        botonMiAvance = new java.awt.Button();
        botonPortafolioDeEvidencias = new java.awt.Button();
        botonAvisos = new java.awt.Button();
        panelPrincipalMenuUsuarioAutonomo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelSuperior.setBackground(new java.awt.Color(84, 146, 207));
        panelSuperior.setPreferredSize(new java.awt.Dimension(143, 34));

        botonPerfilUsuario.setBackground(new java.awt.Color(67, 136, 204));
        botonPerfilUsuario.setForeground(new java.awt.Color(255, 255, 255));
        botonPerfilUsuario.setLabel(usuarioAutonomo.getNombres());

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonPerfilUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        panelMenu.setBackground(new java.awt.Color(51, 181, 229));

        etiquetaMenu.setText("                   Menú");
        etiquetaMenu.setPreferredSize(new java.awt.Dimension(86, 14));

        botonActividades.setBackground(new java.awt.Color(72, 190, 232));
        botonActividades.setLabel("Actividades");
        botonActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActividadesActionPerformed(evt);
            }
        });

        botonMiAvance.setBackground(new java.awt.Color(51, 129, 158));
        botonMiAvance.setForeground(new java.awt.Color(255, 255, 255));
        botonMiAvance.setLabel("Mi avance");

        botonPortafolioDeEvidencias.setBackground(new java.awt.Color(51, 129, 158));
        botonPortafolioDeEvidencias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonPortafolioDeEvidencias.setForeground(new java.awt.Color(255, 255, 255));
        botonPortafolioDeEvidencias.setLabel("Portafolio de evidencias");

        botonAvisos.setBackground(new java.awt.Color(51, 129, 158));
        botonAvisos.setForeground(new java.awt.Color(255, 255, 255));
        botonAvisos.setLabel("Avisos");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botonAvisos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonPortafolioDeEvidencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonMiAvance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonActividades, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(etiquetaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonMiAvance, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonPortafolioDeEvidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalMenuUsuarioAutonomoLayout = new javax.swing.GroupLayout(panelPrincipalMenuUsuarioAutonomo);
        panelPrincipalMenuUsuarioAutonomo.setLayout(panelPrincipalMenuUsuarioAutonomoLayout);
        panelPrincipalMenuUsuarioAutonomoLayout.setHorizontalGroup(
            panelPrincipalMenuUsuarioAutonomoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        panelPrincipalMenuUsuarioAutonomoLayout.setVerticalGroup(
            panelPrincipalMenuUsuarioAutonomoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipalMenuUsuarioAutonomo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPrincipalMenuUsuarioAutonomo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActividadesActionPerformed
       
    }//GEN-LAST:event_botonActividadesActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUsuarioAutonomo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUsuarioAutonomo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUsuarioAutonomo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsuarioAutonomo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsuarioAutonomo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button botonActividades;
    private java.awt.Button botonAvisos;
    private java.awt.Button botonMiAvance;
    private java.awt.Button botonPerfilUsuario;
    private java.awt.Button botonPortafolioDeEvidencias;
    private javax.swing.JLabel etiquetaMenu;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipalMenuUsuarioAutonomo;
    private javax.swing.JPanel panelSuperior;
    // End of variables declaration//GEN-END:variables
}
