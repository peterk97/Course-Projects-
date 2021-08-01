package com.learncoding;

import javax.management.MBeanRegistrationException;

public class Main {

    public static void main(String[] args) {

        char myChar = 'E';

        switch (myChar) {
            case 'A':
                System.out.println("your char is an A ");
                break;
            case 'B':
                System.out.println("your char is a B ");

                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Your char is a " + myChar);
                break;
            default:
                System.out.println("Your char is not even A B C D or E");
                break;
        }

        String month = "January";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }

        int myNum = 5;
        switch(myNum){
            case 1: case 2: case 3: case 4:
                System.out.println(myNum + " is your number");
                break;
            default:
                System.out.println("Num cannot found");
        }

// Week Days challenge method calls!!
        SwitchChalange.days(0);
        SwitchChalange.daysWithIf(0);

        SwitchChalange.days(1);
        SwitchChalange.daysWithIf(1);

        SwitchChalange.days(2);
        SwitchChalange.daysWithIf(2);

        SwitchChalange.days(3);
        SwitchChalange.daysWithIf(3);

        SwitchChalange.days(4);
        SwitchChalange.daysWithIf(4);

        SwitchChalange.days(5);
        SwitchChalange.daysWithIf(5);

        SwitchChalange.days(6);
        SwitchChalange.daysWithIf(6);

        SwitchChalange.days(8);
        SwitchChalange.daysWithIf(8);

    }
}