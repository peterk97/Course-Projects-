package peterkoncz;

import java.util.HashMap;
import java.util.Map;

/**
 * This class programmed defensively and anything what does not need to be exposed isn't exposed
 * used final private ect.
 *
 * the locations. get method returns an instance of the location class rather than a string
 *
 * this class is now fully immutable so once an instance has been created you cannot change that
 */
public class Location {
    private final int locationID;
    private final String description;
    private final Map<String,Integer> exits;

    /*
    modify the constructor to accept the map object and will change our constructor signature and
    assign the passed map to our class fields and this means that we can delete te add exit method
    */
    public Location(int locationID, String description,Map<String,Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if (exits != null){// this if to fix the null point exception if we pass a null object in the constructor it will use an empty HashMap
            this.exits = new HashMap<>(exits); //this is fixes the problem when we can remove the exit
        }else{
           this.exits = new HashMap<String, Integer>();
        }
        this.exits.put("Q",0);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
