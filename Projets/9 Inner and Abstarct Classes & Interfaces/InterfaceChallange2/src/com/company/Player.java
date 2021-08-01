package com.company;

import java.util.ArrayList;
import java.util.List;


public class Player implements ISaveable {
    private String name;
    private double HP;
    private double STR;
    private String weapon;


    public Player(String name, double HP, double STR) {
        this.name = name;
        this.HP = HP;
        this.STR = STR;
        this.weapon = "pick axe";
    }
//getters
    public String getName() {
        return name;
    }

    public double getHP() {
        return HP;
    }

    public double getSTR() {
        return STR;
    }

    public String getWeapon() {
        return weapon;
    }
//setters


    public void setName(String name) {
        this.name = name;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public void setSTR(double STR) {
        this.STR = STR;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

 //toString


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", HP=" + HP +
                ", STR=" + STR +
                ", weapon='" + weapon + '\'' +
                '}';
    }

//Interface methods


    @Override
    public List<String> saveInToTheList() {
        List<String> playerThings = new ArrayList<String>();
        playerThings.add(0,name);
        playerThings.add(1,""+HP);
        playerThings.add(2,""+STR);
        playerThings.add(3,weapon);

        return playerThings;
    }

    @Override
    public void readFromTheList(List<String> savedValues) {
       if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.HP = Double.parseDouble(savedValues.get(1));
            this.STR = Double.parseDouble(savedValues.get(2));
            this.weapon = savedValues.get(3);
         }
    }


}
