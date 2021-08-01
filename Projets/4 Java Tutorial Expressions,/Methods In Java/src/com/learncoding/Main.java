package com.learncoding;

public class Main {

    public static void main(String[] args) { //this code will execute the main like see the variables then we called the method so it will jump down execute the method
        boolean gameOver = true;             // then it will continue read the code in main from up to down
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus); //we assigned the method for an int data type and after we print that "highScore" this is the reason why we don't need the sout int the method!
        System.out.println("Your final score is " + highScore);
      //  calculateScore(gameOver, score, levelCompleted, bonus); // use the previous variables just pass the names in
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(true, 10000, 8, 200);//we assigned the method for an int data type and after we print that "highScore" this is the reason why we don't need the sout int the method!
        System.out.println("your final score is " + highScore);
      //  calculateScore(true, 10000, 8, 200);  //don't use the variables because we defined the values in the brace



//challenge in main --------------------------------------------------------------------------------------------------------------------------------------------------------------
        int highScorePosition = calculateHighScroePosition(1500);
        displayHighScorePosition("Peter",highScorePosition);

        highScorePosition = calculateHighScroePosition(900);
        displayHighScorePosition("Steph",highScorePosition);

        highScorePosition = calculateHighScroePosition(400);
        displayHighScorePosition("Andras",highScorePosition);

        highScorePosition = calculateHighScroePosition(50);
        displayHighScorePosition("Marcell",highScorePosition);

        highScorePosition = calculateHighScroePosition(1000);
        displayHighScorePosition("Anna",highScorePosition);

        highScorePosition = calculateHighScroePosition(500);
        displayHighScorePosition("Josephina",highScorePosition);

        highScorePosition = calculateHighScroePosition(100);
        displayHighScorePosition("Ciganygyerek",highScorePosition);

        highScorePosition = calculateHighScroePosition(100);
        displayHighScorePosition("Daniel",highScorePosition);
        // ---------------------------------------------------------------------------------------------------------------------------------------------------------

    }
//  This dos not return value!  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {
//
//        if(gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//            System.out.println("Your final score was " + finalScore);
//        } if don't want to return any value in th code use (void) key word



// This is returns a value and this is a shortest way to use it -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    // if we want our method to return value into the code we can send back the result to the code when we called the method
    // we have to use data type instead the (void) define (int or whatever) and tell to return value !!!
    //in this case we want to send back an (int) what to final score was to use back in the method !

    // methods cannot be on the main because main is a method as wel!
    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) { //give the data types and names
        if(gameOver) {                                              //add statement to the method
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
                                         //   System.out.println("Your final score was " + finalScore); we don't neccarily need this !!
            return finalScore; //true
        }
        return -1; // else return this(false) (the -1 is just a sign for bad value or false value )
    }

// This returns a value if true and if false -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//    if(gameOver) {                                              this is an another way to return !!!
//        int finalScore = score + (levelCompleted * bonus);
//        finalScore += 2000;
//        System.out.println("Your final score was " + finalScore);
//        return finalScore; //true
//    } else{                                         difference  (else)  !!!!!
//         return -1;
//      }


//challange-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name +  " mananged to got into position " + position + " on the igh score table.");
    }

    public static int calculateHighScroePosition(int playerScore) {
//        if (playerScore >= 1000) {
//             return 1;
//        }else if (playerScore >= 500){
//            return 2;
//        }else if (playerScore >= 100){
//            return 3;
//        }
//        return 4
 // Othere solution without too much return use just one  !!!
        int position = 4;  // assuming position 4 will be returned

        if(playerScore >= 1000){ // it will go and check every if and if else, and if all false it will return the already defined 4!
            position = 1;
        }else if(playerScore >= 500){
            position = 2;
        }else if(playerScore >= 100){
            position = 3;
        }
        return position; // if all false this will return
    }


}
