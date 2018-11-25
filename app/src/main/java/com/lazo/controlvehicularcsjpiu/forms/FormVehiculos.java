package com.lazo.controlvehicularcsjpiu.forms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.lazo.controlvehicularcsjpiu.R;
import com.lazo.controlvehicularcsjpiu.entidades.Vehiculo;

import java.util.UUID;

public class FormVehiculos extends AppCompatActivity {

    EditText placa, marca, modelo, color, anio, combustible, km;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_vehiculos);

        placa = findViewById(R.id.txtPlaca);
        marca = findViewById(R.id.txtMarca);
        modelo = findViewById(R.id.txtModelo);
        color = findViewById(R.id.txtColor);
        anio = findViewById(R.id.txtAnio);
        combustible = findViewById(R.id.txtCombustible);
        km = findViewById(R.id.txtKilometraje);
        inicializarFirebase();
    }

    private void inicializarFirebase() {

        //LE PASAMOS EL contexto
        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.form_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //return super.onOptionsItemSelected(item);
        String placaV = placa.getText().toString();
        String marcaV = marca.getText().toString();
        String modeloV = modelo.getText().toString();
        String colorV = color.getText().toString();
        String anioV = anio.getText().toString();
        String combustibleV = combustible.getText().toString();
        String kmV = km.getText().toString();

        switch (item.getItemId()){
            case R.id.icon_save:{
                if (placaV.equals("") || marcaV.equals("")){
                    validation();
                }else {
                    Vehiculo v = new Vehiculo();
                    v.setId_Vehiculo(UUID.randomUUID().toString());
                    v.setPlaca(placaV);
                    v.setMarca(marcaV);
                    v.setModelo(modeloV);
                    v.setColor(colorV);
                    v.setAnio(anioV);
                    v.setCombustible(combustibleV);
                    v.setKilometraje(kmV);
                    databaseReference.child("Vehiculo").child(v.getId_Vehiculo()).setValue(v);
                    Toast.makeText(this, "SE AGREGÓ CON EXITO", Toast.LENGTH_LONG).show();
                    limpiarCajas();

                }
                break;
            }

            case R.id.icon_list:{
                Intent intent = new Intent(this, ListVehiculosActivity.class);
                startActivity(intent);
            }
            break;
        }
        return true;
    }

    private void limpiarCajas() {
        placa.setText("");
        marca.setText("");
        modelo.setText("");
        color.setText("");
        anio.setText("");
        combustible.setText("");
        km.setText("");
    }


    private void validation() {
        String placaV = placa.getText().toString();
        String nombreV = marca.getText().toString();
        if (placaV.equals("")){
            placa.setError("Required");
        }else if (nombreV.equals("")){
            marca.setError("Required");
        }

    }


}
