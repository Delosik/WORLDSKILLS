package com.example.worldskills;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity implements Register {

    private Object MainActivity3;
    private EditText PasswordEnter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button ButtonRegister = (Button) findViewById(R.id.ButtonRegister);
        ButtonRegister.setOnClickListener(this::onClick);
        Button SignIn = (Button) findViewById(R.id.SignIn);
        SignIn.setOnClickListener(this::onClick);


    }





    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.ButtonRegister:
                intent = new Intent(this, MainActivity3.class);
                startActivity(intent);
                break;
            case R.id.SignIn:
                intent = new Intent();
                intent = new Intent(this, MapsActivity.class);
                startActivity(intent);
                break;

        }

    }}