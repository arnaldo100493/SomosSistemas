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

//Ejercicio 1. Calculadora por consola con condicionales.
public class CalculadoraAvanzada {

    public static void sumar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        double numero1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double numero2 = sc.nextDouble();
        double suma = numero1 + numero2;
        System.out.println("La suma de los números es: " + suma);
    }

    public static void restar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        double numero1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double numero2 = sc.nextDouble();
        double resta = numero1 - numero2;
        System.out.println("La resta de los números es: " + resta);
    }

    public static void multiplicar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        double numero1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double numero2 = sc.nextDouble();
        double multiplicacion = numero1 * numero2;
        System.out.println("La multiplicación de los números es: " + multiplicacion);
    }

    public static void dividirEntero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        double numero1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double numero2 = sc.nextDouble();
        double divisionEntera = numero1 / numero2;
        System.out.println("La división entera de los números es: " + divisionEntera);
    }

    public static void dividirResiduo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        double numero1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double numero2 = sc.nextDouble();
        double divisionResiduo = numero1 % numero2;
        System.out.println("La división residuo de los números es: " + divisionResiduo);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola, por favor ingresa tu nombre: ");
        String nombre = sc.next();
        System.out.println("Hola! " + nombre);

        System.out.println("Ingrese un valor:\n"
                + "1. Suma\n"
                + "2. Resta\n"
                + "3. Multiplicación\n"
                + "4. División Entera\n"
                + "5. División Residuo\n");
        int valor = sc.nextInt();

        System.out.println("Ingrese Número 1:");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese Número 2:");
        int numero2 = sc.nextInt();

        double resultado = 0;
        //Condicionales
        if (valor == 1) {//Si el valor es 1, entonces suma
            resultado = numero1 + numero2;
        } else if (valor == 2) {// Si el valor es 2, entonces resta
            resultado = numero1 - numero2;
        } else if (valor == 3) { //Si el valor es 3, entonces multiplica
            resultado = numero1 * numero2;
        } else if (valor == 4) { //Si el valor es 4, entonces divide entero
            resultado = numero1 / numero2;
        } else if (valor == 5) {
            resultado = numero1 % numero2;
        }
        System.out.println("Su resultado es: " + resultado);
        //sumar();
    }

}
