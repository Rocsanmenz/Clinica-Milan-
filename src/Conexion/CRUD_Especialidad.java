/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import java.util.ArrayList;
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
            CallableStatement cbstc = cn.prepareCall("{call MostrarEspecialidad}");
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
            CallableStatement cbst = cn.prepareCall("{call ModificarPaciente(?,?)}");
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
    
    
    public ArrayList mostrarDatosCombo() {
        
        
        ArrayList<Especialidad> especialidad = new ArrayList<>();

        try {
            CallableStatement cbstc = cn.prepareCall("{call RellenarEspecialidad}");
            ResultSet rs = cbstc.executeQuery();

            while (rs.next()) {
                Especialidad em= new Especialidad();
                em.setId_Especialidad(Integer.parseInt(rs.getString("ID_Especialidad")));
                em.setNombre(rs.getString("Nombre"));
                especialidad.add(em);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return especialidad;
    }
    
    
    
    
    
}
