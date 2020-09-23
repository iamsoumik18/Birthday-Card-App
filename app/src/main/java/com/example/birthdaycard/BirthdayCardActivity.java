package com.example.birthdaycard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BirthdayCardActivity extends AppCompatActivity {
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_card);
        TextView tx = (TextView) findViewById(R.id.textView2);
        String name = getIntent().getStringExtra("name");
        tx.setText(String.format("Happy Birthday\n%s",name));
        player = MediaPlayer.create(this, R.raw.birthday);
        player.start();

    }

    @Override
    protected void onStop() {
        super.onStop();
        player.release();
        player = null;
    }
}