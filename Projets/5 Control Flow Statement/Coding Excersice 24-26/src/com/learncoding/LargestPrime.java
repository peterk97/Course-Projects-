package com.learncoding;

public class LargestPrime {

    public static int getLargestPrime (int number){
        if(number < 2){
            return -1;
        }

        int i;
        int originalNum = number;

            for(i = 2; i <= originalNum; i++){
                if (originalNum % i == 0){
                    originalNum /= i;
                   // System.out.println(i);
                   // System.out.println(originalNum);
                    i--;

                   // System.out.println(i);
                   // System.out.println(originalNum);
                }

            }
       // System.out.println(i);
                return i;
    }

}
