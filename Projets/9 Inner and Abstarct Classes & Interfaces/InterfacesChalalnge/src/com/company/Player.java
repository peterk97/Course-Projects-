package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int hitPoints;
    private  int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public String getWeapon() {
        return weapon;
    }


    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    //implemented methods

    @Override
    //all the values what needed to save the player state
    //any non string variables need to be casted as strings
    //one entry for each item
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0,this.name);
        values.add(1,"" + this.hitPoints); //cast the integer to a string
        values.add(2,"" + this.strength); // cast the int value to a string
        values.add(3,this.weapon); // 4 fields the class

        return values;//returns the list
    }

    @Override
    //this is going to receive an arraylist containing the values that have been previously written
    //and use theme to recreate the state of our member of variables.
    public void read(List<String> savedValues) {
          if (savedValues != null && savedValues.size() > 0){ //make sure the list what we receive is a valid list and not null so got some data in it
                this.name = savedValues.get(0);
                this.hitPoints = Integer.parseInt(savedValues.get(1));
                this.strength = Integer.parseInt(savedValues.get(2));
                this.weapon = savedValues.get(3);
            }
    }

















}
