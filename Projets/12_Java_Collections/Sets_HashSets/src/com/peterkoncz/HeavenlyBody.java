package com.peterkoncz;


import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {


    private final String  name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }


    public double getOrbitalPeriod(){
        return this.orbitalPeriod;
    }

    public String getName(){
        return this.name;
    }

    //we are creating a new HAshMap with our content to retrieve not directly! no access to our original HS
    public Set<HeavenlyBody> getSatellites(){
        return new HashSet<>(this.satellites);
    }

 //have the option to add a moon, this is why we want to pass a parameter which is a heavenlyBody
    //and we will call it moon and we want to add it to the set
    public boolean addMoon (HeavenlyBody moon){
        return this.satellites.add(moon);
    }


}
