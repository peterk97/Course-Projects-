package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50;// this line is  a whole statement

        if (myVariable == 50) {
            System.out.println("Printed"); //this is a statement as well
        }
              // Stataement is contains expressons as well but ends with a ;  and statement includes data type as well

        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is" +
                " another" +
                " still more."); //this is a valid print as well java ignore the whit space and the line difference

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one");
    }
}
