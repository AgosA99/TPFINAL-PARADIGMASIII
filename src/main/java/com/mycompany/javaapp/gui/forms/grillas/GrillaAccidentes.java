/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaapp.gui.forms.grillas;

import com.mycompany.javaapp.objects.Accidente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Agos
 */
public class GrillaAccidentes extends AbstractTableModel{
    private ArrayList<Accidente> datos=new ArrayList<>(); //establezco los datos
    private String[] columnas = {"ID","Legajo Empleado","Motivo","Tipo","Fecha","Ubicacion","Zonas Afectadas"}; //nombres de la columnas

     public GrillaAccidentes() {
    }

    public GrillaAccidentes(ArrayList<Accidente> datos) {
        this.datos = datos;
    }

    public void setDatos(ArrayList<Accidente> datos) {
        this.datos = datos;
    }
    
    
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Accidente a= datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return a.getId_accidente();
            case 1:
                return a.getLegajo();
            case 2:
                return a.getId_motivo();
            case 3:
                return a.getId_tipo_accidente();
            case 4:
                return a.getFecha();
            case 5:
                return a.getUbicacion();
            case 6:
                return a.getPartesCuerpoAfectadas();
            default:
                return "";
        }
    }
    
        @Override //Devuelvo el nombre de la columna
    public String getColumnName(int column) {
        return columnas[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
