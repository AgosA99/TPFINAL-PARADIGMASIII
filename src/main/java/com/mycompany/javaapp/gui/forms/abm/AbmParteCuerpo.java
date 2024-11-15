/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.javaapp.gui.forms.abm;

import com.mycompany.javaapp.controladores.MotivoControlador;
import com.mycompany.javaapp.controladores.ParteCuerpoControlador;
import com.mycompany.javaapp.controladores.database.Conexion;
import static com.mycompany.javaapp.controladores.database.Conexion.conn;
import com.mycompany.javaapp.objects.Motivo;
import com.mycompany.javaapp.objects.ParteCuerpo;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Agos
 */
public class AbmParteCuerpo extends javax.swing.JInternalFrame {
    private int accion;
    /**
     * Creates new form AbmParteCuerpo
     */
    public AbmParteCuerpo() throws SQLException, ClassNotFoundException {
        
        initComponents();
       
        
    }
    
    public AbmParteCuerpo(int accion,ParteCuerpo parteCuerpo,ParteCuerpoControlador parteCuerpoControlador) {
        this.accion = accion;
        this.parteCuerpo = parteCuerpo;
        this.parteCuerpoControlador=parteCuerpoControlador;
        initComponents();
        switch (accion) {
            case 1:
                parteCuerpo=new ParteCuerpo();
                break;
            case 2: 
                cargarFormulario(parteCuerpo);
                break;
            case 3:
                cargarFormulario(parteCuerpo);
                break;
            default:
                throw new AssertionError();
        }
        
    }

    private void cargarFormulario(ParteCuerpo parteCuerpo) {
        jtfId.setText(parteCuerpo.getId_parte_cuerpo().toString());
        jtfParte.setText(parteCuerpo.getParte());
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parteCuerpo = new com.mycompany.javaapp.objects.ParteCuerpo();
        parteCuerpoControlador = new com.mycompany.javaapp.controladores.ParteCuerpoControlador();
        jbCancelar = new javax.swing.JButton();
        jbAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfParte = new javax.swing.JTextField();

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        jtfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdActionPerformed(evt);
            }
        });

        jLabel2.setText("Parte Afectada:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCancelar)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfParte, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtfParte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbAceptar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
       
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jtfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfParte;
    private com.mycompany.javaapp.objects.ParteCuerpo parteCuerpo;
    private com.mycompany.javaapp.controladores.ParteCuerpoControlador parteCuerpoControlador;
    // End of variables declaration//GEN-END:variables
}