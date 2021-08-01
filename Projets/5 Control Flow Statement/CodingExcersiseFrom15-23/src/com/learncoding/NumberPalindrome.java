package com.learncoding;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
            int originalNum = number;
           int reserve = 0;

           while(number != 0){
             int lastDigit = number % 10;
              // System.out.println(lastDigit);
           reserve = reserve * 10 + lastDigit;

           number /=10;
           }
        //System.out.println(reserve);
           if (originalNum == reserve){
               return true;
           }
           return false;
    }
}

