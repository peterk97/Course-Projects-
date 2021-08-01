package com.learncoding;

public class Main {

    public static void main(String[] args) {
        //byte
        //short
        //int
        //long      these are the 8 simple data types.
        //float
        //double
        //char
        //boolean

        String myString = "This is a string ";
        System.out.println("My String is equals to " + myString);
        myString = myString + ", ans this is more ";
        System.out.println("My String is equals to " + myString);
        myString = myString + " \u00a9 2019 ";
        System.out.println("My String is equals to " + myString);

        String myNumberOfString = "250.55";
        myNumberOfString = myNumberOfString + "49.95";   // string is not a numeric data type.
        System.out.println(myNumberOfString);

        String myLastString = "10";
        int myInt = 50;
        myLastString = myLastString + myInt;
        System.out.println("My lsat string is " + myLastString); // java knows the difference, so convert the int into a String;

        double doubleNumber = 30.44;
        myLastString = myLastString + doubleNumber;
        System.out.println("My lsat string is " + myLastString);

    }
}
