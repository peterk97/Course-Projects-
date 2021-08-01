package com.learncoding;

import org.w3c.dom.ls.LSOutput;

public class PerfectNumber {
    private static final String FALSE_MESSAGE =  "false ";
    private static final String TRUE_MESSAGE =  "true ";


    public static boolean isPerfctNumber (int number){
        if (number < 1) {
            System.out.println(FALSE_MESSAGE);
            return false;
        }
           int originalNumber = number;

            int divisors = 0;

        for (int i = 1; i < number; i++ ){
            if(number % i == 0){
                divisors = divisors + i;
               // System.out.println(divisors);
            }
        }
            if (originalNumber == divisors){
                System.out.println(TRUE_MESSAGE);
                return true;
            }
        System.out.println(FALSE_MESSAGE);
            return false;
    }

}
