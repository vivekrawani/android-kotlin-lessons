package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private AutoCompleteTextView actxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       spinner = findViewById(R.id.spinner);
       actxtView = findViewById(R.id.actxtView);
        ArrayList<String> al = new ArrayList<>();
        al.add("Loki");
        al.add("Game of Thrones");
        al.add("House of Dragons");
        al.add("Daredevil");
        al.add("La casa de Papel");
        al.add("Wanda Vision");
        al.add("Breaking Bad");
        al.add(" Avatar: The Last Air Bender");
        al.add("Rick and Morty");
        al.add("Stranger Things");
        al.add("Squid Game");
        al.add("Westworld");
        al.add("The Witcher");
        al.add(" Avatar: The Last Air Bender");

        ArrayAdapter<String> sl = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, al);

        spinner.setAdapter(sl);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, spinner.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<String> actvAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,al);
        actxtView.setAdapter(actvAdapter);
        actxtView.setThreshold(1);
    }
}