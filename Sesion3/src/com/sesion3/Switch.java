/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesion3;

import java.util.Scanner;

/**
 *
 * @author abarrios
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ejercicio4();

    }

    public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor:");
        int valor = sc.nextInt();

        //Si el valor = 1: uno, 2 = dos, 3 = tres
        switch (valor) {//Según sea el caso de valor
            case 1://Si el caso es uno
                System.out.println("UNO");
                break; //Corte de caso
            case 2:
                System.out.println("DOS");
                break;
        }
    }

    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor:");
        String valor = sc.next();
        //Si el valor = 1: uno, 2 = dos, 3 = tres
        switch (valor) {//Según sea el caso de valor
            case "uno"://Si el caso es uno
                System.out.println("1");
                break; //Corte de caso
            case "dos":
                System.out.println("2");
                break;
        }
    }

    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor:");
        String valor = sc.next();
        //Si el valor = 1: uno, 2 = dos, 3 = tres
        switch (valor) {//Según sea el caso de valor
            case "uno"://Si el caso es uno
                System.out.println("1");
                break; //Corte de caso
            case "dos":
                System.out.println("2");
                break;
        }
    }

    public static void ejercicio4() {
        int valor = 1;
        while (true) {//Siempre se ejecuta
            valor++;
            System.out.println("Ejecutando " + valor);
            if (valor == 100) {
                break; //Si el valor es igual a 100, entonces hacemos un corte 
            }
        }
    }
}
