package com.learncoding;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            int age = 2020 - yearOfBirth;
            if (age >= 0 && age <= 100){
                System.out.println("Your name is " + name + ", and you are " + age + " yars old." );
            } else {
                System.out.println("Invalid year of birth");
            }

        }else{
            System.out.println("Enable to parse the year of birth");
        }

        scanner.close();


                 //  count();
    }

    public static void count (){

        int num;
        int num1;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the B side");
      num = scanner1.nextInt();
        scanner1.nextLine();

        System.out.println("Enter the the A side");
        num1 = scanner1.nextInt();
        scanner1.nextLine();

        System.out.println("The reectangle is " + (num*num1) + " cm2" );

        scanner1.close();
    }


}
