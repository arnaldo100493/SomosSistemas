/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesion5;

import com.sesion5.utilidades.GenerarExcelTabla;

/**
 *
 * @author abarrios
 */
public class Sesion5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String[] arreglo = new String[5];
        arreglo[0] = "Hola mundo";
        arreglo[1] = "Hola mundo 1";
        arreglo[2] = "Hola mundo 2";
        arreglo[3] = "Hola mundo 3";
        arreglo[4] = "Hola mundo 4";
        
        System.out.println(arreglo[2]);
        
        String[] arreglo2 = {"Hola 1", "Hola 2", "Hola 3", "Hola 4"};
        System.out.println(arreglo2[1]);*/

        //Definición de una matriz
        String[][] matriz = new String[100][100];

        //[0][0] = "0,0";
        //matriz[0][1] = "0,1";
        for (int i = 0; i < 100; i++) { //Recorremos filas
            //System.out.println(i);
            for (int j = 0; j < 100; j++) { //Recorremos columnas
                //System.out.println(i + " " + j);
                matriz[i][j] = i + "," + j;
            }

        }
        
        GenerarExcelTabla.escribirExcelResultado(matriz, "../Sesion5/src/com/sesion5/librosexcel/ejemplomatriz.xls");
        
        //System.out.println(matriz[1][2]);

        //System.out.println(matriz[0][0]);
    }

}
