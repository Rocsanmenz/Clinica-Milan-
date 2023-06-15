/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Conexion_BD.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Personal_Medico;

/**
 *
 * @author FAREM CH-12
 */
public class CRUD_Doctor {

    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();

    public DefaultTableModel mostrarDatos() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"ID_Persona", "ID_Doctor", "Nombres", "Apellidos", "Correo", "Telefono", "Procedencia_Medica", "ID_Especialidad", "Codigo_Minsa", "usuario", "Contrasena"};
        String[] registro = new String[11];
        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarDoc}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("ID_Persona");
                registro[1] = rs.getString("ID_Doctor");
                registro[2] = rs.getString("Nombres");
                registro[3] = rs.getString("Apellidos");
                registro[4] = rs.getString("Correo");
                registro[5] = rs.getString("Telefono");
                registro[6] = rs.getString("Procedencia_Medica");
                registro[7] = rs.getString("ID_Especialidad");
                registro[8] = rs.getString("Codigo_Minsa");
                registro[9] = rs.getString("usuario");
                registro[10] = rs.getString("Contrasena");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }

    public void Guardar(Personal_Medico Cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call CrearDOC(?,?,?,?,?,?,?,?,?)}");

            cbst.setString(1, Cl.getNombres());
            cbst.setString(2, Cl.getApellidos());
            cbst.setString(3, Cl.getTelefono());
            cbst.setString(4, Cl.getCorreo());
            cbst.setInt(5, Cl.getID_Especialidad());
            cbst.setInt(6, Cl.getCodigo_Minsa());
            cbst.setString(7, Cl.getProcedencia_Medica());
            cbst.setString(8, Cl.getUsuario());
            cbst.setString(9, Cl.getContrasena());

            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

}
