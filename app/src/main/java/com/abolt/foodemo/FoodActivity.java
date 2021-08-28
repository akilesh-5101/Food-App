package com.abolt.foodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {

    private TextView bolo;
    private TextView cost;

    private Button confirm;
    private Button select;
    private ImageButton see;
    private int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        a = 0;
        Intent intent = getIntent();
        bolo = findViewById(R.id.textbolo);
        select = findViewById(R.id.selectbolo);
        cost = findViewById(R.id.cost);
        see = findViewById(R.id.optionbolo);
        confirm = findViewById(R.id.confirm);
        bolo.setVisibility(View.INVISIBLE);
        confirm.setVisibility(View.GONE);
        cost.setVisibility(View.INVISIBLE);
        String s = cost.getText().toString();


        see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a ==0) {
                    bolo.setVisibility(View.VISIBLE);a=1;
                }
                else{
                    bolo.setVisibility(View.INVISIBLE);
                }
            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(FoodActivity.this, PayActivity.class);
                intent1.putExtra("Amount", s.substring(1, s.length()));
                startActivity(intent1);
            }
        });

        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cost.setVisibility(View.VISIBLE);
                confirm.setVisibility(View.VISIBLE);
                select.setVisibility(View.GONE);
            }
        });

    }
}