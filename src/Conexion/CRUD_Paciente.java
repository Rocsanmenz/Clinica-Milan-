/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Conexion_BD.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Paciente;

/**
 *
 * @author UNAN-Chontales
 */
public class CRUD_Paciente {

    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();

    public void Guardar(Paciente Cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call CrearPaciente(?,?,?,?,?,?,?,?)}");
            cbst.setString(1, Cl.getNombres());
            cbst.setString(2, Cl.getApellidos());
            cbst.setString(3, Cl.getTelefono());
            cbst.setString(4, Cl.getCedula());
            cbst.setString(5, Cl.getProcedencia());
            cbst.setString(6, Cl.getEdad());
            cbst.setString(7, Cl.getMedico());
            cbst.setString(8, Cl.getProcedimiento());

            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public DefaultTableModel mostrarDatos() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"ID_General", "ID_Cliente", "Cedula_cliente", "Nombres", "Apellidos", "Telefono", "Procedencia", "Edad", "Procedimiento", "Medico"};
        String[] registro = new String[10];
        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarPaciente}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("ID_Persona");
                registro[1] = rs.getString("ID_Cliente");
                registro[2] = rs.getString("Cedula");
                registro[3] = rs.getString("Nombres");
                registro[4] = rs.getString("Apellidos");
                registro[5] = rs.getString("Telefono");
                registro[6] = rs.getString("Procedencia");
                registro[7] = rs.getString("Edad");
                registro[8] = rs.getString("procedimiento");
                registro[9] = rs.getString("Medico");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }

    public void ActualizarDatos(Paciente C5) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ModificarPaciente(?,?,?,?,?,?,?,?,?)}");
            cbst.setInt(1, C5.getId_Persona());
            cbst.setString(2, C5.getNombres());
            cbst.setString(3, C5.getApellidos());
            cbst.setString(4, C5.getTelefono());
            cbst.setString(5, C5.getCedula());
            cbst.setString(6, C5.getProcedencia());
            cbst.setString(7, C5.getEdad());
            cbst.setString(8, C5.getMedico());
            cbst.setString(9, C5.getProcedimiento());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void EliminarPaciente(int ID_Persona) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarPaciente(?)}");
            cbst.setInt(1, ID_Persona);
            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public DefaultTableModel buscarDatosPaciente(String Dato) {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"ID_General", "ID_Cliente", "Cedula_cliente", "Nombres", "Apellidos", "Telefono", "Procedencia", "Edad", "Procedimiento", "Medico"};
        String[] registro = new String[10];
        modelo = new DefaultTableModel(null, titulos);
        try {
            CallableStatement call = cn.prepareCall("{call ConsultarPaciente(?)}");
            call.setString(1, Dato);
            rs = call.executeQuery();

             while (rs.next()) {
               
                registro[0] = rs.getString("ID_Cliente");
                registro[1] = rs.getString("Cedula");
                registro[2] = rs.getString("Nombres");
                registro[3] = rs.getString("Apellidos");
                registro[4] = rs.getString("Telefono");
                registro[5] = rs.getString("Procedencia");
                registro[6] = rs.getString("Edad");
                registro[7] = rs.getString("procedimiento");
                registro[8] = rs.getString("Medico");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

}
