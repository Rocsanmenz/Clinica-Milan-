
package Conexion_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Roxana_mEND 
 */
public class Conexion {
    
  
 private final String url="jdbc:sqlserver://localhost:"
         + ";databaseName=ClinicaMilan;"
            + "integratedSecurity=true;" +
     "encrypt=true;trustServerCertificate=true";
   
    Connection cn;
    public Connection conectar(){      
        try {
            cn = DriverManager.getConnection(url);
            System.out.println("Conexion establecida");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexión: "+e);
        }
        return null;
    }  
}
 
 

