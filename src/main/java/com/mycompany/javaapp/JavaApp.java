/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaapp;

import com.mycompany.javaapp.gui.Principal;
import com.mycompany.javaapp.objects.Empleado;
import com.mycompany.javaapp.objects.Motivo;
import com.mycompany.javaapp.objects.ParteCuerpo;
import com.mycompany.javaapp.objects.TipoAccidente;
import java.util.ArrayList;

/**
 *
 * @author Agos
 */
public class JavaApp {

    public static ArrayList<Empleado> empleados = new ArrayList<>();
    public static ArrayList<Motivo> motivos;
    public static ArrayList<ParteCuerpo> partesCuerpo;
    public static ArrayList<TipoAccidente> tiposAccidente;

    public static void main(String[] args) {
        Principal p= new Principal();
        p.setVisible(true);
    }
}
