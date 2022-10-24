package com.example.tugas3_prakmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class matcha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matcha);
    }
    public void kopi_susu (View view){
        Intent a = new Intent(matcha.this, kopsu.class);
        startActivity(a);
    }
    public void coklat (View view){
        Intent b = new Intent(matcha.this, MainActivity.class);
        startActivity(b);
    }
}