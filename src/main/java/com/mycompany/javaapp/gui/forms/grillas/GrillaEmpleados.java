/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaapp.gui.forms.grillas;

import com.mycompany.javaapp.objects.Empleado;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Agos
 */
public class GrillaEmpleados extends AbstractTableModel{
    //EmpleadoControlador empleadoControlador = new EmpleadoControlador();
    //empleadoControlador.setConexion(conn);
    //ArrayList<Empleado> listaEmpleados = (ArrayList<Empleado>) empleadoControlador.extraerTodo();

    
    private ArrayList<Empleado> datos=new ArrayList<>(); //establezco los datos
    private String[] columnas = {"Legajo","Nombre","Apellido"}; //nombres de la columnas


    public GrillaEmpleados() {
    }

    public GrillaEmpleados(ArrayList<Empleado> empleados) {
        this.datos = datos;
    }
    
    public void setDatos(ArrayList<Empleado> datos) {
        this.datos = datos;
    }
    
    
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Empleado e = datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return e.getLegajo();
            case 1:
                return e.getNombre();
            case 2:
                return e.getApellido();
            default:
                return "";
        }
    }
    
    @Override //Devuelvo el nombre de la columna
    public String getColumnName(int column) {
        return columnas[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
