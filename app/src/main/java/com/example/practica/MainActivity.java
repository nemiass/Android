package com.example.practica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String n1;
    String n2;
    Button sum;
    Button res;
    Button mul;
    Button div;
    TextView resp;
    EditText a;
    EditText b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sum = (Button) findViewById(R.id.sumar);
        res = (Button) findViewById(R.id.restar);
        mul = (Button) findViewById(R.id.multiplicar);
        div = (Button) findViewById(R.id.dividir);

        resp = (TextView) findViewById(R.id.res);

        a = (EditText) findViewById(R.id.edita);
        b = (EditText) findViewById(R.id.editb);

        n1 = a.getText().toString();
        n2 = a.getText().toString();

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion(n1, n2, "sumar");
            }
        });

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion(n1, n2, "restar");
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion(n1, n2, "multiplicar");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion(n1, n2, "dividir");
            }
        });
    };

    void operacion(String a, String b, String tipo) {

        if (a != null && b != null) {
            if (tipo == "sumar") {
                int suma = Integer.parseInt(a) +  Integer.parseInt(b);
                resp.setText(suma);
            } else if (tipo == "restar") {
                int resta = Integer.parseInt(a) - Integer.parseInt(b);
                resp.setText(resta);
            } else if (tipo == "multiplicar") {
                int mult = Integer.parseInt(a) * Integer.parseInt(b);
                resp.setText(mult);
            } else if (tipo == "dividir") {
                int divi = Integer.parseInt(a) / Integer.parseInt(b);
                resp.setText(divi);
            }
        }
    }
};




