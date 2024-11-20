/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaapp.controladores;

import com.mycompany.javaapp.objects.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class EmpleadoControlador implements IABMController<Integer, Empleado>{

    private Connection conn;
    
    
    
    @Override
    public void setConexion(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Empleado> extraerTodo() {
    List<Empleado> listaEmpleados = new ArrayList<>();
    String sql = "SELECT * FROM empleados";

    try (Statement st = conn.createStatement();
         ResultSet rs = st.executeQuery(sql)) {
        
        while (rs.next()) {
            Empleado empleado = new Empleado(
                rs.getInt("legajo"),
                rs.getString("nombre"),
                rs.getString("apellido")
            );
            listaEmpleados.add(empleado);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return listaEmpleados;
    }

    
    @Override
    public Empleado extrer(Integer id) {
    Empleado empleado = null;
    String sql = "SELECT * FROM empleados WHERE legajo = ?;";

    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            empleado = new Empleado(
                rs.getInt("legajo"),
                rs.getString("nombre"),
                rs.getString("apellido")
            );
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return empleado;
    }

    @Override
    public boolean crear(Empleado entidad) {
        String sql = "INSERT INTO empleados (legajo, nombre, apellido) VALUES (?, ?, ?)";

    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, entidad.getLegajo()); 
        ps.setString(2, entidad.getNombre());
        ps.setString(3, entidad.getApellido());

        int filasAfectadas = ps.executeUpdate();
        return filasAfectadas > 0;  // Devuelve true si se insertó exitosamente
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
    }

    @Override
    public boolean modificar(Empleado entidad) {
        String sql = "UPDATE empleados SET nombre = ?, apellido = ? WHERE legajo = ?";

    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, entidad.getNombre());
        ps.setString(2, entidad.getApellido());
        ps.setInt(3, entidad.getLegajo());

        int filasAfectadas = ps.executeUpdate();
        return filasAfectadas > 0;  // Devuelve true si se actualizó exitosamente
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
    }

    @Override
    public boolean eliminar(Empleado entidad) {
        String sql = "DELETE FROM empleados WHERE legajo = ?";

    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, entidad.getLegajo());

        int filasAfectadas = ps.executeUpdate();
        return filasAfectadas > 0;  // Devuelve true si se eliminó exitosamente
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
    }
     
    
}
