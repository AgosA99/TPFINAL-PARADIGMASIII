/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaapp.objects;

/**
 *
 * @author Agos
 */
public class ParteCuerpo {
    private Integer id_parte_cuerpo;
    private String parte;

    public ParteCuerpo() {
    }

    public ParteCuerpo(Integer id_parte_cuerpo, String parte) {
        this.id_parte_cuerpo = id_parte_cuerpo;
        this.parte = parte;
    }

    public Integer getId_parte_cuerpo() {
        return id_parte_cuerpo;
    }

    public void setId_parte_cuerpo(Integer id_parte_cuerpo) {
        this.id_parte_cuerpo = id_parte_cuerpo;
    }

    public String getParte() {
        return parte;
    }

    public void setParte(String parte) {
        this.parte = parte;
    }

    
    
    
}
