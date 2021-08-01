package com.learncoding;

public class DecimalComparator {

    public static boolean areEqualByThreeDeacimalPlacs(double decimalOne, double decimslTwo){

        decimalOne = decimalOne * 1000;
        decimslTwo = decimslTwo *1000;
        int myfirst = (int) decimalOne;
        int  mySecond = (int) decimslTwo;


        if (myfirst == mySecond) {
            return true;
        }
            return false;
    }

}
