package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
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

        ArrayAdapter<String> sl = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, al);
            // this -> getApplicationContext()
        lv.setAdapter(sl);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                Toast.makeText(MainActivity.this, al.get(pos), Toast.LENGTH_SHORT).show();
            }
        });



    }
}