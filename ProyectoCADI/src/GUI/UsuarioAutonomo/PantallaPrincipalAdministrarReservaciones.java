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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sony
 */
public class PantallaPrincipalAdministrarReservaciones extends javax.swing.JPanel {

    private UsuarioAutonomo usuarioAutonomo;
    private ArrayList<PublicacionActividad> publicacionesActividadesDisponibles;
    private ArrayList<PublicacionActividad> publicacionesActividadesReservadas;
    private int filaSeleccionadaActividadesDisponibles;
    private int filaSeleccionadaActividadesReservadas;

    /**
     * Creates new form PantallaPrincipalAdministrarReservaciones
     */
    public PantallaPrincipalAdministrarReservaciones() {
        initComponents();
    }

    public PantallaPrincipalAdministrarReservaciones(UsuarioAutonomo usuarioAutonomo) {
        this.usuarioAutonomo = usuarioAutonomo;
        filaSeleccionadaActividadesReservadas=-1;
        filaSeleccionadaActividadesDisponibles=-1;
        initComponents();
        insertarActividadesDisponibles();
        insertarActividadesReservadas();
    }

    public void insertarActividadesDisponibles() {
        PublicacionActividadDAO publicacionActividadDAO = new PublicacionActividadDAO();
        publicacionesActividadesDisponibles = publicacionActividadDAO.obtenerActividadesDisponiblesUsuarioAutonomo(usuarioAutonomo.getMatricula());
        String[][] matrizTablaActividadesDisponibles = new String[publicacionesActividadesDisponibles.size()][tablaActividadesDisponibles.getColumnCount()];
        for (int i = 0; i < publicacionesActividadesDisponibles.size(); i++) {
            matrizTablaActividadesDisponibles[i][0] = publicacionesActividadesDisponibles.get(i).getNombreExperienciaEducativa();
            matrizTablaActividadesDisponibles[i][1] = publicacionesActividadesDisponibles.get(i).getNombreActividad();
            matrizTablaActividadesDisponibles[i][2] = String.valueOf(publicacionesActividadesDisponibles.get(i).getFecha());
            matrizTablaActividadesDisponibles[i][3] = String.valueOf(publicacionesActividadesDisponibles.get(i).getHoraInicio());
            matrizTablaActividadesDisponibles[i][4] = publicacionesActividadesDisponibles.get(i).getIdAula();
            matrizTablaActividadesDisponibles[i][5] = publicacionesActividadesDisponibles.get(i).getNombreAsesor();

        }
        crearTablaActividades(matrizTablaActividadesDisponibles,tablaActividadesDisponibles);
    }

    public void insertarActividadesReservadas() {
        PublicacionActividadDAO publicacionActividadDAO = new PublicacionActividadDAO();
        publicacionesActividadesReservadas = publicacionActividadDAO.obtenerActividadesReservadasUsuarioAutonomo(usuarioAutonomo.getMatricula());
        String[][] matrizTablaActividadesReservadas = new String[publicacionesActividadesReservadas.size()][tablaActividadesDisponibles.getColumnCount()];
        for (int i = 0; i < publicacionesActividadesReservadas.size(); i++) {
            matrizTablaActividadesReservadas[i][0] = publicacionesActividadesReservadas.get(i).getNombreExperienciaEducativa();
            matrizTablaActividadesReservadas[i][1] = publicacionesActividadesReservadas.get(i).getNombreActividad();
            matrizTablaActividadesReservadas[i][2] = String.valueOf(publicacionesActividadesReservadas.get(i).getFecha());
            matrizTablaActividadesReservadas[i][3] = String.valueOf(publicacionesActividadesReservadas.get(i).getHoraInicio());
            matrizTablaActividadesReservadas[i][4] = publicacionesActividadesReservadas.get(i).getIdAula();
            matrizTablaActividadesReservadas[i][5] = publicacionesActividadesReservadas.get(i).getNombreAsesor();
        }
        crearTablaActividades(matrizTablaActividadesReservadas,tablaActividadesReservadas);
    }

