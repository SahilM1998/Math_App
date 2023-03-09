package com.example.tables;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button goToTabels,learnSquare,learnCube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToTabels = findViewById(R.id.learnTable);
        learnSquare = findViewById(R.id.learnSquare);
        learnCube = findViewById(R.id.learnCube);

        goToTabels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,TablesActivity.class);
                startActivity(i);
            }
        });
        learnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,TablesActivity.class);
                i.putExtra("key","SQUARE");
                startActivity(i);
            }
        });
        learnCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,TablesActivity.class);
                i.putExtra("key","CUBE");
                startActivity(i);
            }
        });


    }
}