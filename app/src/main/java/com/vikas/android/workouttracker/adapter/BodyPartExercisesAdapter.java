package com.vikas.android.workouttracker.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vikas.android.workouttracker.R;
import com.vikas.android.workouttracker.model.Exercise;
import com.vikas.android.workouttracker.viewholder.BodyPartExercisesViewHolder;

import java.util.List;

public class BodyPartExercisesAdapter extends RecyclerView.Adapter<BodyPartExercisesViewHolder> {
    List<Exercise> exercises;
    private View.OnClickListener listener;
    private Context context;

    public BodyPartExercisesAdapter(List<Exercise> exercises, View.OnClickListener listener, Context context) {
        this.exercises = exercises;
        this.listener = listener;
        this.context = context;
    }

    @NonNull
    @Override
    public BodyPartExercisesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_body_part_exercise_holder, parent, false);
        view.setOnClickListener(listener);
        return new BodyPartExercisesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BodyPartExercisesViewHolder holder, int position) {
        holder.bind(exercises.get(position),position,context);
    }

    @Override
    public int getItemCount() {
        return exercises.size();
    }
}
