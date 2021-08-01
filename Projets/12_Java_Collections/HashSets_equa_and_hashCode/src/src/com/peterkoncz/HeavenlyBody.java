package src.com.peterkoncz;


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

    //here we are going to override the equals method you can use short cut because intelliJ knows it can be handy so you can generate it
    //always use the @Override notation because it is very easy to overload the equals method instead of overriding ex(wrong parameter) and if you ude it if you
    //accidentally made a mistake it will be an error so you know if you do not use it is going to be overloaded and won't work!
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return false;
        }
        //print is for debugging purposes
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        //here checking of passed obj isn't null or if they are from a same class so can compare
        if ((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }
        //here we are checking if the names are equal
        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }






}
