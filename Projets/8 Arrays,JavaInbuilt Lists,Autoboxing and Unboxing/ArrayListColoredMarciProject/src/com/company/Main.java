package com.company;

import java.awt.event.MouseAdapter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);
  private static ColoredMarci coloredMarci = new ColoredMarci();

    public static void main(String[] args) {
	// write your code here


        boolean quit = false;

        System.out.println("options        - options!\n" +
                "add            - add Marci!\n" +
                "remove         - remove Marci!\n" +
                "find           - find Marci!\n" +
                "modify         - modify Marci\n" +
                "list           - list Marci!\n" +
                "good bye marci - quite!");

        while (!quit){

            System.out.println("\nEnter command:");
            String command = scanner.nextLine();
            switch (command){

                case "options" :
                    printOptions();
                    break;
                case "add" :
                    addMarci();
                    break;
                case "remove" :
                    removearci();
                    break;
                case "find" :
                   find();
                    break;
                case "modify" :
                    modify();
                    break;
                case "list" :
                    coloredMarci.printMarci();
                    break;
                case "good bye marci" :
                    quit = true;
                    break;
                default:
                    System.out.println("Cannot find command !");
            }
        }

//        marci.addMarci(Marci.createMarci("yellow" , "976"));
//        marci.addMarci(new Marci("blue", "975"));
//        marci.printMarci();
//        marci.removeMarci("blue");
//        marci.printMarci();
//        marci.addMarci(new Marci("black", "974"));
//        marci.printMarci();
//        marci.findMarcell("black");
//
    }


    private static void printOptions (){
        System.out.println("Options:");
        System.out.println("options        - options!\n" +
                           "add            - add Marci!\n" +
                           "remove         - remove Marci!\n" +
                           "find           - find Marci!\n" +
                           "modify         - modify Marci\n" +
                           "list           - list Marci!\n" +
                           "good bye marci - quite!");
    }

    private static void addMarci(){
        System.out.print("Enter color:");
        String color = scanner.nextLine();
        System.out.print("Enter Id:");
        String id = scanner.nextLine();
        Marci newMarci = Marci.createMarci(color,id);
        if (coloredMarci.addMarci(newMarci)){
            System.out.println(color + " Marci added with ID:" + id);
        }else{
            System.out.println("Marci is already on file !");
        }
    }

    public static void  removearci (){
        System.out.print("Enter Marcell's color:");
        String color = scanner.nextLine();
        if (coloredMarci.removeMarci(color)){
            System.out.println(color + " Marcell removed!");
            coloredMarci.removeMarci(color);
        }else{
            System.out.println("Marcell cannot find");
        }
    }

    public static void find(){
        System.out.print("Enter Marcell's color:");
        String color = scanner.nextLine();
        coloredMarci.findMarcell(color);
    }

    public static void modify(){
        System.out.print("Enter existing Marcell:");
        String color = scanner.nextLine();
        Marci oldMarci = coloredMarci.findMarcell(color);
        if (oldMarci == null){
            System.out.println("Marcei could not find!");
        }

        System.out.print("Enter new Marci's Color:");
        String newColor = scanner.nextLine();
        System.out.print("Enter new Marci's ID:");
        String newId = scanner.nextLine();
        Marci newMarci = new Marci(newColor,newId);
        if (coloredMarci.modify(oldMarci,newMarci)){
            System.out.println("Marcell is Successfully uppdated!");
        }else{
            System.out.println("Error updating Marcell.");
        }
    }


}
