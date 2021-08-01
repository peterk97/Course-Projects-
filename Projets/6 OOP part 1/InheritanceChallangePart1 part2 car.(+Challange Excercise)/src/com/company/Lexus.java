package com.company;

public class Lexus extends Car {
//fields//
    private int roadService;


    //constructor//
    public Lexus(int roadService) {
        super("Lexus", "4WD", 5, 5, 6, false);
        this.roadService = roadService;
    }
//methods//
    public void speedUp(int rate){ //automatic car so this method is sets the gears automatically!!

        int newSpeed = getCurrentSpeed() + rate;

        if(newSpeed==0){
            stop();
            changeGear(1);
        }else if(newSpeed>0&&newSpeed<=10){
            changeGear(1);
        }else if(newSpeed>10&&newSpeed<=20){
            changeGear(2);
        }else if(newSpeed>20&&newSpeed<=30){
            changeGear(3);
        }else if(newSpeed>30&&newSpeed<=40){
            changeGear(4);
        }else if(newSpeed>40&&newSpeed<=50){
            changeGear(5);
        }else{
            changeGear(6);
        }

        if(newSpeed > 0){
            changeSpeed(newSpeed,getCurrentDirection());
        }
    }

    //getters//


    public int getRoadService() {
        return roadService;
    }
}
