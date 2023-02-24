package com.github.fmikov.bootcamp;

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

        TextView name = findViewById(R.id.mainName);
        Button btnApp = (Button) findViewById(R.id.mainGoButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage(v);
            }
        };
        btnApp.setOnClickListener(listener);
    }

    public void sendMessage(View view){
        Intent myIntent = new Intent(MainActivity.this, GreetingActivity.class);
        TextView name = findViewById(R.id.mainName);
        myIntent.putExtra("name", name.toString()); //Optional parameters
        MainActivity.this.startActivity(myIntent);
    }
}