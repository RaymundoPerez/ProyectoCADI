package GUI.Recepcionista;

import Negocio.ExperienciaEducativa;
import Negocio.ExperienciaEducativaDAO;
import Negocio.InscripcionDAO;
import Negocio.UsuarioAutonomo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Permite la visualización del panel con el contenido para eliminar la inscripción de un
 * UsuarioAutonomo.
 * 
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public class PantallaEliminarInscripcion extends javax.swing.JPanel {
    

    private UsuarioAutonomo usuarioAutonomo;
    private ArrayList<ExperienciaEducativa> experienciasEducativas;

    public PantallaEliminarInscripcion() {
        initComponents();
    }

    /**
     * Permite mandar a llamar al método de ExperienciaEducativaDAO
     * obtenerExperienciasEducativasUsuarioAutonomo.
     *
     * @param usuarioAutonomo contiene el UsuarioAutonomo que se desea eliminar
     */
    public PantallaEliminarInscripcion(UsuarioAutonomo usuarioAutonomo) {
        this.usuarioAutonomo = usuarioAutonomo;
        ExperienciaEducativaDAO experienciaEducativaDAO = new ExperienciaEducativaDAO();
        experienciasEducativas = experienciaEducativaDAO.obtenerExperienciasEducativasUsuarioAutonomo(usuarioAutonomo.getMatricula());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaDatosPersonales = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        etiquetaNombres = new javax.swing.JLabel();
        etiquetaApellidos = new javax.swing.JLabel();
        etiquetaFechaDeNacimiento = new javax.swing.JLabel();
        etiquetaMatricula = new javax.swing.JLabel();
        etiquetaCorreoElectronico = new javax.swing.JLabel();
        etiquetaProgramaEducativo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        etiquetaExperienciaEducativa = new javax.swing.JLabel();
        nombresAlumno = new javax.swing.JLabel();
        apellidosAlumno = new javax.swing.JLabel();
        fechaDeNacimientoAlumno = new javax.swing.JLabel();
        matriculaAlumno = new javax.swing.JLabel();
        correoElectronicoAlumno = new javax.swing.JLabel();
        programaEducativoAlumno = new javax.swing.JLabel();
        comboBoxExperienciaEducativa = new javax.swing.JComboBox<>();
        botonEliminarInscrpcion = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        etiquetaDatosPersonales.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaDatosPersonales.setText("Datos personales");

        jSeparator1.setForeground(new java.awt.Color(0, 51, 255));

        etiquetaNombres.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaNombres.setText("Nombres:");

        etiquetaApellidos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaApellidos.setText("Apellidos:");

        etiquetaFechaDeNacimiento.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaFechaDeNacimiento.setText("Fecha de Nacimiento:");

        etiquetaMatricula.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaMatricula.setText("Matrícula:");

        etiquetaCorreoElectronico.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaCorreoElectronico.setText("Correo electrónico:");

        etiquetaProgramaEducativo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaProgramaEducativo.setText("Programa educativo:");

        jSeparator2.setForeground(new java.awt.Color(0, 51, 255));

        etiquetaExperienciaEducativa.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaExperienciaEducativa.setText("Experiencia educativa:");

        nombresAlumno.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nombresAlumno.setText(usuarioAutonomo.getNombres());

        apellidosAlumno.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        apellidosAlumno.setText(usuarioAutonomo.getApellidos());

        fechaDeNacimientoAlumno.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        fechaDeNacimientoAlumno.setText(String.valueOf(usuarioAutonomo.getFechaNac()));

        matriculaAlumno.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        matriculaAlumno.setText(usuarioAutonomo.getMatricula());

        correoElectronicoAlumno.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        correoElectronicoAlumno.setText(usuarioAutonomo.getCorreoElectronico());

        programaEducativoAlumno.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        programaEducativoAlumno.setText(usuarioAutonomo.getProgramaEducativo());

        comboBoxExperienciaEducativa.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        comboBoxExperienciaEducativa.setModel(new javax.swing.DefaultComboBoxModel<>(generarListaDeExperienciasEducativas(experienciasEducativas)));
        comboBoxExperienciaEducativa.setSelectedIndex(-1);
        comboBoxExperienciaEducativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxExperienciaEducativaActionPerformed(evt);
            }
        });

        botonEliminarInscrpcion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        botonEliminarInscrpcion.setText("Eliminar Inscripción");
        botonEliminarInscrpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarInscrpcionActionPerformed(evt);
            }
        });

        botonCancelar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(etiquetaDatosPersonales))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                .addComponent(etiquetaNombres)
                                .addComponent(etiquetaApellidos)
                                .addComponent(etiquetaFechaDeNacimiento)
                                .addComponent(etiquetaMatricula)
                                .addComponent(etiquetaCorreoElectronico)
                                .addComponent(etiquetaProgramaEducativo)
                                .addComponent(jSeparator2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(programaEducativoAlumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(correoElectronicoAlumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(matriculaAlumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fechaDeNacimientoAlumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(apellidosAlumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                .addComponent(nombresAlumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(etiquetaExperienciaEducativa)
                            .addComponent(comboBoxExperienciaEducativa, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(239, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonEliminarInscrpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(etiquetaDatosPersonales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaNombres)
                .addGap(5, 5, 5)
                .addComponent(nombresAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaApellidos)
                .addGap(5, 5, 5)
                .addComponent(apellidosAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaFechaDeNacimiento)
                .addGap(5, 5, 5)
                .addComponent(fechaDeNacimientoAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(matriculaAlumno)
                .addGap(10, 10, 10)
                .addComponent(etiquetaCorreoElectronico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correoElectronicoAlumno)
                .addGap(10, 10, 10)
                .addComponent(etiquetaProgramaEducativo)
                .addGap(5, 5, 5)
                .addComponent(programaEducativoAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaExperienciaEducativa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxExperienciaEducativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonEliminarInscrpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        PantallaPrincipalAdministrarInscripcion pantalla = new PantallaPrincipalAdministrarInscripcion();
        MenuRecepcionista.añadirPanelPrincipal(pantalla);
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void comboBoxExperienciaEducativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxExperienciaEducativaActionPerformed


    }//GEN-LAST:event_comboBoxExperienciaEducativaActionPerformed

    private void botonEliminarInscrpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarInscrpcionActionPerformed
        if (comboBoxExperienciaEducativa.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Seleccione la Experiencia Educativa que desea eliminar");
        } else {
            InscripcionDAO inscripcionDAO = new InscripcionDAO();
            switch (inscripcionDAO.eliminarInscripcion(usuarioAutonomo.getMatricula(),
                    inscripcionDAO.buscarSeccionPorInscripcion(experienciasEducativas.get(comboBoxExperienciaEducativa.getSelectedIndex()).getNrc(),
                            usuarioAutonomo.getMatricula()))) {
                case inscripcionEliminadaCorrectamente:
                    JOptionPane.showMessageDialog(null, "Inscripcion eliminada");

                    break;

                case inscripcionNoEliminada:
                    JOptionPane.showMessageDialog(null, "La inscripcion no se pudo eliminar");
                    break;
            }
        }
        PantallaPrincipalAdministrarInscripcion pantalla = new PantallaPrincipalAdministrarInscripcion();
        MenuRecepcionista.añadirPanelPrincipal(pantalla);
    }//GEN-LAST:event_botonEliminarInscrpcionActionPerformed

 /**
     * Permite obtener los nombres de las Experiencias Educativas.
     *
     * @param experienciasEducativas contiene las experiencias educativas de las que se desean conocer los nombres
     * @exception SQLException. La excepción se puede mandar cuando no se
     * obtiene el resultado esperado por un error en la consulta a la base de
     * datos.
     * @return Un arreglo de nombres de Experiencias Educativas.
     */
    public String[] generarListaDeExperienciasEducativas(ArrayList<ExperienciaEducativa> experienciasEducativas) {
        String[] nombresExperienciaEducativa = new String[experienciasEducativas.size()];
        for (int i = 0; i < experienciasEducativas.size(); i++) {
            nombresExperienciaEducativa[i] = experienciasEducativas.get(i).getNombreExperienciaEducativa();
        }
        return nombresExperienciaEducativa;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidosAlumno;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEliminarInscrpcion;
    private javax.swing.JComboBox<String> comboBoxExperienciaEducativa;
    private javax.swing.JLabel correoElectronicoAlumno;
    private javax.swing.JLabel etiquetaApellidos;
    private javax.swing.JLabel etiquetaCorreoElectronico;
    private javax.swing.JLabel etiquetaDatosPersonales;
    private javax.swing.JLabel etiquetaExperienciaEducativa;
    private javax.swing.JLabel etiquetaFechaDeNacimiento;
    private javax.swing.JLabel etiquetaMatricula;
    private javax.swing.JLabel etiquetaNombres;
    private javax.swing.JLabel etiquetaProgramaEducativo;
    private javax.swing.JLabel fechaDeNacimientoAlumno;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel matriculaAlumno;
    private javax.swing.JLabel nombresAlumno;
    private javax.swing.JLabel programaEducativoAlumno;
    // End of variables declaration//GEN-END:variables
}
