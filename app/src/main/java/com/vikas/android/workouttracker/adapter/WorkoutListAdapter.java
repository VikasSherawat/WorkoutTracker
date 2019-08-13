package com.vikas.android.workouttracker.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vikas.android.workouttracker.R;
import com.vikas.android.workouttracker.model.BodyPart;
import com.vikas.android.workouttracker.viewholder.WorkoutListViewHolder;

import java.util.List;

import static android.view.View.*;

public class WorkoutListAdapter extends RecyclerView.Adapter<WorkoutListViewHolder> {
    private OnClickListener onClickListener;
    private List<BodyPart> mBodyParts;
    private Context mContext;

    public WorkoutListAdapter(List<BodyPart> mBodyParts, OnClickListener onClickListener,Context context) {
        this.onClickListener = onClickListener;
        this.mBodyParts = mBodyParts;
        this.mContext = context;
    }

    @NonNull
    @Override
    public WorkoutListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_body_part_holder, parent, false);
        view.setOnClickListener(onClickListener);
        return new WorkoutListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkoutListViewHolder holder, int position) {
            holder.bindData(this.mBodyParts.get(position),mContext,position);
    }

    @Override
    public int getItemCount() {
        return this.mBodyParts.size();
    }
}
