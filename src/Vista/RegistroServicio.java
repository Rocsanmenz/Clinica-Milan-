/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Conexion.CRUD_Doctor;
import Conexion.CRUD_Especialidad;
import Conexion.CRUD_Servicios;
import static Vista.RegistroDoctor.botonmostrar;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import modelo.Especialidad;
import modelo.Servicios;

/**
 *
 * @author Yosa Lumbi
 */
public class RegistroServicio extends javax.swing.JFrame {

    int datoSeleccionado = -1;
    public RegistroServicio() {
        initComponents();
        botonmostrar.setVisible(false);
        llenarCombo();
        mostrar();
    }

    public void guardarServicio() {

        Categoria categoriaSeleccionada = (Categoria) jComboBoxCategoria.getSelectedItem();
        int idCategoria = categoriaSeleccionada.getId_Categoria();

        String strFecha = jTextFecha.getText();
        java.sql.Date fecha = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date utilFecha = format.parse(strFecha);
            fecha = new java.sql.Date(utilFecha.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        CRUD_Servicios cc = new CRUD_Servicios();
        Servicios S = new Servicios(jTextNombre.getText(),
                fecha,
                Float.parseFloat(jTextPrecio.getText()),
                categoriaSeleccionada.getId_Categoria());

        cc.Guardar(S);
    }

    public void editarEspecialidad() {
        String strFecha = jTextFecha.getText();
        java.sql.Date fecha = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date utilFecha = format.parse(strFecha);
            fecha = new java.sql.Date(utilFecha.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Especialidad especialidadSeleccionada = (Especialidad) jComboBoxCategoria.getSelectedItem();
        int idEspec = especialidadSeleccionada.getId_Especialidad();
        CRUD_Servicios cc = new CRUD_Servicios();

        Servicios cl = new Servicios(
                jTextNombre.getText(),
                fecha,
                Float.parseFloat(jTextPrecio.getText()),
                especialidadSeleccionada.getId_Especialidad()
                
        );

        cc.ActualizarDatos(cl);

    }

    public void mostrar() {
        try {
            DefaultTableModel modelo;
            CRUD_Servicios cli = new CRUD_Servicios();
            modelo = cli.mostrarDatos();
            jTableServicio.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void llenarCombo() {

        CRUD_Servicios gr = new CRUD_Servicios();
        ArrayList<Categoria> listaCategoria = gr.mostrarDatosCombo();
        jComboBoxCategoria.removeAllItems();
        for (int i = 0; i < listaCategoria.size(); i++) {
            jComboBoxCategoria.addItem(new Categoria(
                    listaCategoria.get(i).getId_Categoria(),
                    listaCategoria.get(i).getNombre_Categoria()));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        Precio = new javax.swing.JLabel();
        jTextPrecio = new javax.swing.JTextField();
        ID_Categoria = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableServicio = new javax.swing.JTable();
        jButtonActualizar1 = new javax.swing.JButton();
        jButtonActualizar2 = new javax.swing.JButton();
        jTextFecha = new javax.swing.JTextField();
        Precio1 = new javax.swing.JLabel();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        botonmostrar = new javax.swing.JButton();
        JtextfieldIDSERVICIOS = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Servicio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 103))); // NOI18N

        Nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Nombre.setText("Nombre");

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });

        Precio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Precio.setText("Precio");

        ID_Categoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ID_Categoria.setText("ID_Categoria");

        jButtonGuardar.setBackground(new java.awt.Color(255, 0, 250));
        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonActualizar.setBackground(new java.awt.Color(255, 0, 250));
        jButtonActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jTableServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTableServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableServicioMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableServicio);

        jButtonActualizar1.setBackground(new java.awt.Color(255, 0, 250));
        jButtonActualizar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonActualizar1.setText("Editar");
        jButtonActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizar1ActionPerformed(evt);
            }
        });

        jButtonActualizar2.setBackground(new java.awt.Color(255, 0, 250));
        jButtonActualizar2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonActualizar2.setText("Eliminar");
        jButtonActualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizar2ActionPerformed(evt);
            }
        });

        Precio1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Precio1.setText("Fecha");

        botonmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmostrarActionPerformed(evt);
            }
        });

        JtextfieldIDSERVICIOS.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButtonActualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(ID_Categoria)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonmostrar)
                        .addGap(107, 107, 107)
                        .addComponent(JtextfieldIDSERVICIOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Precio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Nombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(105, 105, 105)
                        .addComponent(Precio1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtextfieldIDSERVICIOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID_Categoria)
                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Precio)
                    .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio1)
                    .addComponent(jTextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonActualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 6, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        CRUD_Servicios cl = new CRUD_Servicios();
        try {
            if ((jTextNombre.getText().equals(""))
                    || (jTextFecha.getText().equals(""))
                    || (jTextPrecio.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacio");
            } else {
//                String correo = jTextCorreo.getText();
//            System.out.println("Valor de correo: " + correo);
                guardarServicio();

                RegistroServicio.botonmostrar.doClick();
                JOptionPane.showMessageDialog(null, "Datos guardados");
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jButtonActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizar1ActionPerformed
        if (datoSeleccionado >= 0) {

            RegistroServicio.JtextfieldIDSERVICIOS.setText(String.valueOf(jTableServicio.getValueAt(datoSeleccionado, 0)));
            RegistroServicio.jTextNombre.setText(String.valueOf(jTableServicio.getValueAt(datoSeleccionado, 1)));
            RegistroServicio.jTextPrecio.setText(String.valueOf(jTableServicio.getValueAt(datoSeleccionado, 2)));
            RegistroServicio.jTextFecha.setText(String.valueOf(jTableServicio.getValueAt(datoSeleccionado, 3)));
            

            RegistroDoctor.jButtonGuardar.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro a actualizar");
        }
    }//GEN-LAST:event_jButtonActualizar1ActionPerformed

    private void jButtonActualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonActualizar2ActionPerformed

    private void botonmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmostrarActionPerformed
        mostrar();
    }//GEN-LAST:event_botonmostrarActionPerformed

    private void jTableServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableServicioMouseClicked
        datoSeleccionado = jTableServicio.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_jTableServicioMouseClicked

    public static void mai(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID_Categoria;
    public static javax.swing.JTextField JtextfieldIDSERVICIOS;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Precio;
    private javax.swing.JLabel Precio1;
    public static javax.swing.JButton botonmostrar;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonActualizar1;
    private javax.swing.JButton jButtonActualizar2;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    public static javax.swing.JComboBox<Categoria> jComboBoxCategoria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableServicio;
    public static javax.swing.JTextField jTextFecha;
    public static javax.swing.JTextField jTextNombre;
    public static javax.swing.JTextField jTextPrecio;
    // End of variables declaration//GEN-END:variables
}
