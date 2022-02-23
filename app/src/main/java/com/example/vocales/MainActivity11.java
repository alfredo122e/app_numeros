package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity11 extends AppCompatActivity {

    Button pagina10;
    Button pagina12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        pagina10 = (Button) findViewById(R.id.button21);
        pagina12 = (Button) findViewById(R.id.button22);

        pagina10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pagina10 = new Intent(MainActivity11.this, MainActivity10.class);
                startActivity(pagina10);
            }
        });

        pagina12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pagina12 = new Intent(MainActivity11.this, MainActivity.class);
                startActivity(pagina12);
            }
        });
    }
}