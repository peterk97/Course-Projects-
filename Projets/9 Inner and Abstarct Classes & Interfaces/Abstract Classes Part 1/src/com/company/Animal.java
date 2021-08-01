package com.company;


//animal abstract class so the sub-classes of this must implement this fields and methods
//if you just extend from a normal class you can define the base method but it is not required to use theme
// the abstract methods are have to be implemented
// you cannot directly instantiate a class which is Abstract

// the big difference in between the Interface and the Abstract class is not all the method have to be abstract so (empty method body)
// you also can use fields and mix these all up in A,classes
public abstract class Animal {
    private String name;// field

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat(); // abstract methods
    public abstract void breathe();

    public String getName() { //not and abstract method
        return name;
    }
}
