package com.lazo.controlvehicularcsjpiu.forms;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.lazo.controlvehicularcsjpiu.R;
import com.lazo.controlvehicularcsjpiu.bd.ConexionSQLiteHelper;
import com.lazo.controlvehicularcsjpiu.utils.ControlPreferences;
import com.lazo.controlvehicularcsjpiu.utils.utils;

public class FormRegUsuarios extends AppCompatActivity {

    EditText campoId, campoDNI, campoApePaterno, campoApeMaterno;

   /* Button btnRegistrar, btnVisualizar;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_reg_usuarios);

        campoId = (EditText) findViewById(R.id.txtId);
        campoDNI= (EditText) findViewById(R.id.txtDNI);
        campoApePaterno = (EditText) findViewById(R.id.txtApePaterno);
        campoApeMaterno = (EditText) findViewById(R.id.txtApeMaterno);
/*
        btnRegistrar = (Button)findViewById(R.id.btnRegistarUsuario);
        btnVisualizar = (Button)findViewById(R.id.btnVisualizarUsuarios);*/


    }

    public void onClick(View view) {
        registrarUsuarios();

    }


    private void registrarUsuarios() {

        if (campoId.getText().toString().isEmpty()) {
            Toast.makeText(this, "Ingresar ID", Toast.LENGTH_SHORT).show();
        }else{
            if (campoDNI.getText().toString().isEmpty()){
                Toast.makeText(this,"Ingresar campo DNI", Toast.LENGTH_SHORT).show();
            }else {
                if (campoApePaterno.getText().toString().isEmpty()){
                    Toast.makeText(this, "Ingresar Apellido Materno", Toast.LENGTH_SHORT).show();
                }else {
                    if (campoApeMaterno.getText().toString().isEmpty()){
                        Toast.makeText(this, "Ingresar Apellido Materno", Toast.LENGTH_SHORT).show();
                    }else {
                        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "bd_proyecto", null, 1);
                        //ABRIR BASE DE DATOS
                        SQLiteDatabase db=conn.getWritableDatabase();

                        //AGREGAR con el put.
                        // Contentvalues que nos provee Android

                        ContentValues values= new ContentValues();

                        values.put(utils.CAMPO_ID,campoId.getText().toString());
                        values.put(utils.CAMPO_DNI,campoDNI.getText().toString());
                        values.put(utils.CAMPO_AP_PATERNO,campoApePaterno.getText().toString());
                        values.put(utils.CAMPO_AP_MATERNO,campoApeMaterno.getText().toString());

                        //DATO Long
                        Long idResultante=db.insert(utils.TABLA_USUARIO,utils.CAMPO_AP_PATERNO,values);
                        //Toast.makeText(getApplicationContext(), "ID REGISTRO: "+idResultante,Toast.LENGTH_SHORT).show();
                        Toast.makeText(getApplicationContext(), "SE REGISTRÓ CON EXITO: "+idResultante,Toast.LENGTH_SHORT).show();
                    }
                }
            }

        }


    }


    public void buttonlistar(View view) {
        Intent intent = new Intent(this, ListUsuariosActivity.class);
        startActivity(intent);
    }
}
