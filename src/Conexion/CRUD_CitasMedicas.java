/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import Conexion_BD.Conexion;
import modelo.CitasMedicas;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author gonzalez
 */
public class CRUD_CitasMedicas {
     public final Conexion con = new Conexion();
    public  final Connection cn = (Connection) con.conectar();

 public DefaultTableModel mostrarDatos(){
 ResultSet rs;
 DefaultTableModel modelo;
 String[] datos = {"ID_Cliente", "ID_Doctor", "Fecha", "Hora"};
 String[] registro = new String[4];
 
 modelo = new DefaultTableModel(null, datos);
 
 try{
     CallableStatement cbstc = cn.prepareCall("{call MostrarDatos}");
     rs = cbstc.executeQuery();
     
     while (rs.next()){
         registro[0] = rs.getString("ID_Cliente");
         registro[1] = rs.getString("ID_Doctor");
         registro[2] = rs.getString("Fecha");
         registro[3] = rs.getString("Hora");
         
         modelo.addRow(registro);
     
 }
     return modelo;
 } catch (SQLException e){
   JOptionPane.showMessageDialog(null, e);
   return null;
 }
 }
 public DefaultTableModel buscarDatos(String dato){
     ResultSet rs;
     DefaultTableModel modelo;
     
     String[] datos = {"ID_Cliente", "ID_Doctor", "Fecha", "Hora"};
 String[] registro = new String[4];
 
 modelo = new DefaultTableModel(null, datos);
 
 try{
     CallableStatement call = cn.prepareCall("{call ConsultarCitas(?)}");
     call.setString(1, dato);
     rs = call.executeQuery();
     
     while (rs.next()){
         registro[0] = rs.getString("ID_Cliente");
         registro[1] = rs.getString("ID_Doctor");
         registro[2] = rs.getString("Fecha");
         registro[3] = rs.getString("Hora");
         
         modelo.addRow(registro);
     
 }
     return modelo;
 } catch (SQLException e){
   JOptionPane.showMessageDialog(null, e);
   return null;
 }
 }
 
    public boolean verificarDatos(String dato){
        ResultSet rs;
        
        try {
         CallableStatement call = cn.prepareCall ("{call ConsultarCitas(?)}");
         call.setString(1, dato);
         rs = call.executeQuery();
         return rs.next();
     } catch (SQLException e){
         JOptionPane.showMessageDialog(null, e);   
         return false;
  }
}
 
    public void Guardar(CitasMedicas Citas){
     try {
         CallableStatement cbst = cn.prepareCall ("{call AgregarCitasMedicas(?,?,?,?)}");
         cbst.setInt(1, Citas.getID_Cliente());
         cbst.setInt (2, Citas.getID_Doctor());
         cbst.setDate (3, Citas.getFecha());
         cbst.setTime (4, Citas.getHora());
         cbst.executeUpdate();
     } catch (SQLException e){
         JOptionPane.showMessageDialog(null, e);
     }
    }
   
    
        public void actualizar(CitasMedicas Citas){
        try {
            CallableStatement cbst = cn.prepareCall("{call ActualizarCitasMedicas(?,?,?,?)}");
            cbst.setInt(1, Citas.getID_Cliente());
            cbst.setInt(2, Citas.getID_Doctor());
            cbst.setDate(3, Citas.getFecha());
            cbst.setTime(4, Citas.getHora());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void eliminar(int ID_Cliente) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarCitasM(?)}");
            cbst.setInt(1, ID_Cliente);
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
}
}
