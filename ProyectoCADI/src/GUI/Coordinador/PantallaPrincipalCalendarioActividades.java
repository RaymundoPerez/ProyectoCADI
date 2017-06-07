package GUI.Coordinador;

import static GUI.Coordinador.MenuCoordinador.añadirPanelPrincipalCoordinador;
import Negocio.ExperienciaEducativa;
import Negocio.ExperienciaEducativaDAO;
import Negocio.Idioma;
import Negocio.IdiomaDAO;
import Negocio.PublicacionActividad;
import Negocio.PublicacionActividadDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public class PantallaPrincipalCalendarioActividades extends javax.swing.JPanel {

    private ArrayList<PublicacionActividad> actividadesDisponibles;
    private ArrayList<Idioma> idiomas;
    private ArrayList<ExperienciaEducativa> experienciasEducativas;
    private int filaSeleccionada;

    public PantallaPrincipalCalendarioActividades() {
        PublicacionActividadDAO publicacionActividadDAO = new PublicacionActividadDAO();
        actividadesDisponibles = publicacionActividadDAO.obtenerActividadesDisponibles();
        IdiomaDAO idiomaDAO = new IdiomaDAO();
        idiomas = idiomaDAO.obtenerTodosLosIdiomas();
        initComponents();
        insertarActividades(actividadesDisponibles);
        filaSeleccionada = -1;
    }

    public String[] insertarIdiomas() {
        String[] arregloIdiomas = new String[idiomas.size()];
        for (int i = 0; i < idiomas.size(); i++) {
            arregloIdiomas[i] = idiomas.get(i).getNombreIdioma();
        }
        return arregloIdiomas;
    }

    public String[] insertarExperienciasEducativas() {
        String[] arregloExperienciasEducativas = new String[experienciasEducativas.size()];
        for (int i = 0; i < experienciasEducativas.size(); i++) {
            arregloExperienciasEducativas[i] = experienciasEducativas.get(i).getNombreExperienciaEducativa();
        }
        return arregloExperienciasEducativas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        etiquetaActividadesDisponibles = new javax.swing.JLabel();
        etiquetaCriterioBusqueda = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        scrollPanelTablaActividades = new javax.swing.JScrollPane();
        tablaActividadesDisponibles = new javax.swing.JTable();
        botonAgregarActividad = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        etiquetaIdioma = new javax.swing.JLabel();
        comboBoxIdioma = new javax.swing.JComboBox<>();
        etiquetaExperienciaEducativa = new javax.swing.JLabel();
        comboBoxExperienciaEducativa = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setPreferredSize(new java.awt.Dimension(900, 541));

        etiquetaActividadesDisponibles.setText("Actividades disponibles");

        etiquetaCriterioBusqueda.setText("¿Qué día buscabas?");

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        tablaActividadesDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EE", "Actividad", "Fecha", "Hora", "Aula", "Profesor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaActividadesDisponibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaActividadesDisponiblesMouseClicked(evt);
            }
        });
        scrollPanelTablaActividades.setViewportView(tablaActividadesDisponibles);

        botonAgregarActividad.setText("Agregar actividad");
        botonAgregarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActividadActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        etiquetaIdioma.setText("Idioma:");

        comboBoxIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(insertarIdiomas()));
        comboBoxIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxIdiomaActionPerformed(evt);
            }
        });

        etiquetaExperienciaEducativa.setText("Experiencia educativa:");

        comboBoxExperienciaEducativa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaActividadesDisponibles))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPanelTablaActividades, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAgregarActividad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonEliminar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiquetaCriterioBusqueda)
                            .addComponent(etiquetaIdioma)
                            .addComponent(etiquetaExperienciaEducativa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxExperienciaEducativa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxIdioma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonBuscar)
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaActividadesDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(botonAgregarActividad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaCriterioBusqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaIdioma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaExperienciaEducativa)
                        .addGap(20, 20, 20)
                        .addComponent(comboBoxExperienciaEducativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPanelTablaActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonEliminar)
                    .addComponent(botonBuscar))
                .addContainerGap(226, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActividadActionPerformed
        PanelAgregarActividadCalendario panelAgregarActividadCalendario = new PanelAgregarActividadCalendario();
        añadirPanelPrincipalCoordinador(panelAgregarActividadCalendario);
    }//GEN-LAST:event_botonAgregarActividadActionPerformed

    private void tablaActividadesDisponiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaActividadesDisponiblesMouseClicked
        filaSeleccionada = tablaActividadesDisponibles.getSelectedRow();
    }//GEN-LAST:event_tablaActividadesDisponiblesMouseClicked

    private void comboBoxIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxIdiomaActionPerformed
        ExperienciaEducativaDAO experienciaEducativaDAO = new ExperienciaEducativaDAO();
        experienciasEducativas = experienciaEducativaDAO.obtenerExperienciaEducativaPorIdioma(idiomas.get(comboBoxIdioma.getSelectedIndex()).getIdIdioma());
        comboBoxExperienciaEducativa.setModel(new javax.swing.DefaultComboBoxModel<>(insertarExperienciasEducativas()));
        comboBoxExperienciaEducativa.setSelectedItem(null);
    }//GEN-LAST:event_comboBoxIdiomaActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if (filaSeleccionada != -1) {
            PublicacionActividadDAO publicacionActividadDAO = new PublicacionActividadDAO();
            switch (publicacionActividadDAO.eliminarPublicacionActividad(actividadesDisponibles.get(filaSeleccionada).getIdPublicacion())) {
                case publicacionEliminada:
                    JOptionPane.showMessageDialog(null, "Se ha eliminado la publicación");
                    break;

                case publicacionNoEliminada:
                    JOptionPane.showMessageDialog(null, "No se ha eliminado la publicación");
                    break;
            }

            actividadesDisponibles = publicacionActividadDAO.obtenerActividadesDisponibles();
            insertarActividades(actividadesDisponibles);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una publicación");
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        if (comboBoxExperienciaEducativa.getSelectedItem() != null) {
            PublicacionActividadDAO publicacionActividadDAO = new PublicacionActividadDAO();
            actividadesDisponibles = publicacionActividadDAO.obtenerActividadesDisponiblesPorEE(experienciasEducativas.get(comboBoxExperienciaEducativa.getSelectedIndex()).getNrc());
            insertarActividades(actividadesDisponibles);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una experiencia educativa");
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    public void insertarActividades(ArrayList<PublicacionActividad> actividades) {

        String[][] matrizTablaActividadesReservadas = new String[actividadesDisponibles.size()][tablaActividadesDisponibles.getColumnCount()];
        for (int i = 0; i < actividadesDisponibles.size(); i++) {
            matrizTablaActividadesReservadas[i][0] = actividadesDisponibles.get(i).getNombreExperienciaEducativa();
            matrizTablaActividadesReservadas[i][1] = actividadesDisponibles.get(i).getNombreActividad();
            matrizTablaActividadesReservadas[i][2] = String.valueOf(actividadesDisponibles.get(i).getFecha());
            matrizTablaActividadesReservadas[i][3] = String.valueOf(actividadesDisponibles.get(i).getHoraInicio());
            matrizTablaActividadesReservadas[i][4] = actividadesDisponibles.get(i).getIdAula();
            matrizTablaActividadesReservadas[i][5] = actividadesDisponibles.get(i).getNombreAsesor();
        }
        crearTablaActividades(matrizTablaActividadesReservadas, tablaActividadesDisponibles);
    }

    /**
     *Permite llenar la tabla que se muestra en la interfaz gràfica.
     *
     * @param matriz los datos de las actividades
     * @param tabla tabla de actividades reservadas o disponibles
     */
    public void crearTablaActividades(String[][] matriz, JTable tabla) {
        tabla.setModel(new DefaultTableModel(
                matriz,
                new String[]{
                    "EE", "Actividad", "Fecha", "Hora", "Aula", "Profesor"
                }
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }
        );

        tabla.getColumnModel().getColumn(1).setPreferredWidth(220);
        tabla.getColumnModel().getColumn(5).setPreferredWidth(210);

        tabla.getColumnModel().getColumn(0).setResizable(false);
        tabla.getColumnModel().getColumn(1).setResizable(false);
        tabla.getColumnModel().getColumn(2).setResizable(false);
        tabla.getColumnModel().getColumn(3).setResizable(false);
        tabla.getColumnModel().getColumn(4).setResizable(false);
        tabla.getColumnModel().getColumn(5).setResizable(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarActividad;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JComboBox<String> comboBoxExperienciaEducativa;
    private javax.swing.JComboBox<String> comboBoxIdioma;
    private javax.swing.JLabel etiquetaActividadesDisponibles;
    private javax.swing.JLabel etiquetaCriterioBusqueda;
    private javax.swing.JLabel etiquetaExperienciaEducativa;
    private javax.swing.JLabel etiquetaIdioma;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane scrollPanelTablaActividades;
    private javax.swing.JTable tablaActividadesDisponibles;
    // End of variables declaration//GEN-END:variables
}
