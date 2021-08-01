package com.peterkoncz;


/**
 * This is a project from Java Master Class from the Composition part to practise the
 * Composition!
 * This project is demonstrating composition with the instance of a Bedroom and all the stuff
 * can be found in a bedroom are different classes!
 */
public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("east");
        Wall wall3 = new Wall("south");
        Wall wall4 = new Wall("north");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("Modern",4,3,2,1);

        Lamp lamp = new Lamp("Classic",false,75);

        Bedroom bedroom = new Bedroom("Peter",wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }



}
