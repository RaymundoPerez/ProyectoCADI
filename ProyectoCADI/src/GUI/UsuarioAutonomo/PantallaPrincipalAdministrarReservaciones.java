/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.UsuarioAutonomo;

import Negocio.PublicacionActividad;
import Negocio.PublicacionActividadDAO;
import Negocio.UsuarioAutonomo;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sony
 */
public class PantallaPrincipalAdministrarReservaciones extends javax.swing.JPanel {

    private UsuarioAutonomo usuarioAutonomo;

    /**
     * Creates new form PantallaPrincipalAdministrarReservaciones
     */
    public PantallaPrincipalAdministrarReservaciones() {
        initComponents();
    }

    public PantallaPrincipalAdministrarReservaciones(UsuarioAutonomo usuarioAutonomo) {
        this.usuarioAutonomo = usuarioAutonomo;
        initComponents();
        insertarActividadesDisponibles();
        insertarActividadesReservadas();
    }

    public void insertarActividadesDisponibles() {
        PublicacionActividadDAO publicacionActividadDAO = new PublicacionActividadDAO();
        ArrayList<PublicacionActividad> publicacionesActividades;
        publicacionesActividades = publicacionActividadDAO.obtenerActividadesDisponiblesUsuarioAutonomo(usuarioAutonomo.getMatricula());
        String[][] matrizTablaActividadesDisponibles = new String[publicacionesActividades.size()][tablaActividadesDisponibles.getColumnCount()];
        for (int i = 0; i < publicacionesActividades.size(); i++) {
            matrizTablaActividadesDisponibles[i][0] = publicacionesActividades.get(i).getNombreExperienciaEducativa();
            matrizTablaActividadesDisponibles[i][1] = publicacionesActividades.get(i).getNombreActividad();
            matrizTablaActividadesDisponibles[i][2] = String.valueOf(publicacionesActividades.get(i).getFecha());
            matrizTablaActividadesDisponibles[i][3] = String.valueOf(publicacionesActividades.get(i).getHoraInicio());
            matrizTablaActividadesDisponibles[i][4] = publicacionesActividades.get(i).getIdAula();
            matrizTablaActividadesDisponibles[i][5] = publicacionesActividades.get(i).getNombreAsesor();
            
        }
        crearTabalaActividadesDisponibles(matrizTablaActividadesDisponibles);
    }

    public void crearTabalaActividadesDisponibles(String[][] matrizTablaActividadesDisponibles) {
        tablaActividadesDisponibles.setModel(new DefaultTableModel(
                matrizTablaActividadesDisponibles,
                new String[]{
                    "EE", "Actividad", "Fecha", "Hora", "Aula", "Profesor", ""
                }
        ));
        tablaActividadesDisponibles.setEnabled(false);

        tablaActividadesDisponibles.getColumnModel().getColumn(1).setPreferredWidth(220);
        tablaActividadesDisponibles.getColumnModel().getColumn(5).setPreferredWidth(210);

        tablaActividadesDisponibles.getColumnModel().getColumn(0).setResizable(false);
        tablaActividadesDisponibles.getColumnModel().getColumn(1).setResizable(false);
        tablaActividadesDisponibles.getColumnModel().getColumn(2).setResizable(false);
        tablaActividadesDisponibles.getColumnModel().getColumn(3).setResizable(false);
        tablaActividadesDisponibles.getColumnModel().getColumn(4).setResizable(false);
        tablaActividadesDisponibles.getColumnModel().getColumn(5).setResizable(false);
    }

    public void insertarActividadesReservadas() {
        PublicacionActividadDAO publicacionActividadDAO = new PublicacionActividadDAO();
        ArrayList<PublicacionActividad> publicacionesActividades;
        publicacionesActividades = publicacionActividadDAO.obtenerActividadesReservadasUsuarioAutonomo(usuarioAutonomo.getMatricula());
        String[][] matrizTablaActividadesReservadas = new String[publicacionesActividades.size()][tablaActividadesDisponibles.getColumnCount()];
        for (int i = 0; i < publicacionesActividades.size(); i++) {
            matrizTablaActividadesReservadas[i][0] = publicacionesActividades.get(i).getNombreExperienciaEducativa();
            matrizTablaActividadesReservadas[i][1] = publicacionesActividades.get(i).getNombreActividad();
            matrizTablaActividadesReservadas[i][2] = String.valueOf(publicacionesActividades.get(i).getFecha());
            matrizTablaActividadesReservadas[i][3] = String.valueOf(publicacionesActividades.get(i).getHoraInicio());
            matrizTablaActividadesReservadas[i][4] = publicacionesActividades.get(i).getIdAula();
            matrizTablaActividadesReservadas[i][5] = publicacionesActividades.get(i).getNombreAsesor();
        }
        crearTablaActividadesReservadas(matrizTablaActividadesReservadas);
    }
    
