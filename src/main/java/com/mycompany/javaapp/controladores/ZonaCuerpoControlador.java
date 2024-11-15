/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaapp.controladores;

import com.mycompany.javaapp.objects.TipoAccidente;
import com.mycompany.javaapp.objects.ZonaCuerpo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Agos
 */
public class ZonaCuerpoControlador implements IABMController<Integer, ZonaCuerpo> {
     private Connection conn;

    public void setConexion(Connection conexion) {
         this.conn = conn;
    }

    public List<ZonaCuerpo> extraerTodo() {
        List<ZonaCuerpo> listaZonaCuerpos = new ArrayList<>();
    String sql = "SELECT * FROM zonas_cuerpo";  

    try (Statement st = conn.createStatement();
         ResultSet rs = st.executeQuery(sql)) {

        while (rs.next()) {
            ZonaCuerpo zonaCuerpo = new ZonaCuerpo(
                rs.getInt("id_zona_cuerpo"),   
                rs.getInt("id_accidente"),     
                rs.getInt("id_parte_cuerpo"),  
                rs.getString("lado")           
            );
            listaZonaCuerpos.add(zonaCuerpo);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return listaZonaCuerpos;
    }

    public ZonaCuerpo extrer(Integer id) {
        ZonaCuerpo zonaCuerpo = null;
        String sql = "SELECT * FROM zonas_cuerpo WHERE id_zona_cuerpo = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                zonaCuerpo = new ZonaCuerpo(
                    rs.getInt("id_zona_cuerpo"),  
                    rs.getInt("id_accidente"),     
                    rs.getInt("id_parte_cuerpo"),  
                    rs.getString("lado")           
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return zonaCuerpo;
    }

    public boolean crear(ZonaCuerpo entidad) {
        String sql = "INSERT INTO zonas_cuerpo (id_accidente, id_parte_cuerpo, lado) VALUES (?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, entidad.getId_accidente());
            ps.setInt(2, entidad.getId_parte_cuerpo());
            ps.setString(3, entidad.getLado());

            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0; 
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false; 
    }


    public boolean modificar(ZonaCuerpo entidad) {
        String sql = "UPDATE zonas_cuerpo SET id_accidente = ?, id_parte_cuerpo = ?, lado = ? WHERE id_zona_cuerpo = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, entidad.getId_accidente());
            ps.setInt(2, entidad.getId_parte_cuerpo());
            ps.setString(3, entidad.getLado());
            ps.setInt(4, entidad.getId_zona_cuerpo());

            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0; 
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean eliminar(ZonaCuerpo entidad) {
        String sql = "DELETE FROM zonas_cuerpo WHERE id_zona_cuerpo = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, entidad.getId_zona_cuerpo());

            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0; // Si se afectaron filas, la eliminación fue exitosa
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
        }
}
