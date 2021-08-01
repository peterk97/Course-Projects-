package com.learncoding;

public class EvenDigitSum {
    public static int getEvnDigitSum (int number){
        if (number < 0){
            return -1;
        }
        int digits = 0;
        int sumOfDigits = 0;

        while (number > 0){
            digits = number%10;
           // System.out.println(digits);
            number/=10;


            if (digits % 2 == 0){
                sumOfDigits = sumOfDigits + digits;
            }
        }
       System.out.println(sumOfDigits);
        return sumOfDigits;
    }
}
