package com.example.intentfirstjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    void initView(){
        Button buttonz = findViewById(R.id.b_check);
        buttonz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity();
            }
        });
    }

    void openSecondActivity(){
        Intent intentz = new Intent(this , SecondActivity.class);
        intentz.putExtra("name" , "Zuhriddin");
        intentz.putExtra("age",21);
        startActivity(intentz);

    }
}