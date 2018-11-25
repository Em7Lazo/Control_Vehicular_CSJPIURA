package com.lazo.controlvehicularcsjpiu.entidades;

/**
 * Create by LazoF 04/11/2018*/

public class Parametro {
    private int id;
    private String categoria;
    private String descripcion;
    private String estado_p;

    public Parametro(int id, String categoria, String descripcion, String estado_p) {
        this.id = id;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.estado_p = estado_p;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado_p() {
        return estado_p;
    }

    public void setEstado_p(String estado_p) {
        this.estado_p = estado_p;
    }
}
