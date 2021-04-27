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
//Ejercicio 3. Ingresar dos números y detectar cúal es el mayor.
public class NumeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número 1: ");
        double numero1 = sc.nextDouble();
        System.out.println("Ingrese el número 2: ");
        double numero2 = sc.nextDouble();
        if (numero1 > numero2) {
            System.out.println("Número " + numero1 + " es el mayor");
        } else if (numero1 < numero2) {
            System.out.println("Número " + numero2 + " es el mayor");
        } else if (numero1 == numero2) {
            System.out.println("Son Iguales");
        }
    }

}
