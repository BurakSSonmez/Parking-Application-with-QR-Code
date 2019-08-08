package com.example.projemiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;
    Button cstmbtn1,cstmbtn2,cstmbtn3,cstmbtn4,cstmbtn5,cstmbtn6,cstmbtn7,cstmbtn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);
        Button btn5 = (Button) findViewById(R.id.button5);
        Button btn6 = (Button) findViewById(R.id.button6);
        Button btn7 = (Button) findViewById(R.id.button7);
        Button btn8 = (Button) findViewById(R.id.button8);

        final Button cstmbtn1=(Button) findViewById(R.id.button1);
        final Button cstmbtn2=(Button) findViewById(R.id.button2);
        final Button cstmbtn3=(Button) findViewById(R.id.button3);
        final Button cstmbtn4=(Button) findViewById(R.id.button4);
        final Button cstmbtn5=(Button) findViewById(R.id.button5);
        final Button cstmbtn6=(Button) findViewById(R.id.button6);
        final Button cstmbtn7=(Button) findViewById(R.id.button7);
        final Button cstmbtn8=(Button) findViewById(R.id.button8);


        Switch switchEnable1=(Switch) findViewById(R.id.switch1);
        Switch switchEnable2=(Switch) findViewById(R.id.switch2);
        Switch switchEnable3=(Switch) findViewById(R.id.switch3);
        Switch switchEnable4=(Switch) findViewById(R.id.switch4);
        Switch switchEnable5=(Switch) findViewById(R.id.switch5);
        Switch switchEnable6=(Switch) findViewById(R.id.switch6);
        final Switch switchEnable7=(Switch) findViewById(R.id.switch7);
        final Switch switchEnable8=(Switch) findViewById(R.id.switch8);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intocan = new Intent(MainActivity.this, Barcodescanner.class);
                startActivity(intocan);


            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intocan = new Intent(MainActivity.this, Barcodescanner.class);
                startActivity(intocan);
            }

        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intocan = new Intent(MainActivity.this, Barcodescanner.class);
                startActivity(intocan);
            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intocan = new Intent(MainActivity.this, Barcodescanner.class);
                startActivity(intocan);
            }

        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intocan = new Intent(MainActivity.this, Barcodescanner.class);
                startActivity(intocan);
            }

        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intocan = new Intent(MainActivity.this, Barcodescanner.class);
                startActivity(intocan);
            }

        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intocan = new Intent(MainActivity.this, Barcodescanner.class);
                startActivity(intocan);


            }

        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intocan = new Intent(MainActivity.this, Barcodescanner.class);
                startActivity(intocan);
            }

        });
        switchEnable1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    cstmbtn1.setEnabled(true);
                } else {
                    cstmbtn1.setEnabled(false);
                }
            }
        });
        switchEnable2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    cstmbtn2.setEnabled(true);
                } else {
                    cstmbtn2.setEnabled(false);
                }
            }
        });
        switchEnable3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    cstmbtn3.setEnabled(true);
                } else {
                    cstmbtn3.setEnabled(false);
                }
            }
        });
        switchEnable4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    cstmbtn4.setEnabled(true);
                } else {
                    cstmbtn4.setEnabled(false);
                }
            }
        });
        switchEnable5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    cstmbtn5.setEnabled(true);
                } else {
                    cstmbtn5.setEnabled(false);
                }
            }
        });
        switchEnable6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    cstmbtn6.setEnabled(true);
                } else {
                    cstmbtn6.setEnabled(false);
                }


            }
        });
       
        switchEnable7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    cstmbtn7.setEnabled(true);
                } else {
                    cstmbtn7.setEnabled(false);
                }
            }
        });
        switchEnable8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    cstmbtn8.setEnabled(true);
                } else {
                    cstmbtn8.setEnabled(false);
                }
            }
        });






    }
}
