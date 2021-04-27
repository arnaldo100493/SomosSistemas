package tareas;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilidades.ValidarCampoNumerico;
import utilidades.ValidarFormatoCorreo;

/*1. Sobre el archivo creado en clases, agregar validaciones a todos los campos, y enviar el ejecutable.*/
public class TareaSesion4 extends javax.swing.JFrame {

    //Aquí definimos las variables globales
    //Modelo de la tabla
    private final String[] columnas = new String[]{"Nombres", "Apellidos", "Correo", "Teléfono", "Profesión"};
    private final DefaultTableModel modeloTabla = new DefaultTableModel(this.columnas, 0);
    //Módelo del combobox
    private final String[] profesiones = new String[]{"Seleccione...", "Ing. Sistemas", "Médico", "Ing. Industrial"};
    private final DefaultComboBoxModel modeloComboBox = new DefaultComboBoxModel(this.profesiones);
    //Variables para la validación de campos
    private boolean validarNombres = false;
    private boolean validarApellidos = false;
    private boolean validarCorreo = false;
    private boolean validarTelefono = false;

    /**
     * Creates new form Tablas
     */
    public TareaSesion4() {
        initComponents();
        this.setTitle("Tablas");
        this.setLocationRelativeTo(null);
        this.setExtendedState(3);
        //Asignamos el modelo a la tabla
        this.tblDatos.setModel(this.modeloTabla);
        //Asignamos el modelo al combobox
        this.cbxProfesion.setModel(this.modeloComboBox);
        //El cursor en nombres
        this.txtNombres.requestFocus();
    }

    private void limpiarCampos() {
        this.txtNombres.setText("");
        this.txtApellidos.setText("");
        this.txtCorreo.setText("");
        this.txtTelefono.setText("");
        this.cbxProfesion.setSelectedIndex(0);
        //El cursor en nombres
        this.txtNombres.requestFocus();
    }

    private boolean validarCampos() {
        boolean validarCampos = true;
        if (this.txtNombres.getText().isEmpty() || this.txtApellidos.getText().isEmpty() || this.txtCorreo.getText().isEmpty() || this.txtTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No debe dejar campos vacíos", "Advertencia", JOptionPane.WARNING_MESSAGE);
            validarCampos = false;
        } else if (this.cbxProfesion.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una profesión", "Advertencia", JOptionPane.WARNING_MESSAGE);
            validarCampos = false;
        }
        return validarCampos;
    }

