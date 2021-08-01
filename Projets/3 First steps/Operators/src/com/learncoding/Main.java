package com.learncoding;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;  // 1 + 2 = 3
        System.out.println("Result is " + result);
        int previousResult = result;
        System.out.println("Previous result = " + previousResult);
        result = result - 1;  // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous result = " + previousResult);

        result = result * 10;  // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;  //  20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;  // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        result++; //   1 + 1 = 2
        System.out.println("1 + 1 = " +result);

        result--; // 2 - 1 + 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2
        result += 2;
        System.out.println("1 + 2 = " + result);

        //result = result * 10
        result *= 10;
        System.out.println("3 * 10 = " + result);

        //result = reslt  / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);


        //  if than statement !!
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("Alien is exist !");
            System.out.println("And i'am scared of aliens");
        }

        // if statement with integer
        int topScore = 80;
        if(topScore < 100) {
            System.out.println("you got the high score!");
        }
        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100){ // and opertator
            System.out.println("secondTopScore is less than top score and top score is less than 200 ");
        }
            if ((topScore > 90) || (secondTopScore <= 90)) {  // or operator
                System.out.println("Either or both of the conditions are true!");

            }
                // equals operator ==
                int newValue = 50;
                if (newValue == 50){
                    System.out.println("This is true");
                }
                boolean isCar = false;
                if(!isCar){
                    System.out.println("This is not a new car"); // false (false, !isCar, isCar !=,)  true(true, isCar, ==)
                }

                isCar = true;// because we reset the isCar value to true the if statement is true so it prints!
                boolean wasCar = (isCar == true) ? true : false; //Ternary operator wasCar is true if is car true if not then wasCar is false!
                if(wasCar){
                    System.out.println("wasCar is true");
                }


                // Operator challange !!!!
        double chalangeFirstValue = 20;
        double ChalangeSecondValue = 80;
        double chalangeSum = (chalangeFirstValue + ChalangeSecondValue) * 100;
        double projectResult = (chalangeSum % 40);
        System.out.println("The result on step 4 is " + projectResult);
        boolean ifTrue = (projectResult == 0) ? true : false;
        if (ifTrue != true){
            System.out.println("Got some reminder");
        }





    }
}
