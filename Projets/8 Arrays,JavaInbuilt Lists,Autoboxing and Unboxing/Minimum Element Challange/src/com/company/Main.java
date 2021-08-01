package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = readIntegers(5);
       findMin(myArray);
        System.out.println(findMin(myArray));
    }
    
    //getting the values for the array!
    public static int[] readIntegers(int number){
        int[] getValue = new int[number];
        System.out.println("Enter your Int value: \r");
        for (int i = 0; i<getValue.length;i++){
            getValue[i] = scanner.nextInt();
        }
        return  getValue;
    }

    //find the minimum value of the array!
    public static int findMin(int[] array) {
       int min = Integer.MAX_VALUE;

       for (int i = 0; i<array.length;i++){
           int value = array[i];

           if (value < min){
               min = value;
           }
       }
       return min;
    }

}
















