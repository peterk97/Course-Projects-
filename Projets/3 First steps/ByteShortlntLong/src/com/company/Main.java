package com.company;



public class Main {

    public static void main(String[] args) {


	int myValue = 10000;

	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Value = " + myMinIntValue);
        System.out.println("Integer Max Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));
        int myBigInt = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte Min value = " + myMinByteValue);
        System.out.println("Byte Max Value = " + myByteMaxValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Short Min value = " + myMinShortValue);
        System.out.println("Short Max Value = " + myShortMaxValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("Long Min value = " + myMinLongValue);
        System.out.println("Long Max Value = " + myLongMaxValue);
        long myBigLong = 2147483647234L;
        System.out.println(myBigLong);

        short bigShortLiteralNumber = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

    }
}
