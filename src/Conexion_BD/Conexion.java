
package Conexion_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Roxana_mEND 
 */
public class Conexion {
    
  //Donde dice 51745, tienes que poner tu puerto de tu pc para que te de
 private final String url="jdbc:sqlserver://localhost:1434;"
         + ";database=ClinicaMilan;"
            + "integratedSecurity=true;" +
     "encrypt=true;trustServerCertificate=true";
   
    Connection cn;
    public Connection conectar(){      
        try {
            cn = DriverManager.getConnection(url);
            System.out.println("Conexion establecida");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion: "+e);
        }
        return null;
    }  
}
 
 

