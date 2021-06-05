/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesion8.vista;

import com.sesion8.control.ControlRegistroPersona;
import com.sesion8.modelo.Persona;
import com.sesion8.utilidades.LimpiarComponentes;
import com.sesion8.utilidades.MensajesSwing;
import com.sesion8.utilidades.ModelosComponentesSwing;
import com.sesion8.utilidades.ValidarCampoNumerico;
import com.sesion8.utilidades.ValidarFormatoCorreoElectronico;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cyber
 */
public class VistaRegistroPersona extends javax.swing.JFrame {
    //Aquí definimos las variables globales.

    //Atributo objeto controlRegistroPersona.
    private final ControlRegistroPersona controlRegistroPersona;
    //Modelo de la tabla
    private final String[] columnas = new String[]{"Nº", "Id", "Nombres", "Apellido Paterno", "Apellido Materno", "Teléfono"};
    private final DefaultTableModel modeloTabla;
    //private final DefaultTableModel modeloTabla = new DefaultTableModel(this.columnas, 0);

    //Variables para la validación de campos.
    private boolean validarNombres = false;
    private boolean validarApellidoPaterno = false;
    private boolean validarApellidoMaterno = false;
    private boolean validarTelefono = false;
    private boolean validarCorreoElectronico = false;
    private boolean validarDireccion = false;

    //Variables para la validación de los campos de la tabla.
    private int id;

    //Variables para la modificación y eliminación de datos.
    private boolean modificar = false;
    private boolean deshabilitar = false;
    private boolean eliminar = false;

    //Constructor.
    /**
     * Creates new form VistaRegistro
     */
    public VistaRegistroPersona() {
        initComponents();
        this.setTitle("Registro de Personas");
        this.setLocationRelativeTo(null);
        this.setExtendedState(3);
        this.controlRegistroPersona = new ControlRegistroPersona();
        this.modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };
        //El cursor en Nombres.
        this.txtNombres.requestFocus();
        //El cursor en Buscar.
        this.txtBuscar.requestFocus();
        //Agregamos el modelo a la tabla.
        this.tblListadoDatosPersonas.setModel(this.modeloTabla);
        this.modeloTabla.addColumn("Nº");
        this.modeloTabla.addColumn("Id");
        this.modeloTabla.addColumn("Nombres");
        this.modeloTabla.addColumn("Apellido Paterno");
        this.modeloTabla.addColumn("Apellido Materno");
        this.modeloTabla.addColumn("Teléfono");

        //Ocultamos la columna del id.
        this.tblListadoDatosPersonas.getColumnModel().getColumn(1).setMaxWidth(0);
        this.tblListadoDatosPersonas.getColumnModel().getColumn(1).setMinWidth(0);
        this.tblListadoDatosPersonas.getColumnModel().getColumn(1).setPreferredWidth(0);

        this.mostrarListadoDatos();

