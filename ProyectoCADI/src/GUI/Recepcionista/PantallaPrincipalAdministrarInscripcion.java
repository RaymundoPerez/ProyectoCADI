package GUI.Recepcionista;

import static GUI.Recepcionista.PantallaDarDeAltaInscripcion.limitarCaracteres;
import Negocio.UsuarioAutonomo;
import Negocio.UsuarioAutonomoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Permite la visualización del panel con el contenido para administrar la
 * inscripción de un
 * UsuarioAutonomo.
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public class PantallaPrincipalAdministrarInscripcion extends javax.swing.JPanel {

    public PantallaPrincipalAdministrarInscripcion() {
        initComponents();
        setVisible(true);
        llenarTablaDeUsuariosInscritos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonNuevaInscripcion = new javax.swing.JButton();
        etiquetaQueAlumnoBuscabas = new javax.swing.JLabel();
        campoTextoMatricula = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();

        botonNuevaInscripcion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        botonNuevaInscripcion.setText("Nueva inscripción ");
        botonNuevaInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevaInscripcionActionPerformed(evt);
            }
        });

        etiquetaQueAlumnoBuscabas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaQueAlumnoBuscabas.setText("¿Qué alumnos buscabas?");

        campoTextoMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoMatriculaActionPerformed(evt);
            }
        });
        campoTextoMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTextoMatriculaKeyTyped(evt);
            }
        });

        botonBuscar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellidos", "Matricula", "Experiencia educativa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAlumnos.setEnabled(false);
        jScrollPane1.setViewportView(tablaAlumnos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(botonNuevaInscripcion))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(botonBuscar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoTextoMatricula)
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaQueAlumnoBuscabas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(botonNuevaInscripcion)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(etiquetaQueAlumnoBuscabas)
                        .addGap(18, 18, 18)
                        .addComponent(campoTextoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(268, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonNuevaInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevaInscripcionActionPerformed
        PantallaDarDeAltaInscripcion panelDarAlta = new PantallaDarDeAltaInscripcion();
        MenuRecepcionista.añadirPanelPrincipal(panelDarAlta);
    }//GEN-LAST:event_botonNuevaInscripcionActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        if (campoTextoMatricula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Introduzca una matrícula");
        } else if (!validarMatriculaIngresada(campoTextoMatricula.getText())) {
            JOptionPane.showMessageDialog(null, "Introduzca una matrícula correcta");
        } else {
            UsuarioAutonomoDAO usuarioAutonomoDAO = new UsuarioAutonomoDAO();
            if (usuarioAutonomoDAO.validarExistenciaUsuarioAutonomoConInscripcion(campoTextoMatricula.getText())) {
                UsuarioAutonomoDAO usuarioAutonomo = new UsuarioAutonomoDAO();
                PantallaEliminarInscripcion pantallaEliminar = new PantallaEliminarInscripcion(usuarioAutonomo.obtenerUsuarioAutonomoPorMatricula(campoTextoMatricula.getText()));
                MenuRecepcionista.añadirPanelPrincipal(pantallaEliminar);

            } else {
                JOptionPane.showMessageDialog(null, "El usuario ingresado no tiene ninguna inscripción");
            }
        }

    }//GEN-LAST:event_botonBuscarActionPerformed

    private void campoTextoMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoMatriculaKeyTyped
        limitarCaracteres(evt, campoTextoMatricula, 9);
    }//GEN-LAST:event_campoTextoMatriculaKeyTyped

    private void campoTextoMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoMatriculaActionPerformed

    /**
     * Permite llenar la tabla que se visualiza en la GUI con los datos
     * correspondientes.
     */
    public void llenarTablaDeUsuariosInscritos() {
        UsuarioAutonomoDAO usuarioAutonomoDAO = new UsuarioAutonomoDAO();
        ArrayList<UsuarioAutonomo> usuariosAutonomos = usuarioAutonomoDAO.obtenerTodosLosAlumnosInscritos();
        String[][] matrizUsuariosInscritos = new String[usuariosAutonomos.size()][tablaAlumnos.getColumnCount()];

        for (int i = 0; i < usuariosAutonomos.size(); i++) {
            matrizUsuariosInscritos[i][0] = usuariosAutonomos.get(i).getNombres();
            matrizUsuariosInscritos[i][1] = usuariosAutonomos.get(i).getApellidos();
            matrizUsuariosInscritos[i][2] = usuariosAutonomos.get(i).getMatricula();
            matrizUsuariosInscritos[i][3] = usuariosAutonomos.get(i).getExperienciaEducativa();
        }

        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
                matrizUsuariosInscritos,
                new String[]{
                    "Nombres", "Apellidos", "Matrícula", "Experiencia Educativa"
                }));

    }

    /**
     * Permite validar que el formato de la matricula ingresada sea el correcto.
     *
     * @param matricula matricula del UsuarioAutonomo
     * @return Un valor verdadero si es el forato es el correto, sino regresa lo
     * contrario.
     */
    public boolean validarMatriculaIngresada(String matricula) {
        boolean formatoMatriculaCorrecto = false;
        if (matricula.charAt(0) == 'S' && matricula.length() == 9) {
            formatoMatriculaCorrecto = true;
        }
        return formatoMatriculaCorrecto;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonNuevaInscripcion;
    private javax.swing.JTextField campoTextoMatricula;
    private javax.swing.JLabel etiquetaQueAlumnoBuscabas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAlumnos;
    // End of variables declaration//GEN-END:variables
}
