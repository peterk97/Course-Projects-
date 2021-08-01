package com.learncoding;

public class MinutesToYearsDaysCalculator {

    private static final String INVALID_VALUE_MASSAG = "Invalid Value";


   public static void printYearsAndDays(long minutes){
       if (minutes < 0){
           System.out.println(INVALID_VALUE_MASSAG);
       }else {

           long years = (long) minutes / 525600;
           long remaind = (long) minutes % 525600;
           long days = (long) remaind / 1440;

           System.out.println(minutes + " min = " + years + " y and " + days + " d");
       }
   }

}
