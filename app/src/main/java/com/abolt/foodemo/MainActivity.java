package com.abolt.foodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageButton pizza;
    private ImageButton burger;
    private ImageButton pasta;
    private ImageButton drinks;
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pizza = findViewById(R.id.pizzza);
        burger = findViewById(R.id.burger);
        pasta = findViewById(R.id.pasta);
        drinks = findViewById(R.id.drinks);
        i =-1;

        pasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(in);
            }
        });
        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, NotFunctioningActivity.class);

                startActivity(in);
            }
        });
        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, NotFunctioningActivity.class);
                startActivity(in);
            }
        });

        drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, NotFunctioningActivity.class);
                startActivity(in);
            }
        });

    }
}