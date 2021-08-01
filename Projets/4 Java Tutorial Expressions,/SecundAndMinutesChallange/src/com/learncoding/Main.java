package com.learncoding;

public class Main {

        private static final String INVALID_VALUE_MASSAG = "Invalid Value";

    public static void main(String[] args) {
        System.out.println( getDurationString(137, 55));
        System.out.println(getDurationString(15673));
        System.out.println(getDurationString(-15673));
        System.out.println(getDurationString(65, 9));



        // sum(1,5,7);

    }

        private static String getDurationString(int minutes, int secunds){
        if (minutes < 0 || secunds < 0 || secunds > 59) {
            return INVALID_VALUE_MASSAG;
        }

        int hours = minutes / 60;
        int remindMinutes = minutes % 60;

        String hoursString = hours + "h";
        if (hours < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = remindMinutes + "m";
        if (remindMinutes < 10){
                minutesString = "0" + minutesString;
            }

        String secundStrng = secunds + "s";
        if (secunds < 10){
                secundStrng = "0" + secundStrng;
            }

        return hoursString + " " + minutesString + " " + secundStrng + "";
    }

       private static String getDurationString (int secund){
        if (secund < 0){
            return INVALID_VALUE_MASSAG;
        }
        int minutes = secund / 60;
        int rmaindSecunds = secund % 60;
           return getDurationString(minutes, rmaindSecunds);
    }

//    public static int sum (int one, int two, int three){
//        int sum = one + two + three;
//        System.out.println("one + two + three = " + sum);
//        return sum;
//    }
//    public static int sum (int one, int two){
//        int sum = one + two;
//        System.out.println("one + two = " + sum);
//        return sum;
//    }
//    public static int sum (int one){
//        int sum = one;
//        System.out.println("one = " + sum);
//        return sum;
//    }
}
