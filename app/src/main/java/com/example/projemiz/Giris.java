package com.example.projemiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Giris extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);
        new Handler().postDelayed(new Runnable() {
            public void run() {

                Intent i = new Intent(Giris.this, Login.class);
                startActivity(i);

                finish();

            }
        }, 2000);
    }
    }

