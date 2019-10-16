package com.gustiramadhan.inputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class List extends AppCompatActivity {

    String[] wisata = {"Kepulauan Raja Ampat","Carstensz Pyramid","Pegunungan Karst ",
            "Danau Sentani"," Baluran","Gunung Bromo","Hidden Canyon","Springs Bamboo",
            "Orchid Forest Cikole","Menara Eiffel"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView listView = findViewById(R.id.lv_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, wisata);

        listView.setAdapter(adapter);
    }

    public void back(View view) {
        Intent intent = new Intent(List.this, MainActivity.class);
        startActivity(intent);
    }
}
