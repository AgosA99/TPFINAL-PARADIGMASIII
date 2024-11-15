/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package com.mycompany.javaapp.gui;

import com.mycompany.javaapp.gui.forms.FormularioAccidentes;
import com.mycompany.javaapp.gui.forms.FormularioEmpleados;
import com.mycompany.javaapp.gui.forms.FormularioMotivos;
import com.mycompany.javaapp.gui.forms.FormularioParteCuerpo;
import com.mycompany.javaapp.gui.forms.FormularioTiposAccidentes;
import com.mycompany.javaapp.gui.forms.FormularioZonaCuerpo;

/**
 *
 * @author Agos
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        jmAccidentes = new javax.swing.JMenu();
        jmiAccidente = new javax.swing.JMenuItem();
        jmEmpleados = new javax.swing.JMenu();
        jmiEmpleados = new javax.swing.JMenuItem();
        jmMotivos = new javax.swing.JMenu();
        jmiMotivos = new javax.swing.JMenuItem();
        jmTipos = new javax.swing.JMenu();
        jmiTipos = new javax.swing.JMenuItem();
        jmPartes = new javax.swing.JMenu();
        jmiParteCuerp = new javax.swing.JMenuItem();
        jmZonas = new javax.swing.JMenu();
        jmiZona = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmAccidentes.setText("Accidentes");

        jmiAccidente.setText("Registro Accidentes");
        jmiAccidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAccidenteActionPerformed(evt);
            }
        });
        jmAccidentes.add(jmiAccidente);

        menuBar.add(jmAccidentes);

        jmEmpleados.setText("Empleados");

        jmiEmpleados.setText("Registro Empleados");
        jmiEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEmpleadosActionPerformed(evt);
            }
        });
        jmEmpleados.add(jmiEmpleados);

        menuBar.add(jmEmpleados);

        jmMotivos.setText("Motivos");

        jmiMotivos.setText("Registro Motivos");
        jmiMotivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMotivosActionPerformed(evt);
            }
        });
        jmMotivos.add(jmiMotivos);

        menuBar.add(jmMotivos);

        jmTipos.setText("Tipos de Accidentes");

        jmiTipos.setText("Registro Tipos de Accidentes");
        jmiTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTiposActionPerformed(evt);
            }
        });
        jmTipos.add(jmiTipos);

        menuBar.add(jmTipos);

        jmPartes.setText("Parte del Cuerpo");

        jmiParteCuerp.setText("Registro Parte del Cuerpo");
        jmiParteCuerp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiParteCuerpActionPerformed(evt);
            }
        });
        jmPartes.add(jmiParteCuerp);

        menuBar.add(jmPartes);

        jmZonas.setText("Zona del Cuerpo");

        jmiZona.setText("Registro Zona del Cuerpo");
        jmiZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiZonaActionPerformed(evt);
            }
        });
        jmZonas.add(jmiZona);

        menuBar.add(jmZonas);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEmpleadosActionPerformed
        FormularioEmpleados formEmpleados = new FormularioEmpleados();
        desktopPane.add(formEmpleados);
        formEmpleados.setVisible(true);
    }//GEN-LAST:event_jmiEmpleadosActionPerformed

    private void jmiAccidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAccidenteActionPerformed
        FormularioAccidentes formAccidentes = new FormularioAccidentes();
        desktopPane.add(formAccidentes);
        formAccidentes.setVisible(true);
    }//GEN-LAST:event_jmiAccidenteActionPerformed

    private void jmiMotivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMotivosActionPerformed
        FormularioMotivos formMotivos = new FormularioMotivos();
        desktopPane.add(formMotivos);
        formMotivos.setVisible(true);
    }//GEN-LAST:event_jmiMotivosActionPerformed

    private void jmiTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTiposActionPerformed
        FormularioTiposAccidentes formtTiposAccidentes = new FormularioTiposAccidentes();
        desktopPane.add(formtTiposAccidentes);
        formtTiposAccidentes.setVisible(true);
    }//GEN-LAST:event_jmiTiposActionPerformed

    private void jmiParteCuerpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiParteCuerpActionPerformed
        FormularioParteCuerpo formParteCuerpo = new FormularioParteCuerpo();
        desktopPane.add(formParteCuerpo);
        formParteCuerpo.setVisible(true);
    }//GEN-LAST:event_jmiParteCuerpActionPerformed

    private void jmiZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiZonaActionPerformed
        FormularioZonaCuerpo formZonaCuerpo = new FormularioZonaCuerpo();
        desktopPane.add(formZonaCuerpo);
        formZonaCuerpo.setVisible(true);
    }//GEN-LAST:event_jmiZonaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jmAccidentes;
    private javax.swing.JMenu jmEmpleados;
    private javax.swing.JMenu jmMotivos;
    private javax.swing.JMenu jmPartes;
    private javax.swing.JMenu jmTipos;
    private javax.swing.JMenu jmZonas;
    private javax.swing.JMenuItem jmiAccidente;
    private javax.swing.JMenuItem jmiEmpleados;
    private javax.swing.JMenuItem jmiMotivos;
    private javax.swing.JMenuItem jmiParteCuerp;
    private javax.swing.JMenuItem jmiTipos;
    private javax.swing.JMenuItem jmiZona;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
