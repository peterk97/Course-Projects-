package com.company;

public class Cuboid extends Rectangle {
    //fields//
    private double height;

//constructor//


    public Cuboid(double length, double width, double height) {
        super(length, width);
        if(height<0){
            height=0;
        }
        this.height = height;
    }

    //getters//
    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea()*height;
    }
}
