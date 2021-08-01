package com.learncoding;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        int min = 0;
//        int max = 0;
        int min = Integer.MAX_VALUE;  //the solution is to solve the 0 bug is to set the min and the max the min and max value of an integer;
        int max = Integer.MIN_VALUE;
//        boolean first = true; // or use a boolean flag to set the first value for a number then set it to false after so the if statement will execute just ones! and it will check the numbers based on the first.

        while (true) {
            System.out.println("Enter number:");
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                    int num = scanner.nextInt();
//                    if (first){
//                        first = false;
//                        min = num;
//                        max = num;
//                    }

                    if(num > max){
                        max = num;
                    }

                    if (num < min){
                        min = num;
                    }

                }else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        scanner.close();


    }
}
