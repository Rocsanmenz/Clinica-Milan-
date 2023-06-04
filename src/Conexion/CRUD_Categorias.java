
package Conexion;

import Conexion_BD.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;


/**
 *
 * @author FAREM CH-12
 */

public class CRUD_Categorias {
    
 private final Conexion con = new Conexion();
 private final Connection cn = (Connection) con.conectar();
 
 public void Guardar(Categoria Cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call CrearCategoria(?)}");//Se pondran cada dato que esta en los procedimiento
            cbst.setString(1, Cl.getNombre_Categoria());                                              //tal cual estan escrito
            

            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    


  public DefaultTableModel mostrarDatos() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = { "ID_Categoria", "Nombre_Categoria"};
        String[] registro = new String[2];
        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarCategoria}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("ID_Categoria");
                registro[1] = rs.getString("Nombre_Categoria");
                

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

  }
  
        public void ActualizarDatos(Categoria C5) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ModificarCategoria(?,?)}");
            cbst.setInt(1, C5.getId_Categoria());
            cbst.setString(2, C5.getNombre_Categoria());
            
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void EliminarCategoria(int ID_Categoria) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarCategoria(?)}");
            cbst.setInt(1, ID_Categoria);
            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
