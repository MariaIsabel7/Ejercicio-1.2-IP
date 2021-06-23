package com.example.app01datos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre, apellido, edad, correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = (Button) findViewById(R.id.button);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nombre = (EditText)findViewById(R.id.txt_nom);
                apellido = (EditText)findViewById(R.id.txt_app);
                edad = (EditText)findViewById(R.id.txt_edad);
                correo = (EditText)findViewById(R.id.txt_correo);




                Intent intent = new Intent(getApplicationContext(), ActivityResultadoDatos.class);
                intent.putExtra("Nombre", nombre.getText().toString());
                intent.putExtra("Apellido", apellido.getText().toString());
                intent.putExtra("Edad", edad.getText().toString());
                intent.putExtra("Correo", correo.getText().toString());
                startActivity(intent);
                clean();


            }
        });
    }

    private void clean() {

            nombre.setText("");
            apellido.setText("");
            edad.setText("");
            correo.setText("");

    }
}