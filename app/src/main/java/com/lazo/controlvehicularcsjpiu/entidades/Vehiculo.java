package com.lazo.controlvehicularcsjpiu.entidades;

public class Vehiculo {

    private String id_Vehiculo;
    private String Placa;
    private String Marca;
    private String Modelo;
    private String Color;
    private String Anio;
    private String Combustible;
    private String Kilometraje;



    public Vehiculo() {
    }

    public String getId_Vehiculo() {
        return id_Vehiculo;
    }

    public void setId_Vehiculo(String id_Vehiculo) {
        this.id_Vehiculo = id_Vehiculo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String anio) {
        Anio = anio;
    }

    public String getCombustible() {
        return Combustible;
    }

    public void setCombustible(String combustible) {
        Combustible = combustible;
    }

    public String getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        Kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return Placa;
    }
}
