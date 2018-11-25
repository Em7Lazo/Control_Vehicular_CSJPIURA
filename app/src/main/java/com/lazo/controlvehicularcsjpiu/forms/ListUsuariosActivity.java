package com.lazo.controlvehicularcsjpiu.forms;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.lazo.controlvehicularcsjpiu.R;
import com.lazo.controlvehicularcsjpiu.bd.ConexionSQLiteHelper;
import com.lazo.controlvehicularcsjpiu.entidades.Usuario;
import com.lazo.controlvehicularcsjpiu.utils.utils;

import java.util.ArrayList;


public class ListUsuariosActivity extends AppCompatActivity {

    ListView listViewPersonas;
    ArrayList<String> listaInformacion;
    ArrayList<Usuario> listaUsuarios;
    ConexionSQLiteHelper conn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_usuarios);

        conn = new ConexionSQLiteHelper(getApplicationContext(), "bd_proyecto", null, 1);
        listViewPersonas = (ListView) findViewById(R.id.listViewPersonas);

        consultarListaPersonas();

        ArrayAdapter adapatador=new ArrayAdapter(this, android.R.layout.simple_list_item_1,listaInformacion);
        listViewPersonas.setAdapter(adapatador);
    }

    private void consultarListaPersonas() {

        SQLiteDatabase db = conn.getWritableDatabase();

        Usuario usuario = null;
        listaUsuarios = new ArrayList<>();

        //SELECT * FROM Usuarios
        Cursor cursor = db.rawQuery("SELECT * FROM " + utils.TABLA_USUARIO, null);

        while (cursor.moveToNext()) {
            usuario=new Usuario();
            usuario.setId(cursor.getInt(0));
            usuario.setDni(cursor.getString(1));
            usuario.setApe_paterno(cursor.getString(2));
            usuario.setApe_materno(cursor.getString(3));
            listaUsuarios.add(usuario);
        }
        obtenerLista();
    }

    private void obtenerLista() {
        listaInformacion = new ArrayList<String>();

        for (int i = 0; i < listaUsuarios.size(); i++) {

            listaInformacion.add(listaUsuarios.get(i).getId() + " - " + listaUsuarios.get(i).getApe_paterno() +" "+ listaUsuarios.get(i).getApe_materno());
        }
    }

}

