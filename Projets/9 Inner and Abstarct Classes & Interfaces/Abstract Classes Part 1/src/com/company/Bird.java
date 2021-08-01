package com.company;
// you cannot directly instantiate a class which is Abstract
//so abstract classes can extend another abstract class like bird extends the animal
//The reason  is every bird can eat and breath but not all the bird can fly
//so in Abird class we iplemented the 2 methods from animal and created another Amethod which is fly and optional for the
//future depending if a specific bird can fly or not!
public abstract class Bird extends Animal  implements  CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is Pecking");
    }

    @Override
    public void breathe() {
        System.out.println( getName() + " Breath in, Breath out ...");
    }

//    public abstract void fly(); instead of this we implemented a CanFly interface
    //instead override the interface method
    @Override
    public void fly() {
        System.out.println("Flapping it's wings !");
    }
}
