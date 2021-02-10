package com.example.workoutandmealplanner;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class WorkoutActivity extends AppCompatActivity {
    DatabaseHelper database;
    String duration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);


        Intent intent = getIntent();
        String level = intent.getStringExtra("Level");
        String type = intent.getStringExtra("Type");
        String user = intent.getStringExtra("Username");

        Spinner spinner = findViewById(R.id.spinner_dialog);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                duration= (String) spinner.getSelectedItem();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        Button button = findViewById(R.id.workoutdone);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WorkoutActivity.this,WorkoutConfirmActivity.class);
                intent.putExtra("Level",level);
                intent.putExtra("Type",type);
                intent.putExtra("Duration",duration);
                intent.putExtra("Username",user);
                startActivity(intent);
            }
        });


        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);

        database = new DatabaseHelper(this);
        List<String> valuesNames = database.getAllWorkoutsURL(level,type);
        String[] strarray = valuesNames.toArray(new String[0]);

        RecyclerView.Adapter recyclerViewAdapter = new VideoAdapter(strarray, this.getLifecycle());
        recyclerView.setAdapter(recyclerViewAdapter);


    }
}
