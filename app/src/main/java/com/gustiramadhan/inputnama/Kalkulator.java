package com.gustiramadhan.inputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {
    EditText angka1, angka2;
    TextView hasil;
 int a, b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        angka1 = (EditText) findViewById(R.id.angkaa);
        angka2 = (EditText) findViewById(R.id.angkadua);
        hasil = (TextView) findViewById(R.id.haaas);
    }


    public void tambah(View view) {
        a =Integer.valueOf(angka1.getText().toString());
        b =Integer.valueOf(angka2.getText().toString());
        c = a + b;
        hasil.setText(String.valueOf(c));
    }

    public void kurang(View view) {
        a =Integer.valueOf(angka1.getText().toString());
        b =Integer.valueOf(angka2.getText().toString());
        c = a - b;
        hasil.setText(String.valueOf(c));
    }

    public void bagi(View view) {
        a =Integer.valueOf(angka1.getText().toString());
        b =Integer.valueOf(angka2.getText().toString());
        c = a / b;
        hasil.setText(String.valueOf(c));
    }

    public void kali(View view) {
        a =Integer.valueOf(angka1.getText().toString());
        b =Integer.valueOf(angka2.getText().toString());
        c = a * b;
        hasil.setText(String.valueOf(c));
    }

    public void berish(View view) {
        angka1.setText("");
        angka2.setText("");
        hasil.setText("0");
        angka1.requestFocus();
    }

    public void back(View view) {
        Intent intent = new Intent(Kalkulator.this, MainActivity.class);
        startActivity(intent);
    }
}
