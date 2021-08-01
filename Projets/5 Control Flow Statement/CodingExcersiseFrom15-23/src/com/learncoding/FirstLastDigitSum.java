package com.learncoding;

public class FirstLastDigitSum {

    public static int sumFirstLastDigitSum(int number){

        if (number < 0 ){
            return -1;
        }

        int origin = number;

        while (number > 9){

            number /= 10;
        }
       // System.out.println(number);

        for(int i = 1; i < 2; i++  ){
             origin %= 10;
        }
        //System.out.println(origin);

        System.out.println(origin + number);
        return origin + number;

    }

}
