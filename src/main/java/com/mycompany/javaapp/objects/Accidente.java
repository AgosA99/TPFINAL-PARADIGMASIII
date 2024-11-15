/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaapp.objects;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Agos
 */
public class Accidente {
    private int id_accidente;             // ID único del accidente
    private int legajo;          // Legajo del empleado involucrado en el accidente
    private int id_motivo;                // ID del motivo del accidente
    private int id_tipo_accidente;         // ID del tipo de accidente
    private Date fecha;                  // Fecha en que ocurrió el accidente
    private String ubicacion;            // Ubicación del accidente (por ejemplo, "interno" o "externo")
    private List<ZonaCuerpo> partesCuerpoAfectadas;  // Lista de zonas del cuerpo afectadas en el accidente

    public Accidente() {
    }

    public Accidente(int id_accidente, int legajo, int id_motivo, int id_tipo_accidente, Date fecha, String ubicacion, List<ZonaCuerpo> partesCuerpoAfectadas) {
        this.legajo = legajo;
        this.id_motivo = id_motivo;
        this.id_tipo_accidente = id_tipo_accidente;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.partesCuerpoAfectadas = partesCuerpoAfectadas;
    }

   

    public int getId_accidente() {
        return id_accidente;
    }

    public void setId_accidente(int id_accidente) {
        this.id_accidente = id_accidente;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getId_motivo() {
        return id_motivo;
    }

    public void setId_motivo(int id_motivo) {
        this.id_motivo = id_motivo;
    }

    public int getId_tipo_accidente() {
        return id_tipo_accidente;
    }

    public void setId_tipo_accidente(int id_tipo_accidente) {
        this.id_tipo_accidente = id_tipo_accidente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<ZonaCuerpo> getPartesCuerpoAfectadas() {
        return partesCuerpoAfectadas;
    }

    public void setPartesCuerpoAfectadas(List<ZonaCuerpo> partesCuerpoAfectadas) {
        this.partesCuerpoAfectadas = partesCuerpoAfectadas;
    }

    
    
    /*
    // Métodos para gestionar la relación de composición con ZonaCuerpo
    public void agregarZonaCuerpo(ZonaCuerpo zona) {
        // Verifica si la parte ya está afectada en el mismo lado
        for (ZonaCuerpo zc : partesCuerpoAfectadas) {
            if (zc.getId_parte_cuerpo()== zona.getId_parte_cuerpo()&& zc.getLado().equalsIgnoreCase(zona.getLado())) {
                throw new IllegalArgumentException("La parte del cuerpo ya está registrada en el mismo lado para este accidente.");
            }
        }
        partesCuerpoAfectadas.add(zona);
    }

    public void eliminarZonaCuerpo(ZonaCuerpo zona) {
        partesCuerpoAfectadas.remove(zona);
    }
    */
}


