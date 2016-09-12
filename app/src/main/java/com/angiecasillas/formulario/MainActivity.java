package com.angiecasillas.formulario;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private Button button;
    private EditText txtInputNom, txtInputTel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, getResources().getString(R.string.onCreate), Toast.LENGTH_SHORT).show();
        //Obteniendo una instancia del boton
        button = (Button)findViewById(R.id.button);
        txtInputNom =(EditText)findViewById(R.id.nombre);
        txtInputTel =(EditText)findViewById(R.id.telefono);

        button.setOnClickListener(this);



    }

    @Override
    public void onClick(View v){

        //Iniciando la actividad Visor
        Intent intent = new Intent(this,Activity2.class);

        String auxEdiNombre=txtInputNom.getText().toString();
        String auxEdiTelefono=txtInputTel.getText().toString();

        intent.putExtra("nombre",auxEdiNombre);//Guardamos una cadena
        intent.putExtra("telefono",auxEdiTelefono);

        startActivity(intent);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, getResources().getString(R.string.onStart), Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, getResources().getString(R.string.onResume), Toast.LENGTH_SHORT).show();
    }

    //Activity running
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, getResources().getString(R.string.onReStart), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, getResources().getString(R.string.onPausa), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, getResources().getString(R.string.onStop), Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, getResources().getString(R.string.onDestroy), Toast.LENGTH_SHORT).show();
    }
}
