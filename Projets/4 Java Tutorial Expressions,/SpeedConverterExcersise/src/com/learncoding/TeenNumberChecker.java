package com.learncoding;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class TeenNumberChecker {

    public static boolean hasTeen(int one, int two, int three) {
        if (one >= 13 && one <= 19) {
            return true;
        } else if (two >= 13 && two <= 19) {
            return true;
        }else if (three >= 13 && three <= 19){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int one){
        if (one >= 13 && one <= 19){
            return true;
        }
        return false;
    }
}


