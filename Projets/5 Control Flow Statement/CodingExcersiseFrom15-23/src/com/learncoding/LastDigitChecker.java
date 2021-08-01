package com.learncoding;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)){
           return false;
        }
        int numOne = 0;
        for (int i = 0; i < 1; i++){
            numOne = num1 % 10;
           // System.out.println("num 1  is " + numOne);
        }
        int numtwo = 0;
        for (int i = 0; i < 1; i++){
            numtwo = num2 % 10;
           // System.out.println("num 2  is " + numtwo);
        }

        int numThree = 0;
        for(int i = 0; i < 1; i++){
            numThree = num3 % 10;
           // System.out.println("num 3  is " + numThree);

    }
        if ((numOne == numtwo) || (numOne == numThree) || (numtwo == numThree)){

            return true;
        }

        return false;
    }

    public static boolean isValid (int number){
        return number >= 10 && number <= 1000;
    }


}

