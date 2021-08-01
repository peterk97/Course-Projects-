package com.learncoding;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double average;
        int count = 0;


        while (true) {
            System.out.println("Enter your numbers:");
            boolean isNum = scanner.hasNextInt();
            if (isNum) {

                int num = scanner.nextInt();
                sum += num;
                count++;
            } else {
                break;
            }

            scanner.nextLine();
        }
        average = Math.round((double) sum / (double) count);
       System.out.printf("SUM = " + sum + " AVG = %.0f", average);
       // System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}

