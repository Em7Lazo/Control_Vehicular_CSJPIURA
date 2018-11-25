package com.lazo.controlvehicularcsjpiu.utils;



public class utils {
    //CONSTANTES CAMPOS TABLA_USUARIO
    public static final String TABLA_USUARIO="usuario";
    public static final String CAMPO_ID="id";
    public static final String CAMPO_DNI="dni";
    public static final String CAMPO_AP_PATERNO="ap_paterno";
    public static final String CAMPO_AP_MATERNO="ap_materno";
    public static final String CREAR_TABLA_USUARIO="CREATE TABLE " +
            ""+TABLA_USUARIO+" ("+CAMPO_ID+" " +
            "INTEGER PRIMARY KEY AUTOINCREMENT, "+CAMPO_DNI+" TEXT, "+CAMPO_AP_PATERNO+" TEXT, "+CAMPO_AP_MATERNO+" TEXT)";

    public static final String TABLA_PARAMETRO = "parametro";
    public static final String CAMPO_ID_PARAMETRO = "id_parametro";
    public static final String CAMPO_DESCRIPCION = "descripcion";
    public static final String CAMPO_CATEGORIA = "categoria";
    public static final String ESTADO_PARAMETRO = "estado_parametro";

    public static final String CREAR_TABLA_PARAMETRO = "CREATE TABLE "+
            "" +TABLA_PARAMETRO+" ("+CAMPO_ID_PARAMETRO+" INTEGER PRIMARY KEY AUTOINCREMENT, "+CAMPO_DESCRIPCION+" TEXT, "+CAMPO_CATEGORIA+" TEXT, "+ESTADO_PARAMETRO+" TEXT) ";

    }
