package com.peterkoncz;

/**
 * This project is the java Master class Coding Exercise 39 Polymorphism Project
 * which is one of the base concept of Java,
 * this project demonstrate the meaning of polymorphism which means multiple states
 * in this case a car can be different in many ways !
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car(8,"Base Car");
        car.startEngine();
        car.accelerate();
        car.brake();

        System.out.println();

        Mitsubishi mitsubishi = new Mitsubishi(6,"Outlander VRX 4WD");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();

        System.out.println();

        Ford ford = new Ford(6,"Ford Falcon");
        ford.startEngine();
        ford.accelerate();
        ford.brake();

    }




}
