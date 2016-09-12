package com.angiecasillas.formulario;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private Button buttonEdit;
    TextView datoNombre, datoTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        datoNombre = (TextView) findViewById(R.id.tvNombre);
        datoTelefono = (TextView) findViewById(R.id.tvTelefono);


        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {//ver si contiene datos
            String datoNombres = (String) extras.get("nombre");//Obtengo el nombre
            String datoTelefonos = (String) extras.get("telefono");//Obtengo el telefono

            datoNombre.setText(datoNombres);
            datoTelefono.setText(datoTelefonos);



        }
    }
}