package com.learncoding;

public class PlayingCat {

    public static boolean isCatPlaying (boolean summer, int temperature ){
        if ( summer && (temperature < 25 || temperature > 45)){
            return false;
        }else if (!summer && (temperature < 25 || temperature > 35)){
            return false;
        }
        return true;
    }

}
