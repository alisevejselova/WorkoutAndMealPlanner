package com.example.workoutandmealplanner;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class WorkoutTrackerActivity extends AppCompatActivity {
    DatabaseHelper database;
    RecyclerView mRecyclerView;
    WorkoutTrackerAdapter mAdapter;
    ArrayList<WorkoutConfirmModel> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_tracker);

        Intent intent = getIntent();
        String user = intent.getStringExtra("Username");
        TextView username = findViewById(R.id.username);
        username.setText(user);

        database = new DatabaseHelper(this);
        arrayList = new ArrayList<>(database.getUserTracker(user));
        mRecyclerView = findViewById(R.id.workout_tracker_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mAdapter = new WorkoutTrackerAdapter( getApplicationContext(),this,arrayList);
        mRecyclerView.setAdapter(mAdapter);

    }
}