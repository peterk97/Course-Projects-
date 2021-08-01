package com.company;

// Create a simple interface (tip: name it Saveable or ISaveable)
// That interface allows an object to be saved to some sort of storage medium. (tip: use arraylist)
// The exact type of medium is not known to the interface (nor to the classes that implement it).
// The interface will just specify two methods, one to return an ArrayList of values to be saved
// and the other to populate the object's fields from an ArrayList (parameter).
//
// Create a few sample classes that implement your Saveable interface (we've used the idea of a game,
// with Players and Monsters, but you can create any type of classes that you want).
//
// Override the toString() method for each of your classes so that they can be easily printed to enable
// the program to be tested easier.
//
// In Main, write a method that takes an object that implements the interface as a parameter and
// "saves" the values e.g. calls the method defined in the interface.

// We haven't covered I/O yet, so your method should just print the values to the screen.
// Also in the Main class, write a method that restores the values to a Saveable object
// e.g. calls the method from the interface for populating fields (see above).

// Again, we are not going to use Java file I/O; instead use the readValues() method below to
// simulate getting values from a file – this allows you to type as many values as your class
// requires, and returns an ArrayList.
// There is a whole Java I/O section later in the course where you will get to use files, etc.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


    Player peter = new Player("Peter", 100, 30);
        System.out.println((peter.toString()));
        saveObject(peter);

        peter.setHitPoints(90);
        System.out.println(peter);
        peter.setWeapon("War Axe");
        System.out.println(peter);
        saveObject(peter);
      //  loadObject(peter);
        System.out.println(peter);


        //or use Monster
        ISaveable warewolf = new Monster("Warewolf",20,40);
        //what we cannot do is: warewolf.getStrength()
        //we have to cast it because we used the ISavable Interface so we have to tell JAva it is Monster to use getter
        System.out.println(((Monster) warewolf).getStrength());
        System.out.println(warewolf);
        saveObject(warewolf);




    }



    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){ //passing the ISavable(Interface) as a parameter and by doing that we can use any object that is using this interface!!!!
         for (int i = 0; i < objectToSave.write().size();i++){ //cycling trough all the entries using the .write going trough each object
             System.out.println("Saving " + objectToSave.write().get(i) + " To storage device");
         }
    }

                                                           // here with the load object we actually just type some data in with scanner and it is going to save it as we did manually before in the main
   public static void loadObject (ISaveable objectToLoad){ // this loads the data back
        ArrayList<String> values = readValues(); // the method from up and this method enables you to simulate getting that data from somewhere but in this case we are just going to
                                                 // type that data in --> so we got the data
        objectToLoad.read(values);              // this case we got the data which we'e typed and going back to the player object and then call the read() method
                                                //and extract the necessary data out and basically save it in the object values for each of those entries of the (name,weapon ect)
   }



















}






























