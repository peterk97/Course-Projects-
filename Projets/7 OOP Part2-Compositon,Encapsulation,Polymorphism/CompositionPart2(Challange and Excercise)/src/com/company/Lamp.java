package com.company;

public class Lamp {
    private int powerSuply;
    private String size;
    private String lampModel;

    private boolean currentPower;



    public Lamp(int powerSuply, String size, String lampModel) {
        this.powerSuply = powerSuply;
        this.size = size;
        this.lampModel = lampModel;

        this.currentPower = false;
    }

    public void power (boolean currentPower) {
        System.out.println("Lamp.power() called");

        if(currentPower){
            this.currentPower = true;
            System.out.println("Lamp is on!");
        }else {
            this.currentPower = false;
            System.out.println("Lamp is off!");
        }
    }

    public int getPowerSuply() {
        return powerSuply;
    }

    public String getSize() {
        return size;
    }

    public String getLampModel() {
        return lampModel;
    }

    public boolean isCurrentPower() {
        return currentPower;
    }
}
