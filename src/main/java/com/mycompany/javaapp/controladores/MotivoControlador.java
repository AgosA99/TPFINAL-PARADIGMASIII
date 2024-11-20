/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaapp.controladores;

import com.mycompany.javaapp.objects.Motivo;
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
public class MotivoControlador implements IABMController<Integer, Motivo>{
     private Connection conn;

    public void setConexion(Connection conn) {
         this.conn = conn;
    }

    public List<Motivo> extraerTodo() {
        List<Motivo> listaEmpleados = new ArrayList<>();
        String sql = "SELECT * FROM motivos";

        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Motivo motivo = new Motivo(
                    rs.getInt("id_motivo"),
                    rs.getString("motivo")
                );
                listaEmpleados.add(motivo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaEmpleados;
    }

    
    public Motivo extrer(Integer id) {
        Motivo motivo = null;
        String sql = "SELECT * FROM motivos WHERE id_motivo = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                motivo = new Motivo(
                    rs.getInt("id_motivo"),
                    rs.getString("motivo")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return motivo;
    }

    
    public boolean crear(Motivo entidad) {
        String sql = "INSERT INTO motivos (motivo) VALUES (?)";

    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, entidad.getMotivo());

        int filasAfectadas = ps.executeUpdate();
        return filasAfectadas > 0;  // Devuelve true si se insertó exitosamente
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }

    }


    public boolean modificar(Motivo entidad) {
        String sql = "UPDATE motivos SET motivo = ? WHERE id_motivo = ?";

    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, entidad.getMotivo());
        ps.setInt(2, entidad.getId_motivo());

        int filasAfectadas = ps.executeUpdate();
        return filasAfectadas > 0;  // Devuelve true si se actualizó exitosamente
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
    }

    public boolean eliminar(Motivo entidad) {
        String sql = "DELETE FROM motivos WHERE id_motivo = ?";

    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, entidad.getId_motivo());

        int filasAfectadas = ps.executeUpdate();
        return filasAfectadas > 0;  // Devuelve true si se eliminó exitosamente
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
    }
}
