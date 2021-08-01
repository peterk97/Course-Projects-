package com.company;

import java.util.Scanner;

public class Main {
    // this project is showing an example to use arrays with user input!

    public static Scanner scanner = new Scanner(System.in); //import and define a new scanner !

    public static void main(String[] args) {
        int [] myIntegers = getIntegers(5);  //assigning the array with a method to get the values!

        //This for loop is going to print the values out//
        for (int i = 0; i<myIntegers.length;i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }

        System.out.println("The average value of the numbers is " + getAverage(myIntegers)); // print out the average
    }

    public static int[] getIntegers (int number){ //this method is getting the integer values for the array on the main method
        System.out.println("Enter " + number + " integer values.\r"); // this is going to print a message to enter your numbers (\r)means it i gonna be in a new line!
        int[] values = new int[number]; // number is to how many elements are we going to assign the Array

        for (int i = 0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values; // we returning the array into the calling process !!
    }

    public static double getAverage (int[] array){ // this method is going to count the average value of the passed numbers !
        int sum = 0;
        for (int i = 0; i< array.length;i++){
            sum+=array[i];
        }
        return (double) sum / (double) array.length;
    }

}
