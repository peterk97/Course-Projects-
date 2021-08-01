package com.company;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }


    @Override  //here it is good to override the fly interface implemented fly method because penguin can flap its wings but cannot fly
    public void fly() {
        super.fly();
        System.out.println("I am not really good at flying, can i go swim instead?!");
    }
}
