package com.company;

public class Room {
   //Fields//
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;

    private Desk desk;
    private Tv tv;
    private Bed bed;
    private Lamp lamp;

    public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Desk desk, Tv tv, Bed bed, Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.desk = desk;
        this.tv = tv;
        this.bed = bed;
        this.lamp = lamp;
    }



//Setup methods//

    //tv
    public void tvPower(boolean power){
        tv.power(power);
    }


    public void tvChannel (String channel){
        tv.channel(channel);
    }

    //lamp
    public void lampPower(boolean power){
        lamp.power(power);
    }
    //bed
    public void makeBed(){
        System.out.println("Room -> Making bed");
        bed.make();
    }

    //Getters//
    private Desk getDesk() {
        return desk;
    }

    private Tv getTv() {
        return tv;
    }

    private Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }
}
