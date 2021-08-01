package com.company;

public class Dog extends Animal {

    public Dog(String name) { //uses the parent class constructor (super) fot the name
        super(name);
    }


    //override the methods from the parent class and give theme some functionality
    @Override
    public void eat() {
        System.out.println(getName() + " is Eating!"); // also can use the getter for the name even if that is in the parent class because of inheritance.
    }

    @Override
    public void breathe() {
        System.out.println( getName() + " Breath in, Breath out ...");
    }
}
