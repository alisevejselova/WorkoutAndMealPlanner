package com.example.workoutandmealplanner;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MealDetailsActivity extends AppCompatActivity {
    DatabaseHelper database;
    Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_details);


        TextView ingredients = findViewById(R.id.ingredients);
        TextView method = findViewById(R.id.method);


        Intent intent = getIntent();
        String id = intent.getStringExtra("ID");

        database = new DatabaseHelper(this);
        // String name = database.getName(id);
        // String kcal = database.getKcal(id);
        String sostojki = database.getIngredients(id);
        String podgotovka = database.getMethod(id);


        ingredients.setText(sostojki);
        method.setText(podgotovka);
    }
}