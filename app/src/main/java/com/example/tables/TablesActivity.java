package com.example.tables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Console;

public class TablesActivity extends AppCompatActivity {

    EditText number;
    TextView tablesView;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);

        tablesView = findViewById(R.id.tablesView);
        number = findViewById(R.id.number);
        btnShow = findViewById(R.id.btnShow);

        String check = getIntent().getStringExtra("key");

        if (check.equals("SQUARE")){
            btnShow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dispaySquare();
                }
            });
        }
        else if (check.equals("CUBE")){
            btnShow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int num  = Integer.parseInt(number.getText().toString());
                    dispayCube(num);
                }
            });
        }
        else {

            btnShow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dispayTables();
                }
            });

        }

    }

    private void dispayCube(int number) {
        String ans = String.valueOf(number*number*number);
        tablesView.setText(ans);
    }

    private void dispayTables() {
        int num  = Integer.parseInt(number.getText().toString());
        String ans ="";
        for (int i=1;i<=10;i++){
            ans = ans + num+" X "+ i + " = "+ num*i+"\n";
        }
        tablesView.setText(ans);
    }

    private void dispaySquare() {
        int num  = Integer.parseInt(number.getText().toString());
        String ans = String.valueOf(num*num);
        tablesView.setText(ans);
    }



}