    public void crearTablaActividades(String[][] matriz,JTable tabla) {
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
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        etiquetaActividadesDisponibles = new javax.swing.JLabel();
        scrollPanelTablaActividadesReservadas = new javax.swing.JScrollPane();
        tablaActividadesReservadas = new javax.swing.JTable();
        scrollPanelTablaActividadesDisponibles = new javax.swing.JScrollPane();
        tablaActividadesDisponibles = new javax.swing.JTable();
        botonEliminarReservacion = new javax.swing.JButton();
        botonReservarActividad = new javax.swing.JButton();

        jSeparator1.setForeground(new java.awt.Color(51, 51, 255));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 255));

        etiquetaActividadesReservadas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaActividadesReservadas.setText("Actividades reservadas");

        jSeparator3.setForeground(new java.awt.Color(102, 102, 255));

        jSeparator4.setForeground(new java.awt.Color(102, 153, 255));

        etiquetaActividadesDisponibles.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaActividadesDisponibles.setText("Actividades disponibles");

        tablaActividadesReservadas.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaActividadesReservadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaActividadesReservadasMouseClicked(evt);
            }
        });
        scrollPanelTablaActividadesReservadas.setViewportView(tablaActividadesReservadas);

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
        scrollPanelTablaActividadesDisponibles.setViewportView(tablaActividadesDisponibles);

        botonEliminarReservacion.setText("Eliminar");
        botonEliminarReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarReservacionActionPerformed(evt);
            }
        });

        botonReservarActividad.setText("Reservar");
        botonReservarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReservarActividadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollPanelTablaActividadesReservadas, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                            .addComponent(scrollPanelTablaActividadesDisponibles)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(43, 43, 43)
                                            .addComponent(etiquetaActividadesDisponibles))
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(179, 179, 179)
                                .addComponent(botonReservarActividad))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator1)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(etiquetaActividadesReservadas)))
                                .addGap(181, 181, 181)
                                .addComponent(botonEliminarReservacion)))))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaActividadesReservadas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonEliminarReservacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanelTablaActividadesReservadas, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(etiquetaActividadesDisponibles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonReservarActividad)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPanelTablaActividadesDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tablaActividadesDisponiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaActividadesDisponiblesMouseClicked
        filaSeleccionadaActividadesDisponibles = tablaActividadesDisponibles.getSelectedRow();
    }//GEN-LAST:event_tablaActividadesDisponiblesMouseClicked

    private void botonReservarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservarActividadActionPerformed
        if(filaSeleccionadaActividadesDisponibles!=-1){
        PublicacionActividadDAO publicacionActividadDAO = new PublicacionActividadDAO();
        publicacionActividadDAO.agregarReservacionPublicacionActividad(
                publicacionesActividadesDisponibles.get(filaSeleccionadaActividadesDisponibles).getIdPublicacion(),
                usuarioAutonomo.getMatricula());
        JOptionPane.showMessageDialog(null, "Se ha agregado la reservación");
        insertarActividadesDisponibles();
        insertarActividadesReservadas();
        filaSeleccionadaActividadesDisponibles=-1;
        }else{
            JOptionPane.showMessageDialog(null, "Por favor seleccione una actividad para reservar");
        }
    }//GEN-LAST:event_botonReservarActividadActionPerformed

    private void tablaActividadesReservadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaActividadesReservadasMouseClicked
        filaSeleccionadaActividadesReservadas = tablaActividadesReservadas.getSelectedRow();
    }//GEN-LAST:event_tablaActividadesReservadasMouseClicked

    private void botonEliminarReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarReservacionActionPerformed
        if(filaSeleccionadaActividadesReservadas!=-1){
        PublicacionActividadDAO publicacionActividadDAO = new PublicacionActividadDAO();
        publicacionActividadDAO.eliminarReservacionPublicacionActividad(
                publicacionesActividadesReservadas.get(filaSeleccionadaActividadesReservadas).getIdPublicacion(),
                usuarioAutonomo.getMatricula());
        JOptionPane.showMessageDialog(null, "Se ha eliminado la reservación");
        insertarActividadesReservadas();
        insertarActividadesDisponibles();
        filaSeleccionadaActividadesReservadas=-1;
        }else{
            JOptionPane.showMessageDialog(null, "Por favor seleccione una actividad para eliminar");
        }
    }//GEN-LAST:event_botonEliminarReservacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarReservacion;
    private javax.swing.JButton botonReservarActividad;
    private javax.swing.JLabel etiquetaActividadesDisponibles;
    private javax.swing.JLabel etiquetaActividadesReservadas;
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
