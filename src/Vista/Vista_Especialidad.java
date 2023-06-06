
package Vista;

import Conexion.CRUD_Especialidad;
import Conexion.CRUD_Paciente;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Especialidad;

/**
 *
 * @author Toshiba2023
 */
public class Vista_Especialidad extends javax.swing.JFrame {
    int datoSeleccionado = -1;

    /**
     * Creates new form Vista_Especialidad
     */
    public Vista_Especialidad() {
        initComponents();
        
        botonmostrar.setVisible(false);
        jTextFieldIDEspecialidad.setVisible(false);
        jTextFieldIDEspecialidad.setEnabled(false);
        mostrar();
        
    }

    public void guardarEspecialidad() {

        CRUD_Especialidad cc = new CRUD_Especialidad();
        Especialidad E = new Especialidad(
                jTextFieldNombre.getText());
        cc.Guardar(E);
    }
    
    
     public void limpiar() {
        jTextFieldNombre.setText("");
        

    }
    
     public void mostrar() {
        try {
            DefaultTableModel modelo;
            CRUD_Especialidad cli = new CRUD_Especialidad();
            modelo = cli.mostrarDatos();
            jTableEspecialidad.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
     
     public void editarEspecialidad() {

        CRUD_Especialidad cc = new CRUD_Especialidad();

        Especialidad cl = new Especialidad(
                Integer.parseInt(jTextFieldIDEspecialidad.getText()),
                jTextFieldNombre.getText());
                

        cc.ActualizarDatos(cl);

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldIDEspecialidad = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEspecialidad = new javax.swing.JTable();
        jButtonGuardar = new javax.swing.JButton();
        botonmostrar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Registro de Especialidades");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jTextFieldIDEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDEspecialidadActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldIDEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 210, -1));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 210, -1));

        jTableEspecialidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id_Especialidad", "Nombre_Especialidad"
            }
        ));
        jTableEspecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEspecialidadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEspecialidad);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 460, 90));

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        botonmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmostrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        CRUD_Especialidad cl = new CRUD_Especialidad();
        try {
            if ((jTextFieldNombre.getText().equals(""))
                    ) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacio");
            } else {
                guardarEspecialidad();
                limpiar();
                JOptionPane.showMessageDialog(null, "Datos guardados");
                Vista_Especialidad.botonmostrar.doClick();
                
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void botonmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmostrarActionPerformed
        mostrar();
    }//GEN-LAST:event_botonmostrarActionPerformed

    private void jTableEspecialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEspecialidadMouseClicked
        datoSeleccionado = jTableEspecialidad.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_jTableEspecialidadMouseClicked

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
         if (datoSeleccionado >= 0) {

            Vista_Especialidad.jTextFieldIDEspecialidad.setText(String.valueOf(jTableEspecialidad.getValueAt(datoSeleccionado, 0)));
            Vista_Especialidad.jTextFieldNombre.setText(String.valueOf(jTableEspecialidad.getValueAt(datoSeleccionado, 1)));
            

            Vista_Especialidad.jButtonGuardar.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro a actualizar");
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        try {
            if (jTextFieldIDEspecialidad.getText().isEmpty()
                    || jTextFieldNombre.getText().isEmpty()
                    ) {
                JOptionPane.showMessageDialog(null, "Existen campos vacíos");
            } else {

                editarEspecialidad();

                limpiar();
                Vista_Especialidad.jButtonGuardar.setVisible(true);
                JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
                Vista_Especialidad.botonmostrar.doClick();

            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        if (datoSeleccionado >= 0) {
            int dato = Integer.valueOf(jTableEspecialidad.getValueAt(datoSeleccionado, 0).toString());
            CRUD_Especialidad cli = new CRUD_Especialidad();
            if (JOptionPane.showConfirmDialog(rootPane,
                "Se eliminará el registro, ¿desea continuar?",
                "Eliminar Registro",
                JOptionPane.WARNING_MESSAGE,
                JOptionPane.YES_NO_OPTION)
            == JOptionPane.YES_OPTION) {

            cli.EliminarEspecialidad(dato);
            mostrar();
            JOptionPane.showMessageDialog(null,
                "Dato eliminado correctamente");
        }
        } else {
            JOptionPane.showMessageDialog(null,
                "Debe seleccionar un registro de la tabla");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTextFieldIDEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDEspecialidadActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_Especialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Especialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Especialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Especialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Especialidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botonmostrar;
    private javax.swing.JButton jButtonActualizar;
    public static javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    public static javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEspecialidad;
    public static javax.swing.JTextField jTextFieldIDEspecialidad;
    public static javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
