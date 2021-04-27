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
//Ejercicio 4. Simular un logeo de usuario (admin, admin123)
public class LoginUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su usuario: ");
        String usuario = sc.next();
        System.out.println("Ingrese su clave: ");
        String clave = sc.next();
        if (usuario.equals("admin") && clave.equals("admin123")) {
            System.out.println("Bienvenido " + usuario);
        } else {
            System.err.println("Usuario y/o Clave Incorrectos...!!!");
        }
    }

}
