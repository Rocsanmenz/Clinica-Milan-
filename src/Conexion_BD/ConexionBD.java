/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion_BD;
import java.sql.*;
import java.util.*;
/**
 *
 * @author UNAN-Chontales
 */
public class ConexionBD {
    String conexionUrl = "jdb:sqlserver://localhost:    ;"
            + "database=BD_Clinica_Milan;"
            + "integratedSecurity = true;" + " encrypt= true;trustServerCertificate= true;";

    public Connection conexion;//para la conexion con la BD

    public ConexionBD() { //constructor de la clase
        try {
            //usando Driver Conector y cadena de conexion para conectar BD
            conexion = DriverManager.getConnection(conexionUrl);
            System.out.println("Conexión Establecida");

        } catch (SQLException e) {
            System.out.println("Error de la conexión");
            e.printStackTrace();

        }
    }
}
