package com.learncoding;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

 //        if(score < 5000 && score >1000) {
//            System.out.println("This was was less than 5000 but greater than 1000");
//        } else if(score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//
//        }

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

//        boolean nwGameOver = true;  //one solution is to recreate all the variables
//        int newScore = 10000;       // here we can save the previous results but use more memory
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        if(gameOver) {
//            int finalScore = newScore + (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + finalScore);
//        }


        gameOver = true; //another solution is the just reasigne the already existing ones
        //this solution us the memory more efficiantly because we did not create new variables
        // but this case you cannot save the previous result and you duplicate code what is not recommended
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
