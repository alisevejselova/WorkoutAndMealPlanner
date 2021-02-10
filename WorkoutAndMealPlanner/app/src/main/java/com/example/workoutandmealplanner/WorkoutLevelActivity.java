package com.example.workoutandmealplanner;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WorkoutLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_level);

        Intent intent = getIntent();
        String user = intent.getStringExtra("Username");

        Button b1,b2,b3;
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WorkoutLevelActivity.this,WorkoutTypeActivity.class);
                intent.putExtra("Level","Beginner");
                intent.putExtra("Username",user);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WorkoutLevelActivity.this,WorkoutTypeActivity.class);
                intent.putExtra("Level","Intermediate");
                intent.putExtra("Username",user);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WorkoutLevelActivity.this,WorkoutTypeActivity.class);
                intent.putExtra("Level","Advanced");
                intent.putExtra("Username",user);
                startActivity(intent);
            }
        });




    }
}