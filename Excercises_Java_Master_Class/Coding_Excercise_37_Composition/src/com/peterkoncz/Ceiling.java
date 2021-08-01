package com.peterkoncz;

public class Ceiling {
    //Variables
    private int height;
    private int paintedColor;

    //Constructor
    public Ceiling(int height, int colour) {
        this.height = height;
        this.paintedColor = colour;
    }

    //Methods / Getters
    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
