package com.vikas.android.workouttracker.fragments;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.vikas.android.workouttracker.R;
import com.vikas.android.workouttracker.adapter.WorkoutListAdapter;
import com.vikas.android.workouttracker.model.BodyPart;

import java.util.ArrayList;
import java.util.List;

public class WorkoutListFragment extends Fragment implements View.OnClickListener {
    List<BodyPart> mBodyParts = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeBodyPartsData();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_workout_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new WorkoutListAdapter(mBodyParts,this,getContext()));
    }

    @Override
    public void onClick(View view) {
        int position = (int)view.getTag();
        Toast.makeText(getContext(),"Clicked on"+mBodyParts.get(position).getName(),Toast.LENGTH_SHORT).show();
    }

    private void initializeBodyPartsData() {
        String[] bodyParts = getResources().getStringArray(R.array.body_parts);
        TypedArray bodyImageResources = getResources().obtainTypedArray(R.array.body_parts_image);
        mBodyParts.clear();
        //Create the ArrayList of Sports objects with the titles and information about each sport
        for (int i = 0; i < bodyParts.length; i++) {
            mBodyParts.add(new BodyPart(i,bodyParts[i],bodyImageResources.getResourceId(i, 0)));
        }
    }
}

