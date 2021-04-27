/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miprimeravez;

/**
 *
 * @author abarrios
 */
public class CalculadoraSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numero1 = 50;
        double numero2 = 30;
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double divisionEntera = numero1 / numero2;
        double divisionResiduo = numero1 % numero2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + divisionEntera);
        System.out.println("La división residuo es: " + divisionResiduo);
    }

}
