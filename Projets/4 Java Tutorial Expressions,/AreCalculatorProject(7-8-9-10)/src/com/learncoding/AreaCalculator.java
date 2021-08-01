package com.learncoding;

public class AreaCalculator {
    private static final String INVALID_VALUE_MASSAG = "Invalid Value";

    public static double area (double radus){
        if (radus < 0 ){
            System.out.println(INVALID_VALUE_MASSAG);
            return -1;
        }
        radus = (radus * radus) * Math.PI;
        System.out.println("The area of the circle is " + radus + " cm2");
        return radus;

    }

    public static double area (double x, double  y) {
        if ((x < 0 && y < 0 ) || (x < 0 || y < 0)){
            System.out.println(INVALID_VALUE_MASSAG);
            return -1;
        }
        double formula = x * y;
        System.out.println("The area of the rechtangle is " + formula + " cm2");
        return formula;
    }

}
