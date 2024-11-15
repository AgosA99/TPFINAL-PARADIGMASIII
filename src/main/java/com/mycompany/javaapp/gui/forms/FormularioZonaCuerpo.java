/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.javaapp.gui.forms;

import com.mycompany.javaapp.controladores.MotivoControlador;
import com.mycompany.javaapp.controladores.ZonaCuerpoControlador;
import com.mycompany.javaapp.controladores.database.Conexion;
import com.mycompany.javaapp.objects.Motivo;
import com.mycompany.javaapp.objects.ZonaCuerpo;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Agos
 */
public class FormularioZonaCuerpo extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioZonaCuerpo
     */
    public FormularioZonaCuerpo() {
        initComponents();
        
        try {
            // Establecer la conexión desde la clase Conexion
            Connection conn = Conexion.conectarDB();  // Aquí se establece la conexión

            // Verificar si la conexión es nula antes de proceder
            if (conn == null) {
                System.out.println("Error: No se pudo establecer la conexión.");
                return;  // Salir si no se puede establecer la conexión
            }

            // Crear el controlador y pasar la conexión
            ZonaCuerpoControlador zonaCuerpoControlador = new ZonaCuerpoControlador();
            zonaCuerpoControlador.setConexion(conn);  // Pasa la conexión al controlador

            // Extraer los datos de los empleados
            ArrayList<ZonaCuerpo> listaZonaCuerpo = (ArrayList<ZonaCuerpo>) zonaCuerpoControlador.extraerTodo();  // Asegúrate que este método devuelve la lista de empleados

            // Establecer los datos en la grilla
            grillaZonasCuerpo.setDatos(listaZonaCuerpo);  // Actualiza la grilla con la lista de empleados

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error al intentar conectar con la base de datos.");
            ex.printStackTrace();
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zonaCuerpoControlador = new com.mycompany.javaapp.controladores.ZonaCuerpoControlador();
        grillaZonasCuerpo = new com.mycompany.javaapp.gui.forms.grillas.GrillaZonasCuerpo();
        zonaCuerpo = new com.mycompany.javaapp.objects.ZonaCuerpo();
        jbNuevo = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtgrilla = new javax.swing.JTable();
        jbCerrar = new javax.swing.JButton();

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jtgrilla.setModel(grillaZonasCuerpo);
        jScrollPane1.setViewportView(jtgrilla);

        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(jbCerrar)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar)
                    .addComponent(jbCerrar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed

        //showAbm(1);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        /* filaseleccionada=jtGrilla.getSelectedRow();
        empleado=JavaApp.empleados.get(filaseleccionada);
        showAbm(2);*/
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        //showAbm(3);
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.javaapp.gui.forms.grillas.GrillaZonasCuerpo grillaZonasCuerpo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JTable jtgrilla;
    private com.mycompany.javaapp.objects.ZonaCuerpo zonaCuerpo;
    private com.mycompany.javaapp.controladores.ZonaCuerpoControlador zonaCuerpoControlador;
    // End of variables declaration//GEN-END:variables
}