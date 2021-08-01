package com.learncoding;

import jdk.swing.interop.SwingInterOpUtils;

public class DiagonalStar {

        private static final String INVALID_V_MASSAGE = "Invalid Value";

        public static void printSquareStar (int number) {
            if (number < 5) {
                System.out.println(INVALID_V_MASSAGE);
            } else {

                //rows
                for (int i = 0; i < number; i++) {
                    //columns
                    for (int j = 0; j < number; j++) {

                        if (i == 0 || j == 0 || i == j || i == number - 1 || j == number - 1 || i + j == number - 1)
                            System.out.print("CIGANY");
                        else
                            System.out.print("      ");
                    }
                    System.out.println();
                }
            }
        }
}




