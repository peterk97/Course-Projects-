package com.learncoding;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 1;
        int sum = 0;

        while (number <= 10) {
            System.out.println("Enter number #" + number);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {

                int num = scanner.nextInt();

                if (num < 0) {
                    System.out.println("invalid value");
                    continue;
                }
                sum = sum + num;
                number += 1;
            }else {
                System.out.println("Invalid number");

            }
            scanner.nextLine();
        }
        System.out.println("The sum of your 10 Numbers is: " + sum);

        scanner.close();
    }
    }

