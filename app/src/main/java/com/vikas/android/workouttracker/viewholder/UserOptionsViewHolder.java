package com.vikas.android.workouttracker.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.vikas.android.workouttracker.R;

public class UserOptionsViewHolder extends RecyclerView.ViewHolder {
    private TextView optionNameView;
    private CardView userOptionCardView;
    public UserOptionsViewHolder(@NonNull View itemView) {
        super(itemView);
        optionNameView = itemView.findViewById(R.id.optionName);
        userOptionCardView = itemView.findViewById(R.id.userOptionCardView);
    }

    public void bind(String name, int position){
        userOptionCardView.setTag(position);
        optionNameView.setText(name);
    }
}
