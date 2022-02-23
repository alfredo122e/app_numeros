package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity9 extends AppCompatActivity {

    ImageButton imagen9;
    Button pagina8;
    Button pagina10;
    private MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        imagen9= (ImageButton) findViewById(R.id.imageButton9);
        mediaplayer= MediaPlayer.create(this,R.raw.nueve);
        pagina8 = (Button) findViewById(R.id.button17);
        pagina10 = (Button) findViewById(R.id.button18);

        imagen9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.start();
            }
        });

        pagina8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.stop();
                Intent pagina8 = new Intent(MainActivity9.this, MainActivity8.class);
                startActivity(pagina8);
            }
        });

        pagina10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.stop();
                Intent pagina10 = new Intent(MainActivity9.this, MainActivity10.class);
                startActivity(pagina10);
            }
        });
    }
}