    public void crearTablaActividadesReservadas(String[][] matrizTablaActividadesReservadas){
        tablaActividadesReservadas.setModel(new DefaultTableModel(
                matrizTablaActividadesReservadas,
                new String[]{
                    "EE", "Actividad", "Fecha", "Hora", "Aula", "Profesor", ""
                }
        ));
        tablaActividadesReservadas.setEnabled(false);

        tablaActividadesReservadas.getColumnModel().getColumn(1).setPreferredWidth(220);
        tablaActividadesReservadas.getColumnModel().getColumn(5).setPreferredWidth(210);

        tablaActividadesReservadas.getColumnModel().getColumn(0).setResizable(false);
        tablaActividadesReservadas.getColumnModel().getColumn(1).setResizable(false);
        tablaActividadesReservadas.getColumnModel().getColumn(2).setResizable(false);
        tablaActividadesReservadas.getColumnModel().getColumn(3).setResizable(false);
        tablaActividadesReservadas.getColumnModel().getColumn(4).setResizable(false);
        tablaActividadesReservadas.getColumnModel().getColumn(5).setResizable(false);
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
        jSeparator2 = new javax.swing.JSeparator();
        etiquetaActividadesReservadas = new javax.swing.JLabel();
        etiquetaPregunta = new javax.swing.JLabel();
        etiquetaDia = new javax.swing.JLabel();
        etiquetaHora = new javax.swing.JLabel();
        comboBoxDia = new javax.swing.JComboBox<>();
        comboBoxHora = new javax.swing.JComboBox<>();
        botonBuscar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        etiquetaActividadesDisponibles = new javax.swing.JLabel();
        scrollPanelTablaActividadesReservadas = new javax.swing.JScrollPane();
        tablaActividadesReservadas = new javax.swing.JTable();
        scrollPanelTablaActividadesDisponibles = new javax.swing.JScrollPane();
        tablaActividadesDisponibles = new javax.swing.JTable();

        jSeparator1.setForeground(new java.awt.Color(51, 51, 255));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 255));

        etiquetaActividadesReservadas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaActividadesReservadas.setText("Actividades reservadas");

        etiquetaPregunta.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaPregunta.setText("¿Que dia buscabas?");

        etiquetaDia.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        etiquetaDia.setText("Día:");

        etiquetaHora.setText("Hora:");

        comboBoxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDiaActionPerformed(evt);
            }
        });

        comboBoxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(102, 102, 255));

        jSeparator4.setForeground(new java.awt.Color(102, 153, 255));

        etiquetaActividadesDisponibles.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaActividadesDisponibles.setText("Actividades disponibles");

        tablaActividadesReservadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EE", "Actividad", "Fecha", "Hora", "Aula", "Profesor", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPanelTablaActividadesReservadas.setViewportView(tablaActividadesReservadas);

        tablaActividadesDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EE", "Actividad", "Fecha", "Hora", "Aula", "Profesor", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPanelTablaActividadesDisponibles.setViewportView(tablaActividadesDisponibles);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollPanelTablaActividadesReservadas, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
                            .addComponent(scrollPanelTablaActividadesDisponibles))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboBoxDia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etiquetaHora)
                                .addComponent(etiquetaDia)
                                .addComponent(etiquetaPregunta)
                                .addComponent(comboBoxHora, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botonBuscar)
                                .addGap(54, 54, 54))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(299, 299, 299)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(43, 43, 43)
                                            .addComponent(etiquetaActividadesDisponibles))
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator1)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(etiquetaActividadesReservadas)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaActividadesReservadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanelTablaActividadesReservadas, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(etiquetaActividadesDisponibles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPanelTablaActividadesDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPregunta)
                        .addGap(18, 18, 18)
                        .addComponent(etiquetaDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(etiquetaHora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonBuscar)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void comboBoxDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxDiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JComboBox<String> comboBoxDia;
    private javax.swing.JComboBox<String> comboBoxHora;
    private javax.swing.JLabel etiquetaActividadesDisponibles;
    private javax.swing.JLabel etiquetaActividadesReservadas;
    private javax.swing.JLabel etiquetaDia;
    private javax.swing.JLabel etiquetaHora;
    private javax.swing.JLabel etiquetaPregunta;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JScrollPane scrollPanelTablaActividadesDisponibles;
    private javax.swing.JScrollPane scrollPanelTablaActividadesReservadas;
    private javax.swing.JTable tablaActividadesDisponibles;
    private javax.swing.JTable tablaActividadesReservadas;
    // End of variables declaration//GEN-END:variables
}
