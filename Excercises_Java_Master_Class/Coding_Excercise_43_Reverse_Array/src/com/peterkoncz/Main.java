package com.peterkoncz;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {3,2,5,7,8,1};
        reverse(arr);
    }

    private static void reverse (int[] array){
        int maxL = array.length -1;
        int halfL = array.length/2;
        System.out.println("Array = " + Arrays.toString(array));
        for (int i = 0; i < halfL; i++){
            int temp = array[i];
            array[i] = array[maxL -i];
            array[maxL -i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

}
