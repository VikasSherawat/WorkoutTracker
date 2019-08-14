package com.vikas.android.workouttracker.model;

public class Exercise {
    int id;
    String name;
    int imageFileName;

    public Exercise(int id, String name, int imageFileName) {
        this.id = id;
        this.name = name;
        this.imageFileName = imageFileName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(int imageFileName) {
        this.imageFileName = imageFileName;
    }
}
