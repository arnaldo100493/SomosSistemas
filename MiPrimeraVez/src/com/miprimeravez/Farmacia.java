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
//Ejercicio 5.
public class Farmacia {

    /*Una farmacia desea un programa para ingresar el valor de compra y
    calcular lo siguiente: si el pago se efectúa al "contado", 
    calcular un descuento del 5%; pero si el pago es con "tarjeta"
    se incrementa un recargo del 3% al valor de compra.
    Calcular y visualizar el descuento o recargo según sea el caso 
    y el total a pagar de la compra.*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la compra:");
        Scanner sc2 = new Scanner(System.in);
        double valorCompra = sc2.nextDouble();
        System.out.println("Ingrese el tipo de pago: E (efectivo) - T (tarjeta)");
        String tipoPago = sc.nextLine();

        double valorFinal = -1;
        //Condicionales
        //Si es con contado 5% de descuento
        if (tipoPago.equalsIgnoreCase("c")) {
            double descuento = valorCompra * 0.05;
            System.out.println("Hay un descuento de: " + descuento);
            valorFinal = valorCompra - descuento;

            //Si no, hay un 3% de recargo
        } else if (tipoPago.equalsIgnoreCase("t")) {
            double recargo = valorCompra * 0.03;
            System.out.println("Hay un recargo de: " + recargo);
            valorFinal = valorCompra + recargo;
        }

        System.out.println("El precio final es: " + valorFinal);
    }
}
