package com.company;

public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    //it is extends already 2 classes so we do not have to do implement all the methods just the new ones for the bird
    //which is the fly(), you can implement all as well if you want but not required!

//    @Override
//    public void fly() {
//        System.out.println("Fitting from branch to branch Flying");
//    }

    //implemented interface in the Bird class already have the fly method and this is inherits so it can flap its wing and that means parrot will fly
}
