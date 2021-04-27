/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesion2;

import java.util.Scanner;

/**
 *
 * @author abarrios
 */
public class Sesion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ejercicio9();
        //Calculadora ventana = new Calculadora();
        //ventana.setVisible(true);

        //Ciclo for
        /*for (int i = 0; i <= 100; i += 10) {
            System.out.println("El valor es: " + i);
        }*/
        //Acumulador:
        //int total = 0;

        /*for (int i = 0; i <= 10; i++) {
            total = total + i;
        }*/
        //System.out.println("El total es: " + total);
    }

    //1. Listar números del 1 al 100.
    public static void ejercicio1() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Numero: " + i);
        }
    }

    //2. Listar sólo números pares el 1 al 100
    public static void ejercicio2() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Numero: " + i);
            }
        }
    }

    //3. Listar números del 100 al 1.
    public static void ejercicio3() {
        for (int i = 100; i >= 1; i--) {
            System.out.println("Numero: " + i);
        }
    }

    //4. Listar números de N hasta Z con Scanner.
    public static void ejercicio4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer número:");
        int n = sc.nextInt();
        System.out.println("Digite el segundo número:");
        int z = sc.nextInt();
        for (int i = n; i <= z; i++) {
            System.out.println("Número: " + i);
        }
    }

    //5. Pedir 10 números y mostrar la suma de estos.
    public static void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite un número: ");
            numero = sc.nextInt();
            total = total + numero;
        }
        System.out.println("La suma de los 10 números es: " + total);
    }

    //6. Pedir si un número es primo.
    public static void ejercicio6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un número: ");
        int numero = sc.nextInt();
        int c = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println("El Número " + numero + " es Primo");
        } else {
            System.out.println("El Número " + numero + " es Compuesto");
        }
    }

    //7. Listar solo los números primos del 1 al 100.
    public static void ejercicio7() {

    }

    //8. Listar los números primos del 100 al 1.
    public static void ejercicio8() {

    }

     //Tarea 1.
    /*1. Hacer una aplicación en consola, que tenga datos de ingreso: nombres, apellidos, edad,
    carrera, (ingreso en texto) y el sistema devolverá la siguiente información: Bienvenido
    "nombres + apellidos", gracias por su registro a la carrera "carrera", el monto a pagar es
    de: monto + igv(18%) + monto total.
    
    Si el alumno tiene menos de 20 años, se le hará un descuento del 20% sobre el total.
    
    Por ejemplo si es mayor a 20 y la carrera de Ingeniería de Sistemas, cuesta 1000 dólares, 
    el monto base es $847.45, el igv es $152.54 y el monto total es de 1000, 
    en caso que sea menor de 20, el monto total será de $800 y el monto base e 
    igv se calcularán en base a los $800
    
    Ingeniería de Sistemas: 1000
    Medicina: 800
    Arquitectura: 900
    Ingeniería de Software: 1200
    Ingeniería Industrial: 300
    
   ------------------------------
    NOTA: Para leer Strings con Scanner estoy utilizando el método next(), ya que tengo problemas
    con el método nextLine() que se salta a la siguiente línea sin leer la última variable llamada
    carrera, el étodo next() leer un String hasta cuando encuentre un espacio en blanco
    
    Se ingresa las carreras, Sistemas, Medicina, Arquitectura, Software, Industrial, debido al problema con los Strings mencionados*/
    public static void ejercicio9() {
        double montoBase = 0;
        double igv = 0;
        double montoTotal = 0;
        double montoPagar = 0;
        Scanner sc = new Scanner(System.in);

        //Pedimos la información
        System.out.println("Digite nombres: ");
        String nombres = sc.next();
        System.out.println("Digite apellidos: ");
        String apellidos = sc.next();
        System.out.println("Digite edad: ");
        int edad = sc.nextInt();
        System.out.println("Digite carrera: ");
        String carrera = sc.next();
        System.out.println("Bienvenido " + nombres + " " + apellidos + ", " + "gracias por su registro a la carrera " + carrera);

        //Validamos las carreras
        if (carrera.equalsIgnoreCase("Sistemas")) {
            if (edad < 20) {
                montoBase = 847.45;
                igv = 152.54;
                montoTotal = 800 * 0.2;
            } else {
                montoBase = 847.45;
                igv = 152.54;
                montoTotal = 1000;
            }

        } else if (carrera.equalsIgnoreCase("Medicina")) {
            if (edad < 20) {
                montoBase = 847.45;
                igv = 152.54;
                montoTotal = 800 * 0.2;
            } else {
                montoBase = 847.45;
                igv = 152.54;
                montoTotal = 800;
            }
        } else if (carrera.equalsIgnoreCase("Arquitectura")) {
            if (edad < 20) {
                montoBase = 847.45;
                igv = 152.54;
                montoTotal = 800 * 0.2;
            } else {
                montoBase = 847.45;
                igv = 152.54;
                montoTotal = 900;
            }
        } else if (carrera.equalsIgnoreCase("Software")) {
            if (edad < 20) {
                montoBase = 847.45;
                igv = 152.54;
                montoTotal = 800 * 0.2;
            } else {
                montoBase = 847.45;
                igv = 152.54;
                montoTotal = 1200;
            }
        } else if (carrera.equalsIgnoreCase("Industrial")) {
            if (edad < 20) {
                montoBase = 847.45;
                igv = 152.54;
                montoTotal = 800 * 0.2;
            } else {
                montoBase = 847.45;
                igv = 152.54;
                montoTotal = 300;
            }
        } else {
            System.out.println("Ha ingresado una carrera inexistente");
        }

        montoPagar = montoBase + igv * 0.18 + montoTotal;

        System.out.println("El monto a pagar es: " + montoPagar);
    }
}
