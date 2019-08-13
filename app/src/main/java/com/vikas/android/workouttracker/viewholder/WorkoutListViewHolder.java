package com.vikas.android.workouttracker.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.vikas.android.workouttracker.R;
import com.vikas.android.workouttracker.model.BodyPart;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class WorkoutListViewHolder extends RecyclerView.ViewHolder {
    private ImageView bodyPartImageView;
    private TextView bodyPartTextView;
    private TextView bodyPartLastPerformedDateTextView;

    public WorkoutListViewHolder(@NonNull View itemView) {
        super(itemView);
        bodyPartImageView = itemView.findViewById(R.id.bodyPartImage);
        bodyPartTextView = itemView.findViewById(R.id.bodyPartTitle);
        bodyPartLastPerformedDateTextView = itemView.findViewById(R.id.bodyPartLastPerformedDate);
    }

    public void bindData(BodyPart bodyPart, Context mContext){
        bodyPartTextView.setText(bodyPart.getName());
        SimpleDateFormat df = new SimpleDateFormat("MMM dd yyyy");
        String formattedDate = df.format(new Date());
        bodyPartLastPerformedDateTextView.setText("Last Performed on "+ formattedDate);
        Glide.with(mContext).load(bodyPart.getImageResource()).into(bodyPartImageView);
    }
}
