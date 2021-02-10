package com.example.workoutandmealplanner;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WorkoutConfirmActivity extends AppCompatActivity {
    DatabaseHelper database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_confirm);

        TextView User,Level,Type,Duration,Date;
        Button confirm;

        Intent intent = getIntent();
        String user = intent.getStringExtra("Username");
        String level = intent.getStringExtra("Level");
        String type = intent.getStringExtra("Type");
        String duration = intent.getStringExtra("Duration");

        SimpleDateFormat currentDate = new SimpleDateFormat("dd/MM/yyyy");
        Date todayDate = new Date();
        String date = currentDate.format(todayDate);

        User = findViewById(R.id.user);
        Level = findViewById(R.id.level);
        Type = findViewById(R.id.type);
        Duration = findViewById(R.id.duration);
        Date = findViewById(R.id.date);

        User.setText(user);
        Level.setText(level);
        Type.setText(type);
        Duration.setText(duration);
        Date.setText(date);

        confirm = findViewById(R.id.confirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  database.insertIntoWorkoutTracker(user,level,type,duration,date);
                Toast.makeText(WorkoutConfirmActivity.this, "Confirmed", Toast.LENGTH_SHORT).show();
              //  Intent intent = new Intent(v.getContext(),MainActivity.class);
               //  v.getContext().startActivity(intent);
            }
        });

        Button tracker = findViewById(R.id.tracker);
        tracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),WorkoutTrackerActivity.class);
                intent.putExtra("Username",user);
                v.getContext().startActivity(intent);
            }
        });

        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),MainActivity.class);
                v.getContext().startActivity(intent);
            }
        });



    }
}