package com.learncoding;

import jdk.jshell.execution.JdiInitiator;

public class NumberToWords {

    private static final String INVALID_V_MASSAGE = "Invalid Value";

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println(INVALID_V_MASSAGE);
           // number = number *(-1);
        }else if (number == 0){
            System.out.println("Zero");
        }
        int originalNumber = number;
        int newNumber = reverse(number);
        int reverse = 0;

       // System.out.println(getDigitCount(reverse(number)));



        while (newNumber != 0) {
            int lastDigit = newNumber % 10;
            // System.out.println(lastDigit);
            reverse = reverse * 10 + lastDigit;
            newNumber /= 10;



                switch (lastDigit) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    case 0:
                        System.out.println("Zero");
                    default:

                        break;
                }

            }
                        //System.out.println(reverse);
                        //System.out.println(originalNumber);
                         // System.out.println(getDigitCount(originalNumber));
                          //System.out.println(getDigitCount(reverse));

                    if (getDigitCount(reverse) != getDigitCount(originalNumber)){
                        int differnce = getDigitCount(originalNumber) - getDigitCount(reverse);

                            //System.out.println(differnce);

                        for (int i = 1; i <= differnce; i++){
                            System.out.println("Zero");
                        }
                    }
        }



    public static int reverse(int number) {

        int originalNumber = number;

        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
       //System.out.println(lastDigit);
            reverse = reverse * 10 + lastDigit;

            number /= 10;
        }


       // System.out.println(reverse);
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }else if (number == 0){
            return 1;
        }
        int digit = 0;
        while (number != 0) {
            digit +=1;
            number /= 10;
        }
       // System.out.println(digit);
        return digit;
    }
}