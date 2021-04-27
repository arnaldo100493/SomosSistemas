package tareas;

import java.util.Scanner;

public class TareasSesion1 {

    public static void main(String[] args) {
        //tarea1();
        tarea2();
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
    public static void tarea1() {
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

    //Tarea 2.
    /*2. . Hacer una aplicacion en consola en donde se ingresen 5 notas, 
    en donde cada nota equivale a un porcentaje para su calificación final, los porcentajes son:
    1era nota 10%
    2da nota 15%
    3era nota 20%
    4ta nota 25%
    5ta nota 30%
    mostrar como resultado si el alumno está aprobado o desaprobado en base al cálculo de todas las 5 notas, el rango de notas es del 0 al 20 y se aprueba con un mínimo de 14.
     */
    public static void tarea2() {
        //Digitamos las notas
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite nota 1:");
        double n1 = sc.nextDouble();
        System.out.println("Digite nota 2:");
        double n2 = sc.nextDouble();
        System.out.println("Digite nota 3:");
        double n3 = sc.nextDouble();
        System.out.println("Digite nota 4:");
        double n4 = sc.nextDouble();
        System.out.println("Digite nota 5:");
        double n5 = sc.nextDouble();

        //Nos aseguramos que las notas ingresadas sean en el rango entre 0 y 20.
        if (((n1 >= 0 && n2 >= 0 && n3 >= 0 && n4 >= 0 && n5 >= 0) && (n1 <= 20 && n2 <= 20 && n3 <= 20 && n4 <= 20 && n5 <= 20))) {

            //Asignamos los porcentajes por cada nota
            double p1 = n1 * 0.1;
            double p2 = n2 * 0.15;
            double p3 = n3 * 0.2;
            double p4 = n4 * 0.25;
            double p5 = n5 * 0.3;

            //Calculamos el resultado final
            double resultado = p1 + p2 + p3 + p4 + p5;

            //Validación cuando el estudiante es aprobado
            if (resultado >= 14) {
                System.out.println("Estudiante aprobado, su nota final es: " + resultado);
            } else { //Caso contrario si el estudiante es reprobado
                System.err.println("Estudiante reprobado, su nota final es: " + resultado);
            }

        } else { //Muestra mensaje de error cuando es ingresada una o varias notas menores a 0 y mayores a 20
            System.err.println("Las notas ingresadas deben ser en el rango entre 0 y 20...!!!");
        }
    }
}
