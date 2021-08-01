package com.learncoding;

public class Main {

    public static void main(String[] args) {
        System.out.println( "Sum of th digits is " + sumDigits(125));
        System.out.println( "Sum of th digits is " + sumDigits(-125));
        System.out.println( "Sum of th digits is " + sumDigits(5));
        System.out.println( "Sum of th digits is " + sumDigits(32123));

    }

    public static int sumDigits(int number) {
        if(number < 10){
            return -1;
        }
        int sum = 0;
// 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125- 120 = 5
        while(number > 0){
            // extract the least significant
            int digit = number % 10;
            sum += digit;

            // drop the least-significant
            number /= 10;
        }
        return sum;
    }

}
