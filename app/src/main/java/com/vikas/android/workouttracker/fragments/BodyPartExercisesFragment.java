package com.vikas.android.workouttracker.fragments;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.vikas.android.workouttracker.R;
import com.vikas.android.workouttracker.adapter.BodyPartExercisesAdapter;
import com.vikas.android.workouttracker.model.Exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BodyPartExercisesFragment extends Fragment implements View.OnClickListener {

    private Map<String, List<Exercise>> exercises = new HashMap<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeExerciseData();
    }

    private void initializeExerciseData() {
        TypedArray bodyImageResources = getResources().obtainTypedArray(R.array.body_parts_image);
        List<Exercise> list = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            list.add(new Exercise(1,"Bench Press",bodyImageResources.getResourceId(i,0)));
            list.add(new Exercise(2,"Incline Press",bodyImageResources.getResourceId(i+1,0)));
            list.add(new Exercise(3,"Decline Press",bodyImageResources.getResourceId(i+2,0)));
        }
        exercises.put("CHEST",list);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_workout_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new BodyPartExercisesAdapter(exercises.get("CHEST"),this,getContext()));
    }

    @Override
    public void onClick(View view) {

    }
}
