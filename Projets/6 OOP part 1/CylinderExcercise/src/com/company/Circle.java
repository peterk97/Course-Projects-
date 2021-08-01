package com.company;

public class Circle {

    //fields//
    private double radius;

    //constructor//
    public Circle(double radius) {
        if(radius < 0){
            radius = 0;
        }
        this.radius = radius;
    }

    //getter//
    public double getRadius() {
        return radius;
    }

    //methods//
    public double getArea(){
        return (radius*radius)*Math.PI;
    }

}
