/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Recepcionista;

import javax.swing.JPanel;

/**
 *
 * @author Irdevelo
 */
public class PantallaPrincipalAdministrarInscripcion extends javax.swing.JPanel {

    /**
     * Creates new form PantallaPrincipalAdministrarInscripcion
     */
    public PantallaPrincipalAdministrarInscripcion() {
        initComponents();
        setVisible(true);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPanelTablaAlumnos = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        botonNuevaInscripcion = new javax.swing.JButton();
        etiquetaTotalDeAlumnos = new javax.swing.JLabel();
        etiquetaQueAlumnoBuscabas = new javax.swing.JLabel();
        campoTextoMatricula = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();

        tablaAlumnos.setBackground(new java.awt.Color(204, 204, 204));
        tablaAlumnos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tablaAlumnos.setForeground(new java.awt.Color(204, 204, 204));
        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Apellidos", "Matrícula", "Experiencia Educativa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAlumnos.setGridColor(new java.awt.Color(204, 204, 204));
        scrollPanelTablaAlumnos.setViewportView(tablaAlumnos);

        botonNuevaInscripcion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        botonNuevaInscripcion.setText("Nueva inscripción ");
        botonNuevaInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevaInscripcionActionPerformed(evt);
            }
        });

        etiquetaTotalDeAlumnos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        etiquetaTotalDeAlumnos.setText("Total de alumnos: ");

        etiquetaQueAlumnoBuscabas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaQueAlumnoBuscabas.setText("¿Qué alumnos buscabas?");

        botonBuscar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        botonBuscar.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonNuevaInscripcion)
                            .addComponent(etiquetaTotalDeAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(scrollPanelTablaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                .addContainerGap(28, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(botonNuevaInscripcion)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaQueAlumnoBuscabas)
                        .addGap(18, 18, 18)
                        .addComponent(campoTextoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonBuscar))
                    .addComponent(scrollPanelTablaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaTotalDeAlumnos)
                .addContainerGap(157, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonNuevaInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevaInscripcionActionPerformed
       PantallaDarDeAltaInscripcion panelDarAlta = new PantallaDarDeAltaInscripcion();
        MenuRecepcionista.añadirPanelPrincipal(panelDarAlta);
    }//GEN-LAST:event_botonNuevaInscripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonNuevaInscripcion;
    private javax.swing.JTextField campoTextoMatricula;
    private javax.swing.JLabel etiquetaQueAlumnoBuscabas;
    private javax.swing.JLabel etiquetaTotalDeAlumnos;
    private javax.swing.JScrollPane scrollPanelTablaAlumnos;
    private javax.swing.JTable tablaAlumnos;
    // End of variables declaration//GEN-END:variables
}