        //this.setSize(350, 350);
        //Image image = new ImageIcon(getClass().getResource("/com/puntodeventa/iconos/icono-escaparate-tienda.jpg")).getImage();
        Image iconoPropio = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/sesion8/iconos/1981441-agenda-de-contactos.png"));
        this.setIconImage(iconoPropio);
    }

    //Métodos.
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("./com/sesion8/iconos/1981441-agenda-de-contactos.png"));

        return retValue;
    }

    private void limpiarCampos() {
        LimpiarComponentes.limpiarComponentes(this.pnlRegistroPersonas);
        this.btnGuardar.setText("Guardar");
        this.modificar = false;
        //El cursor en Nombres.
        this.txtNombres.requestFocus();
    }

    private boolean validarCampos() {
        boolean validarCampos = true;
        if (this.txtNombres.getText().isEmpty() || this.txtApellidoPaterno.getText().isEmpty() || this.txtApellidoMaterno.getText().isEmpty() || this.txtTelefono.getText().isEmpty() || this.txtCorreoElectronico.getText().isEmpty() || this.txtCorreoElectronico.getText().isEmpty()) {
            MensajesSwing.mostrarDialogoMensajeAdvertencia("¡No debe dejar campos vacíos!");
            validarCampos = false;
        }
        return validarCampos;
    }

    private boolean validacionesCampos() {
        boolean correcto = false;
        if (this.validarNombres && this.validarApellidoPaterno && this.validarApellidoMaterno && this.validarTelefono && this.validarCorreoElectronico && this.validarDireccion) {
            correcto = true;
        } else {
            correcto = false;
        }
        return correcto;
    }

    private void validarNombres() {
        String nombres = this.txtNombres.getText().trim();
        if (nombres.isEmpty()) {//Está Vacío?
            this.validarNombres = false;
            this.lblValidarNombres.setVisible(true);
        } else {
            this.validarNombres = true;
            this.lblValidarNombres.setVisible(false);
        }
    }

    private void validarApellidoPaterno() {
        String apellidoPaterno = this.txtApellidoPaterno.getText().trim();
        if (apellidoPaterno.isEmpty()) {//Está Vacío?
            this.validarApellidoPaterno = false;
            this.lblValidarApellidoPaterno.setVisible(true);
        } else {
            this.validarApellidoPaterno = true;
            this.lblValidarApellidoPaterno.setVisible(false);
        }
    }

    private void validarApellidoMaterno() {
        String apellidoMaterno = this.txtApellidoMaterno.getText().trim();
        if (apellidoMaterno.isEmpty()) {//Está Vacío?
            this.validarApellidoMaterno = false;
            this.lblValidarApellidoMaterno.setVisible(true);
        } else {
            this.validarApellidoMaterno = true;
            this.lblValidarApellidoMaterno.setVisible(false);
        }
    }

    private void validarTelefono() {
        String telefono = this.txtTelefono.getText();
        this.validarTelefono = ValidarCampoNumerico.validarCampoNumerico(telefono);
        if (this.validarTelefono) {
            this.lblValidarTelefono.setVisible(false); //No se ve
            System.out.println("Es correcto...!!!! :D");
        } else if (!this.validarTelefono) {
            this.lblValidarTelefono.setVisible(true);
            System.err.println("No es correcto...!!! :(");
        }
    }

    private void validarCorreoElectronico() {
        String correoElectronico = this.txtCorreoElectronico.getText();
        this.validarCorreoElectronico = ValidarFormatoCorreoElectronico.validarFormatoCorreoElectronico(correoElectronico);
        if (this.validarCorreoElectronico) {
            this.lblValidarCorreoElectronico.setVisible(false); //No se ve
            System.out.println("Es correcto...!!!! :D");
        } else if (!this.validarCorreoElectronico) {
            this.lblValidarCorreoElectronico.setVisible(true);
            System.err.println("No es correcto...!!! :(");
        }
    }

    private void validarDireccion() {
        String direccion = this.txtDireccion.getText().trim();
        if (direccion.isEmpty()) {//Está Vacío?
            this.validarDireccion = false;
            this.lblValidarDireccion.setVisible(true);
        } else {
            this.validarDireccion = true;
            this.lblValidarDireccion.setVisible(false);
        }
    }

    private void llenarTabla() {
        if (this.validarCampos()) {
            String nombres = this.txtNombres.getText();
            String apellidoPaterno = this.txtApellidoPaterno.getText();
            String apellidoMaterno = this.txtApellidoMaterno.getText();
            String telefono = this.txtTelefono.getText();
            String correoElectronico = this.txtCorreoElectronico.getText();
            String direccion = this.txtDireccion.getText();
            //Creamos el arreglo para las filas
            String[] filas = new String[]{nombres, apellidoPaterno, apellidoMaterno, telefono, correoElectronico, direccion};

            //Agregamos las filas al modelo de la tabla.
            this.modeloTabla.addRow(filas);
            //Limpiamos los campos
            this.limpiarCampos();
        }
    }

    private void mostrarListadoDatos() {
        ModelosComponentesSwing.vaciarTabla(this.modeloTabla);
        this.controlRegistroPersona.mostrarListadoDatos(this.modeloTabla, this.tblListadoDatosPersonas, this.txtBuscar);
    }

    private void actualizarTabla() {
        this.mostrarListadoDatos();
    }

    private void guardarDatos() {
        if (this.validarCampos()) {
            //Se obtiene toda la información.
            String nombres = this.txtNombres.getText();
            String apellidoPaterno = this.txtApellidoPaterno.getText();
            String apellidoMaterno = this.txtApellidoMaterno.getText();
            String telefono = this.txtTelefono.getText();
            String correoElectronico = this.txtCorreoElectronico.getText();
            String direccion = this.txtDireccion.getText();

            if (!this.modificar || !this.eliminar) {
                boolean respuesta = this.controlRegistroPersona.insertarDatos(nombres, apellidoPaterno, apellidoMaterno, telefono, correoElectronico, direccion);
                if (respuesta) {
                    MensajesSwing.mostrarDialogoMensajeInformacion("¡Registro Correcto!");
                    this.limpiarCampos();
                    this.actualizarTabla();
                } else {
                    MensajesSwing.mostrarDialogoMensajeError("¡Error en el Registro!");
                }
            } else if (this.modificar) {
                boolean respuesta = this.controlRegistroPersona.modificarDatos(nombres, apellidoPaterno, apellidoMaterno, telefono, correoElectronico, direccion, this.id);
                if (respuesta) {
                    MensajesSwing.mostrarDialogoMensajeInformacion("¡Registro Modificado!");
                    this.actualizarTabla();
                    this.limpiarCampos();
                } else {
                    MensajesSwing.mostrarDialogoMensajeError("¡Error al Modificar los Datos!");
                }
            }
        }
        /*if (this.validacionesCampos() && this.validarCampos()) {
            this.llenarTabla();
        } else {
            MensajesSwing.mostrarDialogoMensajeError("No se puede guardar, porque existen validaciones faltantes");
        }*/
    }

    private void eliminarDatosDesactivarEstado() {
        if (this.deshabilitar) {
            int confirmacion = MensajesSwing.mostrarDialogoMensajeConfirmacion("¿Realmente desea eliminar este registro?");
            if (confirmacion == 0) {
                boolean respuesta = this.controlRegistroPersona.eliminarDatosDesactivarEstado(this.id);
                if (respuesta) {
                    MensajesSwing.mostrarDialogoMensajeInformacion("¡Registro Eliminado!");
                    this.actualizarTabla();
                    this.limpiarCampos();
                } else {
                    MensajesSwing.mostrarDialogoMensajeError("¡Error al Eliminar los Datos!");
                }
            }
        } else {
            MensajesSwing.mostrarDialogoMensajeAdvertencia("¡No ha seleccionado un registro para eliminar!");
        }
    }

    private void eliminarDatos() {
        if (this.eliminar) {
            int opcion = MensajesSwing.mostrarDialogoMensajeOpcion("¿Está seguro que desea eliminar este registro?");
            if (opcion != -1) {
                if ((opcion + 1) == 1) {
                    boolean respuesta = this.controlRegistroPersona.eliminarDatos(this.id);
                    if (respuesta) {
                        MensajesSwing.mostrarDialogoMensajeInformacion("¡Registro Eliminado!");
                        this.actualizarTabla();
                        this.limpiarCampos();
                    } else {
                        MensajesSwing.mostrarDialogoMensajeError("¡Error al Eliminar los Datos!");
                    }
                }
            }
        } else {
            MensajesSwing.mostrarDialogoMensajeAdvertencia("¡No ha seleccionado un registro para eliminar!");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        panelPestanas = new javax.swing.JTabbedPane();
        pnlListadoPersonas = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListadoDatosPersonas = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        pnlRegistroPersonas = new javax.swing.JPanel();
        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblApellidoPaterno = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JTextField();
        lblApellidoMaterno = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        lblCorreoElectronico = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtCorreoElectronico = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblValidarNombres = new javax.swing.JLabel();
        lblValidarApellidoPaterno = new javax.swing.JLabel();
        lblValidarApellidoMaterno = new javax.swing.JLabel();
        lblValidarTelefono = new javax.swing.JLabel();
        lblValidarCorreoElectronico = new javax.swing.JLabel();
        lblValidarDireccion = new javax.swing.JLabel();
        lblRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlListadoPersonas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBuscar.setText("Buscar:");
        pnlListadoPersonas.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        txtBuscar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtBuscarCaretUpdate(evt);
            }
        });
        pnlListadoPersonas.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 420, -1));

        tblListadoDatosPersonas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblListadoDatosPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListadoDatosPersonasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListadoDatosPersonas);

        pnlListadoPersonas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 630, 250));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        pnlListadoPersonas.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 100, 20));

        panelPestanas.addTab("Listado de Personas", pnlListadoPersonas);

        pnlRegistroPersonas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombres.setText("Nombres:");
        pnlRegistroPersonas.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtNombres.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNombresCaretUpdate(evt);
            }
        });
        pnlRegistroPersonas.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 510, -1));

        lblApellidoPaterno.setText("Apellido Paterno:");
        pnlRegistroPersonas.add(lblApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txtApellidoPaterno.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtApellidoPaternoCaretUpdate(evt);
            }
        });
        pnlRegistroPersonas.add(txtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 510, -1));

        lblApellidoMaterno.setText("Apellido Materno:");
        pnlRegistroPersonas.add(lblApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txtApellidoMaterno.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtApellidoMaternoCaretUpdate(evt);
            }
        });
        pnlRegistroPersonas.add(txtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 510, -1));

        lblTelefono.setText("Teléfono:");
        pnlRegistroPersonas.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        lblCorreoElectronico.setText("Correo Electrónico:");
        pnlRegistroPersonas.add(lblCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        lblDireccion.setText("Dirección:");
        pnlRegistroPersonas.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        txtTelefono.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTelefonoCaretUpdate(evt);
            }
        });
        pnlRegistroPersonas.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 510, -1));

        txtCorreoElectronico.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCorreoElectronicoCaretUpdate(evt);
            }
        });
        pnlRegistroPersonas.add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 510, -1));

        txtDireccion.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtDireccionCaretUpdate(evt);
            }
        });
        pnlRegistroPersonas.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 510, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        pnlRegistroPersonas.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlRegistroPersonas.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlRegistroPersonas.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, -1, -1));

        lblValidarNombres.setForeground(new java.awt.Color(255, 0, 0));
        lblValidarNombres.setText("*");
        pnlRegistroPersonas.add(lblValidarNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

        lblValidarApellidoPaterno.setForeground(new java.awt.Color(255, 0, 0));
        lblValidarApellidoPaterno.setText("*");
        pnlRegistroPersonas.add(lblValidarApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 20, -1));

        lblValidarApellidoMaterno.setForeground(new java.awt.Color(255, 0, 0));
        lblValidarApellidoMaterno.setText("*");
        pnlRegistroPersonas.add(lblValidarApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 20, -1));

        lblValidarTelefono.setForeground(new java.awt.Color(255, 0, 0));
        lblValidarTelefono.setText("*");
        pnlRegistroPersonas.add(lblValidarTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 10, -1));

        lblValidarCorreoElectronico.setForeground(new java.awt.Color(255, 0, 0));
        lblValidarCorreoElectronico.setText("*");
        pnlRegistroPersonas.add(lblValidarCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 20, -1));

        lblValidarDireccion.setForeground(new java.awt.Color(255, 0, 0));
        lblValidarDireccion.setText("*");
        pnlRegistroPersonas.add(lblValidarDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 20, -1));

        panelPestanas.addTab("Registro de Personas", pnlRegistroPersonas);

        pnlPrincipal.add(panelPestanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 700, 390));

        lblRegistro.setText("Registro de Personas");
        pnlPrincipal.add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 720, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        this.mostrarListadoDatos();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtBuscarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtBuscarCaretUpdate
        // TODO add your handling code here:
        this.mostrarListadoDatos();
    }//GEN-LAST:event_txtBuscarCaretUpdate

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        this.guardarDatos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        this.limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblListadoDatosPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListadoDatosPersonasMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            //Obtiene la fila seleccionada.
            int fila = this.tblListadoDatosPersonas.getSelectedRow();
            //Obtenemos el id.
            this.id = (int) this.tblListadoDatosPersonas.getValueAt(fila, 1);

            System.out.println("El id es: " + this.id);
            Object[] datos = this.controlRegistroPersona.consultarDatos(this.id);

            this.txtNombres.setText(datos[0].toString()); //Nombres.
            this.txtApellidoPaterno.setText(datos[1].toString()); //Apellido Paterno.
            this.txtApellidoMaterno.setText(datos[2].toString()); //Apellido Materno.
            this.txtTelefono.setText(datos[3].toString()); //Teléfono.
            this.txtCorreoElectronico.setText(datos[4].toString()); //Correo Electrónico.
            this.txtDireccion.setText(datos[5].toString()); //Dirección.

            this.panelPestanas.setSelectedIndex(1);
            this.modificar = true;
            this.deshabilitar = true;
            this.eliminar = true;
            this.btnGuardar.setText("Actualizar");
        }
    }//GEN-LAST:event_tblListadoDatosPersonasMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        this.eliminarDatos();
        //this.eliminarDatosDesactivarEstado();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNombresCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNombresCaretUpdate
        // TODO add your handling code here:
        this.validarNombres();
    }//GEN-LAST:event_txtNombresCaretUpdate

    private void txtApellidoPaternoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtApellidoPaternoCaretUpdate
        // TODO add your handling code here:
        this.validarApellidoPaterno();
    }//GEN-LAST:event_txtApellidoPaternoCaretUpdate

    private void txtApellidoMaternoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtApellidoMaternoCaretUpdate
        // TODO add your handling code here:
        this.validarApellidoMaterno();
    }//GEN-LAST:event_txtApellidoMaternoCaretUpdate

    private void txtTelefonoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTelefonoCaretUpdate
        // TODO add your handling code here:
        this.validarTelefono();
    }//GEN-LAST:event_txtTelefonoCaretUpdate

    private void txtCorreoElectronicoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCorreoElectronicoCaretUpdate
        // TODO add your handling code here:
        this.validarCorreoElectronico();
    }//GEN-LAST:event_txtCorreoElectronicoCaretUpdate

    private void txtDireccionCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDireccionCaretUpdate
        // TODO add your handling code here:
        this.validarDireccion();
    }//GEN-LAST:event_txtDireccionCaretUpdate

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
            java.util.logging.Logger.getLogger(VistaRegistroPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaRegistroPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaRegistroPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaRegistroPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VistaRegistroPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCorreoElectronico;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblValidarApellidoMaterno;
    private javax.swing.JLabel lblValidarApellidoPaterno;
    private javax.swing.JLabel lblValidarCorreoElectronico;
    private javax.swing.JLabel lblValidarDireccion;
    private javax.swing.JLabel lblValidarNombres;
    private javax.swing.JLabel lblValidarTelefono;
    private javax.swing.JTabbedPane panelPestanas;
    private javax.swing.JPanel pnlListadoPersonas;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlRegistroPersonas;
    private javax.swing.JTable tblListadoDatosPersonas;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
