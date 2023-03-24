package com.example.mytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView te;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        te=findViewById(R.id.te);
        te.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("xxx","我是打印的内容");
                Toast.makeText(MainActivity.this, "你好我是测试的内容", Toast.LENGTH_SHORT).show();
            }
        });
    }
}