package com.vikas.android.workouttracker.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vikas.android.workouttracker.R;
import com.vikas.android.workouttracker.viewholder.UserOptionsViewHolder;

import java.util.List;

public class UserOptionsAdapter extends RecyclerView.Adapter<UserOptionsViewHolder> {
    private List<String> userOptions;
    private OnClickListener adapterListener;
    public UserOptionsAdapter(@NonNull List<String> userOptions, OnClickListener listener) {
        this.userOptions = userOptions;
        this.adapterListener = listener;
    }

    @NonNull
    @Override
    public UserOptionsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.user_option_view_holder, parent, false);
        view.setOnClickListener(adapterListener);
        return new UserOptionsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserOptionsViewHolder holder, int position) {
        holder.bind(this.userOptions.get(position),position);
    }

    @Override
    public int getItemCount() {
        return this.userOptions.size();
    }
}
