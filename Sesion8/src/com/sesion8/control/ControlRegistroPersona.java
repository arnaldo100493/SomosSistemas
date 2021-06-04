/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesion8.control;

import com.sesion8.jdbc.ConexionMySQL;
import com.sesion8.modelo.Persona;
import com.sesion8.utilidades.MensajesSwing;
import com.sesion8.utilidades.ModelosComponentesSwing;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cyber
 */
public class ControlRegistroPersona {

    private final ConexionMySQL conexion;

    public ControlRegistroPersona() {
        this.conexion = new ConexionMySQL();
    }

    public void mostrarListadoDatos(DefaultTableModel modeloTabla, JTable tabla, JTextField buscar) {
        String dato = buscar.getText().trim();
        String sql = "select id, nombres, apellido_paterno, apellido_materno, telefono from persona where estado = 1 and (nombres like '%" + dato + "%' or apellido_paterno like '%" + dato + "%' or apellido_materno like '%" + dato
                + "%');";
        ResultSet resultado = this.conexion.ejecutarConsultaSQLSelect(sql);
        ModelosComponentesSwing.listarDatosEnTablaVariosCampos(5, resultado, modeloTabla, tabla);
    }

    public boolean insertarDatos(String nombres, String apellidoPaterno, String apellidoMaterno, String telefono, String correoElectronico, String direccion) {
        String sql = "insert into persona(nombres, apellido_paterno, apellido_materno, telefono, correo_electronico, direccion) values(?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement sentencia = this.conexion.getConexion().prepareStatement(sql);
            sentencia.setString(1, nombres);
            sentencia.setString(2, apellidoPaterno);
            sentencia.setString(3, apellidoMaterno);
            sentencia.setString(4, telefono);
            sentencia.setString(5, correoElectronico);
            sentencia.setString(6, direccion);
            boolean ejecucion = this.conexion.ejecutarConsultaSQL(sentencia);
            if (ejecucion) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            MensajesSwing.mostrarDialogoMensajeError("Error al registrar datos: " + ex.getMessage());
            return false;
        }
    }

    public boolean insertarDatos(Persona persona) {
        String sql = "insert into persona(nombres, apellido_paterno, apellido_materno, telefono, correo_electronico, direccion) values(?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement sentencia = this.conexion.getConexion().prepareStatement(sql);
            sentencia.setString(1, persona.getNombres());
            sentencia.setString(2, persona.getApellidoPaterno());
            sentencia.setString(3, persona.getApellidoMaterno());
            sentencia.setString(4, persona.getTelefono());
            sentencia.setString(5, persona.getCorreoElectronico());
            sentencia.setString(6, persona.getDireccion());
            boolean ejecucion = this.conexion.ejecutarConsultaSQL(sentencia);
            if (ejecucion) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            MensajesSwing.mostrarDialogoMensajeError("Error al registrar datos: " + ex.getMessage());
            return false;
        }
    }

    public Object[] consultarDatos(int id) {
        Object[] datos = new Object[6];
        String sql = "select nombres, apellido_paterno, apellido_materno, telefono, correo_electronico, direccion from persona where id = ?";
        try {
            PreparedStatement sentencia = this.conexion.getConexion().prepareStatement(sql);
            sentencia.setInt(1, id);
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {
                datos[0] = resultado.getString(1); //Nombres.
                datos[1] = resultado.getString(2); //Apellido Paterno.
                datos[2] = resultado.getString(3); //Apellido Materno.
                datos[3] = resultado.getString(4); //Teléfono.
                datos[4] = resultado.getString(5); //Correo Electrónico.
                datos[5] = resultado.getString(6); //Dirección.
            }
        } catch (SQLException ex) {
            MensajesSwing.mostrarDialogoMensajeError("Error al consultar datos: " + ex.getMessage());
        }
        return datos;
    }

    public boolean modificarDatos(String nombres, String apellidoPaterno, String apellidoMaterno, String telefono, String correoElectronico, String direccion, int id) {
        String sql = "update persona set nombres = ?, apellido_paterno = ?, apellido_materno = ?, telefono = ?, correo_electronico = ?, direccion = ? where id = ?";
        try {
            PreparedStatement sentencia = this.conexion.getConexion().prepareStatement(sql);
            sentencia.setString(1, nombres);
            sentencia.setString(2, apellidoPaterno);
            sentencia.setString(3, apellidoMaterno);
            sentencia.setString(4, telefono);
            sentencia.setString(5, correoElectronico);
            sentencia.setString(6, direccion);
            sentencia.setInt(7, id);
            boolean ejecucion = this.conexion.ejecutarConsultaSQL(sentencia);
            if (ejecucion) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            MensajesSwing.mostrarDialogoMensajeError("Error al registrar datos: " + ex.getMessage());
            return false;
        }
    }

    public boolean modificarDatos(Persona persona) {
        String sql = "update persona set nombres = ?, apellido_paterno = ?, apellido_materno = ?, telefono = ?, correo_electronico = ?, direccion = ? where id = ?";
        try {
            PreparedStatement sentencia = this.conexion.getConexion().prepareStatement(sql);
            sentencia.setString(1, persona.getNombres());
            sentencia.setString(2, persona.getApellidoPaterno());
            sentencia.setString(3, persona.getApellidoMaterno());
            sentencia.setString(4, persona.getTelefono());
            sentencia.setString(5, persona.getCorreoElectronico());
            sentencia.setString(6, persona.getDireccion());
            sentencia.setInt(7, persona.getId());
            boolean ejecucion = this.conexion.ejecutarConsultaSQL(sentencia);
            if (ejecucion) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            MensajesSwing.mostrarDialogoMensajeError("Error al registrar datos: " + ex.getMessage());
            return false;
        }
    }

    public boolean eliminarDatosDesactivarEstado(int id) {
        String sql = "update persona set estado = 0 where id = ?";
        try {
            PreparedStatement sentencia = this.conexion.getConexion().prepareStatement(sql);
            sentencia.setInt(1, id);
            boolean ejecucion = this.conexion.ejecutarConsultaSQL(sentencia);
            if (ejecucion) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            MensajesSwing.mostrarDialogoMensajeError("Error al registrar datos: " + ex.getMessage());
            return false;
        }
    }

    public boolean eliminarDatos(int id) {
        String sql = "delete from persona where id = ?";
        try {
            PreparedStatement sentencia = this.conexion.getConexion().prepareStatement(sql);
            sentencia.setInt(1, id);
            boolean ejecucion = this.conexion.ejecutarConsultaSQL(sentencia);
            if (ejecucion) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            MensajesSwing.mostrarDialogoMensajeError("Error al registrar datos: " + ex.getMessage());
            return false;
        }
    }
}
