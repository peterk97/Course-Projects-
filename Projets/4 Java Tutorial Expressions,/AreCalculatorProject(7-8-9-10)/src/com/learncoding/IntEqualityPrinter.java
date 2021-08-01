package com.learncoding;

public class IntEqualityPrinter {
    private static final String INVALID_VALUE_MASSAG = "Invalid Value";

    public static void printEqual (int one, int two, int three) {
        if ((one < 0 || two < 0 || three < 0)) {
            System.out.println(INVALID_VALUE_MASSAG);
        } else {
            if (one == three && two == three) {
                System.out.println("All numbers are equal");
            } else if (one != two && one  != three && two != three ) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        }
    }

}
