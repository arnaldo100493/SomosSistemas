/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesion8.jdbc;

import com.mysql.cj.jdbc.JdbcConnection;
import java.io.Serializable;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author cyber
 */
//Clase para conectarse con la Base de Datos.
public class ConexionMySQL implements Serializable {

    //Atributos.
    private static transient JdbcConnection conexion;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/dbregistro?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrival=true";
    private static final String user = "root";
    private static final String password = "Arnaldo100493*";

    //Constructores.
    public ConexionMySQL() {
        conexion = conectarBaseDeDatos();
    }

    public ConexionMySQL(JdbcConnection con) {
        conexion = con;
    }

    //Métodos.
    public JdbcConnection getConexion() {
        return conexion;
    }

    public void setConexion(JdbcConnection con) {
        conexion = con;
    }

    public boolean ejecutarConsultaSQL(PreparedStatement sentencia) {
        try {
            sentencia.execute();
            sentencia.close();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar consulta SQL: " + ex.getMessage());
            return false;
        }
    }

    public ResultSet ejecutarConsultaSQLSelect(String sql) {
        ResultSet resultado;
        try {
            //Se crea la sentencia que se va a ejecutar.
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            //Ejecutamos la consulta SQL.
            resultado = sentencia.executeQuery();
            return resultado;
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar consulta SQL Select: " + ex.getMessage());
            return null;
        }
    }

    public static boolean estaConectado() {
        return conexion != null;
    }

    public static JdbcConnection conectarBaseDeDatos() {
        JdbcConnection con = null;
        try {
            Class.forName(driver);
            con = (JdbcConnection) DriverManager.getConnection(url, user, password);
            System.out.println("Conectado correctamente...!!!");
        } catch (ClassNotFoundException ex) {
            System.err.println("Error en la conexión: " + ex.getMessage());
        } catch (SQLException ex) {
            System.err.println("Error en la conexión: " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("Error en la conexión: " + ex.getMessage());
        } finally {
            return con;
        }
    }

    public static void cerrarConexion() {
        try {
            if (estaConectado()) {
                conexion.close();
                System.out.println("Desconectado correctamente...!!!");
            }
        } catch (SQLException ex) {
            System.err.println("Error en la conexión: " + ex.getMessage());
        }
    }
}
