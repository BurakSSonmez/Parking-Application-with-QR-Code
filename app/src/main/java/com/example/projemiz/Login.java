package com.example.projemiz;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Login extends AppCompatActivity {
        EditText txtEmail, txtPassword;
        Button btn_login, btn_kayıt;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login_form);
            getSupportActionBar().setTitle("LOGIN FORM");

            txtEmail = (EditText) findViewById(R.id.txt_email);
            txtPassword = (EditText) findViewById(R.id.txt_password);
            btn_login = (Button) findViewById(R.id.buttonLogin);
            btn_kayıt=(Button) findViewById(R.id.buttonKayıt);



            btn_login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String email = txtEmail.getText().toString().trim();
                    String password = txtPassword.getText().toString().trim();

                    if (TextUtils.isEmpty(email)) {
                        Toast.makeText(Login.this, "please enter email", Toast.LENGTH_LONG).show();
                        return;

                    }
                    if (TextUtils.isEmpty(password)) {
                        Toast.makeText(Login.this, "please enter password", Toast.LENGTH_LONG).show();
                        return;
                    }
                    if (password.length() < 6) {
                        Toast.makeText(Login.this, "Şifre çok kısa", Toast.LENGTH_SHORT).show();

                    }
                    btn_login.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intocan = new Intent(Login.this, SplashScreen.class);
                            startActivity(intocan);
                }
        });
                }
            });


            btn_kayıt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intocan = new Intent(Login.this, Signup_Form.class);
                    startActivity(intocan);

                }
            });}
}






