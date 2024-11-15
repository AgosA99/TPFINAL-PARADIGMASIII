/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaapp.controladores;

import com.mycompany.javaapp.objects.Motivo;
import com.mycompany.javaapp.objects.TipoAccidente;
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
public class TipoAccidenteControlador implements IABMController<Integer, TipoAccidente> {
     private Connection conn;

    public void setConexion(Connection conn) {
         this.conn = conn;
    }

    public List<TipoAccidente> extraerTodo() {
        List<TipoAccidente> listaTipoAccidentes = new ArrayList<>();
        String sql = "SELECT * FROM tipos_accidentes";

        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                TipoAccidente tipoAccidente = new TipoAccidente(
                    rs.getInt("id_tipo_accidente"),
                    rs.getString("tipo")
                );
                listaTipoAccidentes.add(tipoAccidente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaTipoAccidentes;
    }
    

    public TipoAccidente extrer(Integer id) {
        TipoAccidente tipoAccidente = null;
        String sql = "SELECT * FROM tipos_accidentes WHERE id_motivo = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                tipoAccidente = new TipoAccidente(
                    rs.getInt("id_tipo_accidente"),
                    rs.getString("tipo")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tipoAccidente;
    }

    public boolean crear(TipoAccidente entidad) {
        String sql = "INSERT INTO tipos_accidentes (tipo) VALUES (?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, entidad.getTipo());

            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;  // Devuelve true si se insertó exitosamente
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    public boolean modificar(TipoAccidente entidad) {
        String sql = "UPDATE tipos_accidentes SET tipo = ? WHERE id_tipo_accidente = ?";

    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, entidad.getTipo());
        ps.setInt(2, entidad.getId_tipo_accidente());

        int filasAfectadas = ps.executeUpdate();
        return filasAfectadas > 0;  // Devuelve true si se actualizó exitosamente
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
    }

    public boolean eliminar(TipoAccidente entidad) {
        String sql = "DELETE FROM tipos_accidentes WHERE id_tipo_accidente = ?";

    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, entidad.getId_tipo_accidente());

        int filasAfectadas = ps.executeUpdate();
        return filasAfectadas > 0;  // Devuelve true si se eliminó exitosamente
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
    }
    
}
