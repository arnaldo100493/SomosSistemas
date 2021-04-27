/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesion3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abarrios
 */
public class Sesion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Inicializando variable
        int valor = 0;

        while (valor < 200) {
            System.out.println(valor + " es menor a 200");
            //contador
            //valor++;
            //valor=valor+1;
            //valor+=1;
            valor += 2;
        }
        //Reloj simple
        boolean activado = true;
        int i = 1;
        while (activado) {
            System.out.println(i++);
            try {
                Thread.sleep(1000);//Corte de tiempo por cada segundo
            } catch (InterruptedException ex) {
                Logger.getLogger(Sesion3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public String retornarSaludo() {
        return "Hola";
    }

}
