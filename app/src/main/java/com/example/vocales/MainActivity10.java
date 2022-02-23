package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity10 extends AppCompatActivity {

    ImageButton imagen10;
    Button pagina9;
    Button pagina11;
    private MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        imagen10= (ImageButton) findViewById(R.id.imageButton10);
        mediaplayer= MediaPlayer.create(this,R.raw.diez);
        pagina9 = (Button) findViewById(R.id.button19);
        pagina11 = (Button) findViewById(R.id.button20);

        imagen10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.start();
            }
        });

        pagina9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.stop();
                Intent pagina9 = new Intent(MainActivity10.this, MainActivity9.class);
                startActivity(pagina9);
            }
        });

        pagina11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.stop();
                Intent pagina11 = new Intent(MainActivity10.this, MainActivity11.class);
                startActivity(pagina11);
            }
        });
    }
}