package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Wall wall = new Wall("west");
        Wall wall1 = new Wall("east");
        Wall wall2= new Wall("south");
        Wall wall3 = new Wall("north");

      Desk desk = new Desk(2,2,"Wooden desk!");

      Bed bed = new Bed("King","Fasza bed");

     // Tv tv = new Tv(1,1,"Sony");

      Lamp lamp = new Lamp(240,"Big", "Fasza Lamp");


      Room room = new Room(wall,wall1,wall2,wall3,desk,(new Tv(1,1,"Sony")),bed,lamp);

        room.lampPower(true);
       // room.lampPower(false);

        room.tvChannel("Gay porn");
        room.tvPower(true);
        room.tvChannel("Gay porn");

        room.makeBed();

        room.getLamp().power(true); //because getLamp is true! (but better use it as a private)
       //  room.getTv().power(true);
        // room.getTv().channel("Normal porn");



    }
}
