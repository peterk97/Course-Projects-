package com.learncoding;

import javax.swing.*;
import java.io.ObjectInputValidation;

public class NumberOfDaysInMonth {

    private static final String INVALID_VALUE_MASSAG = "Invalid Value";

    public static boolean isLeapYear(int year) {
        if (year <= 0 || year > 9999) {
            return false;
        } else return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }

    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12) {
            System.out.println(INVALID_VALUE_MASSAG);
            return -1;
        } else if (year < 1 || year > 9999) {
            System.out.println(INVALID_VALUE_MASSAG);
            return -1;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:

                    return 31;
                case 4:
                case 6:
                case 9:
                case 11:

                    return 30;
                case 2:
                    if(isLeapYear(year)){

                        return 29;
                    }else{

                        return 28;
                    }
                default:
                    System.out.println(INVALID_VALUE_MASSAG);
                    return -1;

            }
        }
    }
}