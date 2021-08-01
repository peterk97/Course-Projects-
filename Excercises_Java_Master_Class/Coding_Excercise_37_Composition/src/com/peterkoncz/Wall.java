package com.peterkoncz;

public class Wall {
    //Variables
    private String direction;

    //Constructor
   public Wall(String direction){
        this.direction = direction.substring(0,1).toUpperCase();
    }

    //Getters
    public String getDirection(){
        return this.direction;
    }
}