    private boolean validacionesCampos() {
        boolean correcto = false;
        if (this.validarNombres && this.validarApellidos && this.validarCorreo && this.validarTelefono) {
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

    private void validarApellidos() {
        String apellidos = this.txtApellidos.getText().trim();
        if (apellidos.isEmpty()) {//Está Vacío?
            this.validarApellidos = false;
            this.lblValidarApellidos.setVisible(true);
        } else {
            this.validarApellidos = true;
            this.lblValidarApellidos.setVisible(false);
        }
    }

    private void validarCorreo() {
        String correo = this.txtCorreo.getText();

        this.validarCorreo = ValidarFormatoCorreo.validarFormatoCorreo(correo);

        if (this.validarCorreo) {
            this.lblValidarCorreo.setVisible(false); //No se ve
            System.out.println("Es correcto...!!!! :D");
        } else if (!this.validarCorreo) {
            this.lblValidarCorreo.setVisible(true);
            System.err.println("No es correcto...!!! :(");
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

    private void llenarTabla() {
        if (this.validarCampos()) {
            String nombres = this.txtNombres.getText();
            String apellidos = this.txtApellidos.getText();
            String correo = this.txtCorreo.getText();
            String telefono = this.txtTelefono.getText();
            String profesion = this.cbxProfesion.getSelectedItem().toString();

            //Creamos el arreglo para las filas
            String[] filas = new String[]{nombres, apellidos, correo, telefono, profesion};

            //Agregamos las filas al modelo de la tabla
            this.modeloTabla.addRow(filas);
            //Limpiamos los campos
            this.limpiarCampos();
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

        pnlTablas = new javax.swing.JPanel();
        txtNombres = new javax.swing.JTextField();
        lblNombres = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnGrabar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        lblTareaSesion4 = new javax.swing.JLabel();
        lblProfesion = new javax.swing.JLabel();
        cbxProfesion = new javax.swing.JComboBox<>();
        lblValidarCorreo = new javax.swing.JLabel();
        lblValidarNombres = new javax.swing.JLabel();
        lblValidarApellidos = new javax.swing.JLabel();
        lblValidarTelefono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlTablas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombres.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNombresCaretUpdate(evt);
            }
        });
        pnlTablas.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 222, -1));

        lblNombres.setText("Nombres:");
        pnlTablas.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        lblApellidos.setText("Apellidos:");
        pnlTablas.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        lblCorreo.setText("Correo:");
        pnlTablas.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        lblTelefono.setText("Teléfono:");
        pnlTablas.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        txtApellidos.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtApellidosCaretUpdate(evt);
            }
        });
        pnlTablas.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 222, -1));

        txtCorreo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCorreoCaretUpdate(evt);
            }
        });
        pnlTablas.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 222, -1));

        txtTelefono.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTelefonoCaretUpdate(evt);
            }
        });
        pnlTablas.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 222, -1));

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });
        pnlTablas.add(btnGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, -1, -1));

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDatos);

        pnlTablas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 650, 90));

        lblTareaSesion4.setText("Tablas");
        pnlTablas.add(lblTareaSesion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        lblProfesion.setText("Profesión:");
        pnlTablas.add(lblProfesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        cbxProfesion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlTablas.add(cbxProfesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 230, -1));

        lblValidarCorreo.setForeground(new java.awt.Color(255, 0, 51));
        lblValidarCorreo.setText("*");
        pnlTablas.add(lblValidarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        lblValidarNombres.setForeground(new java.awt.Color(255, 0, 0));
        lblValidarNombres.setText("*");
        pnlTablas.add(lblValidarNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, 10));

        lblValidarApellidos.setForeground(new java.awt.Color(255, 0, 0));
        lblValidarApellidos.setText("*");
        pnlTablas.add(lblValidarApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        lblValidarTelefono.setForeground(new java.awt.Color(255, 0, 0));
        lblValidarTelefono.setText("*");
        pnlTablas.add(lblValidarTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 10, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTablas, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        // TODO add your handling code here:
        if (this.validacionesCampos() && this.validarCampos()) {
            this.llenarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "No se puede guardar, porque existen validaciones faltantes", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnGrabarActionPerformed

    private void txtCorreoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCorreoCaretUpdate
        // TODO add your handling code here:
        this.validarCorreo();
    }//GEN-LAST:event_txtCorreoCaretUpdate

    private void txtNombresCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNombresCaretUpdate
        // TODO add your handling code here:
        this.validarNombres();
    }//GEN-LAST:event_txtNombresCaretUpdate

    private void txtApellidosCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtApellidosCaretUpdate
        // TODO add your handling code here:
        this.validarApellidos();
    }//GEN-LAST:event_txtApellidosCaretUpdate

    private void txtTelefonoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTelefonoCaretUpdate
        // TODO add your handling code here:
        this.validarTelefono();
    }//GEN-LAST:event_txtTelefonoCaretUpdate

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
            java.util.logging.Logger.getLogger(TareaSesion4.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TareaSesion4.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TareaSesion4.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TareaSesion4.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TareaSesion4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabar;
    private javax.swing.JComboBox<String> cbxProfesion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblProfesion;
    private javax.swing.JLabel lblTareaSesion4;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblValidarApellidos;
    private javax.swing.JLabel lblValidarCorreo;
    private javax.swing.JLabel lblValidarNombres;
    private javax.swing.JLabel lblValidarTelefono;
    private javax.swing.JPanel pnlTablas;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
