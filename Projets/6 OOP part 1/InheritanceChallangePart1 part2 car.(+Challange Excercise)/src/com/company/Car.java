package com.company;

public class Car extends Vehicle{
//fields//
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

//constructor//
    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    //methods//
    public void changeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("car.changeGear(): change to " + this.currentGear + " gear");
    }

    public void changeSpeed (int speed, int direction){
        System.out.println("car.changeSpeed(): Speed " + speed + " direction " + direction);
        move(speed,direction);
    }


//getters//


    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
