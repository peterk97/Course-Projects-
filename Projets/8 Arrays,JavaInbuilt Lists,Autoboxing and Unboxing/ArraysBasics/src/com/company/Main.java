package com.company;

public class Main {

    //Arrays Basics

    public static void main(String[] args) {

        int[] myIntArray = new int[10]; // one way to initialize
       // System.out.println(myIntArray[0] = 45);
        myIntArray[1] = 476;
        myIntArray[5] = 50;

        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //another way to initialize an array
       // System.out.println(myArray[0]);


        int[] myThirdArray = new int[10];

        for (int i = 0; i < myThirdArray.length; i++) {
            myThirdArray[i] = i * 10;
        }

        printArray(myThirdArray); // calling the printing array method!!





        
    }




    //Passing Array into a method !
    public static void printArray (int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }

}
