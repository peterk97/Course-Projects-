package peterkoncz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * This project is about immutable classes so we are going to make this class immutable !
 * immutable is when the class cannot be changed once their created
 * increase encapsulation and reduce errors (even if you are going to allow
 * external code to modify your class)
 *
 * there is a few technique to do it like the getter returns a copy of the real map or
 * make the fields final and private ect.
 * The third technique to do not provide setters for the fields
 */

public class Main {
    //define a map here which holds our class Location this is initializing
    private static Map<Integer,Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        //temp map this will hold the exits
        //we are setting tempExits to a new HashMap after each room so the
        //so the previous rooms exits aren't included in the new room
        Map<String,Integer> tempExits = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",null));

        //moved the lines from above into the appropriate area after its exits have been defined nd to pass the tempExits map
        //to the constructor
        tempExits = new HashMap<String, Integer>();
        tempExits.put("W",2);
        tempExits.put("E",3);
        tempExits.put("S",4);
        tempExits.put("N",5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExits));


        tempExits = new HashMap<String, Integer>();
        tempExits.put("N",5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExits));


        tempExits = new HashMap<String, Integer>();
        tempExits.put("W",1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExits));


        tempExits = new HashMap<String, Integer>();
        tempExits.put("N",1);
        tempExits.put("W",2);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExits));

        tempExits = new HashMap<String, Integer>();
        tempExits.put("S",1);
        tempExits.put("W",2);
        locations.put(5, new Location(5, "You are in the forest",tempExits));


        Map<String, String> vocab = new HashMap<String, String>();
        vocab.put("WEST","W");
        vocab.put("SOUTH","S");
        vocab.put("NORTH","N");
        vocab.put("EAST","E");
        vocab.put("QUIT", "Q");





        int loc =1;

        while(true){
            System.out.println(locations.get(loc).getDescription());
            //we still have one more problem we can remove this must be fixed
            //we still have a reference to the exits map for location 5 the forest
            //we must use the same technique like at the setter just apply it at the setter
            tempExits.remove("s");

            if (loc ==0){
                break;
            }
            //exits returns a copy if we did make any changes to the map it wouldn't effect the map field
            //in the locations instance
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()){
                System.out.print(exit + ", ");
            }
            System.out.println();
            System.out.print("Enter Direction:-->");
            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1){
                String[] words = direction.split(" ");
                for (String s : words){
                    if (vocab.containsKey(s)){
                        direction = vocab.get(s);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction)){
                loc = exits.get(direction);
            }else {
                System.out.println("You cannot go in that direction!");
            }
        }
   }
}
