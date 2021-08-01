package com.learncoding;

public class Main {

    public static void main(String[] args) {


             int numOfNum = 0;
             int sum = 0;
        for (int i=1; i<=100; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                numOfNum++;
                sum += i;
                System.out.println("Found number = " + i);
            }else if (numOfNum == 5){
                break;
            }
        }
        System.out.println("Sum = " + sum);


    }
}


