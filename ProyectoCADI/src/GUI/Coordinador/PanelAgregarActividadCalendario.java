/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Coordinador;

import static GUI.Coordinador.MenuCoordinador.añadirPanelPrincipalCoordinador;
import Negocio.Actividad;
import Negocio.ActividadDAO;
import Negocio.ExperienciaEducativa;
import Negocio.ExperienciaEducativaDAO;
import Negocio.Idioma;
import Negocio.IdiomaDAO;
import Negocio.Modulo;
import Negocio.ModuloDAO;
import Negocio.Seccion;
import Negocio.SeccionDAO;
import java.util.ArrayList;

/**
 *
 * @author alonso
 */
public class PanelAgregarActividadCalendario extends javax.swing.JPanel {
    private ArrayList<Idioma> idiomas;
    private ArrayList<ExperienciaEducativa> experienciasEducativas;
    private ArrayList<Modulo> modulos;
    private ArrayList<Seccion> secciones;
    private ArrayList<Actividad> actividades;
     
    /**
     * Creates new form PanelAgregarActividadCalendario
     */
    public PanelAgregarActividadCalendario() {
        IdiomaDAO idiomaDAO = new IdiomaDAO();
        idiomas = idiomaDAO.obtenerTodosLosIdiomas();
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        etiquetaAgregarActividad = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        etiquetaIdioma = new javax.swing.JLabel();
        comboBoxIdioma = new javax.swing.JComboBox<>();
        etiquetaPreguntaActividadDeseada = new javax.swing.JLabel();
        comboBoxActividad = new javax.swing.JComboBox<>();
        etiquetaHora = new javax.swing.JLabel();
        etiquetaInicio = new javax.swing.JLabel();
        comboBoxHoraInicio = new javax.swing.JComboBox<>();
        etiquetaFin = new javax.swing.JLabel();
        comboBoxHoraFin = new javax.swing.JComboBox<>();
        etiquetaDiasDisponibles = new javax.swing.JLabel();
        checkBoxLunes = new javax.swing.JCheckBox();
        checkBoxMartes = new javax.swing.JCheckBox();
        checkBoxMiercoles = new javax.swing.JCheckBox();
        checkBoxJueves = new javax.swing.JCheckBox();
        checkBoxViernes = new javax.swing.JCheckBox();
        checkBoxSabado = new javax.swing.JCheckBox();
        botonCancelar = new javax.swing.JButton();
        botonAgregarActividad = new javax.swing.JButton();
        checkBoxTodaSemana = new javax.swing.JCheckBox();
        etiquetaModulo = new javax.swing.JLabel();
        comboBoxModulo = new javax.swing.JComboBox<>();
        etiquetaSeccion = new javax.swing.JLabel();
        comboBoxSeccion = new javax.swing.JComboBox<>();
        etiquetaExperienciaEducativa = new javax.swing.JLabel();
        comboBoxExperienciaEducativa = new javax.swing.JComboBox<>();

        etiquetaAgregarActividad.setText("Agregar actividad");

        etiquetaIdioma.setText("Idioma:");

        comboBoxIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(insertarIdiomas(this.idiomas)));
        comboBoxIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxIdiomaActionPerformed(evt);
            }
        });

        etiquetaPreguntaActividadDeseada.setText("¿Qué actividad desea añadir al calendario?");

        comboBoxActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        etiquetaHora.setText("Seleccione la hora:");

        etiquetaInicio.setText("Inicio:");

        comboBoxHoraInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        etiquetaFin.setText("Fin:");

        comboBoxHoraFin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        etiquetaDiasDisponibles.setText("Seleccione los dias que estará disponible la actividad");

        checkBoxLunes.setText("Lunes");

        checkBoxMartes.setText("Martes");

        checkBoxMiercoles.setText("Miércoles");

        checkBoxJueves.setText("Jueves");

        checkBoxViernes.setText("Viernes");

        checkBoxSabado.setText("Sabado");

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonAgregarActividad.setText("Agregar Actividad");

        checkBoxTodaSemana.setText("Toda la semana");

        etiquetaModulo.setText("Modulo");

        comboBoxModulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        comboBoxModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxModuloActionPerformed(evt);
            }
        });

        etiquetaSeccion.setText("Seccion");

        comboBoxSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        comboBoxSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSeccionActionPerformed(evt);
            }
        });

        etiquetaExperienciaEducativa.setText("Experiencia educativa:");

        comboBoxExperienciaEducativa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        comboBoxExperienciaEducativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxExperienciaEducativaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(comboBoxActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(295, 295, 295))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(etiquetaPreguntaActividadDeseada)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(etiquetaInicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etiquetaFin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBoxHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(244, 244, 244))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etiquetaHora)
                        .addGap(314, 314, 314))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etiquetaDiasDisponibles)
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(checkBoxLunes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkBoxMartes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkBoxMiercoles)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkBoxJueves)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkBoxViernes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkBoxSabado))
                            .addComponent(botonAgregarActividad, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkBoxTodaSemana)
                            .addComponent(botonCancelar))
                        .addGap(94, 94, 94))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(etiquetaIdioma))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxModulo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaAgregarActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(comboBoxIdioma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxSeccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etiquetaSeccion)
                        .addGap(379, 379, 379))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etiquetaModulo)
                        .addGap(378, 378, 378))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboBoxExperienciaEducativa, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaExperienciaEducativa))
                        .addGap(322, 322, 322))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAgregarActividad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaIdioma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaExperienciaEducativa)
                .addGap(18, 18, 18)
                .addComponent(comboBoxExperienciaEducativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(etiquetaModulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboBoxModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaSeccion)
                .addGap(18, 18, 18)
                .addComponent(comboBoxSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(etiquetaPreguntaActividadDeseada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboBoxActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaInicio)
                    .addComponent(comboBoxHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaFin)
                    .addComponent(comboBoxHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(etiquetaDiasDisponibles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxLunes)
                    .addComponent(checkBoxMartes)
                    .addComponent(checkBoxMiercoles)
                    .addComponent(checkBoxJueves)
                    .addComponent(checkBoxViernes)
                    .addComponent(checkBoxSabado)
                    .addComponent(checkBoxTodaSemana))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelar)
                    .addComponent(botonAgregarActividad))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        PantallaPrincipalCalendarioActividades pantallaPrincipalCalendarioActividades = new PantallaPrincipalCalendarioActividades();
        añadirPanelPrincipalCoordinador(pantallaPrincipalCalendarioActividades);
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void comboBoxIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxIdiomaActionPerformed
        ExperienciaEducativaDAO experienciaEducativaDAO = new ExperienciaEducativaDAO();
        experienciasEducativas = experienciaEducativaDAO.obtenerExperienciaEducativaPorIdioma(idiomas.get(comboBoxIdioma.getSelectedIndex()).getIdIdioma());
        comboBoxExperienciaEducativa.setModel(new javax.swing.DefaultComboBoxModel<>(insertarExperienciasEducativas()));
        comboBoxModulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        comboBoxSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        comboBoxActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
    }//GEN-LAST:event_comboBoxIdiomaActionPerformed

    private void comboBoxExperienciaEducativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxExperienciaEducativaActionPerformed
        ModuloDAO moduloDAO = new ModuloDAO();
        modulos = moduloDAO.obtenerModulosPorEE(experienciasEducativas.get(comboBoxExperienciaEducativa.getSelectedIndex()).getNrc());
        comboBoxModulo.setModel(new javax.swing.DefaultComboBoxModel<>(insertarModulos()));
        comboBoxSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        comboBoxActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
    }//GEN-LAST:event_comboBoxExperienciaEducativaActionPerformed

    private void comboBoxModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxModuloActionPerformed
        SeccionDAO seccionDAO = new SeccionDAO();
        secciones = seccionDAO.obtenerSeccionPorModulo(modulos.get(comboBoxModulo.getSelectedIndex()).getIdModulo());
        comboBoxSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(insertarSecciones()));
        comboBoxActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
    }//GEN-LAST:event_comboBoxModuloActionPerformed

    private void comboBoxSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSeccionActionPerformed
        ActividadDAO actividadDAO = new ActividadDAO();
        actividades = actividadDAO.seleccionarActividadPorSeccion(secciones.get(comboBoxSeccion.getSelectedIndex()).getIdSeccion());
        comboBoxActividad.setModel(new javax.swing.DefaultComboBoxModel<>(insertarActividades()));
    }//GEN-LAST:event_comboBoxSeccionActionPerformed
    
    public String[] insertarIdiomas(ArrayList<Idioma> idiomas){
        String[] arregloIdiomas = new String[idiomas.size()];
        for(int i=0; i<idiomas.size();i++){
            arregloIdiomas[i] = idiomas.get(i).getNombreIdioma();
        }
        return arregloIdiomas;
    }
    
    public String[] insertarExperienciasEducativas(){
        String[] arregloExperienciasEducativas = new String[experienciasEducativas.size()];
        for(int i=0; i<experienciasEducativas.size();i++){
            arregloExperienciasEducativas[i] = experienciasEducativas.get(i).getNombreExperienciaEducativa();
        }
        return arregloExperienciasEducativas;
    }
    
    public String[] insertarModulos(){
        String[] arregloModulos = new String[modulos.size()];
        for(int i=0; i<modulos.size();i++){
            arregloModulos[i] = modulos.get(i).getNombreModulo();
        }
        return arregloModulos;
    }
    
    public String[] insertarSecciones(){
        String[] arregloSecciones = new String[secciones.size()];
        for(int i=0; i<secciones.size();i++){
            arregloSecciones[i] = secciones.get(i).getNombreSeccion();
        }
        return arregloSecciones;
    }
    
    public String[] insertarActividades(){
        String[] arregloactividades = new String[actividades.size()];
        for(int i=0; i<actividades.size();i++){
            arregloactividades[i] = actividades.get(i).getNombreActividad();
        }
        return arregloactividades;
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarActividad;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JCheckBox checkBoxJueves;
    private javax.swing.JCheckBox checkBoxLunes;
    private javax.swing.JCheckBox checkBoxMartes;
    private javax.swing.JCheckBox checkBoxMiercoles;
    private javax.swing.JCheckBox checkBoxSabado;
    private javax.swing.JCheckBox checkBoxTodaSemana;
    private javax.swing.JCheckBox checkBoxViernes;
    private javax.swing.JComboBox<String> comboBoxActividad;
    private javax.swing.JComboBox<String> comboBoxExperienciaEducativa;
    private javax.swing.JComboBox<String> comboBoxHoraFin;
    private javax.swing.JComboBox<String> comboBoxHoraInicio;
    private javax.swing.JComboBox<String> comboBoxIdioma;
    private javax.swing.JComboBox<String> comboBoxModulo;
    private javax.swing.JComboBox<String> comboBoxSeccion;
    private javax.swing.JLabel etiquetaAgregarActividad;
    private javax.swing.JLabel etiquetaDiasDisponibles;
    private javax.swing.JLabel etiquetaExperienciaEducativa;
    private javax.swing.JLabel etiquetaFin;
    private javax.swing.JLabel etiquetaHora;
    private javax.swing.JLabel etiquetaIdioma;
    private javax.swing.JLabel etiquetaInicio;
    private javax.swing.JLabel etiquetaModulo;
    private javax.swing.JLabel etiquetaPreguntaActividadDeseada;
    private javax.swing.JLabel etiquetaSeccion;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
