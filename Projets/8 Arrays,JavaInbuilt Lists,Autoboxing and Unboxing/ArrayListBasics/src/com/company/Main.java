package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        printInstruction();
        while(!quit){
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice){
                case "options":
                    printInstruction();
                    break;
                case "list":
                    groceryList.printList();
                    break;
                case "add":
                    addItem();
                    break;
                case "modify":
                    modifyItem();
                    break;
                case "remove":
                    removeItem();
                    break;
                case "find":
                    searchForItem();
                    break;
                case "save":
                    processArrayList();
                    break;
                case "quite":
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstruction(){
        System.out.println("\nType: ");
        System.out.println("\t options  -> To print choice options.");
        System.out.println("\t list     -> To print the list of grocery items.");
        System.out.println("\t add      -> To add an item to the list.");
        System.out.println("\t modify   -> To modify an item on the list.");
        System.out.println("\t remove   -> To remove an itm from the list.");
        System.out.println("\t find     -> To search for an itm in the list.");
        System.out.println("\t save     -> To save the existing list.");
        System.out.println("\t quite    -> To quite the application.");
    }

    public static void addItem (){
        System.out.print("Enter the grocery item: ");
        groceryList.addItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Current item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyItem(itemName,newItem);
    }

    public static void removeItem (){
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeItem(itemName);
    }

    public static void searchForItem(){
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem);
        }else {
            System.out.println(searchItem + ", not on file.");
        }
    }

    public static void processArrayList () {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());    //adding the entire content of an array

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList()); //initialize the content of the other arrayList
        // almost identical with the previous solution but this is happening at the time when you are declaring and initializing the newArrayList Object

        //add all the content and convert it into a regular array!
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);


        //for all of this you need a Getter int the class where you are copying from !!
        //these are all Java built in functions and a really fast way to achieve something to use theme
    }

}

//this the wy to use array list
//important to put all the functionality into the class and hide it from the user make it all self contained













