package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnhuruf,btnhitung,btnmembaca,btnmengenalhewan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getSupportActionBar().hide();
        Button btnhuruf = findViewById(R.id.btnhuruf);
        Button btnhitung = findViewById(R.id.btnhitung);
        Button btnmembaca = findViewById(R.id.btnmembaca);
        Button btnmengenalhewan = findViewById(R.id.btnmengenalhewan);
        Button btnQuiz = findViewById(R.id.btn_quiz);

        btnQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),quiz.class);
                startActivity(i);
            }
        });

        btnhuruf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),huruf.class);
                startActivity(i);
            }
        });
        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),menhitung.class);
                startActivity(i);
                            }
        });
        btnmembaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),membaca.class);
                startActivity(i);
            }
        });
        btnmengenalhewan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),mengenalhewan.class);
                startActivity(i);
            }
        });
    }
}
