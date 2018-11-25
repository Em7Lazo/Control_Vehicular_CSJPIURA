package com.lazo.controlvehicularcsjpiu.forms;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.lazo.controlvehicularcsjpiu.R;
import com.lazo.controlvehicularcsjpiu.bd.ConexionSQLiteHelper;
import com.lazo.controlvehicularcsjpiu.utils.utils;

public class FormRegParametros extends AppCompatActivity {

    EditText campoCategoria, campoDescripcion,  campoEstado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_reg_parametros);

        campoCategoria = (EditText)findViewById(R.id.txtCategoria);
        campoCategoria = (EditText)findViewById(R.id.txtDescripcion);
        campoEstado = (EditText)findViewById(R.id.txtEstado);


    }


    public void regParametro(View view) {
        registrarParametros();
    }

    private void registrarParametros() {
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "bd_proyecto", null, 1);
        //ABRIR BASE DE DATOS
        SQLiteDatabase db=conn.getWritableDatabase();

        //AGREGAR con el put.
        // Contentvalues que nos provee Android

        ContentValues values= new ContentValues();


        values.put(utils.CAMPO_CATEGORIA,campoCategoria.getText().toString());
        values.put(utils.CAMPO_DESCRIPCION,campoDescripcion.getText().toString());
        values.put(utils.ESTADO_PARAMETRO,campoEstado.getText().toString());

        //DATO Long
        Long idResultante=db.insert(utils.TABLA_PARAMETRO,utils.CAMPO_DESCRIPCION,values);
        //Toast.makeText(getApplicationContext(), "ID REGISTRO: "+idResultante,Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "SE REGISTRÓ CON EXITO: "+idResultante,Toast.LENGTH_SHORT).show();
    }
}
