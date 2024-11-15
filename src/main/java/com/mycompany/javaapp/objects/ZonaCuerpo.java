/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaapp.objects;

/**
 *
 * @author Agos
 */
public class ZonaCuerpo {
    private Integer id_zona_cuerpo;   // ID único de la zona del cuerpo afectada
    private Integer id_accidente;    // ID del accidente al que pertenece (composición)
    private Integer id_parte_cuerpo;  // ID de la parte específica del cuerpo afectada
    private String lado;        // Lado de la parte del cuerpo (izquierdo o derecho)

    public ZonaCuerpo() {
    }

    public ZonaCuerpo(Integer id_zona_cuerpo, Integer id_accidente, Integer id_parte_cuerpo, String lado) {
        this.id_zona_cuerpo = id_zona_cuerpo;
        this.id_accidente = id_accidente;
        this.id_parte_cuerpo = id_parte_cuerpo;
        this.lado = lado;
    }

    public Integer getId_zona_cuerpo() {
        return id_zona_cuerpo;
    }

    public void setId_zona_cuerpo(Integer id_zona_cuerpo) {
        this.id_zona_cuerpo = id_zona_cuerpo;
    }

    public Integer getId_accidente() {
        return id_accidente;
    }

    public void setId_accidente(Integer id_accidente) {
        this.id_accidente = id_accidente;
    }

    public Integer getId_parte_cuerpo() {
        return id_parte_cuerpo;
    }

    public void setId_parte_cuerpo(Integer id_parte_cuerpo) {
        this.id_parte_cuerpo = id_parte_cuerpo;
    }

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }

    
}

