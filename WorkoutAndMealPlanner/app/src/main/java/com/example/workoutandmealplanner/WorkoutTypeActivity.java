package com.example.workoutandmealplanner;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WorkoutTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_type);

        Intent intent = getIntent();
        String level = intent.getStringExtra("Level");
        String user = intent.getStringExtra("Username");

        Button b1,b2,b3,b4,b5;

        b1= findViewById(R.id.button1);
        b2= findViewById(R.id.button2);
        b3= findViewById(R.id.button3);
        b4= findViewById(R.id.button4);
        b5= findViewById(R.id.button5);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WorkoutTypeActivity.this,WorkoutActivity.class);
                intent.putExtra("Type","Cardio");
                intent.putExtra("Level",level);
                intent.putExtra("Username",user);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WorkoutTypeActivity.this,WorkoutActivity.class);
                intent.putExtra("Type","Strength");
                intent.putExtra("Level",level);
                intent.putExtra("Username",user);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WorkoutTypeActivity.this,WorkoutActivity.class);
                intent.putExtra("Type","Flexibility");
                intent.putExtra("Level",level);
                intent.putExtra("Username",user);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WorkoutTypeActivity.this,WorkoutActivity.class);
                intent.putExtra("Type","Balance");
                intent.putExtra("Level",level);
                intent.putExtra("Username",user);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WorkoutTypeActivity.this,WorkoutActivity.class);
                intent.putExtra("Type","Coordination");
                intent.putExtra("Level",level);
                intent.putExtra("Username",user);
                startActivity(intent);
            }
        });

    }

}