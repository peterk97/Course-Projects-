package com.company;

public class Rectangle {
    //fields// 
    private double length;
    private double width;

    //constructor//
    public Rectangle(double width, double length) {
        if(length<0&&width<0){
            length=0;
            width=0;
        }else if(width<0){
            width=0;
        }else if (length<0){
            length=0;
        }
        this.length = length;
        this.width = width;
    }

    //getter//
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    
    public double getArea(){
        return (width*length);
    }
            
}
