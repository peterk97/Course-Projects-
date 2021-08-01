package com.company;



public class Main {

    public static void main(String[] args) {

        Lexus lexus = new Lexus(36);
        lexus.steer(45);
        lexus.speedUp(30);
        lexus.speedUp(20);
        lexus.speedUp(-42);


        System.out.println(lexus.getSize());
        System.out.println(lexus.getCurrentDirection());
        System.out.println(lexus.getCurrentSpeed());
        System.out.println(lexus.getName());
        System.out.println(lexus.getClass());
        System.out.println(lexus.getDoors());



    }
}
