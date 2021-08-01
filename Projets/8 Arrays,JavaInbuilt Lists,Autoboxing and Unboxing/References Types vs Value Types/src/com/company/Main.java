package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        //this is going to show what is the difference in between the the primitive and the reference data types !!
        //primitive :
            int myIntValue = 5;
            int anotherValue = 5;
        System.out.println(myIntValue);
        System.out.println(anotherValue);
        anotherValue++;
        System.out.println(myIntValue);
        System.out.println(anotherValue);


        //reference data type!

        int [] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
            //use toString built in function in java to print out the arrays it is going to convert the arrays into String values!
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
        // after the change one of the references it is going to chang the array in memory!
        anotherArray[0] = 1;

        System.out.println(" myIntArray after change = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray after change = " + Arrays.toString(anotherArray));

            anotherArray = new int[] {4,5,6,7,8}; //  with the new key word we create a new array in memory !
            modifyArray(myIntArray);

        System.out.println(" myIntArray after modify = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray after modify = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[]{1,2,3,4,5};// de referencing the reference! with the new keyword crate a new array in memory
    }
}















