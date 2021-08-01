package com.company;

/**
 * this is an abstract class for player all kind of players
 * are going to be inherit(extend) from this class
 * There is a baseball, football, and a soccer player
 */
public abstract class Player {
    private String name;

    public Player (String name){
        this.name = name;
    }

    public  String getName(){
        return this.name;
    }
}
