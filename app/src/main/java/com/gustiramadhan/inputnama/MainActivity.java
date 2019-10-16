package com.gustiramadhan.inputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   EditText nama;
    TextView hnama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nama = (EditText) findViewById(R.id.editText);
        hnama = (TextView) findViewById(R.id.textView2);
    }

    public void tampilnama(View view) {
        String namae;
        namae = nama.getText().toString().trim();
        hnama.setText(namae);
    }

    public void kalk(View view) {
        Intent intent = new Intent(MainActivity.this, Kalkulator.class);
        startActivity(intent);
    }

    public void List(View view) {
        Intent intent = new Intent(MainActivity.this, List.class);
        startActivity(intent);
    }
}
