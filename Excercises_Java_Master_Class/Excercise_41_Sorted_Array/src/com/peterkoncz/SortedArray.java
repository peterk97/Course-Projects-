package com.peterkoncz;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static Scanner scanner = new Scanner(System.in);


    //Get integer method
    public static int[] getIntegers(int num){
        int[] values = new int[num];
        System.out.println("Enter " + num + " values\r");
        for (int i = 0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    //Sorting method
    public static int[] sortIntegers(int[] array){
        int[] sortedIntegers = Arrays.copyOf(array,array.length);

        int temp;
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0; i < sortedIntegers.length-1; i++){
                if (sortedIntegers[i] < sortedIntegers[i+1]){
                    temp = sortedIntegers[i];
                    sortedIntegers[i] = sortedIntegers[i+1];
                    sortedIntegers[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedIntegers;
    }

    //print method
    public static void printArray (int[] array){
        for (int i = 0; i<array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}











