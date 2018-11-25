package com.lazo.controlvehicularcsjpiu;

import android.content.Intent;
import android.preference.Preference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.lazo.controlvehicularcsjpiu.utils.ControlPreferences;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtUsuario;
    private EditText txtPassword;
    private Button btnIngresar;
    private ControlPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        prefs = new ControlPreferences(this);
        txtUsuario = findViewById(R.id.txtUsuario);
        txtPassword = findViewById(R.id.txtPassword);
        btnIngresar = findViewById(R.id.btnIngresar);
        btnIngresar.setOnClickListener(this);
        /*quitar ActionBar*/
        getSupportActionBar().hide();
    }

    @Override
    protected void onResume() {
        super.onResume();
        String usuario = prefs.getString(ControlPreferences.PREF_USUARIO, null);
        if (usuario != null){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }

    @Override
    public void onClick(View view) {

        if(txtUsuario.getText().toString().equals("154981") && txtPassword.getText().toString().equals("123456")){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            prefs.putString(ControlPreferences.PREF_USUARIO, txtUsuario.getText().toString());
        }else{
            Toast.makeText(this, "Credenciales incorrectos", Toast.LENGTH_SHORT).show();


        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed(); moveTaskToBack(true);
    }
}
