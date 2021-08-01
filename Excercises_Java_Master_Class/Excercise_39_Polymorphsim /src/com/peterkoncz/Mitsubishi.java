package com.peterkoncz;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return "Mitsubishi's engine is starting.";
    }
    @Override
    public String accelerate(){
        return "the Mitsubishi accelerating";
    }
    @Override
    public String brake(){
        return "the Mitsubishi is braking";
    }
}
