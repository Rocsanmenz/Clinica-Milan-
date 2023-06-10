/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantalla;

import Conexion.CRUD_Paciente;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modelo.Paciente;

/**
 *
 * @author Hp
 */
public class RegitroPaciente extends javax.swing.JFrame {

    
    
    
    int datoSeleccionado = -1;

    public RegitroPaciente() {
        initComponents();
        jTextFieldIDPersona.setEnabled(false);
        jTextFieldIDPersona.setVisible(false);
        jTextFieldIDPaciente.setVisible(false);
        jTextFieldIDPaciente.setEnabled(false);
        mostrar();
    }

    public void guardarPaciente() {

        CRUD_Paciente cc = new CRUD_Paciente();
        Paciente PA = new Paciente(
                jTextCedula.getText(),
                jTextProcedencia.getText(),
                jTextEdad.getText(),
                jTextMedico.getText(),
                jTextProcedimiento.getText(),
                jTextNombre.getText(),
                jTextApellidos.getText(),
                jTextTelefono.getText());
        cc.Guardar(PA);
    }

    public void mostrar() {
        try {
            DefaultTableModel modelo;
            CRUD_Paciente cli = new CRUD_Paciente();
            modelo = cli.mostrarDatos();
            jTablepaciente.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void editarPaciente() {

        CRUD_Paciente cc = new CRUD_Paciente();

        Paciente cl = new Paciente(
                jTextCedula.getText(),
                jTextProcedencia.getText(),
                jTextEdad.getText(),
                jTextMedico.getText(),
                jTextProcedimiento.getText(),
                Integer.parseInt(jTextFieldIDPersona.getText()),
                jTextNombre.getText(),
                jTextApellidos.getText(),
                jTextTelefono.getText());

        cc.ActualizarDatos(cl);

    }

    public void limpiar() {
        jTextNombre.setText("");
        jTextApellidos.setText("");
        jTextEdad.setText("");

        jTextProcedencia.setText("");
        jTextCedula.setText("");
        jTextTelefono.setText("");
        jTextMedico.setText("");
        jTextProcedimiento.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextApellidos = new javax.swing.JTextField();
        jTextEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtexlabelMedico = new javax.swing.JLabel();
        jTextProcedencia = new javax.swing.JTextField();
        jTextCedula = new javax.swing.JTextField();
        jTextTelefono = new javax.swing.JTextField();
        jTextMedico = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jTextFieldBuscarPaciente = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablepaciente = new javax.swing.JTable();
        jTextProcedimiento = new javax.swing.JTextField();
        jtexlabeProcedimiento = new javax.swing.JLabel();
        botonmostrar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldIDPersona = new javax.swing.JTextField();
        jTextFieldIDPaciente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de paciente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 120))); // NOI18N
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Apellidos");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Edad");

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Procedencia");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Cedula");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Telefono");

        jtexlabelMedico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtexlabelMedico.setText("Medico");

        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jTextFieldBuscarPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldBuscarPaciente.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldBuscarPaciente.setText("Buscar paciente");
        jTextFieldBuscarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldBuscarPacienteMouseClicked(evt);
            }
        });
        jTextFieldBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarPacienteActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTablepaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jTablepaciente.setToolTipText("");
        jTablepaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablepacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablepaciente);
        if (jTablepaciente.getColumnModel().getColumnCount() > 0) {
            jTablepaciente.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            jTablepaciente.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            jTablepaciente.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            jTablepaciente.getColumnModel().getColumn(3).setHeaderValue("Title 4");
            jTablepaciente.getColumnModel().getColumn(4).setHeaderValue("Title 5");
            jTablepaciente.getColumnModel().getColumn(5).setHeaderValue("Title 6");
            jTablepaciente.getColumnModel().getColumn(6).setHeaderValue("Title 7");
            jTablepaciente.getColumnModel().getColumn(7).setHeaderValue("Title 8");
        }

        jtexlabeProcedimiento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtexlabeProcedimiento.setText("Procedimiento");

        botonmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmostrarActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTextFieldIDPersona.setText("jTextField1");

        jTextFieldIDPaciente.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtexlabeProcedimiento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextProcedimiento))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(39, 39, 39)
                                        .addComponent(jTextEdad)))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jtexlabelMedico))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(jTextProcedencia)
                                    .addComponent(jTextTelefono)
                                    .addComponent(jTextMedico)))
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jTextFieldIDPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldIDPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(botonmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIDPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIDPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel5)
                        .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtexlabelMedico)
                    .addComponent(jTextMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtexlabeProcedimiento)
                    .addComponent(jTextProcedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(botonmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        CRUD_Paciente cl = new CRUD_Paciente();
        try {
            if ((jTextNombre.getText().equals(""))
                    || (jTextApellidos.getText().equals(""))
                    || (jTextEdad.getText().equals(""))
                    || (jTextProcedencia.getText().equals(""))
                    || (jTextCedula.getText().equals(""))
                    || (jTextTelefono.getText().equals(""))
                    || (jTextMedico.getText().equals(""))
                    || (jTextProcedimiento.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacio");
            } else {
                guardarPaciente();
                limpiar();
                JOptionPane.showMessageDialog(null, "Datos guardados");
                RegitroPaciente.botonmostrar.doClick();
                
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (datoSeleccionado >= 0) {

            RegitroPaciente.jTextFieldIDPersona.setText(String.valueOf(jTablepaciente.getValueAt(datoSeleccionado, 0)));
            RegitroPaciente.jTextFieldIDPaciente.setText(String.valueOf(jTablepaciente.getValueAt(datoSeleccionado, 1)));
            RegitroPaciente.jTextCedula.setText(String.valueOf(jTablepaciente.getValueAt(datoSeleccionado, 2)));
            RegitroPaciente.jTextNombre.setText(String.valueOf(jTablepaciente.getValueAt(datoSeleccionado, 3)));
            RegitroPaciente.jTextApellidos.setText(String.valueOf(jTablepaciente.getValueAt(datoSeleccionado, 4)));
            RegitroPaciente.jTextTelefono.setText(String.valueOf(jTablepaciente.getValueAt(datoSeleccionado, 5)));
            RegitroPaciente.jTextProcedencia.setText(String.valueOf(jTablepaciente.getValueAt(datoSeleccionado, 6)));
            RegitroPaciente.jTextEdad.setText(String.valueOf(jTablepaciente.getValueAt(datoSeleccionado, 7)));
            RegitroPaciente.jTextProcedimiento.setText(String.valueOf(jTablepaciente.getValueAt(datoSeleccionado, 8)));
            RegitroPaciente.jTextMedico.setText(String.valueOf(jTablepaciente.getValueAt(datoSeleccionado, 9)));

            RegitroPaciente.jButtonGuardar.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro a actualizar");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if (jTextFieldIDPersona.getText().isEmpty()
                    || jTextNombre.getText().isEmpty()
                    || jTextApellidos.getText().isEmpty()
                    || jTextEdad.getText().isEmpty()
                    
                    || jTextProcedencia.getText().isEmpty()
                    || jTextCedula.getText().isEmpty()
                    || jTextTelefono.getText().isEmpty()
                    || jTextMedico.getText().isEmpty()
                    || jTextProcedimiento.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacíos");
            } else {

                editarPaciente();

                limpiar();
                RegitroPaciente.jButtonGuardar.setVisible(true);
                JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
                RegitroPaciente.botonmostrar.doClick();

            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTablepacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablepacienteMouseClicked
        datoSeleccionado = jTablepaciente.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_jTablepacienteMouseClicked

    private void botonmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmostrarActionPerformed
        mostrar();
    }//GEN-LAST:event_botonmostrarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (datoSeleccionado >= 0) {
            int dato = Integer.valueOf(jTablepaciente.getValueAt(datoSeleccionado, 0).toString());
            CRUD_Paciente cli = new CRUD_Paciente();
            if (JOptionPane.showConfirmDialog(rootPane,
                "Se eliminará el registro, ¿desea continuar?",
                "Eliminar Registro",
                JOptionPane.WARNING_MESSAGE,
                JOptionPane.YES_NO_OPTION)
            == JOptionPane.YES_OPTION) {

            cli.EliminarPaciente(dato);
            mostrar();
            JOptionPane.showMessageDialog(null,
                "Dato eliminado correctamente");
        }
        } else {
            JOptionPane.showMessageDialog(null,
                "Debe seleccionar un registro de la tabla");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarPacienteActionPerformed

    private void jTextFieldBuscarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldBuscarPacienteMouseClicked
        if (jTextFieldBuscarPaciente.getText().equals("Buscar paciente")) {
            jTextFieldBuscarPaciente.setText("");
            jTextFieldBuscarPaciente.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextFieldBuscarPacienteMouseClicked

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try {
            DefaultTableModel modelo;
            CRUD_Paciente cli = new CRUD_Paciente();
            modelo = cli.buscarDatosPaciente(jTextFieldBuscarPaciente.getText());
            if (jTextFieldBuscarPaciente.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Escriba el dato a buscar");
                mostrar();
            } else {
                jTablepaciente.setModel(modelo);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegitroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegitroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegitroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegitroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegitroPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botonmostrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonBuscar;
    public static javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablepaciente;
    public static javax.swing.JTextField jTextApellidos;
    public static javax.swing.JTextField jTextCedula;
    public static javax.swing.JTextField jTextEdad;
    private javax.swing.JTextField jTextFieldBuscarPaciente;
    public static javax.swing.JTextField jTextFieldIDPaciente;
    public static javax.swing.JTextField jTextFieldIDPersona;
    public static javax.swing.JTextField jTextMedico;
    public static javax.swing.JTextField jTextNombre;
    public static javax.swing.JTextField jTextProcedencia;
    public static javax.swing.JTextField jTextProcedimiento;
    public static javax.swing.JTextField jTextTelefono;
    private javax.swing.JLabel jtexlabeProcedimiento;
    private javax.swing.JLabel jtexlabelMedico;
    // End of variables declaration//GEN-END:variables
}
