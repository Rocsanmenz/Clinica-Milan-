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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import modelo.Servicios;

/**
 *
 * @author FAREM CH-12
 */
public class CRUD_Servicios {

    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();

    public void Guardar(Servicios Cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call CrearServicio(?,?,?,?)}");

            cbst.setString(1, Cl.getNombre_Servicio());
            cbst.setDate(2, Cl.getFecha());
            cbst.setFloat(3, Cl.getPrecio());
            cbst.setInt(4, Cl.getID_Categoria());
            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public DefaultTableModel mostrarDatos() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"ID_Servicios", "Nombres Servicio", "Fecha", "Precio", "Nombre Categoria"};
        String[] registro = new String[5];
        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarServicio}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("ID_Servicio");
                registro[1] = rs.getString("Nombre_Servicio");
                registro[2] = rs.getString("Fecha");
                registro[3] = rs.getString("Precio");
                registro[4] = rs.getString("Nombre_Categoria");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }

    public ArrayList mostrarDatosCombo() {

        ArrayList<Categoria> categoria = new ArrayList<>();

        try {
            CallableStatement cbstc = cn.prepareCall("{call RellenarCategoria}");
            ResultSet rs = cbstc.executeQuery();

            while (rs.next()) {
                Categoria em = new Categoria();
                em.setId_Categoria(Integer.parseInt(rs.getString("ID_Categoria")));
                em.setNombre_Categoria(rs.getString("Nombre_Categoria"));
                categoria.add(em);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return categoria;
    }

    public void ActualizarDatos(Servicios C5) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ServicioModificado(?,?,?,?,?)}");
            cbst.setInt(1, C5.getID_Servicio());
            cbst.setString(2, C5.getNombre_Servicio());
            cbst.setDate(3, C5.getFecha());
            cbst.setFloat(4, C5.getPrecio());
            cbst.setInt(5, C5.getID_Categoria());
            

            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    
    public void EliminarServicio(int ID_Servicio) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarServicio(?)}");
            cbst.setInt(1, ID_Servicio);
            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
}
