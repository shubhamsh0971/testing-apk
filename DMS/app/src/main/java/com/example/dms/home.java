package com.example.dms;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnTransaction = findViewById(R.id.btn_transaction);
        Button btnScoreboard = findViewById(R.id.btn_Score);
        Button btnMyProfile = findViewById(R.id.btn_myprofile);
        Button btnKnowAboutUs = findViewById(R.id.btn_knowaboutus);

        btnTransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, TransactionActivity.class);
//                startActivity(intent);
            }
        });

        btnScoreboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, ScoreboardActivity.class);
//                startActivity(intent);
            }
        });

        btnMyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open MyProfileActivity
//                Intent intent = new Intent(MainActivity.this, MyProfileActivity.class);
//                startActivity(intent);
            }
        });

        btnKnowAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open KnowAboutUsActivity
//                Intent intent = new Intent(MainActivity.this, KnowAboutUsActivity.class);
//                startActivity(intent);
            }
        });
    }
}