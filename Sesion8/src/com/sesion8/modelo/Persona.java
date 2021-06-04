/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesion8.modelo;

import java.sql.Date;

/**
 *
 * @author cyber
 */
public class Persona {

    private int id;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String telefono;
    private String correoElectronico;
    private String direccion;
    private int estado;
    private Date fechaRegistro;

    public Persona() {
        this.id = 0;
        this.nombres = "";
        this.apellidoPaterno = "";
        this.apellidoMaterno = "";
        this.telefono = "";
        this.correoElectronico = "";
        this.direccion = "";
        this.estado = 1;
        this.fechaRegistro = null;
    }

    public Persona(String nombres, String apellidoPaterno, String apellidoMaterno, String telefono, String correoElectronico, String direccion) {
        this.id = 0;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.estado = 1;
        this.fechaRegistro = null;
    }
    
    public Persona(int id, String nombres, String apellidoPaterno, String apellidoMaterno, String telefono, String correoElectronico, String direccion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.estado = 1;
        this.fechaRegistro = null;
    }

    public Persona(int id, String nombres, String apellidoPaterno, String apellidoMaterno, String telefono, String correoElectronico, String direccion, int estado, Date fechaRegistro) {
        this.id = id;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombres=" + nombres + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", telefono=" + telefono + ", correoElectronico=" + correoElectronico + ", direccion=" + direccion + ", estado=" + estado + ", fechaRegistro=" + fechaRegistro + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the correoElectronico
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * @param correoElectronico the correoElectronico to set
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * @return the fechaRegistro
     */
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @param fechaRegistro the fechaRegistro to set
     */
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}
