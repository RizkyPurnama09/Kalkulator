package com.example.kalkulator_sederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txthasil;
EditText angka1, angka2;
Button btnplus, btnkurang, btnkali, btnbagi, clear;
float num1, num2, getresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angka1= findViewById(R.id.angka1);
        angka2=findViewById(R.id.angka2);
        txthasil=findViewById(R.id.txthasil);
        btnplus=findViewById(R.id.btnplus);
        btnkurang=findViewById(R.id.btnkurang);
        btnkali=findViewById(R.id.btnkali);
        btnbagi=findViewById(R.id.btnbagi);
        clear=findViewById(R.id.clear);

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(angka1.getText().toString());
                num2=Integer.parseInt(angka2.getText().toString());
                getresult = num1+num2;
                txthasil.setText(String.valueOf(getresult));
            }
        });
        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(angka1.getText().toString());
                num2=Integer.parseInt(angka2.getText().toString());
                getresult = num1 - num2;
                txthasil.setText(String.valueOf(getresult));
            }
        });
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(angka1.getText().toString());
                num2=Integer.parseInt(angka2.getText().toString());
                getresult = num1 * num2;
                txthasil.setText(String.valueOf(getresult));
            }
        });
        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(angka1.getText().toString());
                num2=Integer.parseInt(angka2.getText().toString());
                if (num2 != 0) {
                    getresult = num1 / num2;
                    txthasil.setText(String.valueOf(getresult));
                } else {
                    txthasil.setText("Tidak bisa dibagi dengan nol");
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka1.setText("");
                angka2.setText("");
                txthasil.setText("");
            }
        });
    }
}