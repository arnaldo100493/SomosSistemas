package tareas;

import javax.swing.JOptionPane;

/*1. Desarrollar una interfaz gráfica, la cual tenga dos campos de texto, y un combo
con los siguientes items(números pares, números impares, suma de todos, promedio de todos), 
la intención de cada campo es que represente el inicio y el final de la recursividad, y según
el item que se seleccione, se realizará la acción con un botón. Ejemplo, si el primer valor
es 1, y el último valor es 10, y selecciona "suma de todos", el resultado será la suma de
1+2+3+4+5+...+10=55; si la opción es "números pares", entonces listará todos los números pares
que existan en el rango de los números*/
public class TareaSesion2 extends javax.swing.JFrame {

    /**
     * Creates new form InterfazGrafica
     */
    public TareaSesion2() {
        initComponents();
        this.setTitle("Tarea Sesión 2");
        this.setLocationRelativeTo(null);
        this.setExtendedState(3);
    }

    private void calcular() {
        String primerValorString = this.txtInicio.getText().trim(); //trim() me retorna el texto sin espacios vacíos adelante y atrás
        String segundoValorString = this.txtFinal.getText().trim();

        //Si ambos valores están vacíos
        if (primerValorString.equals("") || primerValorString.isEmpty() || segundoValorString.equals("") || segundoValorString.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No deben ir campos vacíos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            double inicioRecursividad = Double.parseDouble(primerValorString);
            double finalRecursividad = Double.parseDouble(segundoValorString);
            double resultado = 0;

            //Obtener la posición de ComboBox Acción.
            int accion = this.cbxAccion.getSelectedIndex();
            if (accion == 0) { //Validación Seleccionar Opción Válida.
                JOptionPane.showMessageDialog(null, "Debe seleccionar una opción", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else if (accion == 1) { //Validación Números Pares
                for (double i = inicioRecursividad; i <= finalRecursividad; i++) {
                    if (i % 2 == 0) {
                        this.lblResultado.setText(String.valueOf(i));
                    }
                }
            } else if (accion == 2) {//Validación Numeros Impares.
                for (double i = inicioRecursividad; i <= finalRecursividad; i++) {
                    if (i % 2 != 0) {
                        this.lblResultado.setText(String.valueOf(i));
                    }
                }
                this.limpiarCampos();
            } else if (accion == 3) { //Validación Suma de Todos.
                for (double i = inicioRecursividad; i <= finalRecursividad; i++) {
                    resultado += i;
                    this.lblResultado.setText(String.valueOf(resultado));
                }
            } else if (accion == 4) { //Validación Promedio de Todos.
                double cantidadNumeros = 0;
                double promedio = 0;
                for (double i = inicioRecursividad; i <= finalRecursividad; i++) {
                    resultado += i;
                    cantidadNumeros = i;
                    promedio = resultado / cantidadNumeros;
                }
                this.lblResultado.setText(String.valueOf(promedio));
            }
        }
    }

    private void limpiarCampos() {
        this.txtInicio.setText("");
        this.txtFinal.setText("");
        this.cbxAccion.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTareaSesion2 = new javax.swing.JPanel();
        lblTareaSesion2 = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        lblFinal = new javax.swing.JLabel();
        txtInicio = new javax.swing.JTextField();
        txtFinal = new javax.swing.JTextField();
        cbxAccion = new javax.swing.JComboBox<>();
        lblAccion = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        lblResultadoEs = new javax.swing.JLabel();
        lblLimpiar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTareaSesion2.setText("Tarea Sesión 2");

        lblInicio.setText("Inicio:");

        lblFinal.setText("Final:");

        cbxAccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Números Pares", "Números Impares", "Suma de Todos", "Promedio de Todos" }));

        lblAccion.setText("Acción:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblResultadoEs.setText("El resultado es:");

        lblLimpiar.setText("Limpiar");
        lblLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTareaSesion2Layout = new javax.swing.GroupLayout(pnlTareaSesion2);
        pnlTareaSesion2.setLayout(pnlTareaSesion2Layout);
        pnlTareaSesion2Layout.setHorizontalGroup(
            pnlTareaSesion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTareaSesion2Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(lblTareaSesion2))
            .addGroup(pnlTareaSesion2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblInicio)
                .addGap(75, 75, 75)
                .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTareaSesion2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblFinal)
                .addGap(79, 79, 79)
                .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTareaSesion2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblAccion)
                .addGap(66, 66, 66)
                .addComponent(cbxAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTareaSesion2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnCalcular)
                .addGap(96, 96, 96)
                .addComponent(lblLimpiar))
            .addGroup(pnlTareaSesion2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblResultadoEs)
                .addGap(138, 138, 138)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlTareaSesion2Layout.setVerticalGroup(
            pnlTareaSesion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTareaSesion2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTareaSesion2)
                .addGap(18, 18, 18)
                .addGroup(pnlTareaSesion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTareaSesion2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblInicio))
                    .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlTareaSesion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTareaSesion2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblFinal))
                    .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlTareaSesion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTareaSesion2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblAccion))
                    .addComponent(cbxAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlTareaSesion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcular)
                    .addComponent(lblLimpiar))
                .addGap(18, 18, 18)
                .addGroup(pnlTareaSesion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResultadoEs)
                    .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTareaSesion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTareaSesion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        this.calcular();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void lblLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblLimpiarActionPerformed
        // TODO add your handling code here:
        this.limpiarCampos();
    }//GEN-LAST:event_lblLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(TareaSesion2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TareaSesion2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TareaSesion2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TareaSesion2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TareaSesion2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cbxAccion;
    private javax.swing.JLabel lblAccion;
    private javax.swing.JLabel lblFinal;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JButton lblLimpiar;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblResultadoEs;
    private javax.swing.JLabel lblTareaSesion2;
    private javax.swing.JPanel pnlTareaSesion2;
    private javax.swing.JTextField txtFinal;
    private javax.swing.JTextField txtInicio;
    // End of variables declaration//GEN-END:variables
}