/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gonzalez
 */
public class JInternalFrameCitasAgendadas extends javax.swing.JInternalFrame {

    int datoSeleccionado = -1;
    
    public JInternalFrameCitasAgendadas() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableCitasAgendadas = new javax.swing.JTable();
        jTextBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botonmostrar = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableCitasAgendadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Cliente", "ID Doctor", "Fecha", "Hora"
            }
        ));
        TableCitasAgendadas.setGridColor(new java.awt.Color(0, 0, 0));
        TableCitasAgendadas.setShowGrid(true);
        TableCitasAgendadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableCitasAgendadasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TableCitasAgendadas);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 219, 622, 228));

        jTextBuscar.setForeground(new java.awt.Color(153, 153, 153));
        jTextBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextBuscar.setText("Escribe el id cliente o id doctor");
        jTextBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextBuscarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextBuscarMousePressed(evt);
            }
        });
        jPanel3.add(jTextBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 148, 450, 39));

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(51, 0, 240));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buscar.png"))); // NOI18N
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 148, 55, -1));

        jButtonEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(51, 0, 240));
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Editar.png"))); // NOI18N
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 465, 56, -1));

        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(51, 0, 240));
        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Borrar.png"))); // NOI18N
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 465, 50, -1));

        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Agregar.png"))); // NOI18N
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 465, 56, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Citas Agendadas");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 61, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Calendario.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 55, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        botonmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(574, Short.MAX_VALUE)
                .addComponent(botonmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 622, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
     
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextBuscarMouseClicked
    
    }//GEN-LAST:event_jTextBuscarMouseClicked

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jTextBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextBuscarMousePressed
        
    }//GEN-LAST:event_jTextBuscarMousePressed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
       
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void TableCitasAgendadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCitasAgendadasMouseClicked
         datoSeleccionado = TableCitasAgendadas.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_TableCitasAgendadasMouseClicked

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
       
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void botonmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmostrarActionPerformed
       
    }//GEN-LAST:event_botonmostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableCitasAgendadas;
    public static javax.swing.JButton botonmostrar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextBuscar;
    // End of variables declaration//GEN-END:variables
}
