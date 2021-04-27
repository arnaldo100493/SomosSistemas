/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesion6;

import com.sesion6.entidades.Persona;

/**
 *
 * @author abarrios
 */
public class Sesion6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creación de un objeto de la clase Persona
        Persona persona1 = new Persona();
        persona1.setNombres("Arnaldo Andrés");
        persona1.setApellidoPaterno("Barrios");
        persona1.setApellidoMaterno("Mena");
        persona1.setDni("1047459854");
        persona1.setEdad(28);
        persona1.setTalla("1.69 cm");
        persona1.setPeso("90 Kg");
        
        Persona persona2 = new Persona();
        persona2.setNombres("Brainer");
        persona2.setApellidoPaterno("Barrios");
        persona2.setApellidoMaterno("Mena");
        persona2.setDni("8853492");
        persona2.setEdad(40);
        persona2.setTalla("1.60 cm");
        persona2.setPeso("90 Kg");
        
        
        System.out.println("La persona 1 es: " + persona1.getNombres() + " " + persona1.getApellidoPaterno() + " " +  persona1.getApellidoMaterno());
        System.out.println("La persona 2 es: " + persona2.getNombres() + " " + persona2.getApellidoPaterno() + " " +  persona2.getApellidoMaterno());

    }

}
