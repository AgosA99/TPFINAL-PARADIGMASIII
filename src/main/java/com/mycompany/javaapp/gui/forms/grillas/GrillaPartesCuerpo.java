/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaapp.gui.forms.grillas;

import com.mycompany.javaapp.objects.ParteCuerpo;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Agos
 */
public class GrillaPartesCuerpo extends AbstractTableModel{
    private ArrayList<ParteCuerpo> datos=new ArrayList<>(); //establezco los datos
    private String[] columnas = {"ID","Parte Afectada"}; //nombres de la columnas
    
    public GrillaPartesCuerpo() {
    }

    public GrillaPartesCuerpo(ArrayList<ParteCuerpo> datos) {
        this.datos = datos;
    }

    public void setDatos(ArrayList<ParteCuerpo> datos) {
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
        ParteCuerpo p = datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return p.getId_parte_cuerpo();
            case 1:
                return p.getParte();
            default:
                return "";
        }
    }
    
    
        @Override //Devuelvo el nombre de la columna
    public String getColumnName(int column) {
        return columnas[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}


