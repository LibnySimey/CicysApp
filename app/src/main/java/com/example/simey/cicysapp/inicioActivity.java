package com.example.simey.cicysapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class inicioActivity extends AppCompatActivity implements View.OnClickListener{
    Button btuser;
    Button btvisit;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_screen);
        btuser = (Button) findViewById(R.id.btusuario);
        btvisit = (Button) findViewById(R.id.btinvitado);

        btuser.setOnClickListener(this);
        btvisit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext(),registrarseActivity.class);
        Intent intent1 = new Intent(v.getContext(),login1Activity.class);
        switch (v.getId()){
            case R.id.btusuario:
                startActivityForResult(intent,0);
                break;
            case R.id.btinvitado:
                startActivityForResult(intent1,0);
        }
    }
}
