/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaapp.objects;

/**
 *
 * @author Agos
 */
public class TipoAccidente {
    private Integer id_tipo_accidente;
    private String tipo;
    
    public TipoAccidente() {
    }

    public TipoAccidente(Integer id_tipo_accidente, String tipo) {
        this.id_tipo_accidente = id_tipo_accidente;
        this.tipo = tipo;
    }

    public Integer getId_tipo_accidente() {
        return id_tipo_accidente;
    }

    public void setId_tipo_accidente(Integer id_tipo_accidente) {
        this.id_tipo_accidente = id_tipo_accidente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   

    
    
}
