package GUI.Coordinador;

import Negocio.Empleado;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 * Permite la visualiacion de la GUI MenuCoordinador.
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public class MenuCoordinador extends javax.swing.JFrame {

    private Empleado coordinador;

    public MenuCoordinador() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public MenuCoordinador(Empleado coordinador) {
        this.coordinador = coordinador;
        initComponents();
        PantallaPrincipalCalendarioActividades pantallaPrincipalCalendarioActividades = new PantallaPrincipalCalendarioActividades();
        añadirPanelPrincipalCoordinador(pantallaPrincipalCalendarioActividades);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Permite agregar un panel a MenuCoordinador.
     *
     * @param pantalla recibe la pantalla que se colocara en el la pantalla principal
     */
    public static void añadirPanelPrincipalCoordinador(JPanel pantalla) {
        panelPrincipal.removeAll();
        Dimension dimensiones = pantalla.getPreferredSize();
        pantalla.setBounds(0, 0, dimensiones.width, dimensiones.height);
        panelPrincipal.add(pantalla);
        panelPrincipal.repaint();
        panelPrincipal.revalidate();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuperior = new javax.swing.JPanel();
        botonPerfilUsuario = new java.awt.Button();
        panelMenu = new javax.swing.JPanel();
        etiquetaMenu = new javax.swing.JLabel();
        botonCalendarioDeActividades = new java.awt.Button();
        botonUsuarios = new java.awt.Button();
        botonAvisos = new java.awt.Button();
        botonReservaciones = new java.awt.Button();
        botonInscripciones = new java.awt.Button();
        botonReportes = new java.awt.Button();
        botonExperienciasEducativas = new java.awt.Button();
        botonSeguimientoDelAlumno = new java.awt.Button();
        botonActividad = new java.awt.Button();
        scrollPanelPrincipal = new javax.swing.JScrollPane();
        panelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelSuperior.setBackground(new java.awt.Color(84, 146, 207));
        panelSuperior.setMinimumSize(new java.awt.Dimension(143, 34));

        botonPerfilUsuario.setBackground(new java.awt.Color(67, 136, 204));
        botonPerfilUsuario.setForeground(new java.awt.Color(255, 255, 255));
        botonPerfilUsuario.setLabel(coordinador.getNombres());
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
                .addContainerGap(924, Short.MAX_VALUE)
                .addComponent(botonPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonPerfilUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        panelMenu.setBackground(new java.awt.Color(51, 181, 229));
        panelMenu.setPreferredSize(new java.awt.Dimension(155, 471));

        etiquetaMenu.setText("                  Menú");

        botonCalendarioDeActividades.setBackground(new java.awt.Color(72, 190, 232));
        botonCalendarioDeActividades.setLabel("Calendario de actividades");

        botonUsuarios.setBackground(new java.awt.Color(51, 129, 158));
        botonUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        botonUsuarios.setLabel("Usuarios");

        botonAvisos.setBackground(new java.awt.Color(51, 129, 158));
        botonAvisos.setForeground(new java.awt.Color(255, 255, 255));
        botonAvisos.setLabel("Avisos");

        botonReservaciones.setBackground(new java.awt.Color(51, 129, 158));
        botonReservaciones.setForeground(new java.awt.Color(255, 255, 255));
        botonReservaciones.setLabel("Reservaciones");

        botonInscripciones.setBackground(new java.awt.Color(51, 129, 158));
        botonInscripciones.setForeground(new java.awt.Color(255, 255, 255));
        botonInscripciones.setLabel("Inscrpciones");

        botonReportes.setBackground(new java.awt.Color(51, 129, 158));
        botonReportes.setForeground(new java.awt.Color(255, 255, 255));
        botonReportes.setLabel("Reportes");

        botonExperienciasEducativas.setBackground(new java.awt.Color(51, 129, 158));
        botonExperienciasEducativas.setForeground(new java.awt.Color(255, 255, 255));
        botonExperienciasEducativas.setLabel("Experiencias educativas");

        botonSeguimientoDelAlumno.setBackground(new java.awt.Color(51, 129, 158));
        botonSeguimientoDelAlumno.setForeground(new java.awt.Color(255, 255, 255));
        botonSeguimientoDelAlumno.setLabel("Seguimiento del alumno");

        botonActividad.setBackground(new java.awt.Color(51, 129, 158));
        botonActividad.setForeground(new java.awt.Color(255, 255, 255));
        botonActividad.setLabel("Actividad");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonCalendarioDeActividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonAvisos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonReservaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonInscripciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonExperienciasEducativas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonSeguimientoDelAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(etiquetaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonCalendarioDeActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonReservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonInscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonExperienciasEducativas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonSeguimientoDelAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        scrollPanelPrincipal.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanelPrincipal.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        panelPrincipal.setMinimumSize(new java.awt.Dimension(0, 700));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(0, 1000));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        scrollPanelPrincipal.setViewportView(panelPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(panelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanelPrincipal))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPerfilUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPerfilUsuarioActionPerformed

    }//GEN-LAST:event_botonPerfilUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCoordinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCoordinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCoordinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCoordinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCoordinador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button botonActividad;
    private java.awt.Button botonAvisos;
    private java.awt.Button botonCalendarioDeActividades;
    private java.awt.Button botonExperienciasEducativas;
    private java.awt.Button botonInscripciones;
    private java.awt.Button botonPerfilUsuario;
    private java.awt.Button botonReportes;
    private java.awt.Button botonReservaciones;
    private java.awt.Button botonSeguimientoDelAlumno;
    private java.awt.Button botonUsuarios;
    private javax.swing.JLabel etiquetaMenu;
    private javax.swing.JPanel panelMenu;
    private static javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JScrollPane scrollPanelPrincipal;
    // End of variables declaration//GEN-END:variables
}
