package com.example.trabajo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class leones extends AppCompatActivity {
    Button button_leon, button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leones);
        button_leon = (Button) findViewById(R.id.button_leon);
        button_leon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(leones.this, leoninfo.class);
                startActivity(i);
            }
        });
            button11 =(Button) findViewById(R.id.button11);
            button11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent j=new Intent(leones.this, MainActivity2.class);
                    startActivity(j);
                }
            });
    }
}