package com.example.workoutandmealplanner;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WorkoutTrackerAdapter  extends  RecyclerView.Adapter<WorkoutTrackerAdapter.viewHolder> {

    List<WorkoutConfirmModel> arrayList;
    Context context;
    DatabaseHelper database;
    Activity activity;


    public WorkoutTrackerAdapter(Context context, Activity activity, List<WorkoutConfirmModel> arrayList) {
        this.context = context;
        this.activity = activity;
        this.arrayList = arrayList;

    }

    @Override
    public WorkoutTrackerAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.workout_confirm_recycler_view_item, parent, false);
        return new WorkoutTrackerAdapter.viewHolder(view);
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        public TextView level, type, duration, date;

        public viewHolder(View itemView) {
            super(itemView);
            level = itemView.findViewById(R.id.level);
            type = itemView.findViewById(R.id.type);
            duration = itemView.findViewById(R.id.duration);
            date = itemView.findViewById(R.id.date);

        }
    }

    @Override
    public void onBindViewHolder(WorkoutTrackerAdapter.viewHolder holder, int i) {
        WorkoutConfirmModel entry = arrayList.get(i);
        holder.level.setText(entry.getLevel());
        holder.type.setText(entry.getType());
        holder.duration.setText(entry.getDuration());
        holder.date.setText(entry.getDate());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}