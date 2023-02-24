package com.github.fmikov.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        Intent intent = getIntent();
        String value = intent.getStringExtra("name"); //if it's a string you stored.

        TextView name = findViewById(R.id.greetingMessage);
        name.setText("Greetings " + value);
    }
}