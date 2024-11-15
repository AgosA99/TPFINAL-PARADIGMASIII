/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaapp.controladores;

import com.mycompany.javaapp.objects.ParteCuerpo;
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
public class ParteCuerpoControlador implements IABMController<Integer, ParteCuerpo>{
     private Connection conn;

    public void setConexion(Connection conn) {
        this.conn = conn;
    }

    public List<ParteCuerpo> extraerTodo() {
        List<ParteCuerpo> listaParteCuerpos = new ArrayList<>();
        String sql = "SELECT * FROM partes_cuerpo";

        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                ParteCuerpo parteCuerpo = new ParteCuerpo(
                    rs.getInt("id_parte_cuerpo"),
                    rs.getString("parte")
                );
                listaParteCuerpos.add(parteCuerpo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaParteCuerpos;
    }

    public ParteCuerpo extrer(Integer id) {
        ParteCuerpo parteCuerpo = null;
        String sql = "SELECT * FROM partes_cuerpo WHERE id_motivo = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                parteCuerpo = new ParteCuerpo(
                    rs.getInt("id_parte_cuerpo"),
                    rs.getString("parte")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return parteCuerpo;
    }

    public boolean crear(ParteCuerpo entidad) {
        String sql = "INSERT INTO partes_cuerpo (parte) VALUES (?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, entidad.getParte());
        int filasAfectadas = ps.executeUpdate();
        return filasAfectadas > 0; // Si se insertó al menos una fila, la operación fue exitosa
        } catch (SQLException e) {
        e.printStackTrace();
        return false; // Si ocurre un error, devuelve false
        }
    }


    public boolean modificar(ParteCuerpo entidad) {
         String sql = "UPDATE motivos SET motivo = ? WHERE id_motivo = ?";

    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, entidad.getParte());
        ps.setInt(2, entidad.getId_parte_cuerpo());

        int filasAfectadas = ps.executeUpdate();
        return filasAfectadas > 0;  // Devuelve true si se actualizó exitosamente
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
    }

    public boolean eliminar(ParteCuerpo entidad) {
        String sql = "DELETE FROM motivos WHERE id_motivo = ?";

    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, entidad.getId_parte_cuerpo());

        int filasAfectadas = ps.executeUpdate();
        return filasAfectadas > 0;  // Devuelve true si se eliminó exitosamente
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
    }
    
    
}
