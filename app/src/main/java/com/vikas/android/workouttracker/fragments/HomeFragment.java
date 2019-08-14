package com.vikas.android.workouttracker.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.vikas.android.workouttracker.R;
import com.vikas.android.workouttracker.adapter.UserOptionsAdapter;

import java.util.Arrays;
import java.util.List;

public class HomeFragment extends Fragment implements View.OnClickListener {
    private List<String> userOptions = Arrays.asList("AllWorkout", "MyWorkout", "Diet Log", "Weight Log");

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(new UserOptionsAdapter(this.userOptions, this));
    }

    @Override
    public void onClick(View view) {
        int position = (int) view.getTag();
        NavController navController = Navigation.findNavController(view);
        switch (position) {
            case 0:
                navController.navigate(R.id.workoutListFragment );
                break;
            case 1:
                navController.navigate(R.id.myWorkoutFragment);
                break;
            default:
                navController.navigate(R.id.workoutListFragment);
        }
    }
}

