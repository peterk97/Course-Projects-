package com.peterkoncz;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return "Holden's engine is starting.";
    }
    @Override
    public String accelerate(){
        return "the Holden accelerating";
    }
    @Override
    public String brake(){
        return "the Holden is braking";
    }
}
