package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
     int[] myIntegers = getNum(5);
     int[] sorted = getSorted(myIntegers);
       printArray(sorted);
    }
//getting number
    public static int[] getNum (int number) {
        int[] values = new int[number];
        System.out.println("Enter " + number + " values\r");
        for (int i = 0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    //Print array method
    public static void printArray (int[] array){
        for(int i = 0; i<array.length;i++){
            System.out.println( "Element " + i + " = value: " + array[i]);
        }
    }
// sort method
    public static int[] getSorted (int[] array){
//        int[] sortedValues = new int[array.length];
//            for (int i = 0;i<array.length;i++){
//                sortedValues[i]=array[i];
//            }
            int[] sortedValues = Arrays.copyOf(array,array.length); // this one line built in function copies the arrays! instead of the previous lines !


            boolean flag = true;
            int temporary;

            while (flag) {
                flag = false;

                //160 40 50 60 70
                //160 50 40 60 70
                //160 50 60 40 70
                //160 50 60 70 40
                //160 50 60 70 40
                //160 60 50 70 40
                //160 60 70 50 40
                //160 70 60 50 40

                //sort method
                for (int i = 0; i < sortedValues.length-1; i++) {
                    if(sortedValues[i] < sortedValues[i+1]){
                        temporary = sortedValues[i];
                        sortedValues[i] = sortedValues[i+1];
                        sortedValues[i+1]=temporary;
                        flag = true;
                    }
                }
            }
            return sortedValues;
    }
}












