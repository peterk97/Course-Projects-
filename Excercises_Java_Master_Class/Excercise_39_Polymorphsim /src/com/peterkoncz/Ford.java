package com.peterkoncz;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return "Ford's engine is starting.";
    }
    @Override
    public String accelerate(){
        return "the Ford accelerating";
    }
    @Override
    public String brake(){
        return "the Ford is braking";
    }
}
