package GUI.Recepcionista;

import Negocio.Cuenta;
import Negocio.CuentaDAO;
import Negocio.ExperienciaEducativaDAO;
import Negocio.InscripcionDAO;
import Negocio.SeccionCursoDAO;
import Negocio.UsuarioAutonomo;
import Negocio.UsuarioAutonomoDAO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Permite la visualización del panel con el contenido para dar del alta la inscripción un
 * UsuarioAutonomo.
 *
 * @author Irvin Vera.
 * @author Alonso Lora.
 * @author Raymundo Pérez.
 */
public class PantallaDarDeAltaInscripcion extends javax.swing.JPanel {

    private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public PantallaDarDeAltaInscripcion() {
        initComponents();
        ButtonGroup grupoDeRadioButton = new ButtonGroup();
        grupoDeRadioButton.add(radioButtonNuevoUsuario);
        grupoDeRadioButton.add(radioButtonUsuarioExistente);
        radioButtonNuevoUsuario.setSelected(true);
        ExperienciaEducativaDAO experienciaEducativaDAO = new ExperienciaEducativaDAO();
        comboBoxExperienciaEducativa.setModel(new javax.swing.DefaultComboBoxModel<>(experienciaEducativaDAO.obtenerTodasLasExperienciasEducativas()));
        comboBoxExperienciaEducativa.setSelectedItem(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        etiquetaInscripcion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        etiquetaNombres = new javax.swing.JLabel();
        campoTextoNombres = new javax.swing.JTextField();
        etiquetaApellidos = new javax.swing.JLabel();
        campoTextoApellidos = new javax.swing.JTextField();
        etiquetaFechaDeNacimiento = new javax.swing.JLabel();
        comboBoxDia = new javax.swing.JComboBox<>();
        comboBoxMes = new javax.swing.JComboBox<>();
        comboBoxAño = new javax.swing.JComboBox<>();
        etiquetaMatricula = new javax.swing.JLabel();
        campoTextoMatricula = new javax.swing.JTextField();
        etiquetaCorreoElectronico = new javax.swing.JLabel();
        campoTextoCorreoElectronico = new javax.swing.JTextField();
        etiquetaProgramaEducativo = new javax.swing.JLabel();
        comboBoxProgramaEducativo = new javax.swing.JComboBox<>();
        etiquetaExperienciaEducativa = new javax.swing.JLabel();
        comboBoxExperienciaEducativa = new javax.swing.JComboBox<>();
        botonGuardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        etiquetaSeccionCurso = new javax.swing.JLabel();
        comboBoxSeccionCurso = new javax.swing.JComboBox<>();
        radioButtonNuevoUsuario = new javax.swing.JRadioButton();
        radioButtonUsuarioExistente = new javax.swing.JRadioButton();

        etiquetaInscripcion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaInscripcion.setText("Inscripción");

        jSeparator1.setForeground(new java.awt.Color(20, 102, 255));

        etiquetaNombres.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaNombres.setText("Nombres:");

        campoTextoNombres.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        campoTextoNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoNombresActionPerformed(evt);
            }
        });
        campoTextoNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTextoNombresKeyTyped(evt);
            }
        });

        etiquetaApellidos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaApellidos.setText("Apellidos:");

        campoTextoApellidos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        campoTextoApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTextoApellidosKeyTyped(evt);
            }
        });

        etiquetaFechaDeNacimiento.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaFechaDeNacimiento.setText("Fecha de Nacimiento:");

        comboBoxDia.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        comboBoxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        comboBoxDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDiaActionPerformed(evt);
            }
        });

        comboBoxMes.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        comboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        comboBoxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMesActionPerformed(evt);
            }
        });

        comboBoxAño.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        comboBoxAño.setModel(new javax.swing.DefaultComboBoxModel<>(calcularRangoAños()));
        comboBoxAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxAñoActionPerformed(evt);
            }
        });

        etiquetaMatricula.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaMatricula.setText("Matrícula:");

        campoTextoMatricula.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
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

        etiquetaCorreoElectronico.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaCorreoElectronico.setText("Correo electrónico:");

        campoTextoCorreoElectronico.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        campoTextoCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoCorreoElectronicoActionPerformed(evt);
            }
        });
        campoTextoCorreoElectronico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTextoCorreoElectronicoKeyTyped(evt);
            }
        });

        etiquetaProgramaEducativo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaProgramaEducativo.setText("Programa educativo:");

        comboBoxProgramaEducativo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        comboBoxProgramaEducativo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Economía", "Ciencias Técnicas y Estadísticas", "Ingenieria de Software", "Redes y Servicios de Computo", "Tecnologías Computacionales" }));
        comboBoxProgramaEducativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxProgramaEducativoActionPerformed(evt);
            }
        });

        etiquetaExperienciaEducativa.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaExperienciaEducativa.setText("Experiencia educativa:");

        comboBoxExperienciaEducativa.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        comboBoxExperienciaEducativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxExperienciaEducativaActionPerformed(evt);
            }
        });

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        etiquetaSeccionCurso.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        etiquetaSeccionCurso.setText("Sección curso:");

        comboBoxSeccionCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSeccionCursoActionPerformed(evt);
            }
        });

        radioButtonNuevoUsuario.setText("Nuevo usuario");
        radioButtonNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonNuevoUsuarioActionPerformed(evt);
            }
        });

        radioButtonUsuarioExistente.setText("Usuario existente");
        radioButtonUsuarioExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonUsuarioExistenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaInscripcion)
                .addGap(328, 328, 328))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonNuevoUsuario)
                    .addComponent(campoTextoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaProgramaEducativo)
                    .addComponent(etiquetaCorreoElectronico)
                    .addComponent(etiquetaMatricula)
                    .addComponent(etiquetaFechaDeNacimiento)
                    .addComponent(etiquetaApellidos)
                    .addComponent(etiquetaNombres)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(comboBoxExperienciaEducativa, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBoxProgramaEducativo, javax.swing.GroupLayout.Alignment.LEADING, 0, 146, Short.MAX_VALUE)
                        .addComponent(campoTextoCorreoElectronico, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campoTextoMatricula, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaExperienciaEducativa)
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaSeccionCurso)
                                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxSeccionCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(comboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxAño, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioButtonUsuarioExistente)
                                .addGap(42, 42, 42)))
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(etiquetaInscripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonNuevoUsuario)
                    .addComponent(radioButtonUsuarioExistente))
                .addGap(23, 23, 23)
                .addComponent(etiquetaNombres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTextoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaApellidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTextoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaFechaDeNacimiento)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTextoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaCorreoElectronico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTextoCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaProgramaEducativo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxProgramaEducativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaExperienciaEducativa)
                    .addComponent(etiquetaSeccionCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxExperienciaEducativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxSeccionCurso))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        comboBoxDia.setSelectedItem(null);
        comboBoxMes.setSelectedItem(null);
        comboBoxAño.setSelectedItem(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void limitarCaracteres(java.awt.event.KeyEvent evt, JTextField campo, int caracteresMaximos) {
        if (campo.getText().length() >= caracteresMaximos) {
            evt.consume();
        }
    }

    /**
     * Verifica que los campos de texto no estén vacios.
     *
     * @return Un valor verdadero si estan vacios o un valor falso si es lo
     * contrario.
     */
    public boolean verificarCamposVacios() {
        boolean camposVacios;
        camposVacios = campoTextoApellidos.getText().isEmpty() || campoTextoApellidos.getText().isEmpty()
                || campoTextoMatricula.getText().isEmpty() || campoTextoCorreoElectronico.getText().isEmpty();
        return camposVacios;
    }

    /**
     * Permite verificar si los ComboBox están vacíos.
     *
     * @return Un valor verdadero si estan vacios o un valor falso si es lo
     * contrario.
     */
    public boolean estanVaciosComboBox() {
        boolean comboBoxNoSeleccinonados;
        comboBoxNoSeleccinonados = comboBoxDia.getSelectedItem() == null | comboBoxMes.getSelectedItem() == null
                | comboBoxAño.getSelectedItem() == null | comboBoxProgramaEducativo.getSelectedItem() == null
                | comboBoxExperienciaEducativa.getSelectedItem() == null
                | comboBoxSeccionCurso.getSelectedItem() == null;
        return comboBoxNoSeleccinonados;
    }

    /**
     * Permite calcular un rango de años que es usado en el comboBox para
     * selccionar el año de nacimiento de un UsuarioAtonomo.
     *
     * @return Un arreglo con un rango de años.
     */
    public String[] calcularRangoAños() {
        ArrayList<Integer> años = new ArrayList();
        Calendar fecha = new GregorianCalendar();
        for (int i = fecha.get(Calendar.YEAR) - 18; i >= 1950; i--) {
            años.add(i);
        }
        String[] rangoDeAños = new String[años.size()];
        for (int i = 0; i < años.size(); i++) {
            rangoDeAños[i] = String.valueOf(años.get(i));
        }
        return rangoDeAños;
    }

    /**
     * Permite validar que el correo electrónico ingresado tiene el formato
     * correcto.
     *
     * @param correo correo electronico del UsuarioAutonomo
     * @return Un valor verdadero el formato es correcto oo un valor falso si es
     * lo contrario.
     */
    public static boolean validarCorreo(String correo) {
        Pattern patron = Pattern.compile(PATTERN_EMAIL);
        Matcher matcher = patron.matcher(correo);
        return matcher.matches();
    }

    /**
     * Permite verificar un UsuarioAutonomo antes de mandarlo a inscribir.
     */
    public void inscribirNuevoUsuario() {
        if (verificarCamposVacios() || estanVaciosComboBox()) {
            JOptionPane.showMessageDialog(null, "Algunos campos estan vacios");
        } else if (validarCorreo(campoTextoCorreoElectronico.getText()) == false) {
            JOptionPane.showMessageDialog(null, "Introduzca un correo electrónico correcto");
        } else if (campoTextoMatricula.getText().length() == 9) {
            validarNuevoUsuario();
        } else {
            JOptionPane.showMessageDialog(null, "Introduzca el formato de matricula "
                    + "correcto, el cual empieza con 'S' y seguido de 8 números");
        }
    }

    /**
     * Permite validar que un UsuarioAutonomo no existe en el sistema antes de
     * inscribirlo.
     */
    public void validarNuevoUsuario() {
        UsuarioAutonomoDAO usuarioAutonomoDAO = new UsuarioAutonomoDAO();
        if (!usuarioAutonomoDAO.validarExistenciaUsuarioAutonomo(campoTextoMatricula.getText())) {
            agregarInscripcionNuevoUsuario();
        } else {
            JOptionPane.showMessageDialog(null, "El usuario ya existe");
        }
    }

    /**
     * Permite inscribir a un UsuarioAutonomo a una ExperienciaEEducativa.
     */
    public void agregarInscripcionNuevoUsuario() {
        CuentaDAO cuentaDAO = new CuentaDAO();
        UsuarioAutonomoDAO usuarioAutonomoDAO = new UsuarioAutonomoDAO();
        InscripcionDAO inscripcionDAO = new InscripcionDAO();
        Cuenta cuenta = new Cuenta();
        cuenta.setNombreUsuario("z" + campoTextoMatricula.getText());
        cuenta.setConstraseña(campoTextoMatricula.getText());
        cuenta.setTipoUsuario("UsuarioAutonomo");
        cuentaDAO.crearCuenta(cuenta);
        UsuarioAutonomo usuarioAutonomo = new UsuarioAutonomo();
        usuarioAutonomo.setNombres(campoTextoNombres.getText());
        usuarioAutonomo.setApellidos(campoTextoApellidos.getText());
        usuarioAutonomo.setMatricula(campoTextoMatricula.getText());
        usuarioAutonomo.setProgramaEducativo((String) comboBoxProgramaEducativo.getSelectedItem());
        usuarioAutonomo.setCorreoElectronico(campoTextoCorreoElectronico.getText());
        usuarioAutonomo.setFechaNac(Integer.parseInt((String) comboBoxAño.getSelectedItem()) - 1900, comboBoxMes.getSelectedIndex(),
                comboBoxDia.getSelectedIndex() + 1);
        usuarioAutonomoDAO.crearUsuarioAutonomo(usuarioAutonomo);
        inscripcionDAO.crearInscripcion(campoTextoMatricula.getText(), (String) comboBoxSeccionCurso.getSelectedItem());
        JOptionPane.showMessageDialog(null, "El alumno se ha inscrito correctamente");
    }

    /**
     * Permite inscribir a UsuarioAutonomo que anteriormente ya estaba
     * inscrito en el sistema.
     */
    public void inscribirUsuarioExistente() {
        if (campoTextoMatricula.getText().isEmpty() || comboBoxExperienciaEducativa.getSelectedItem() == null
                | comboBoxSeccionCurso.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Algunos campos estan vacios");
        } else {
            validarUsuarioExistente();
        }
    }

    /**
     * Permite verificar a un a UsuarioAutonomo que anteriormente ya estaba
     * inscrito en el sistema.
     */
    public void validarUsuarioExistente() {
        UsuarioAutonomoDAO usuarioAutonomoDAO = new UsuarioAutonomoDAO();
        if (usuarioAutonomoDAO.validarExistenciaUsuarioAutonomo(campoTextoMatricula.getText())) {
            validarInscripcionRepetida();
        } else {
            JOptionPane.showMessageDialog(null, "El usuario no existe");
        }
    }

    /**
     * Permite validar que un UsuarioAutonomo no pueda inscribir una
     * ExperienciaEducativa que ya tiene inscrita.
     */
    public void validarInscripcionRepetida() {
        InscripcionDAO inscripcionDAO = new InscripcionDAO();
        if (!inscripcionDAO.validarExistenciaInscripcion(campoTextoMatricula.getText(), (String) comboBoxSeccionCurso.getSelectedItem())) {
            agregarInscripcionUsuarioExistente();
        } else {
            JOptionPane.showMessageDialog(null, "El alumno ya esta inscrito en este curso");
        }
    }

    /**
     * Permite inscribir a un UsuarioAutonomo ya existente a una
     * ExperienciaEducativa.
     */
    public void agregarInscripcionUsuarioExistente() {
        InscripcionDAO inscripcionDAO = new InscripcionDAO();
        inscripcionDAO.crearInscripcion(campoTextoMatricula.getText(), (String) comboBoxSeccionCurso.getSelectedItem());
        JOptionPane.showMessageDialog(null, "El alumno se ha inscrito correctamente");

    }


    private void campoTextoNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoNombresActionPerformed

    }//GEN-LAST:event_campoTextoNombresActionPerformed

    private void campoTextoNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoNombresKeyTyped
        limitarCaracteres(evt, campoTextoNombres, 40);
    }//GEN-LAST:event_campoTextoNombresKeyTyped

    private void campoTextoApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoApellidosKeyTyped
        limitarCaracteres(evt, campoTextoApellidos, 50);
    }//GEN-LAST:event_campoTextoApellidosKeyTyped

    private void campoTextoMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoMatriculaKeyTyped
        limitarCaracteres(evt, campoTextoMatricula, 9);
    }//GEN-LAST:event_campoTextoMatriculaKeyTyped

    private void campoTextoCorreoElectronicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoCorreoElectronicoKeyTyped
        limitarCaracteres(evt, campoTextoCorreoElectronico, 40);
    }//GEN-LAST:event_campoTextoCorreoElectronicoKeyTyped

    private void comboBoxDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxDiaActionPerformed

    private void comboBoxAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxAñoActionPerformed

    private void comboBoxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxMesActionPerformed

    private void campoTextoCorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoCorreoElectronicoActionPerformed

    }//GEN-LAST:event_campoTextoCorreoElectronicoActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed

        if (radioButtonNuevoUsuario.isSelected()) {
            inscribirNuevoUsuario();
        } else {
            inscribirUsuarioExistente();
            PantallaPrincipalAdministrarInscripcion pantalla = new PantallaPrincipalAdministrarInscripcion();
            MenuRecepcionista.añadirPanelPrincipal(pantalla);
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void comboBoxExperienciaEducativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxExperienciaEducativaActionPerformed
        SeccionCursoDAO seccionCursoDAO = new SeccionCursoDAO();
        comboBoxSeccionCurso.setModel(new javax.swing.DefaultComboBoxModel<>(seccionCursoDAO.obtenerTodasLasSeccionesPorEE((String) comboBoxExperienciaEducativa.getSelectedItem())));
        comboBoxSeccionCurso.setSelectedItem(null);
    }//GEN-LAST:event_comboBoxExperienciaEducativaActionPerformed

    private void radioButtonNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonNuevoUsuarioActionPerformed
        activarCampos(true);
    }//GEN-LAST:event_radioButtonNuevoUsuarioActionPerformed

    private void radioButtonUsuarioExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonUsuarioExistenteActionPerformed
        activarCampos(false);
    }//GEN-LAST:event_radioButtonUsuarioExistenteActionPerformed

    private void comboBoxProgramaEducativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxProgramaEducativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxProgramaEducativoActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        PantallaPrincipalAdministrarInscripcion pantalla = new PantallaPrincipalAdministrarInscripcion();
        MenuRecepcionista.añadirPanelPrincipal(pantalla);
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void comboBoxSeccionCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSeccionCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSeccionCursoActionPerformed

    private void campoTextoMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoMatriculaActionPerformed

    public void activarCampos(boolean estaActivo) {
        etiquetaNombres.setVisible(estaActivo);
        campoTextoNombres.setVisible(estaActivo);
        etiquetaApellidos.setVisible(estaActivo);
        campoTextoApellidos.setVisible(estaActivo);
        etiquetaFechaDeNacimiento.setVisible(estaActivo);
        comboBoxDia.setVisible(estaActivo);
        comboBoxMes.setVisible(estaActivo);
        comboBoxAño.setVisible(estaActivo);
        etiquetaCorreoElectronico.setVisible(estaActivo);
        campoTextoCorreoElectronico.setVisible(estaActivo);
        etiquetaProgramaEducativo.setVisible(estaActivo);
        comboBoxProgramaEducativo.setVisible(estaActivo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField campoTextoApellidos;
    private javax.swing.JTextField campoTextoCorreoElectronico;
    private javax.swing.JTextField campoTextoMatricula;
    private javax.swing.JTextField campoTextoNombres;
    private javax.swing.JComboBox<String> comboBoxAño;
    private javax.swing.JComboBox<String> comboBoxDia;
    private javax.swing.JComboBox<String> comboBoxExperienciaEducativa;
    private javax.swing.JComboBox<String> comboBoxMes;
    private javax.swing.JComboBox<String> comboBoxProgramaEducativo;
    private javax.swing.JComboBox<String> comboBoxSeccionCurso;
    private javax.swing.JLabel etiquetaApellidos;
    private javax.swing.JLabel etiquetaCorreoElectronico;
    private javax.swing.JLabel etiquetaExperienciaEducativa;
    private javax.swing.JLabel etiquetaFechaDeNacimiento;
    private javax.swing.JLabel etiquetaInscripcion;
    private javax.swing.JLabel etiquetaMatricula;
    private javax.swing.JLabel etiquetaNombres;
    private javax.swing.JLabel etiquetaProgramaEducativo;
    private javax.swing.JLabel etiquetaSeccionCurso;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton radioButtonNuevoUsuario;
    private javax.swing.JRadioButton radioButtonUsuarioExistente;
    // End of variables declaration//GEN-END:variables
}
