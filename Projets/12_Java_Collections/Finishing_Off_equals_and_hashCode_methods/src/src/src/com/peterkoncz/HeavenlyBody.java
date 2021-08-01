package src.src.com.peterkoncz;


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
        //test for null is important because if we try to call the getClass method on null it will throw null pointer exception
        if ((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }
        //here we are checking if the names are equal to comparing names is the criteria
        //and using the string compare method to compare names against each other
        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }
/**
 * The equals method won't be valid until we implement the hashCode method
    //without the hashCode method it is not even called and pluto is still showing because it has been put in a
    //different bucket
 * HERE is the overridden hashCode method
 * in this case it is easy because String class has HashCode method and because we are comparing only Strings
    //(this would work because we've typed the sts and the map using generics so there is a little DANGER comparing
    //HeavenlyBody to a String but it is not a good practice because String Pluto has a different HashCode from HeavenlyBody Pluto)
 * To generate hashCode is up to you as long as same Objects has same HashCode during any execution of your program
    //and also as long as Object compare equal has the same HashCode
 * THIS CASE adding a number to the names HashCode will make it different, so any number that doesn't risk overflowing an integer
    //will do so we just use 57 in this case is just enough not to case problem
    //that than we guarantee that we've got a number a non-zero number that's been returned for each of our hashes
    //so we are using a code that comes back from a String and adding 57 to that as well so its a non-zero number
    //because HashCode from the String source code returning its own code and we adding 57
 **/
    @Override
    public int hashCode() {
        System.out.println("HashCode is being called!");
        return this.name.hashCode() + 57;
    }
}
