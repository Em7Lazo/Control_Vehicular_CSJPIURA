package com.lazo.controlvehicularcsjpiu.entidades;


/**
 * Create by LazoF 29/10/2018*/

public class Usuario {

    private Integer id;
    private String dni;
    private String ape_paterno;
    private String ape_materno;

    public Usuario() {
        /*this.id = id;
        this.dni = dni;
        this.ape_paterno = ape_paterno;
        this.ape_materno = ape_materno;*/
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApe_paterno() {
        return ape_paterno;
    }

    public void setApe_paterno(String ape_paterno) {
        this.ape_paterno = ape_paterno;
    }

    public String getApe_materno() {
        return ape_materno;
    }

    public void setApe_materno(String ape_materno) {
        this.ape_materno = ape_materno;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", ape_paterno='" + ape_paterno + '\'' +
                ", ape_materno='" + ape_materno + '\'' +
                '}';
    }
}
