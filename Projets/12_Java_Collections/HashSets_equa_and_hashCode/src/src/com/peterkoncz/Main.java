package src.com.peterkoncz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * This project will show why is it important to override the equals() and the hashCode() methods
 * because java uses the original equals method from the base Object class and this way you can accidentally
 * add more Object with the same name if some other fields are different because it uses the original
 * referential equality!
 * This case the equals method has to be overridden in heavenly body class !
 */

public class Main {
//store the heavenlyBodies in a map and also gonna contain a set containing ones in the planets
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();


    public static void main(String[] args) {

        // write your code here

        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        tempMoon = new HeavenlyBody("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        temp = new HeavenlyBody("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        temp = new HeavenlyBody("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);


        //printout if working
        System.out.println("Planets");
        for(HeavenlyBody planet : planets){
            System.out.println("\t" + planet.getName()); //"\t" -> is a tab
        }

        System.out.println();

        //add some code to display the moons of a planet
        HeavenlyBody body = solarSystem.get("Jupiter"); //getting the Jupiter,Mars ect. from the solar.sys
        System.out.println("Moons of " + body.getName());
        for (HeavenlyBody jupMoons : body.getSatellites()){
            System.out.println("\t" + jupMoons.getName());
        }


//Here we are generating a new set of the moons because in set theory the union of two sets is a set containing the elements of both and
        //because sets do not allow duplicate all the element only will appear once
        //we cab yse addAll method of the set bv looping trough all the planets and calling there getSatellites method we can generate a set of moons
        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets){
            moons.addAll(planet.getSatellites());
        }

        System.out.println();

        //Printing the moons
        System.out.println("All Moons ");
        for (HeavenlyBody moon : moons){
            System.out.println("\t" + moon.getName());
        }

        //you will see here pluto can be added twice and it is possible because the two objects references are not equal!
        HeavenlyBody pluto = new HeavenlyBody("Pluto",842);
        planets.add(pluto);

        for (HeavenlyBody planet : planets){
            System.out.println(planet.getName() + " : " + planet.getOrbitalPeriod());
        }


        //here you can see what the obj use as equality just ==
        //and how the string overrides it in the string class
        //also if two objets compare equal their hashcode must be the same so this is why you also have to override
        //the hashCode method as well when you override the equals method !
        //ctrl + click on the methods!
        Object o = new Object();
        o.equals(o);
        "pluto".equals("");

    }
}

























