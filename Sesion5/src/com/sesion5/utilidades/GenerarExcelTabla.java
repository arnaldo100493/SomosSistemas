/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesion5.utilidades;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author abarrios
 */
public class GenerarExcelTabla {

    public GenerarExcelTabla() {

    }

    public static void generarExcel(String ruta, JTable tabla) {
        int filas = tabla.getRowCount();
        int columnas = tabla.getColumnCount();

        System.out.println("Filas: " + filas);
        System.out.println("Columnas: " + columnas);
        String[][] matriz = new String[filas + 1][columnas];

        for (int i = 0; i < columnas; i++) {
            matriz[0][i] = tabla.getColumnName(i);
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                try {
                    matriz[i + 1][j] = tabla.getValueAt(i, j).toString();
                } catch (Exception ex) {
                    matriz[i + 1][j] = "";
                }
            }
        }
        escribirExcelResultado(matriz, ruta);
        //JOptionPane.showMessageDialog(null, "Reporte en Excel creado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void escribirExcelResultado(String[][] entrada, String ruta) {
        try {
            WritableFont headersFont = new WritableFont(WritableFont.ARIAL, 12, WritableFont.NO_BOLD);
            WritableCellFormat headerFormat = new WritableCellFormat(headersFont);
            //Se crea el libro Excel
            WorkbookSettings config = new WorkbookSettings();
            config.setEncoding("ISO-8859-1");
            WritableWorkbook workbook = Workbook.createWorkbook(new File(ruta), config);

            //Se crea una nueva hoja dentro del libro
            WritableSheet sheet = workbook.createSheet("Resultados", 0);

            for (int i = 0; i < entrada.length; i++) {
                sheet.addCell(new Label(0, i, entrada[i][0]));
                for (int j = 1; j < entrada[i].length; j++) {
                    sheet.addCell(new Label(j, i, entrada[i][j], headerFormat));

                }
            }
            workbook.write();
            workbook.close();
        } catch (IOException ex) {
        } catch (WriteException ex) {

        } catch (Exception ex) {

        }
    }
}
