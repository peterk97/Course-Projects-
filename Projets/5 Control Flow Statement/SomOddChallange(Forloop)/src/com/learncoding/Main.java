package com.learncoding;

import java.util.Enumeration;

public class Main {

    public static void main(String[] args) {
        System.out.println(isOdd(-5));

        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));
    }

    public static boolean isOdd(int number) {
        return ((number <= 0) || (number % 2 != 0)) && number >= 0;   // if ((number > 0) && (number % 2 == 0) || number < 0) {
    }                                                                // return false;                  simplified if statement!!!!!
                                                                     // }

    public static int sumOdd (int start, int end) {
        if((end < start) || start < 0){
            return -1;
        }

        int sum = 0;
        for (int i=start ; i <= end; i++) {
            //boolean isNumOdd = isOdd(i);
            if(isOdd(i)){
                sum += i;
            }
        }
            return sum;
        }

    }

