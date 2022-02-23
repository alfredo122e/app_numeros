package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity8 extends AppCompatActivity {

    ImageButton imagen8;
    Button pagina7;
    Button pagina9;
    private MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        imagen8= (ImageButton) findViewById(R.id.imageButton8);
        mediaplayer= MediaPlayer.create(this,R.raw.ocho);
        pagina7 = (Button) findViewById(R.id.button15);
        pagina9 = (Button) findViewById(R.id.button16);

        imagen8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.start();
            }
        });

        pagina7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.stop();
                Intent pagina7 = new Intent(MainActivity8.this, MainActivity7.class);
                startActivity(pagina7);
            }
        });

        pagina9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.stop();
                Intent pagina9 = new Intent(MainActivity8.this, MainActivity9.class);
                startActivity(pagina9);
            }
        });
    }
}