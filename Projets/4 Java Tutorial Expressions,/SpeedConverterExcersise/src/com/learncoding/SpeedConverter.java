package com.learncoding;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }else{
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printCorvesion (double kilometersPerHour){

        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h" );
        }
    }
}
