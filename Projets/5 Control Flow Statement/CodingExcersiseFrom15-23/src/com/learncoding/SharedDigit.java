package com.learncoding;

public class SharedDigit {
    public static boolean hasSharedDigit(int numOne, int numTwo){
        if ((numOne < 10 || numOne > 99) || (numTwo < 10 || numTwo > 99)){
            return false;
        }

        int firstNumberSecundDigit = numOne;
        int secundNumberSecundDigit = numTwo;

        int firstNumberFirstDigit = 0;
       while (numOne > 0){
       firstNumberFirstDigit = numOne % 10;
        numOne /= 10;
       }

        int secundNumberFirstDigit = 0;
        while(numTwo > 0){
            secundNumberFirstDigit = numTwo % 10;
            numTwo /= 10;
        }

       // System.out.println(firstNumberFirstDigit);
       // System.out.println(secundNumberFirstDigit);

        for(int i = 0; i<1; i++ ){
        firstNumberSecundDigit = firstNumberSecundDigit % 10;
        }

        for(int i = 0; i<1; i++ ){
          secundNumberSecundDigit  = secundNumberSecundDigit % 10;
        }
       // System.out.println(firstNumberSecundDigit);
       // System.out.println(secundNumberSecundDigit);

        return firstNumberFirstDigit == secundNumberFirstDigit || firstNumberSecundDigit == secundNumberSecundDigit || firstNumberFirstDigit == secundNumberSecundDigit || firstNumberSecundDigit == secundNumberFirstDigit;
    }

}
