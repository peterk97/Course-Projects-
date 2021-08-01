package com.company;

//Super Class//

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    private int currentSpeed;


    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;

        this.wheels = 4;
        this.engine = true;
    }

//getters
    public String getName() {
        return name;
    }


    public int getCylinders() {
        return cylinders;
    }


    public int getCurrentSpeed() {
        return currentSpeed;
    }

    //methods
    public String startEngine(){
        return "Car -> startEngine";
    }

    public String accelerate (){
        return "Car -> accelerate";
    }

    public String brake (){
        return "Car -> bake";
    }
}


class Lexus extends Car {
    public Lexus(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Lexus -> startEngine";
    }

    @Override
    public String accelerate() {
        return "Lexus -> accelerate";
    }

    @Override
    public String brake() {
        return "Lexus -> brake";
    }
}

class Honda extends Car{
    public Honda(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return  getClass().getSimpleName() + " -> startEngine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate";
    }

    @Override
    public String brake() {
        return  getClass().getSimpleName() +  " -> brake";
    }
}



class Tesla extends Car{
    public Tesla(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Tesla -> startEngine";
    }

    @Override
    public String accelerate() {
        return "Tesla -> accelerate";
    }

    @Override
    public String brake() {
        return "Tesla -> brake";
    }
}


class UnknownCar extends Car {
    public UnknownCar() {
        super("Unknown car", 0);
    }

    //no methods here
}





public class Main {

    public static void main(String[] args) {

        Car car = new Car("Marcells car", 6);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());


        Tesla tesla = new Tesla("Model S", 0);
        System.out.println(tesla.startEngine());
        System.out.println(tesla.accelerate());
        System.out.println(tesla.brake());

        Honda honda = new Honda("Civic", 0);
        System.out.println(honda.startEngine());
        System.out.println(honda.accelerate());
        System.out.println(honda.brake());
    }


}




























