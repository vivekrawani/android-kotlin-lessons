package com.example.checkboxandradiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup mb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mb = findViewById(R.id.mb);
        mb.clearCheck();

        mb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.apple:
                        Toast.makeText(MainActivity.this, "Apple", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.microsoft:
                        Toast.makeText(MainActivity.this, "Microsoft", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.onePlus:
                        Toast.makeText(MainActivity.this, "One Plus", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.motorola:
                        Toast.makeText(MainActivity.this, "Motorola", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                        }
            }
        });


    }
}