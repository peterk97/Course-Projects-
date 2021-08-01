package com.learncoding;

public class Main {

    public static final String BORDR_MASSAGE = "--------------------------------------------------------------------------------";

    public static void main(String[] args) {

// Flour packer excerxie


        System.out.println(FlourPacker.canPack(1,0,4));
        System.out.println(FlourPacker.canPack(1,0,5));
        System.out.println(FlourPacker.canPack(0,5,4));
       System.out.println(FlourPacker.canPack(2,2,11));
        System.out.println(FlourPacker.canPack(-3,2,12));
        System.out.println(FlourPacker.canPack(2,1,5));

        System.out.println(BORDR_MASSAGE);

//  LArgest Prime factor

        //System.out.println(LargestPrime.getLargestPrime(21));
       // System.out.println(LargestPrime.getLargestPrime(217));
       // System.out.println(LargestPrime.getLargestPrime(0));
        System.out.println(LargestPrime.getLargestPrime(45));
       // System.out.println(LargestPrime.getLargestPrime(-1));


        System.out.println(BORDR_MASSAGE);


// Diagnol Star  !!

        DiagonalStar.printSquareStar(20);



    }
}
