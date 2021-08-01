package com.learncoding;

public class Main {

    public static void main(String[] args) {
//Speed Convert

        SpeedConverter.printCorvesion(11.57);
        SpeedConverter.printCorvesion(130);
        SpeedConverter.printCorvesion(80);
        SpeedConverter.printCorvesion(-1);


//Mega byte converter
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        MegaBytesConverter.printMegaBytesAndKiloBytes(2236);

// is the dog barking ?
        System.out.println("Is the dog Barking ?" + BarkingDog.shouldWakeUp(true, 5));
        System.out.println("Is the dog Barking ?" + BarkingDog.shouldWakeUp(true, -1));

//Is the year LeapYear?
        System.out.println("Is the year LeapYear " + LeapYear.isLeapYear(2017));
        System.out.println("Is the year LeapYear " + LeapYear.isLeapYear(2000));
        System.out.println("Is the year LeapYear " + LeapYear.isLeapYear(2004));


//Decimal !!

        System.out.println("If the first three decimal is the same " + DecimalComparator.areEqualByThreeDeacimalPlacs(-1.12345, -1.12367));
        System.out.println("If the first three decimal is the same " + DecimalComparator.areEqualByThreeDeacimalPlacs(-1.12345, -1.32367));

 // Checker  Equal sum !!
        System.out.println("Equal Sum checker " + EqualSumChecker.haseQualSum(0,1,1));
        System.out.println("Equal Sum checker " + EqualSumChecker.haseQualSum(1,1,1));

// Teen Number checker !
        System.out.println("Has teen " + TeenNumberChecker.hasTeen(22,23,34));
        System.out.println("Has teen " + TeenNumberChecker.hasTeen(9,99,19));
        System.out.println("Has teen " + TeenNumberChecker.hasTeen(23,15,42));
        System.out.println("Has teen " + TeenNumberChecker.hasTeen(23,24,16));

        System.out.println("Is teen " + TeenNumberChecker.isTeen(13));
        System.out.println("Is teen " + TeenNumberChecker.isTeen(16));
        System.out.println("Is teen " + TeenNumberChecker.isTeen(123));

    }
}
