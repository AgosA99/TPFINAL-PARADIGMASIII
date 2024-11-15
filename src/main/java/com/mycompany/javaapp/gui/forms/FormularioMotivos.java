/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.javaapp.gui.forms;

import com.mycompany.javaapp.JavaApp;
import com.mycompany.javaapp.controladores.EmpleadoControlador;
import com.mycompany.javaapp.controladores.MotivoControlador;
import com.mycompany.javaapp.controladores.database.Conexion;
import com.mycompany.javaapp.gui.Principal;
import com.mycompany.javaapp.gui.forms.abm.AbmEmpleados;
import com.mycompany.javaapp.gui.forms.abm.AbmMotivos;
import com.mycompany.javaapp.objects.Empleado;
import com.mycompany.javaapp.objects.Motivo;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Agos
 */
public class FormularioMotivos extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioMotivos
     */
    public FormularioMotivos() {
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
            MotivoControlador motivoControlador = new MotivoControlador();
            motivoControlador.setConexion(conn);  // Pasa la conexión al controlador

            // Extraer los datos de los empleados
            ArrayList<Motivo> listaMotivos = (ArrayList<Motivo>) motivoControlador.extraerTodo();  // Asegúrate que este método devuelve la lista de empleados

            // Establecer los datos en la grilla
            grillaMotivos.setDatos(listaMotivos);  // Actualiza la grilla con la lista de empleados

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

        motivoControlador = new com.mycompany.javaapp.controladores.MotivoControlador();
        grillaMotivos = new com.mycompany.javaapp.gui.forms.grillas.GrillaMotivos(JavaApp.motivos);
        motivo = new com.mycompany.javaapp.objects.Motivo();
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

        jtgrilla.setModel(grillaMotivos);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                .addComponent(jbCerrar)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
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

        AbmMotivos abmMotivos=new AbmMotivos(1, motivo, motivoControlador);
        Principal.desktopPane.add(abmMotivos);
        abmMotivos.setVisible(true);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        /* filaseleccionada=jtGrilla.getSelectedRow();
        empleado=JavaApp.empleados.get(filaseleccionada);*/
        AbmMotivos abmMotivos=new AbmMotivos(2, motivo, motivoControlador);
        Principal.desktopPane.add(abmMotivos);
        abmMotivos.setVisible(true);
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        AbmMotivos abmMotivos=new AbmMotivos(3, motivo, motivoControlador);
        Principal.desktopPane.add(abmMotivos);
        abmMotivos.setVisible(true);
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.javaapp.gui.forms.grillas.GrillaMotivos grillaMotivos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JTable jtgrilla;
    private com.mycompany.javaapp.objects.Motivo motivo;
    private com.mycompany.javaapp.controladores.MotivoControlador motivoControlador;
    // End of variables declaration//GEN-END:variables
}