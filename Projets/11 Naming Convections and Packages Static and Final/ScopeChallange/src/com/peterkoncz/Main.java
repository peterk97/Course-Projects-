package com.peterkoncz;

import java.util.Scanner;

/**
 * The purpose of this challenge to have a bette understanding in scoops this is the reason
 * why all the variables, class and methods name is x
 * in other cases this is really bad solution and not recommended
 */
public class Main {

    public static void main(String[] args) {

        X x = new X(new Scanner(System.in));
        x.x();
    }
}
// Write a small program to read an integer from the keyboard
// (using Scanner) and print out the times table for that number.
// The table should run from 1 to 12.
//
// You are allowed to use one variable called scanner for your
// Scanner instance. You can use as many other variables as you
// need, but they must must all be called x. That includes any
// class instances and loop control variables that you may decide
// to use.
//
// If you use a class, the class can be called X (capital), but
// any instances of it must be called x (lower case).
//
// Any methods you create must also be called x.
//
// Optional Extra:
// Change your program so that ALL variables (including the scanner
// instance) are called x.