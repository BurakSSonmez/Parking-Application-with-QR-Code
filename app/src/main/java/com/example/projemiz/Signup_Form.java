package com.example.projemiz;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class Signup_Form extends AppCompatActivity {
    EditText txtEmail, txtPassword, txtConfirmPassword;
    Button btn_register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup__form);
        getSupportActionBar().setTitle("Signup Form");


        txtEmail=(EditText) findViewById(R.id.txt_email);
        txtPassword=(EditText) findViewById(R.id.txt_password);
        txtConfirmPassword=(EditText) findViewById(R.id.txt_confirm_password);
        btn_register=(Button) findViewById(R.id.buttonRegister);



        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = txtEmail.getText().toString().trim();
                String password = txtPassword.getText().toString().trim();

                String confirmPassword = txtConfirmPassword.getText().toString().trim();


                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(Signup_Form.this, "please enter email", Toast.LENGTH_LONG).show();
                    return;

                }
                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(Signup_Form.this, "please enter password", Toast.LENGTH_LONG).show();
                    return;

                }
                if (TextUtils.isEmpty(confirmPassword)) {
                    Toast.makeText(Signup_Form.this, "please enter confirmpassword", Toast.LENGTH_LONG).show();
                    return;

                }

                if (password.length() < 6) {
                    Toast.makeText(Signup_Form.this, "Şifre çok kısa", Toast.LENGTH_SHORT).show();

                }


            }

        });


        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intocan = new Intent(Signup_Form.this, Login.class);
                startActivity(intocan);

            }
        });}
}



