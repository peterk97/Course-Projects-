package com.company;

public class Vehicle {
//fields//
    private String name;
    private String size;

    private int currentDirection;
    private int currentSpeed;

// Constructor //
    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.currentSpeed = 0;
    }


    //methods//
    public void steer (int direction){
        this.currentDirection += direction;
        System.out.println("vehicle.steer(): Steering at " + currentDirection + " degrees");
    }

    public void move (int speed , int direction){
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("vehicle.move(): Moving at " + currentSpeed + " in direction " + currentDirection);
    }

    public void stop (){
        this.currentSpeed = 0;
    }

    //getter//


    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}