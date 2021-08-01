package peterkoncz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * In this project we are going to look at the remaining mathematical operations
 * we can perform with sets.
 * Bulk operations:
 * * Union of two sets adAll()
 * * SubSet of two sets is containsAll()
 * * Set Intersection retainAll()
 *
 * In set theory there are two differences are defined Symmetric and Asymmetric
 * so Java Set interface obtain asymmetric difference of to sets using
 * the removeAll() Bulk operation
 *
 *
 */

public class SetMain {

    /*
    This is going to demonstrate the project with two sets '
    one is the set of all Cubes and the other is all Squares
     */
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        //This loop is adding 100 elements in each set.
        for (int i=1; i<=100; i++){
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        //Printing the results
        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");

//Union
        Set<Integer> union = new HashSet<>(squares); //we are adding the squares in the constructor
        union.addAll(cubes); //and here we are adding the cubes
        System.out.println("Union contains " + union.size() + " elements.");
        Set<Integer> intersection = new HashSet<>(squares);

//Intersection
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");

        //We are going to use the square root and the CBRT methods from math class to confirm we are on track.
        for(int i : intersection){
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

//Asymmetric Difference
  //(set1 - set2 ! set2 - set1) !

// We will switch to smaller Sets just to see the remove all in action!

 /*
 This is a good time to look at the interaction between the collections
 framework in Java Arrays so that we can use that to create our Sets

 The collections interface suggests that all classes that implement collections
 should provide two constructors 1. should take no arguments to create empty collection
                                 2. the other one take a collection argument to initialize new collection with all the items

So Arrays class provides an (Arrays.)asList() method that returns a list view the elements on the array
  */

      Set<String> words = new HashSet<>();
      String sentence = "one day in the year of the fox";
      String[] arrayWords = sentence.split(" ");
      words.addAll(Arrays.asList(arrayWords));

      for(String s : words){
          System.out.println(s);
      }

//(set1 - set2 ! set2 - set1) !
        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));

        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("nature - divine:");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine - nature");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);


 /* Symmetric diff is the opposed to the Asymmetric so when an element
    appears in one set or the other but NOT both

    Java does not define a method to calculate this
    but Symmetric diff is = (Union - Intersection) !
 */
        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);

        System.out.println("Symmetric Difference");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

//Last Bulk operation is the containsAll() it is non destructive
        //used to see if a set is a super set of another
        //returns true or false !
        System.out.println();
        if (nature.containsAll(divine)){
            System.out.println("divine is a subset of nature");
        }

        if(nature.containsAll(intersectionTest)){
            System.out.println("intersection is a subset of nature");
        }

        if (divine.containsAll(intersectionTest)){
            System.out.println("intersection is a subset of divine");
        }







    }


    //method to print sets
    private static void printSet(Set<String> set){
        System.out.print("\t");
        for (String s : set){
            System.out.print(s + " ");
        }
        System.out.println();
    }












}














