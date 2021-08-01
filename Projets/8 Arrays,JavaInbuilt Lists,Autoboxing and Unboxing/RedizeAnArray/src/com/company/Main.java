package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter 10 Integers:");
        getInput();
        printArray(baseData);
        resizeArray();
        baseData[10] = 67;
        baseData[11] = 7; //these ara the new two members

//        System.out.println("Enter 12 Integers"); // with this you resize and override as well !!
//        getInput();
        printArray(baseData);
    }

    private static void getInput() {
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = s.nextInt();
        }
    }

    private static void printArray (int[] array){
        for (int i = 0; i<array.length;i++){
            System.out.println(array[i] + " ");
        }
    }

    public static void resizeArray(){
        int[] original = baseData;

        baseData = new int[12];
        for (int i = 0; i<original.length;i++){
            baseData[i] = original[i];
        }
    }

    // so this is a way to resizing an existing array but it take quiet a long time
    // Java has some built in function to make it s much easier an faster
    // The ArrayList is resizable array and it does everything automatically even make space in the memory!
    

}
























