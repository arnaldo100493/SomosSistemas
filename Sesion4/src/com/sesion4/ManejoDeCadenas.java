/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesion4;

/**
 *
 * @author abarrios
 */
public class ManejoDeCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombres = "ARNALDO ANDRES";
        String apellidos = "BARRIOS MENA";
        //String datos = concatenarTexto(nombres, apellidos);
        //System.out.println("Los datos son: " + datos);
        //concatenarFor();

        //Convertir a mayúsculas
        //String datosMayusculas = convertirAMayusculas(nombres, apellidos);
        //System.out.println("Datos en mayúsculas: " + datosMayusculas);
        //Convertir a minusculas
        //String datosMinusculas = convertirAMinusculas(nombres, apellidos);
        //System.out.println("Datos en minúsculas: " + datosMinusculas);
        //Retornar tamaño de cadena
        //String cadena = "72126442 Arnaldo Barrios";
        //int tamanio = retornarTamanioCadena(cadena);
        //System.out.println("El tamaño es: " + tamanio);
        //String cadena = "72126442 Arnaldo Barrios";
        //extraerNombres(cadena);
        String dato = "Arnaldo Andrés | Barrios | Mena";
        extraerCaracteres(dato);

    }

    //Concatenar
    private static String concatenarTexto(String nombres, String apellidos) {
        return nombres + " | " + apellidos;
    }

    //Procedimiento concatenar con for
    private static void concatenarFor() {
        String resultado = "";
        for (int i = 0; i < 10; i++) {
            resultado = resultado + " | " + i;
        }
        System.out.println("El resultado es: " + resultado);
    }

    //Método de convertir a mayúsculas
    private static String convertirAMayusculas(String nombres, String apellidos) {
        String datos = nombres + " " + apellidos; //Concatenando
        String datosMayusculas = datos.toUpperCase(); //Convirtiendo a mayúsculas
        return datosMayusculas; //Retorno de datos
    }

    //Método de convertir a mayúsculas
    private static String convertirAMinusculas(String nombres, String apellidos) {
        String datos = nombres + " " + apellidos; //Concatenando
        String datosMayusculas = datos.toLowerCase(); //Convirtiendo a minúsculas
        return datosMayusculas; //Retorno de datos
    }

    private static int retornarTamanioCadena(String cadena) {
        return cadena.length();
    }

    private static void extraerNombres(String dato) {
        /*Tenemos el dato "72126442 Arnaldo Barrios", lo que queremos es que se
        separen ambos valores.*/
        int cantidad = retornarTamanioCadena(dato);
        String codigo = dato.substring(0, 8);
        String nombres = dato.substring(9);

        System.out.println("Código: " + codigo);
        System.out.println("Nombres: " + nombres);
    }

    private static void extraerCaracteres(String dato) {
        int posicion1 = dato.indexOf("|");
        System.out.println("Posición 1: " + posicion1);
        String nombres = dato.substring(0, posicion1 - 1);
        System.out.println("Nombres: " + nombres);
        int posicionUltima = dato.lastIndexOf("|");
        String apellidoPaterno = dato.substring(posicion1 + 1, posicionUltima - 1);
        System.out.println("Apellido Paterno: " + apellidoPaterno);
        String apellidoMaterno = dato.substring(posicionUltima + 1);
        System.out.println("Apellido Materno: " + apellidoMaterno);
    }

}
