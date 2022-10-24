package com.example.tugas3_prakmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void matcha (View view){
        Intent a = new Intent(MainActivity.this, matcha.class);
        startActivity(a);
    }
    public void kopi_susu (View view){
        Intent b = new Intent(MainActivity.this, kopsu.class);
        startActivity(b);
    }
}