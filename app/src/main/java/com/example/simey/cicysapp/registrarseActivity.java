package com.example.simey.cicysapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registrarseActivity extends AppCompatActivity implements View.OnClickListener{
    Button btcancelar;
    Button btaceptar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrarse_screen);
        btcancelar = (Button) findViewById(R.id.btrcancelar);
        btaceptar = (Button) findViewById(R.id.btraceptar);

        btcancelar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
