package com.vikas.android.workouttracker.model;

public class BodyPart {
    private int id;
    private String name;
    private int imageResource;

    public BodyPart(int id, String name, int imageResource) {
        this.id = id;
        this.name = name;
        this.imageResource = imageResource;
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

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
