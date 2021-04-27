/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesion4;

/**
 *
 * @author abarrios
 */
public class Sesion4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Llamar al procedimiento
        //multiplicacion(12, 12);
        
        //Llamar al método - función
        double resultado = multiplicacionRetorno(12, 12);
        System.out.println("El resultado es: " + resultado);
    }

    //Procedimiento (No retorna)
    private static void multiplicacion(double valor1, double valor2) {
        double resultado = valor1 * valor2;
        System.out.println("El resultado es: " + resultado);
    }

    //Método - Función (Con retorno)
    private static double multiplicacionRetorno(double valor1, double valor2) {
        double resultado = valor1 * valor2;
        return resultado;
    }
}
