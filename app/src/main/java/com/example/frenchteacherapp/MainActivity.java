package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_black, btn_yellow, btn_red, btn_purple, btn_green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_black = findViewById(R.id.button_black);
        btn_yellow = findViewById(R.id.button_yellow);
        btn_red = findViewById(R.id.button_red);
        btn_purple = findViewById(R.id.button_purple);
        btn_green = findViewById(R.id.button_green);

        btn_red.setOnClickListener(this);
        btn_black.setOnClickListener(this);
        btn_purple.setOnClickListener(this);
        btn_yellow.setOnClickListener(this);
        btn_green.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int clickedBtnId = view.getId();

        if (clickedBtnId == R.id.button_red) {
            PlaySounds(R.raw.red);
        } else if (clickedBtnId == R.id.button_black) {
            PlaySounds(R.raw.black);
        } else if (clickedBtnId == R.id.button_green) {
            PlaySounds(R.raw.green);
        } else if (clickedBtnId == R.id.button_purple) {
            PlaySounds(R.raw.purple);
        } else if (clickedBtnId == R.id.button_yellow){
            PlaySounds(R.raw.yellow);
        }
    }

    public void PlaySounds(int id) {

        MediaPlayer mediaPlayer = MediaPlayer.create(
                this,
                id
        );
        mediaPlayer.start();
    }
}