package peterkoncz;


import java.util.HashSet;
import java.util.Set;

/**
 * Here we are going to use the new field the bodyType
 * Java have a good way to grouping constance together
 * this called ENUM
 *
 * also when we using Enum and not an int or anything else
 * we are going to get a compile time error so it will appear and
 * we do not have to do another check in the constructor
 *
 * a nested Enum is automatically Static so it is possible to refer to the
 * enum values without instantiate the HB object
 */

public abstract class HeavenlyBody {
//HERE WE CAN REPLACE THE NAME AND THE BODY TYPE WITH THE KEY CLASS!

    private final Key key;
    //private final String  name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    //private final BodyTypes bodyType;

    //Enum
    //enums are types so when we change the constructor we can make sure
    //it only accepts the valid bodyType (one of these)  
    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID,
    }
//  CHANGE THE CONSTRUCTOR AS WELL INSTEAD OF NAME AND BODY TYPE IT WILL ACCEPT THE KEY CLASS
    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.key = new Key(name,bodyType); //even key class constructor defined as private it works because it is an inner class to HB
        //this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        //this.bodyType = bodyType;
    }



    public double getOrbitalPeriod(){
        return this.orbitalPeriod;
    }
//ADD NEW GETTER FOR KEY

    public Key getKey() {
        return key;
    }


//MUST REMOVE GETTER FOR THE NAME
//    public String getName(){
//        return this.name;
//    }
    //MUST REMOVE GETTER FOR BODY TYPE
//getter for BodyType
//    public BodyTypes getBodyType() {
//        return bodyType;
//    }

    //we are creating a new HAshMap with our content to retrieve not directly! no access to our original HS
    public Set<HeavenlyBody> getSatellites(){
        return new HashSet<>(this.satellites);
    }

    //have the option to add a moon, this is why we want to pass a parameter which is a heavenlyBody
    public boolean addSatellite(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    //here we are going to override the equals method
    //we are doing this because we are tempt to subclass the HB
    //to create the planet moon or other objects that is why are we testing to class
    //using instanceof
    //also to avid with equals to not being symmetric mark the method as final
    @Override
    public final boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof HeavenlyBody){ //here we are checking if it is the right class
            HeavenlyBody theObject = (HeavenlyBody) obj;//if yes we are casting the obj to a HB
            //CHANGING THIS CODE TO NOT HAVE DUPLICATE WE ARE CALLING THE EQUALS METHOD FROM THE KEY INNER CLASS!!!!!
//            if (this.name.equals(theObject.getName())){//we are doing the test on the name first
//                return this.bodyType == theObject.bodyType;//if that is true we can return true or false if this bodyType = to obj bodyType
//            }
                return this.key.equals(theObject.getKey());
        }
        return false;  //return false because ether the name or the bodyType is different
    }

    //hashCode should be final as well
    //enum constance have a hashCode method as well so we can just add to it
    @Override
    public final int hashCode() {
        //SAME HERE WE ARE GOING TO RETURN THE HASHCODE FROM THE KEY INNER CLASS TO PREVENT DUPLICATE CODE
       // return this.name.hashCode() + 57 + this.bodyType.hashCode();// now this gives us a unique hashCode
        return this.key.hashCode();
    }
 /*
 Here we are going to add a method to make a key so the actual implementation of the key is not that uses of the class
 should have to know about but in order to retrieve the HB from a map we need a key what we really have is a name and BodyType
 so what we want to do is pass the name and the BodyType and return the valid key which can be use to look up the entry in our map
  */
    public static Key makeKey(String name, BodyTypes bodyType){
        return new Key(name,bodyType);
    }


 // to override the toString method will makes the printing so much easier
 //when we are printing the instance automatically will use the toString();
 // {java implicitly calls toString() to obtain string representation of the object} it as also important to use it for debugging purposes !
 //other advantage of enum when you print it out the enum returns the name of the enum (so we will get the Uppercase enum Name: STAR,PLANET ect)
    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod; //CHANGE THIS TO RETRIEVE NAME AND B TYPE FROM KEY
    }

//Static Inner class for the key!
    /*
   key class is very simple and gives us way to deal with the
   combination of name and BType in a single object
   because we are using the key in a Map that is why we have to override
   the equal and the HashCode methods

   now generally speaking it is a bad idea to have duplicate code like this
   but we can fix that by making the HB method just call the method in our new Key class
   the HB equals() still needs to check if the Obj is being compared as an HB type (obj instanceof HB)
   and must cast the obj to a HB in order to access as a key
*/

    public static final class Key{

        private String name;
        private BodyTypes bodyType;

    public Key(String name, BodyTypes bodyType) {
        this.name = name;
        this.bodyType = bodyType;
    }

  //getters
    public String getName() {
        return name;
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }

//Override equals() and hashCode() methods
    @Override
    public int hashCode() {
        return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Key key = (Key) obj;
        if (this.name.equals(key.getName())){  //same concept like before if the name matches check for the body type
            return this.bodyType == key.getBodyType();
        }
        return false;
    }

    //we want to add a toString() here as well to display nicely the name and the BType

        @Override
        public String toString() {
            return this.name + ", " + this.bodyType;
        }
    }



}
