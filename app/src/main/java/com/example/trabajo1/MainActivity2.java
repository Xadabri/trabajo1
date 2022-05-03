package com.example.trabajo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et1 = (EditText) findViewById(R.id.txt_web);
    }
    //motodo boton ir
    public void Navegar (View view){
        //se establecen cambiomde las pantallas oactivities
        Intent i= new Intent().setClass(MainActivity2.this,ActivityWeb.class);
        //enviarparametros intent; metodo put extra
        i.putExtra("SitioWeb",et1.getText().toString());

        startActivity(i);
    }
}
