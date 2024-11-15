/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaapp.gui.forms.grillas;

import com.mycompany.javaapp.objects.Empleado;
import com.mycompany.javaapp.objects.Motivo;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Agos
 */
public class GrillaMotivos extends AbstractTableModel {
    private ArrayList<Motivo> datos=new ArrayList<>(); //establezco los datos
    private String[] columnas = {"Legajo","Nombre","Apellido"}; //nombres de la columnas

    public GrillaMotivos() {
    }

    public GrillaMotivos(ArrayList<Motivo> datos) {
        this.datos = datos;
    }

    public void setDatos(ArrayList<Motivo> datos) {
        this.datos = datos;
    }
    
    
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         Motivo m = datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return m.getId_motivo();
            case 1:
                return m.getMotivo();
            default:
                return "";
        }
    }
    
     @Override //Devuelvo el nombre de la columna
    public String getColumnName(int column) {
        return columnas[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
