package com.example.birthdaycard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void createCard(View view) {
        TextView t = (TextView) findViewById(R.id.nameInput);
        String n = t.getEditableText().toString();
        Intent intent = new Intent(this, BirthdayCardActivity.class);
        intent.putExtra("name", n);
        startActivity(intent);
    }


}