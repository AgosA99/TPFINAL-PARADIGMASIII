/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaapp.gui.forms.grillas;

import com.mycompany.javaapp.objects.TipoAccidente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Agos
 */
public class GrillaTiposAccidentes extends AbstractTableModel{
    private ArrayList<TipoAccidente> datos=new ArrayList<>(); //establezco los datos
    private String[] columnas = {"ID","Tipo de Accidente"}; //nombres de la columnas

    public GrillaTiposAccidentes() {
    }

    public GrillaTiposAccidentes(ArrayList<TipoAccidente> datos) {
        this.datos = datos;
    }

    public void setDatos(ArrayList<TipoAccidente> datos) {
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
        TipoAccidente tipoAcc = datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tipoAcc.getId_tipo_accidente();
            case 1:
                return tipoAcc.getTipo();
            default:
                return "";
        }
       
    }
    
    @Override //Devuelvo el nombre de la columna
    public String getColumnName(int column) {
        return columnas[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
