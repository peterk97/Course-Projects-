package com.peterkoncz;

public class Main {

    public static void main(String[] args) {


       Series series = new Series();

       for (int i = 0; i<= 10; i++){
           System.out.println(series.fibonacci(i));
       }
        System.out.println("#############################################");
        for (int i = 0; i<= 10; i++){
            System.out.println(series.factorial(i));
        }
        System.out.println("#############################################");

        for (int i = 0; i<= 10; i++){
            System.out.println(series.nSum(i));
        }

    }
}
