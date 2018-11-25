package com.lazo.controlvehicularcsjpiu.forms;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.lazo.controlvehicularcsjpiu.R;
import com.lazo.controlvehicularcsjpiu.entidades.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class ListVehiculosActivity extends AppCompatActivity {
    private List<Vehiculo> listVehiculo = new ArrayList<Vehiculo>();
    ArrayAdapter<Vehiculo> arrayAdapterVehiculo;
    ListView listV_Vehiculos;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_vehiculos);

        listV_Vehiculos = findViewById(R.id.lstVehiculos);
        inicializarFirebase();
        listarVehiculos();

    }

    private void listarVehiculos() {
        databaseReference.child("Vehiculo").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                listVehiculo.clear();
                for (DataSnapshot objSnapshot : dataSnapshot.getChildren()){
                    Vehiculo v = objSnapshot.getValue(Vehiculo.class);
                    listVehiculo.add(v);

                    arrayAdapterVehiculo = new ArrayAdapter<Vehiculo>(ListVehiculosActivity.this, android.R.layout.simple_list_item_1, listVehiculo);
                    listV_Vehiculos.setAdapter(arrayAdapterVehiculo);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void inicializarFirebase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

    }
}
