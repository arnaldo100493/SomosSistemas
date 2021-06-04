/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesion8.utilidades;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 *
 * @author cyber
 */
public class ModelosComponentesSwing {

    public ModelosComponentesSwing() {

    }

    public static void listarDatosEnTablaVariosCampos(int columnas, ResultSet resultado, DefaultTableModel modeloTabla, JTable tablaDatos) {
        try {
            //Definimos el arreglo para guardar las filas.
            Object[] filas = new Object[columnas + 1];
            int numeracion = 1;
            //Mientras existan filas, va a recorrerlas todas.
            while (resultado.next()) {
                filas[0] = numeracion++;
                //Recorremos las columnas
                for (int i = 1; i <= columnas; i++) {
                    //Obteniendo el valor de la columna 1.
                    filas[i] = resultado.getObject(i);
                }
                //Mandamos a nuestro modelo de la tabla.
                modeloTabla.addRow(filas);
            }
            tablaDatos.updateUI();
            resultado.close();
        } catch (SQLException ex) {
            MensajesSwing.mostrarDialogoMensajeError("Error al listar datos en la tabla: " + ex.getMessage());
        }
    }

    public static void vaciarTabla(DefaultTableModel modeloTabla) {
        while (modeloTabla.getRowCount() > 0) {
            modeloTabla.removeRow(0);
        }
    }

    public static void centrarIFrame(JDesktopPane desktopPane, JInternalFrame internalFrame) {
        int x = (desktopPane.getWidth() / 2) - internalFrame.getWidth() / 2;
        int y = (desktopPane.getHeight() / 2) - internalFrame.getHeight() / 2;
        if (internalFrame.isShowing()) {
            internalFrame.setLocation(x, y);
        } else {
            desktopPane.add(internalFrame);
            internalFrame.setLocation(x, y);
            internalFrame.show();
        }
    }

    public static void pasarDatosListas(JList listaInicio, DefaultListModel modeloLista1, DefaultListModel modeloLista2) {
        Object[] selecciones;
        selecciones = listaInicio.getSelectedValuesList().toArray();
        //Método en construcción.
    }

    public static void establecerTablaColumnasFijas(JTable tablaDatos) {
        tablaDatos.getTableHeader().setReorderingAllowed(false);
    }

    public static void establecerTablaModeloColumnas(JTable tablaDatos, int[] anchos) {
        //int[] anchos = {40, 278}; //318  
        for (int i = 0; i < tablaDatos.getColumnCount(); i++) {
            tablaDatos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
    }

    public static void quitarFila(DefaultTableModel modeloTabla, int fila) {
        modeloTabla.removeRow(fila);
    }

    public static void centrarDatosConCheck(JTable tabla, int numeroColumnas) {
        DefaultTableCellRenderer modeloCentrarDatos = new DefaultTableCellHeaderRenderer();
        modeloCentrarDatos.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 1; i < numeroColumnas; i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(modeloCentrarDatos);
        }
    }

    public static void establecerTamanioColumnas(JTable tablaDatos, int columna, int tamanio) {
        tablaDatos.getColumnModel().getColumn(1).setMaxWidth(0);
        tablaDatos.getColumnModel().getColumn(1).setMinWidth(0);
        tablaDatos.getColumnModel().getColumn(1).setPreferredWidth(0);
    }
}
