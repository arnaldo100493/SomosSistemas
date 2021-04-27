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
//Ejercicio 2. Saber si es un número es par o impar.
public class NumerosParesEImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        double numero = sc.nextDouble();
        double residuo = numero % 2;
        if (residuo == 0) { //
            System.out.println("Número " + numero + " es par");
        } else if (residuo != 0) {
            System.out.println("Número " + numero + " es impar");
        }
    }
}
