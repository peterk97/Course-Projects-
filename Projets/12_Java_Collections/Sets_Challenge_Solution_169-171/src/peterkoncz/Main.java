package peterkoncz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *This is the solution of the Sets challenge video 169-171
 * also we are going to add a new field in HB which is body type and based on the
 * body type we are going to create new classes of the HB so HB will be extended (subclassed) like MOON, Planet, etc
 * also we are going to change the equals and the hasCode methods
 */

public class Main {

    /*
    ISSUE:
    There is a an issue with the solar system map because we are defining it with the name (String) as a key and
    there is no wa to cater for the body type and because we are using a map we only got the key and the value

    SOLUTION:
    this is a common problem when attempting to store and retrieve more complex objects
    there are many solutions for this
    1, for example data bases allow records to be selected on several fields it is possible to make a primary key that consist with all the unique fields defined
    2, an other approach is to create unique serial numbers for each record such as (social sec num US, tax file num AU) so you cannot retrieve someones records
    unless you know the number.
    Like in universe all the object have a unique num to retrieve the info about it but the disadvantage is that you have to know the number to get the info!

    Here you may use a number instead of the name as a key or concatenated the name with the body type can work as well

    In this solution we are going to create a class and give the HB class a field of type key!
     because this key is going ot be closely tied to the HB class we are gonna make it a static inner class of the HB class
     */
    //store the heavenlyBodies in a map and also gonna contain a set containing ones in the planets
    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();//MAKE A CHANGE INSTEAD OF STRING NAME IT WILL BE HB KEY
    private static Set<HeavenlyBody> planets = new HashSet<>();


    public static void main(String[] args) {

        // write your code here
        //changing the Planets and the moons to a subclass because in the constructor the third par the bodyType is already set

        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);


        //printout if working
        System.out.println("Planets");
        for(HeavenlyBody planet : planets){
            System.out.println("\t" + planet.getKey()); //"\t" -> is a tab
        }

        System.out.println();

        //add some code to display the moons of a planet
        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Mars",HeavenlyBody.BodyTypes.PLANET));
        System.out.println("Moons of " + body.getKey());
        for (HeavenlyBody jupMoons : body.getSatellites()){
            System.out.println("\t" + jupMoons.getKey());
        }

        System.out.println();
//Here we are generating a new set of the moons because in set theory the union of two sets is a set containing the elements of both
        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets){
            moons.addAll(planet.getSatellites());
        }


        //Printing the moons
        System.out.println("All Moons ");
        for (HeavenlyBody moon : moons){
            System.out.println("\t" + moon.getKey());
        }

        //you will see here pluto can be added twice and it is possible because the two objects references are not equal!
        HeavenlyBody pluto = new DwarfPlanet("Pluto",842); //2. pluto if change the body type it will appear twice because equals checks for
        planets.add(pluto);                                                   //body type as well if that is diff it can be added again

        System.out.println();

        for (HeavenlyBody planet : planets){
            System.out.println(planet);//this automatically invoke the (HB)toString();
//            System.out.println(planet.getKey() + " : " + planet.getOrbitalPeriod());
        }

        System.out.println();
        //here we are going to test case 2 (if a.equals(b) then b.equals(a))
        HeavenlyBody earth1 = new Planet("Earth",365);
        HeavenlyBody earth2 = new Planet("Earth",365);
        System.out.println(earth1.equals(earth2)); //true
        System.out.println(earth2.equals(earth1)); //true

        //make sure it is valid compare something else
        System.out.println(earth1.equals(pluto)); //false
        System.out.println(pluto.equals(earth1)); //false

        //Test for case 6
        //we can check if they're both in there
        solarSystem.put(pluto.getKey(),pluto);
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto",HeavenlyBody.BodyTypes.PLANET)));
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto",HeavenlyBody.BodyTypes.DWARF_PLANET)));

        //Just as a final check print out the entire solar system
        System.out.println();
        System.out.println("The solar system contains:");
        for (HeavenlyBody heavenlyBody : solarSystem.values()){
            System.out.println(heavenlyBody);//it works because we have the toString there
        }



    }
}

























