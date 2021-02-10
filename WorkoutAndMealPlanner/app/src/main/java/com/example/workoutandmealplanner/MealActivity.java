package com.example.workoutandmealplanner;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.List;

public class MealActivity extends AppCompatActivity {


    DatabaseHelper database;
    RecyclerView mRecyclerView;
    MealAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal);

        Intent mealtype = getIntent();
        String type = mealtype.getStringExtra("Type");

        database = new DatabaseHelper(this);
        List<String> valuesNames = database.getMealByType(type);


//        database = new DatabaseHelper(this);
//        List<String> valuesNames = database.getMealIDs();

        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        //mRecyclerView.setLayoutManager( new LinearLayoutManager(this));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mAdapter = new MealAdapter(valuesNames, R.layout.meal_recycler_view_item, database,this);
        mRecyclerView.setAdapter(mAdapter);
    }
}
