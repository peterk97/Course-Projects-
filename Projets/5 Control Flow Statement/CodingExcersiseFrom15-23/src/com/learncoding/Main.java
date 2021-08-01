package com.learncoding;

import java.awt.event.PaintEvent;

public class Main {

    private static final String BORDER_MASSAGE = "*****************************************************************************";


    public static void main(String[] args) {
// Number palindrome
        System.out.println(NumberPalindrome.isPalindrome(7227));

        System.out.println(BORDER_MASSAGE);
// Sum First and last ..
        FirstLastDigitSum.sumFirstLastDigitSum(91235);
        FirstLastDigitSum.sumFirstLastDigitSum(0);
        FirstLastDigitSum.sumFirstLastDigitSum(10);

        System.out.println(BORDER_MASSAGE);
// Even Digit Numbers Sum ..
        EvenDigitSum.getEvnDigitSum(232347298);

        System.out.println(BORDER_MASSAGE);

        System.out.println(SharedDigit.hasSharedDigit(12,23));
       System.out.println(SharedDigit.hasSharedDigit(9,99));
       System.out.println(SharedDigit.hasSharedDigit(15,55));
       System.out.println(SharedDigit.hasSharedDigit(12,13));

        System.out.println(BORDER_MASSAGE);
// Last digit Checker

        System.out.println(LastDigitChecker.hasSameLastDigit(41,22,71));
        System.out.println(LastDigitChecker.hasSameLastDigit(23,32,42));
        System.out.println(LastDigitChecker.hasSameLastDigit(9,99,999));
        System.out.println(LastDigitChecker.hasSameLastDigit(42,100000,82));

        System.out.println(BORDER_MASSAGE);

 // Biggest common divisor

        GreatestCommonDivisor.getTheGreatestCommonDivisor( 25,15);
        GreatestCommonDivisor.getTheGreatestCommonDivisor(12, 30);

        System.out.println(BORDER_MASSAGE);

// Print Factors
        FactorPrinter.printFactors(6);
        FactorPrinter.printFactors(32);
        FactorPrinter.printFactors(10);
        FactorPrinter.printFactors(-1);

        System.out.println(BORDER_MASSAGE);
// Perfect number project

        PerfectNumber.isPerfctNumber(6);
        PerfectNumber.isPerfctNumber(28);
        PerfectNumber.isPerfctNumber(5);
        PerfectNumber.isPerfctNumber(-1);

        System.out.println(BORDER_MASSAGE);

// Number to Word (Hardest Shit)
       // NumberToWords.numberToWords(342);
        //NumberToWords.numberToWords(90000);
        //NumberToWords.numberToWords(1009);
        NumberToWords.numberToWords(1450);
       // NumberToWords.numberToWords(0);
       // NumberToWords.numberToWords(-222);

        System.out.println(BORDER_MASSAGE);


    }
}
