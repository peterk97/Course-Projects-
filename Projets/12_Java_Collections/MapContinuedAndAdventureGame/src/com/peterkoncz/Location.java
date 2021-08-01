package com.peterkoncz;

import java.util.HashMap;
import java.util.Map;

/**
 * This class programmed defensively and anything what does not need to be exposed isn't exposed
 * used final private ect.
 *
 * the locations. get method returns an instance of the location class rather than a string
 *
 */
public class Location {
    private final int locationID;
    private final String description;
    private final Map<String,Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
        this.exits.put("Q",0);
    }

    //directions to be add to this map
    public void addExit(String direction,int location){
        exits.put(direction,location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    //instead just return the exits map i am creating a new map and passing our exits in the constructor
    //new map is created and has that has all the makings of the exits map
    //this is useful because nothing outside of that class can change exits so the getter return the copy of the exits!
    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
