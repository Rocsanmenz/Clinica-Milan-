
package Conexion;

import java.sql.CallableStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Especialidad;


/**
 *
 * @author Toshiba2023
 */
import Conexion_BD.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
public class CRUD_Especialidad {
    
    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();
    
    
    
    public void Guardar(Especialidad Cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call CrearEspecialidad(?)}");//Se pondran cada dato que esta en los procedimiento
            cbst.setString(1, Cl.getNombre());                                              //tal cual estan escrito
            

            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
    
      public DefaultTableModel mostrarDatos() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = { "ID_Especialidad", "Nombres"};
        String[] registro = new String[2];
        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarEspecialidades}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("ID_Especialidad");
                registro[1] = rs.getString("Nombre");
                

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
    
        public void ActualizarDatos(Especialidad C5) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ActualizarEspecialidad(?,?)}");
            cbst.setInt(1, C5.getId_Especialidad());
            cbst.setString(2, C5.getNombre());
            
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void EliminarEspecialidad(int ID_Especialidad) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarEspecialidad(?)}");
            cbst.setInt(1, ID_Especialidad);
            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
