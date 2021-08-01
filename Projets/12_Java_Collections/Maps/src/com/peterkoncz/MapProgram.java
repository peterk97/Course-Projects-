package com.peterkoncz;

import java.sql.Struct;
import java.util.HashMap;
import java.util.Map;

/**
 * This project focus on Maps
 * so maps are holds a key and also a value for each key and to add a key and a value use 'put'
 * to get a value for a key use 'get' and the key and it will return a value
 * keys are unique so if you use it again the old value gets overridden !
 *
 * There is an other method called 'put if absent' and it is only gonna add if the key is not already present but
 * that is really intended to prevent concurrency issues that one thread does not add to the map only for that entry to be overwritten by another thread,
 * so it doesn't help in the null case because it will overwrite keys with no values
 *
 * we can also remove items   but before do that go trough the map to se the content and to do that
 * loop trough the map the contents of the set of keys
 */

public class MapProgram {

    public static void main(String[] args) {

        Map<String, String> language = new HashMap<>(); // 2 String one for the key and for the value

        if (language.containsKey("Java")){ //this si just to make sure!
            System.out.println("Java already exist");
        }else {
            language.put("Java", "a compiled high level, OOP, platform independent language");
            System.out.println("Java successfully added !");
        }

        language.put("Python", "an interpreted, OOP, high-level programming language with dynamic semantics");
        language.put("Algol" , "an algorithmic language");
        System.out.println(language.put("BASIC", "Beginners All Purpose Symbolic Instruction Code")); //if you do this you can check if they already in the list because if not
        System.out.println(language.put("Lisp", "Therein lies madness"));                             //it will return print null!

        //This is how to prevent to override an exiting value!!
        if (language.containsKey("Java")){
            System.out.println("Java is already in the map");
        }else {
            language.put("Java", "This course is about java");
        }

//        System.out.println(language.put("Java", "This course is about java"));// we get the version that already existed -> it will return/print the prior exiting version!
//       System.out.println(language.get("Java"));//here the value has been changed

        System.out.println("===========================================================");
//Remove from HashMaps
        //language.remove("Lisp");
        //other way and also check the value as well
        if (language.remove("Algol","an g algorithmic language")){
            System.out.println("Algol removed");
        }else {
            System.out.println("Algol not removed, key/value not found");
        }

 //Replace an entry !! replace an entry for specify key if it is already mapped to a value
        //System.out.println(language.replace("Lisp", "a functional language with imperative features "));
        //you also can pars the old value and use it that way
        if (language.replace("Lisp" ,"Therein lies madness","a functional language with imperative features")){
            System.out.println("Lisp replaced");
        }else {
            System.out.println("this was not replaced");
        }
        System.out.println(language.replace("Scala","this will not be added "));


        //key set method to print the keys and the values
        for (String key : language.keySet()){
            System.out.println(key + " : " + language.get(key));
        }
    }

    
}
