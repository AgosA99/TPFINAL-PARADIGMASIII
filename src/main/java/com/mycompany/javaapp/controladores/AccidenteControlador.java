/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaapp.controladores;

import com.mycompany.javaapp.objects.Accidente;
import com.mycompany.javaapp.objects.Empleado;
import com.mycompany.javaapp.objects.ZonaCuerpo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Agos
 */
public class AccidenteControlador implements IABMController<Integer, Accidente>{
    private Connection conn;

    public void setConexion(Connection conexion) {
         this.conn = conn;
    }

    public List<Accidente> extraerTodo() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }
    /*List<Accidente> listaAccidentes = new ArrayList<>();
    String sql = "SELECT * FROM accidentes"; // Consulta para extraer todos los accidentes

    try (Statement st = conn.createStatement();
         ResultSet rs = st.executeQuery(sql)) {
        
        while (rs.next()) {
            // Crear un nuevo objeto Accidente con los datos extraídos
            Accidente accidente = new Accidente(
                rs.getInt("legajo"),
                rs.getInt("id_motivo"),
                rs.getInt("id_tipo_accidente"),
                rs.getDate("fecha"),
                rs.getString("ubicacion")
            );

            // Aquí asumimos que hay una relación con las zonas del cuerpo afectadas (si es que se manejan así)
            // Para esto, puedes hacer una consulta adicional para obtener las zonas afectadas.
            //List<ZonaCuerpo> zonasAfectadas = obtenerZonasAfectadas(accidente.getId_accidente());
            //accidente.setPartesCuerpoAfectadas(zonasAfectadas);

            // Agregar el accidente a la lista
            listaAccidentes.add(accidente);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return listaAccidentes;*/
    

    public Accidente extrer(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean crear(Accidente entidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public boolean modificar(Accidente entidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean eliminar(Accidente entidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
