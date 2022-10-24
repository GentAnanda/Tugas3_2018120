package com.example.tugas3_prakmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kopsu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kopsu);
    }
    public void coklat (View view){
        Intent a = new Intent(kopsu.this, MainActivity.class);
        startActivity(a);
    }
    public void matcha (View view){
        Intent b = new Intent(kopsu.this, matcha.class);
        startActivity(b);
    }
}