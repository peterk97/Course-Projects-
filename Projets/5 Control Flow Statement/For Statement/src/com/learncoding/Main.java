package com.learncoding;

public class Main {

    public static void main(String[] args) {

        System.out.println("100 at 2% interest = " + calculatenterest(10000,2));
        System.out.println("100 at 3% interest = " + calculatenterest(10000,3));
        System.out.println("100 at 4% interest = " + calculatenterest(10000,4));
        System.out.println("100 at 5% interest = " + calculatenterest(10000,5));

        for(int i = 0; i<5; i++){
            System.out.println("Loop " + i + " hello" );
        }

// challange is how to dol the calculate interst method with loop?
        for (int i=2; i<9; i++){
            System.out.println("10 000 at " + i + "% interest is " + String.format("%.2f", calculatenterest(10000, i)));
        }


        System.out.println("************************************************************************************");
// how to modify from 8% to 2%

        for (int i=8; i>=2; i--) {
            System.out.println("10 000 at " + i + "% interest is " + String.format("%.2f", calculatenterest(10000, i)));
        }


 //       is prime challange
        int count = 0;
        for (int i = 10; i<=50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3){
                    System.out.println("exiting for loop");
                    break;
                }
            }
        }

    }

    public static double calculatenterest (double amounth, double interstRate){
        return (amounth * (interstRate / 100));
    }



    //is prime challange

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
                         //Math.sqrt(n)      so much faster less loop
        }                //n/2
        for(int i=2; i<=Math.sqrt(n); i++){
            System.out.println("Looping" +i);
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
