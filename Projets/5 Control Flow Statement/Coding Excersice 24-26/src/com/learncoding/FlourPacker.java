package com.learncoding;

public class FlourPacker {

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        int five = bigCount * 5;
        int one = smallCount * 1;
        //System.out.println(five);
        //System.out.println(one);

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }else if (five + one < goal){
            return false;
        }else if (five + one == goal ){
            return true;
        }else if (five > goal){
            bigCount = bigCount -1;
            int sum = (bigCount * 5) + one;
            if (sum < goal){
                return false;
            }
        } return true;


    }
}
