package com.example.intentfirstjava;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    static final String TAG = SecondActivity.class.toString();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }
    void initView(){
        TextView tv_data = findViewById(R.id.tv_data);
        String name = getIntent().getStringExtra("name");
        int age = getIntent().getIntExtra("age", 0);
        tv_data.setText(name+" "+age);
        Log.d(TAG , name);
    }

}
