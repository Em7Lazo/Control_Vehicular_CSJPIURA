package com.lazo.controlvehicularcsjpiu;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/*import com.lazo.controlvehicularcsjpiu.bd.ConexionSQLiteHelper;*/
import com.lazo.controlvehicularcsjpiu.bd.ConexionSQLiteHelper;
import com.lazo.controlvehicularcsjpiu.forms.FormRegParametros;
import com.lazo.controlvehicularcsjpiu.forms.FormRegUsuarios;
import com.lazo.controlvehicularcsjpiu.forms.FormRegVehiculos;
import com.lazo.controlvehicularcsjpiu.forms.FormVehiculos;
import com.lazo.controlvehicularcsjpiu.forms.ListUsuariosActivity;
import com.lazo.controlvehicularcsjpiu.utils.ControlPreferences;



public class MainActivity extends AppCompatActivity {
    private ControlPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "bd_proyecto", null, 1);

        prefs = new ControlPreferences(this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        String usuario = prefs.getString(ControlPreferences.PREF_USUARIO, null);
        if ( usuario == null){
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
    }


    /*VISUALIZAR MENÚ*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.opt_ver_perfil:
                return true;
            case R.id.opt_cerrar_sesion:
                cerrarSesion();
                return true;
            case R.id.opt_reg_vehiculos:
                regVehiculos();
                return true;
            case  R.id.opt_reg_usuarios:
                regUsuarios();
                return true;
            case  R.id.opt_reg_parametros:
                regParametros();
                return true;
        }
        return false;
    }

    private void regParametros() {
        Intent intent = new Intent(this, FormRegParametros.class);
        startActivity(intent);
    }

    private void cerrarSesion(){
        this.prefs.putString(ControlPreferences.PREF_USUARIO, null);
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed(); moveTaskToBack(true);
    }

    private void regVehiculos(){

        Intent intent = new Intent(this, FormVehiculos.class);
        startActivity(intent);
    }

    private void regUsuarios(){
        /*this.prefs.putString(ControlPreferences.PREF_USUARIO, null);*/

        Intent intent = new Intent(this, FormRegUsuarios.class);
        startActivity(intent);
    }
}
