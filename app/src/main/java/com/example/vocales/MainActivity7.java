package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity7 extends AppCompatActivity {
    ImageButton imagen7;
    Button pagina6;
    Button pagina8;
    private MediaPlayer mediaplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);


        imagen7= (ImageButton) findViewById(R.id.imageButton7);
        mediaplayer= MediaPlayer.create(this,R.raw.siete);
        pagina6 = (Button) findViewById(R.id.button13);
        pagina8 = (Button) findViewById(R.id.button14);

        imagen7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.start();
            }
        });

        pagina6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.stop();
                Intent pagina6 = new Intent(MainActivity7.this, MainActivity6.class);
                startActivity(pagina6);
            }
        });

        pagina8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.stop();
                Intent pagina8 = new Intent(MainActivity7.this, MainActivity8.class);
                startActivity(pagina8);
            }
        });
    }
}