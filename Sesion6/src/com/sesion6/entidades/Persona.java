/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesion6.entidades;

/**
 *
 * @author abarrios
 */
public class Persona {

    //Definimos nuestros atributos
    private String dni;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String talla;
    private String peso;

    //Definimos nuestros constructores
    public Persona() {
        this.dni = "";
        this.nombres = "";
        this.apellidoPaterno = "";
        this.apellidoMaterno = "";
        this.edad = 0;
        this.talla = "";
        this.peso = "";
    }

    public Persona(String dni, String nombres, String apellidoPaterno, String apellidoMaterno, int edad, String talla, String peso) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.talla = talla;
        this.peso = peso;
    }

    //Definimos nuestros métodos
    public void caminar() {

    }

    public void correr() {

    }

    public void dormir() {

    }

    public void comer() {

    }
    
    public String mostrarPersona() {
        return "Persona{" + "dni=" + getDni() + ", nombres=" + getNombres() + ", apellidoPaterno=" + getApellidoPaterno() + ", apellidoMaterno=" + getApellidoMaterno() + ", edad=" + getEdad() + ", talla=" + getTalla() + ", peso=" + getPeso() + '}';
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + getDni() + ", nombres=" + getNombres() + ", apellidoPaterno=" + getApellidoPaterno() + ", apellidoMaterno=" + getApellidoMaterno() + ", edad=" + getEdad() + ", talla=" + getTalla() + ", peso=" + getPeso() + '}';
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidoPaterno
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * @param apellidoPaterno the apellidoPaterno to set
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * @return the apellidoMaterno
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * @param apellidoMaterno the apellidoMaterno to set
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the talla
     */
    public String getTalla() {
        return talla;
    }

    /**
     * @param talla the talla to set
     */
    public void setTalla(String talla) {
        this.talla = talla;
    }

    /**
     * @return the peso
     */
    public String getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(String peso) {
        this.peso = peso;
    }

}
