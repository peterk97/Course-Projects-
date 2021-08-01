package com.peterkoncz;

public class Lamp {
    //Fields
    private String style;
    private boolean battery;
    private int globRating;

    //Constructor
   public Lamp(String style, boolean battery, int globRating){
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    //Getters
    public String getStyle(){
        return this.style;
    }

    public int getGlobRating(){
        return this.globRating;
    }

    public boolean isBattery(){
        return battery;
    }

    //Methods
    public void turnOn(){
        System.out.println(style + "(lamp): Hase been turned ON!");
    }





}
