package com.vikas.android.workouttracker.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vikas.android.workouttracker.viewholder.WorkoutListViewHolder;

import static android.view.View.*;

public class WorkoutListAdapter extends RecyclerView.Adapter<WorkoutListViewHolder> {
    private OnClickListener onClickListener;

    public WorkoutListAdapter(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public WorkoutListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull WorkoutListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
