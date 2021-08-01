package com.company;

public class Cylinder extends Circle{
    //field//
    private double height;

    //constructor//
    public Cylinder(double radius, double height) {
        super(radius);
        if(height < 0){
            height = 0;
        }
        this.height = height;
    }

    //getter//
    public double getHeight() {
        return height;
    }

    //methods//
    public double getVolume (){
        return getArea()*height;
    }
}
