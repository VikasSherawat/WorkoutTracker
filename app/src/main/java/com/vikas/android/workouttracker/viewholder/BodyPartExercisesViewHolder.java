package com.vikas.android.workouttracker.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.vikas.android.workouttracker.R;
import com.vikas.android.workouttracker.model.Exercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BodyPartExercisesViewHolder extends RecyclerView.ViewHolder {
    private TextView heading;
    private TextView subText;
    private ImageView exerciseImage;
    public BodyPartExercisesViewHolder(@NonNull View itemView) {
        super(itemView);
        heading = itemView.findViewById(R.id.primary_text);
        subText = itemView.findViewById(R.id.sub_text);
        exerciseImage = itemView.findViewById(R.id.media_image);
    }

    public void bind(Exercise exercise, int position, Context context) {
        heading.setText(exercise.getName());
        SimpleDateFormat df = new SimpleDateFormat("MMM dd yyyy");
        String formattedDate = df.format(new Date());
        subText.setText("Last Performed on "+ formattedDate);
        Glide.with(context).load(exercise.getImageFileName()).into(exerciseImage);

    }
}
