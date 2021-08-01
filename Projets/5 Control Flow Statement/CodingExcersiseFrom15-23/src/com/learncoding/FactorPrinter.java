package com.learncoding;

public class FactorPrinter {
    private static final String INVALID_VALUE_MASSAGE = "Invalid Value";

    public static void printFactors(int number) {
        if(number < 0){
            System.out.println(INVALID_VALUE_MASSAGE);
        }
        int diveder = 0;
        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                diveder = i;
                System.out.println(diveder);
            }
        }
    }

}
