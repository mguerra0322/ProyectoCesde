package com.example.intentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainPage extends AppCompatActivity {

    TextView correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        correo = findViewById(R.id.txtCorreo);

        Intent intent = getIntent();

        String mostrar = intent.getStringExtra("keyword");
        correo.setText(mostrar);


    }
}