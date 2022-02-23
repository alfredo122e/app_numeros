package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity6 extends AppCompatActivity {

    ImageButton imagen6;
    Button pagina5;
    Button pagina7;
    private MediaPlayer mediaplayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        imagen6= (ImageButton) findViewById(R.id.imageButton6);
        mediaplayer= MediaPlayer.create(this,R.raw.seis);
        pagina5 = (Button) findViewById(R.id.button11);
        pagina7 = (Button) findViewById(R.id.button12);

        imagen6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.start();
            }
        });

        pagina5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.stop();
                Intent pagina5 = new Intent(MainActivity6.this, MainActivity5.class);
                startActivity(pagina5);
            }
        });

        pagina7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.stop();
                Intent pagina7 = new Intent(MainActivity6.this, MainActivity7.class);
                startActivity(pagina7);
            }
        });
    }
}