/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesion3.vista;

/**
 *
 * @author abarrios
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Definición del arreglo, segunda parte
        Object[] arregloObjetos = new Object[]{"Hola", 2, false, 'C'};
        
        System.out.println("Posición 0: " + arregloObjetos[0]);

        //Definición de arreglo tipo String
        String[] arregloString = new String[]{"uno", "dos", "tres", "4"};
        
    }
    
    private static void definicionArreglo() {
        // Definimos 6 espacios, pero solo hay 5 posiciones
        //Definición de nuestro arreglo
        Object[] arregloObjetos = new Object[6];

        //Asignar información a nuestro arreglo
        arregloObjetos[0] = "Hola"; //Campo String
        arregloObjetos[1] = 2; //Campo int
        arregloObjetos[2] = 3244.3345; //Campo double
        arregloObjetos[3] = 2.3; //Campo float
        arregloObjetos[4] = true; //Campo boolean
        arregloObjetos[5] = 'C'; //Campo char

        //Leer esta información
        System.out.println("Posición 0: " + arregloObjetos[6]);
        
    }
    
}
