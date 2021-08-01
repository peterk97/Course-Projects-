package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myArray = new int[] {3,4,6,7,8};
        System.out.println(Arrays.toString(myArray));
        reverseArray(myArray);
        System.out.println(Arrays.toString(myArray));



    }


//reverse method
    public  static  void reverseArray (int[] array){

    int maxIndex = array.length-1;
    int halfLength = array.length/2;

    for(int i = 0;i < halfLength; i++){
       int temp = array[i];
       array[i] = array[maxIndex-i];
       array[maxIndex - i] = temp;

     }

   }

}
