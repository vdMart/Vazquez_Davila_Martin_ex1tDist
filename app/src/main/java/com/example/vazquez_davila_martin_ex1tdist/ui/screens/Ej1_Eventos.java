package com.example.vazquez_davila_martin_ex1tdist.ui.screens;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.vazquez_davila_martin_ex1tdist.R;

public class Ej1_Eventos extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.button);
        TextView tv1 = findViewById(R.id.textView);

        tv1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) v).setText("Adios");
                findViewById(R.id.textView).getText;
            }
        });

        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Hola", Toast.LENGTH_LONG).show();

            }
        });

    }
}