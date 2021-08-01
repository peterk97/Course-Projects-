package com.company;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        if (width < 0){
            width = 0;
        }else if(length < 0){
            length = 0;
        }else {
            this.width = width;
            this.length = length;
        }
    }

    public double getArea(){
        return width * length;
    }
}
