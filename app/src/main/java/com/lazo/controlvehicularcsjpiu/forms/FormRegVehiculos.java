

package com.lazo.controlvehicularcsjpiu.forms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.lazo.controlvehicularcsjpiu.R;
import com.lazo.controlvehicularcsjpiu.bd.ConexionSQLiteHelper;

public class FormRegVehiculos extends AppCompatActivity {

    EditText txtPlaca, txtModelo, txtColor, txtAnio, txtCombustible, txtKilometraje;
    Spinner campoMarca;
    Button btnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_reg_vehiculos);

        txtPlaca = (EditText)findViewById(R.id.txtPlaca);

        //txtModelo = (EditText)findViewById(R.id.txtModelo);
        txtColor = (EditText)findViewById(R.id.txtColor);
        txtAnio = (EditText)findViewById(R.id.txtAnio);
        txtCombustible = (EditText)findViewById(R.id.txtCombustible);
        txtKilometraje = (EditText)findViewById(R.id.txtKilometraje);
        btnAgregar = (Button)findViewById(R.id.btnRegistrar);

    }


/*
    @Override
    public void onBackPressed() {
        super.onBackPressed(); moveTaskToBack(true);
    }*/
}

