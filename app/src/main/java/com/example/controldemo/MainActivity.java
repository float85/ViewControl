package com.example.controldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnControlView, btnDateTime, btnLinear, btnRelative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnControlView = findViewById(R.id.btnViewControl);
        btnDateTime = findViewById(R.id.btnDateTime);
        btnLinear = findViewById(R.id.btnLinear);
        btnRelative = findViewById(R.id.btnRelative);

        btnControlView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), ViewControl.class));
            }
        });
        btnDateTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), AdvancedViewControl.class));

            }
        });
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), AndroidLinearLayout.class));

            }
        });
        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), AndroidRelativeLayout.class));

            }
        });
    }

}