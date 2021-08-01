package com.learncoding;

public class GreatestCommonDivisor {

    public static int getTheGreatestCommonDivisor (int num1, int num2) {
        if (num1 < 10 || num2 < 10) {
            return -1;
        }

        int smallerNumber;
        if (num1 > num2) {
            smallerNumber = num2;
        } else {
            smallerNumber = num1;
        }

        int divisor = 0;
        for (int i = 1; i <= smallerNumber; i++) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                divisor = i;
            }
        }
        System.out.println(divisor);
        return divisor;
    }
}
