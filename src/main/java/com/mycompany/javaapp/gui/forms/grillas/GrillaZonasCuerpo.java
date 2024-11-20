/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaapp.gui.forms.grillas;

import com.mycompany.javaapp.objects.ZonaCuerpo;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Agos
 */
public class GrillaZonasCuerpo extends AbstractTableModel{
    private ArrayList<ZonaCuerpo> datos=new ArrayList<>(); //establezco los datos
    private String[] columnas = {"ID","ID Accidente","ID Parte Cuerpo","Lado"}; //nombres de la columnas

    public GrillaZonasCuerpo() {
    }

    public GrillaZonasCuerpo(ArrayList<ZonaCuerpo> datos) {
        this.datos = datos;
    }

    public void setDatos(ArrayList<ZonaCuerpo> datos) {
        this.datos = datos;
    }
    
    
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ZonaCuerpo zc = datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return zc.getId_zona_cuerpo();
            case 1:
                return zc.getId_accidente();
            case 2:
                return zc.getId_parte_cuerpo();
            case 3:
                return zc.getLado(); 
            default:
                return "";
        }
    }
    
    @Override //Devuelvo el nombre de la columna
    public String getColumnName(int column) {
        return columnas[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
