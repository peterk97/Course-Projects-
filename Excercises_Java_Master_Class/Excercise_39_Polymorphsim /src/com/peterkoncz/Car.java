package com.peterkoncz;

public class Car {
    
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    
    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
    }
    
    public String startEngine(){
        return "Car's engine is starting.";
    }
    
    public String accelerate(){
       return "the Car accelerating";
    }
    
    public String brake(){
      return "the Car is braking";
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getCylinders(){
        return this.cylinders;
    }
}
