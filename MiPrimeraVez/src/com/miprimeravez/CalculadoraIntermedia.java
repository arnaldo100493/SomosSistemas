/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miprimeravez;

import java.util.Scanner;

/**
 *
 * @author abarrios
 */
public class CalculadoraIntermedia {

    public static void operacion() {
        //Primera Línea - Definimos el objeto Scanner sc, la cual permite leer información
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        //Leemos el primer número
        double numero1 = sc.nextDouble();
        //Texto en consola
        System.out.println("Ingrese el segundo número:");
        //Leemos el segundo número
        double numero2 = sc.nextDouble();

        //System.out.println("Tu número 1 es: " + numero1);
        //System.out.println("Tu número 2 es: " + numero2);
        //Procesamos
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double divisionEntera = numero1 / numero2;
        double divisionResiduo = numero1 % numero2;

        //Escribimos
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La resta de los números es: " + resta);
        System.out.println("La multiplicación de los números es: " + multiplicacion);
        System.out.println("La división entera de los números es: " + divisionEntera);
        System.out.println("La división residuo de los números es: " + divisionResiduo);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        operacion();

    }

}
