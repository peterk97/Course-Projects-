package com.chalange;

public class Main {

    public static void main(String[] args) {


        byte myByteNum = 10; // 6bits
        short myShortNum = 20;// 12 bits
        int myIntNum = 50; // 32 bits
        long myLongNum = 50_000L + 10L * (myByteNum + myShortNum + myIntNum); //64 bits

        System.out.println(myLongNum);

        short shortTotal = (short) (1000 + 10 * (myShortNum + myByteNum + myIntNum));
// because the int is the default type if you wold like to return a byte, short or long you must use (s, L, (byte))
    }
}
