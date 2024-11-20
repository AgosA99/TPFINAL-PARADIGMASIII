/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.javaapp.gui.forms.abm;


import com.mycompany.javaapp.controladores.AccidenteControlador;
import com.mycompany.javaapp.controladores.MotivoControlador;
import com.mycompany.javaapp.controladores.ZonaCuerpoControlador;
import com.mycompany.javaapp.objects.Accidente;
import com.mycompany.javaapp.objects.Motivo;
import com.mycompany.javaapp.objects.ZonaCuerpo;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Agos
 */
public class AbmZonaCuerpo extends javax.swing.JInternalFrame {
    private int accion;
    
    /**
     * Creates new form AbmZonaCuerpo
     */
    public AbmZonaCuerpo() throws SQLException, ClassNotFoundException {
        initComponents();
        
        
        
    }
    
        
       /* private void cargarComboBoxes() {
        try {
            // Llenar el ComboBox de accidentes
            List<Accidente> listaAccidentes = AccidenteControlador.extraerTodo();
            jcbIdaccidente.removeAllItems();  // Limpiar los elementos previos del ComboBox
            for (Accidente accidente : listaAccidentes) {
                jcbIdaccidente.addItem(accidente);  // Agregar cada objeto Accidente al ComboBox
            }

            // Llenar el ComboBox de partes del cuerpo
            List<ParteCuerpo> listaPartesCuerpo = zonaCuerpoControlador.extraerTodoPartesCuerpo();
            jcbIdparte.removeAllItems();  // Limpiar los elementos previos del ComboBox
            for (ParteCuerpo parteCuerpo : listaPartesCuerpo) {
                jcbIdparte.addItem(parteCuerpo);  // Agregar cada objeto ParteCuerpo al ComboBox
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();  // Manejo de errores si no se pueden cargar los datos
        }
        
    }/*
    
    public AbmZonaCuerpo(int accion,ZonaCuerpo zonaCuerpo,ZonaCuerpoControlador zonaCuerpoControlador) {
        this.accion = accion;
        this.zonaCuerpo = zonaCuerpo;
        this.zonaCuerpoControlador=zonaCuerpoControlador;
        initComponents();
        switch (accion) {
            case 1:
                zonaCuerpo=new ZonaCuerpo();
                break;
            case 2: 
                cargarFormulario(zonaCuerpo);
                break;
            case 3:
                cargarFormulario(zonaCuerpo);
                break;
            default:
                throw new AssertionError();
        }
        
    }

    private void cargarFormulario(ZonaCuerpo zonaCuerpo) {
        jtfId.setText(zonaCuerpo.getId_zona_cuerpo().toString());
        jcbIdaccidente.getSelectedItem();
        jtfLado.setText(zonaCuerpo.getLado());
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
        zonaCuerpo = new com.mycompany.javaapp.objects.ZonaCuerpo();
        jLabel1 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbAceptar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfLado = new javax.swing.JTextField();
        jcbIdaccidente = new javax.swing.JComboBox<>();
        jcbIdparte = new javax.swing.JComboBox<>();

        jLabel1.setText("ID:");

        jtfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Accidente:");

        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jLabel3.setText("ID Parte Cuerpo:");

        jLabel4.setText("Lado Afectado:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jtfLado, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jcbIdparte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfId, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jcbIdaccidente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(79, 79, 79)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbIdaccidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbIdparte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbAceptar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdActionPerformed

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed

    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JComboBox<String> jcbIdaccidente;
    private javax.swing.JComboBox<String> jcbIdparte;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfLado;
    private com.mycompany.javaapp.objects.ZonaCuerpo zonaCuerpo;
    private com.mycompany.javaapp.controladores.ZonaCuerpoControlador zonaCuerpoControlador;
    // End of variables declaration//GEN-END:variables
}