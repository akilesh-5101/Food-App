package com.abolt.foodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PayActivity extends AppCompatActivity {

    private Button card;
    private Button cash;
    private TextView message;
    private Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        Intent e = getIntent();
        String m = e.getStringExtra("Amount");
        float c = Float.parseFloat(m);

        card = findViewById(R.id.card);
        cash = findViewById(R.id.cash);
        home = findViewById(R.id.home);
        message = findViewById(R.id.success);

        message.setVisibility(View.INVISIBLE);
        home.setVisibility(View.GONE);


        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message.setVisibility(View.VISIBLE);
                message.setText("Amount " + c + " Payment succesfully made by CARD\n Your order is on the way");
                card.setVisibility(View.INVISIBLE);
                cash.setVisibility(View.INVISIBLE);
                home.setVisibility(View.VISIBLE);
            }
        });

        cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message.setVisibility(View.VISIBLE);
                message.setText("Amount "+ c +" Payment succesfully made by CASH\n Your order is on the way");
                cash.setVisibility(View.INVISIBLE);
                card.setVisibility(View.INVISIBLE);
                home.setVisibility(View.VISIBLE);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(PayActivity.this, MainActivity.class);
                startActivity(inte);
            }
        });

    }
}