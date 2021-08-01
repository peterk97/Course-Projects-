package peterkoncz;

import java.util.*;

/**
 * This project is the HashSet challenge basically we create two new classes at least
 * these are the subclasses of the HeavenlyBody Moon and Planet
 * also add a new parameter to HeavenlyBody and based on the new parameter
 * we decide if the Body is a Moon or a Planet the new par is BodyType
 */

public class Main {
//store the heavenlyBodies in a map and also gonna contain a set containing ones in the planets
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static HashSet<HeavenlyBody> planets = new HashSet<>();
    private static HashSet<HeavenlyBody> moons = new HashSet<>();


    public static void main(String[] args) {

        // write your code here



        addHeavenlyB("Mercury",88 , "planet");
        addHeavenlyB("Venus",225 , "planet");
        addHeavenlyB("Earth",365 , "planet");
        addHeavenlyB("Mars",687 , "planet");
        addHeavenlyB("Deimos",1.3 , "moon");
        addHeavenlyB("Phobos",0.3 , "moon");


        print(planets);
//        print(moons);
//        printSolarSys();

        System.out.println();

        solarSystem.get("Mercury").addMoon(solarSystem.get("Deimos"));
        printMoons("Mercury");


//        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
//        solarSystem.put(temp.getName(),temp);
//        planets.add(temp);
//
//        temp = new HeavenlyBody("Venus", 225);
//        solarSystem.put(temp.getName(),temp);
//        planets.add(temp);
//
//        temp = new HeavenlyBody("Earth", 365);
//        solarSystem.put(temp.getName(),temp);
//        planets.add(temp);
//
//        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
//        solarSystem.put(tempMoon.getName(),tempMoon);
//        temp.addMoon(tempMoon);
//
//        temp = new HeavenlyBody("Mars", 687);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        tempMoon = new HeavenlyBody("Deimos", 1.3);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon); // temp is still Mars
//
//        tempMoon = new HeavenlyBody("Phobos", 0.3);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon); // temp is still Mars
//
//        temp = new HeavenlyBody("Jupiter", 4332);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        tempMoon = new HeavenlyBody("Io", 1.8);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon); // temp is still Jupiter
//
//        tempMoon = new HeavenlyBody("Europa", 3.5);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon); // temp is still Jupiter
//
//        tempMoon = new HeavenlyBody("Ganymede", 7.1);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon); // temp is still Jupiter
//
//        tempMoon = new HeavenlyBody("Callisto", 16.7);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon); // temp is still Jupiter
//
//        temp = new HeavenlyBody("Saturn", 10759);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        temp = new HeavenlyBody("Uranus", 30660);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        temp = new HeavenlyBody("Neptune", 165);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        temp = new HeavenlyBody("Pluto", 248);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);




    }


    //This method will create the Objects and sort theme based on the type
    public static HeavenlyBody addHeavenlyB(String name, double orbitalPeriod, String bodyType){
        if(bodyType.equals("planet".toLowerCase())){
            HeavenlyBody hb = new Planet(name, orbitalPeriod, bodyType);
            planets.add(hb);
            solarSystem.put(hb.getName(),hb);
            return hb;
        }else if (bodyType.equals("moon".toLowerCase())){
            HeavenlyBody hb = new Moon(name,orbitalPeriod,bodyType);
            moons.add(hb);
            solarSystem.put(hb.getName(),hb);
            return hb;
        }else {
            System.out.println("Body type not supported !");
            return null;
        }
    }


    public static void print(HashSet<HeavenlyBody> hs){
        for(HeavenlyBody hb : hs){
            System.out.println(hb.getName() + " " + hb.getOrbitalPeriod() + " " + hb.getBodyType());
        }
    }

    public static void printSolarSys(){
        for(String s : solarSystem.keySet()){
            String key = s.toString();
            double value = solarSystem.get(s).getOrbitalPeriod();
            System.out.println(key + " " + value + " " + solarSystem.get(s).getBodyType());

        }
    }

    public static void printMoons(String name){
        Set<HeavenlyBody> ls = solarSystem.get(name).getSatellites();
            for (HeavenlyBody hb : ls){
                System.out.println(hb.getName() + " " + hb.getOrbitalPeriod());
            }
    }

}

























