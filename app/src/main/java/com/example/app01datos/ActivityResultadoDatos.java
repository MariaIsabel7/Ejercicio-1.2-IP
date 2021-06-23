package com.example.app01datos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityResultadoDatos extends AppCompatActivity {

    EditText r_nom, r_app, r_edad, r_correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_datos);

        Intent intent = getIntent();
        Bundle resp = getIntent().getExtras();
        String nombre = (String) resp.get("Nombre");
        String apellido = (String) resp.get("Apellido");
        String edad = (String) resp.get("Edad");
        String correo = (String) resp.get("Correo");

        r_nom = (EditText) findViewById(R.id.d_nom);
        r_app = (EditText) findViewById(R.id.d_app);
        r_edad = (EditText) findViewById(R.id.d_edad);
        r_correo = (EditText) findViewById(R.id.d_correo);

        r_nom.setEnabled(false);
        r_app.setEnabled(false);
        r_edad.setEnabled(false);
        r_correo.setEnabled(false);

        r_nom.setText(""+nombre);
        r_app.setText(""+apellido);
        r_edad.setText(""+edad);
        r_correo.setText(""+correo);
    }
}