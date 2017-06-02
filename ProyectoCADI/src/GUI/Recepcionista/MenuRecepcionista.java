/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Recepcionista;

import Negocio.Empleado;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author Irdevelo
 */
public class MenuRecepcionista extends javax.swing.JFrame {
    private Empleado recepcionista;
   
    
    public MenuRecepcionista() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    
      public MenuRecepcionista(Empleado recepcionista) {
        this.recepcionista = recepcionista;
        initComponents();
        PantallaPrincipalAdministrarInscripcion pantalla = new PantallaPrincipalAdministrarInscripcion();
        añadirPanelPrincipal(pantalla);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
      public static void añadirPanelPrincipal(JPanel pantalla){
         panelPrincipalMenuRecepcionista.removeAll();
        Dimension dimensiones = pantalla.getPreferredSize();
        pantalla.setBounds(0,0,dimensiones.width, dimensiones.height);
        panelPrincipalMenuRecepcionista.add(pantalla);
        panelPrincipalMenuRecepcionista.repaint();
        panelPrincipalMenuRecepcionista.revalidate();
      }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuperior = new java.awt.Panel();
        botonPerfilUsuario = new java.awt.Button();
        panelMenu = new javax.swing.JPanel();
        etiquetaMenu = new javax.swing.JLabel();
        botonReservaciones = new java.awt.Button();
        botonReportes = new java.awt.Button();
        botonInscripciones = new java.awt.Button();
        botonAvisos = new java.awt.Button();
        botonActividadesSemanales = new java.awt.Button();
        scrollPaneMenuRecepcionista = new javax.swing.JScrollPane();
        panelPrincipalMenuRecepcionista = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelSuperior.setBackground(new java.awt.Color(84, 146, 207));

        botonPerfilUsuario.setBackground(new java.awt.Color(67, 136, 204));
        botonPerfilUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonPerfilUsuario.setForeground(new java.awt.Color(255, 255, 255));
        botonPerfilUsuario.setLabel(recepcionista.getNombres());
        botonPerfilUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPerfilUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonPerfilUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        panelMenu.setBackground(new java.awt.Color(51, 181, 229));

        etiquetaMenu.setText("                     Menú");

        botonReservaciones.setBackground(new java.awt.Color(51, 129, 158));
        botonReservaciones.setForeground(new java.awt.Color(255, 255, 255));
        botonReservaciones.setLabel("Reservaciones");
        botonReservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReservacionesActionPerformed(evt);
            }
        });

        botonReportes.setBackground(new java.awt.Color(51, 129, 158));
        botonReportes.setForeground(new java.awt.Color(255, 255, 255));
        botonReportes.setLabel("Reportes");

        botonInscripciones.setBackground(new java.awt.Color(77, 190, 232));
        botonInscripciones.setLabel("Inscripciones");
        botonInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInscripcionesActionPerformed(evt);
            }
        });

        botonAvisos.setBackground(new java.awt.Color(51, 129, 158));
        botonAvisos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonAvisos.setForeground(new java.awt.Color(255, 255, 255));
        botonAvisos.setLabel("Avisos");

        botonActividadesSemanales.setBackground(new java.awt.Color(51, 129, 158));
        botonActividadesSemanales.setForeground(new java.awt.Color(255, 255, 255));
        botonActividadesSemanales.setLabel("Actividades semanales");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonReservaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonInscripciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonAvisos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonActividadesSemanales, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
            .addComponent(etiquetaMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(etiquetaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(botonReservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonInscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonActividadesSemanales, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        scrollPaneMenuRecepcionista.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneMenuRecepcionista.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        panelPrincipalMenuRecepcionista.setPreferredSize(new java.awt.Dimension(0, 500));

        javax.swing.GroupLayout panelPrincipalMenuRecepcionistaLayout = new javax.swing.GroupLayout(panelPrincipalMenuRecepcionista);
        panelPrincipalMenuRecepcionista.setLayout(panelPrincipalMenuRecepcionistaLayout);
        panelPrincipalMenuRecepcionistaLayout.setHorizontalGroup(
            panelPrincipalMenuRecepcionistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 712, Short.MAX_VALUE)
        );
        panelPrincipalMenuRecepcionistaLayout.setVerticalGroup(
            panelPrincipalMenuRecepcionistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        scrollPaneMenuRecepcionista.setViewportView(panelPrincipalMenuRecepcionista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneMenuRecepcionista, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPaneMenuRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonReservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonReservacionesActionPerformed

    private void botonPerfilUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPerfilUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPerfilUsuarioActionPerformed

    private void botonInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInscripcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInscripcionesActionPerformed

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
            java.util.logging.Logger.getLogger(MenuRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuRecepcionista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button botonActividadesSemanales;
    private java.awt.Button botonAvisos;
    private java.awt.Button botonInscripciones;
    private java.awt.Button botonPerfilUsuario;
    private java.awt.Button botonReportes;
    private java.awt.Button botonReservaciones;
    private javax.swing.JLabel etiquetaMenu;
    private javax.swing.JPanel panelMenu;
    private static javax.swing.JPanel panelPrincipalMenuRecepcionista;
    private java.awt.Panel panelSuperior;
    private javax.swing.JScrollPane scrollPaneMenuRecepcionista;
    // End of variables declaration//GEN-END:variables
}
