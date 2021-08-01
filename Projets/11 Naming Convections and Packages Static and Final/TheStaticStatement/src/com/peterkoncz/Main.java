package com.peterkoncz;

/**
 * What static is and why we have to use it ?
 * when you use static it means it is associated with the class and not with the instances
 *  so there is just one variable on memory and all the instances share only that one variable
 */
public class Main {

    //public  int multiplier = 7;
    public static int multiplier = 7;

    public static void main(String[] args) {
	// write your code here

        //when we do this both of the NumInstances will be only 1 because they are not sharing these fields
        //both have their own so it becomes from 0 to 1
        //but when you use static it is going to keep incrementing
        StaticTest firstInstance = new StaticTest("1. Instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2. Instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("3. Instance");
        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        //java com.peterkoncz.Main this is how you would run ti in the command line

//another example of the static and non - static relation
        //normal class fields require an instance of the class
       //they not existing till they are not created
        //java cannot allow a static method to access non-static fields or methods
        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);

    }


//    public int  multiply (int num){
//        return num * multiplier;
//    }
    public static int  multiply (int num){
        return num * multiplier;
    }

}
