package com.floatanddouble.;

public class Main {




    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("My Min Float Value = " + myMinFloatValue);
        System.out.println("My Max Float Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("My Min Double Value = " + myMinDoubleValue);
        System.out.println("My Max Double Value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = (float) 5.25f;   // smaller than the double 32bit
        double myDoubleValue = 5.25; // 64 bit

    // ponds converts to kg .
        double pounds = 170;
        double poundsInKg = (pounds * 0.45359237);
        System.out.println("Calculation: " + pounds + " pounds are: " + poundsInKg + "Kg");

    }
}
