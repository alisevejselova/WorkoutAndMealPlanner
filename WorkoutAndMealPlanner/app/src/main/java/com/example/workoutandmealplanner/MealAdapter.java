package com.example.workoutandmealplanner;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MealAdapter extends RecyclerView.Adapter<MealAdapter.ViewHolder>{
    private final List<String> myList;
    private final int rowLayout;
    private final Context mContext;
    private final DatabaseHelper database;

    public MealAdapter(List<String> myList, int rowLayout, DatabaseHelper database,Context mContext) {
        this.myList = myList;
        this.rowLayout = rowLayout;
        this.database = database;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MealAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final String id = myList.get(position);
        final String name = database.getName(id);
        final String kcal = database.getKcal(id);

        int productImageId = mContext.getResources().getIdentifier(id, "drawable", mContext.getPackageName());


        holder.t1.setText(name);
        holder.t2.setText(kcal);
        Picasso.with(mContext).load(productImageId)
                .error(R.drawable.ic_baseline_error_outline_24)
                .resize(200, 200)
                .centerCrop()
                .into(holder.imageView);


        holder.t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),MealDetailsActivity.class);
                intent.putExtra("ID",id);
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return myList == null ? 0 : myList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView t1,t2;
        public ImageView imageView;

        public ViewHolder( View itemView) {
            super(itemView);
            t1= itemView.findViewById(R.id.mealname);
            t2= itemView.findViewById(R.id.kcal);
            imageView=itemView.findViewById(R.id.image);
        }
    }
}
