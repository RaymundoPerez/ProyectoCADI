package GUI.Coordinador;

import static GUI.Coordinador.MenuCoordinador.añadirPanelPrincipalCoordinador;
import Negocio.Actividad;
import Negocio.ActividadDAO;
import Negocio.Aula;
import Negocio.AulaDAO;
import Negocio.Empleado;
import Negocio.EmpleadoDAO;
import Negocio.ExperienciaEducativa;
import Negocio.ExperienciaEducativaDAO;
import Negocio.Idioma;
import Negocio.IdiomaDAO;
import Negocio.Modulo;
import Negocio.ModuloDAO;
import Negocio.PublicacionActividad;
import Negocio.PublicacionActividadDAO;
import Negocio.Seccion;
import Negocio.SeccionDAO;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * Permitela visualizacion de la GUI PanelAgregarActividadCalendario
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public class PanelAgregarActividadCalendario extends javax.swing.JPanel {

    private ArrayList<Idioma> idiomas;
    private ArrayList<ExperienciaEducativa> experienciasEducativas;
    private ArrayList<Modulo> modulos;
    private ArrayList<Seccion> secciones;
    private ArrayList<Actividad> actividades;
    Date fecha = new Date();
    private ArrayList<Empleado> asesoresDisponibles;
    private ArrayList<Aula> aulasDisponibles;

    public PanelAgregarActividadCalendario() {
        IdiomaDAO idiomaDAO = new IdiomaDAO();
        idiomas = idiomaDAO.obtenerTodosLosIdiomas();
        initComponents();

    }

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
        botonCancelar = new javax.swing.JButton();
        botonAgregarActividad = new javax.swing.JButton();
        etiquetaModulo = new javax.swing.JLabel();
        comboBoxModulo = new javax.swing.JComboBox<>();
        etiquetaSeccion = new javax.swing.JLabel();
        comboBoxSeccion = new javax.swing.JComboBox<>();
        etiquetaExperienciaEducativa = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JDateChooser();
        comboBoxExperienciaEducativa = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        comboBoxAsesor = new javax.swing.JComboBox<>();
        comboBoxAula = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        botonBuscarAsesor = new javax.swing.JButton();

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

        comboBoxHoraInicio.setModel(new javax.swing.DefaultComboBoxModel<>(generarHora()));
        comboBoxHoraInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxHoraInicioActionPerformed(evt);
            }
        });

        etiquetaFin.setText("Fin:");

        comboBoxHoraFin.setModel(new javax.swing.DefaultComboBoxModel<>());

        etiquetaDiasDisponibles.setText("Seleccione el día:");

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonAgregarActividad.setText("Agregar Actividad");
        botonAgregarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActividadActionPerformed(evt);
            }
        });

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

        calendario.setDateFormatString("yyyy/MM/d");
        calendario.setMinSelectableDate(fecha);

        comboBoxExperienciaEducativa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        comboBoxExperienciaEducativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxExperienciaEducativaActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione el asesor:");

        comboBoxAsesor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        comboBoxAula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        jLabel2.setText("Seleccione el aula:");

        botonBuscarAsesor.setText("Buscar asesor");
        botonBuscarAsesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarAsesorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAgregarActividad)
                .addGap(49, 49, 49)
                .addComponent(botonCancelar)
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(etiquetaAgregarActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator1)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboBoxModulo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(etiquetaIdioma))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(etiquetaSeccion)
                                    .addGap(57, 57, 57))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(etiquetaModulo)
                                    .addGap(56, 56, 56))
                                .addComponent(comboBoxExperienciaEducativa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etiquetaExperienciaEducativa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboBoxSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboBoxActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etiquetaPreguntaActividadDeseada))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(etiquetaHora)
                                        .addGap(195, 195, 195))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(etiquetaInicio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboBoxHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(etiquetaFin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboBoxHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(102, 102, 102))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(etiquetaDiasDisponibles)
                                        .addComponent(botonBuscarAsesor))
                                    .addGap(60, 60, 60)
                                    .addComponent(comboBoxAsesor, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(170, 170, 170))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addGap(37, 37, 37)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(comboBoxAula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)))))))
                .addContainerGap(161, Short.MAX_VALUE))
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
                .addGap(15, 15, 15)
                .addComponent(etiquetaIdioma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaExperienciaEducativa)
                .addGap(22, 22, 22)
                .addComponent(comboBoxExperienciaEducativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(etiquetaModulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboBoxModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaSeccion)
                .addGap(18, 18, 18)
                .addComponent(comboBoxSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaPreguntaActividadDeseada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboBoxActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaInicio)
                    .addComponent(comboBoxHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaFin)
                    .addComponent(comboBoxHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaDiasDisponibles)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBoxAsesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonBuscarAsesor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
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
        comboBoxModulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
        comboBoxSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
        comboBoxActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
    }//GEN-LAST:event_comboBoxIdiomaActionPerformed

    private void comboBoxExperienciaEducativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxExperienciaEducativaActionPerformed
        ModuloDAO moduloDAO = new ModuloDAO();
        modulos = moduloDAO.obtenerModulosPorEE(experienciasEducativas.get(comboBoxExperienciaEducativa.getSelectedIndex()).getNrc());
        comboBoxModulo.setModel(new javax.swing.DefaultComboBoxModel<>(insertarModulos()));
        comboBoxSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
        comboBoxActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
    }//GEN-LAST:event_comboBoxExperienciaEducativaActionPerformed

    private void comboBoxModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxModuloActionPerformed
        SeccionDAO seccionDAO = new SeccionDAO();
        secciones = seccionDAO.obtenerSeccionPorModulo(modulos.get(comboBoxModulo.getSelectedIndex()).getIdModulo());
        comboBoxSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(insertarSecciones()));
        comboBoxActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
    }//GEN-LAST:event_comboBoxModuloActionPerformed

    private void comboBoxSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSeccionActionPerformed
        ActividadDAO actividadDAO = new ActividadDAO();
        actividades = actividadDAO.obtenerActividadesPorSeccion(secciones.get(comboBoxSeccion.getSelectedIndex()).getIdSeccion());
        comboBoxActividad.setModel(new javax.swing.DefaultComboBoxModel<>(insertarActividades()));
    }//GEN-LAST:event_comboBoxSeccionActionPerformed

    private void comboBoxHoraInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxHoraInicioActionPerformed
        comboBoxHoraFin.setModel(new javax.swing.DefaultComboBoxModel<>(generarHoraFin(comboBoxHoraInicio.getSelectedIndex())));
    }//GEN-LAST:event_comboBoxHoraInicioActionPerformed

    private void botonAgregarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActividadActionPerformed
        PublicacionActividad publicacionActividad = new PublicacionActividad();
        if (!validarCamposVacios()) {
            publicacionActividad.setFecha(calendario.getDate());
            publicacionActividad.setHoraInicio(new Time(comboBoxHoraInicio.getSelectedIndex() + 8, 00, 00));
            publicacionActividad.setHoraFin(new Time(comboBoxHoraInicio.getSelectedIndex() + 9 + comboBoxHoraFin.getSelectedIndex(), 00, 00));
            publicacionActividad.setIdAula(aulasDisponibles.get(comboBoxAula.getSelectedIndex()).getIdAula());
            publicacionActividad.setNombreActividad(actividades.get(comboBoxActividad.getSelectedIndex()).getIdActividad());
            publicacionActividad.setNombreAsesor(asesoresDisponibles.get(comboBoxAsesor.getSelectedIndex()).getNoPersonal());
            publicacionActividad.setCupo(aulasDisponibles.get(comboBoxAula.getSelectedIndex()).getCupo());
            PublicacionActividadDAO publicacionDAO = new PublicacionActividadDAO();
            switch (publicacionDAO.publicarActividad(publicacionActividad)) {
                case actividadPublicada:
                    JOptionPane.showMessageDialog(null, "Publicación guardada");
                    comboBoxAsesor.setModel(new javax.swing.DefaultComboBoxModel<>());
                    comboBoxAula.setModel(new javax.swing.DefaultComboBoxModel<>());
                    break;

                case actividadNoPublicada:
                    JOptionPane.showMessageDialog(null, "Publicacion no guardada");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Existen campos vacios");
        }
    }//GEN-LAST:event_botonAgregarActividadActionPerformed

    private void botonBuscarAsesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarAsesorActionPerformed
        if (calendario.getDate() != null) {
            Time horaInicio = new Time(comboBoxHoraInicio.getSelectedIndex() + 8, 00, 00);
            Date fecha = calendario.getDate();
            Time horaFin = new Time((comboBoxHoraInicio.getSelectedIndex() + 8) + (comboBoxHoraFin.getSelectedIndex() + 1), 0, 0);
            EmpleadoDAO empleadoDAO = new EmpleadoDAO();
            asesoresDisponibles = empleadoDAO.obtenerAsesoresDisponibles(horaInicio, horaFin, idiomas.get(comboBoxIdioma.getSelectedIndex()).getIdIdioma(), new java.sql.Date(fecha.getTime()));
            AulaDAO aulaDAO = new AulaDAO();
            aulasDisponibles = aulaDAO.obtenerAulasDisponibles(horaInicio, horaFin, new java.sql.Date(fecha.getTime()));
            comboBoxAsesor.setModel(new javax.swing.DefaultComboBoxModel<>(generarAsoresDisponibles()));
            comboBoxAula.setModel(new javax.swing.DefaultComboBoxModel<>(insertarAulas()));
        } else {
            JOptionPane.showMessageDialog(null, "Existen campos vacios");
        }
    }//GEN-LAST:event_botonBuscarAsesorActionPerformed

    public String[] insertarIdiomas(ArrayList<Idioma> idiomas) {
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

    public String[] insertarModulos() {
        String[] arregloModulos = new String[modulos.size()];
        for (int i = 0; i < modulos.size(); i++) {
            arregloModulos[i] = modulos.get(i).getNombreModulo();
        }
        return arregloModulos;
    }

    public String[] insertarSecciones() {
        String[] arregloSecciones = new String[secciones.size()];
        for (int i = 0; i < secciones.size(); i++) {
            arregloSecciones[i] = secciones.get(i).getNombreSeccion();
        }
        return arregloSecciones;
    }

    public String[] insertarActividades() {
        String[] arregloactividades = new String[actividades.size()];
        for (int i = 0; i < actividades.size(); i++) {
            arregloactividades[i] = actividades.get(i).getNombreActividad();
        }
        return arregloactividades;
    }

    public String[] generarHora() {
        String[] horas = new String[14];
        for (int i = 0; i < 14; i++) {
            horas[i] = String.valueOf(i + 8) + ":00:00";
        }
        return horas;
    }

    public String[] generarHoraFin(int horaInicio) {
        String[] horas = new String[2];
        horaInicio += 8;
        horas[0] = String.valueOf(horaInicio + 1) + ":00:00";
        horas[1] = String.valueOf(horaInicio + 2) + ":00:00";
        return horas;
    }

    public String[] generarAsoresDisponibles() {
        String[] arregloAsesores = new String[asesoresDisponibles.size()];
        for (int i = 0; i < asesoresDisponibles.size(); i++) {
            arregloAsesores[i] = asesoresDisponibles.get(i).getNombres() + " " + asesoresDisponibles.get(i).getApellidos();
        }
        return arregloAsesores;
    }

    public String[] insertarAulas() {
        String[] arregloAulasDisponibles = new String[aulasDisponibles.size()];
        for (int i = 0; i < aulasDisponibles.size(); i++) {
            arregloAulasDisponibles[i] = aulasDisponibles.get(i).getIdAula();
        }
        return arregloAulasDisponibles;
    }

    public boolean validarCamposVacios() {
        return (comboBoxExperienciaEducativa.getSelectedItem() == null | comboBoxModulo.getSelectedItem() == null | comboBoxSeccion.getSelectedItem() == null
                | comboBoxActividad.getSelectedItem() == null | comboBoxHoraInicio.getSelectedItem() == null | comboBoxHoraFin.getSelectedItem() == null
                | calendario.getDate() == null | comboBoxAsesor.getSelectedItem() == null | comboBoxAula.getSelectedItem() == null);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarActividad;
    private javax.swing.JButton botonBuscarAsesor;
    private javax.swing.JButton botonCancelar;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JComboBox<String> comboBoxActividad;
    private javax.swing.JComboBox<String> comboBoxAsesor;
    private javax.swing.JComboBox<String> comboBoxAula;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
