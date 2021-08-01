package com.peterkoncz;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int num){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[num];
        for (int i = 0;i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    private static int findMin(int[] array){
        int temp;
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i = 0; i<array.length-1;i++){
                if (array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array[0];
    }

}
