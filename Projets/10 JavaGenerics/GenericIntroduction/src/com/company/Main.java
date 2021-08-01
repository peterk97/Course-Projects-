package com.company;

import java.util.ArrayList;

/**
 * this project is about the java generics
 * this is an introduction why do and how do we use the java generics
 * use type parameters (is different from other parameters)
 * this is going to demonstrate it with an arrayList without then with generics
 * (also going to use auto boxing automatically)
 */
public class Main {

    public static void main(String[] args) {

        /*
         * this arrayList is not using generics
         * there is not specified what kind of objects the arrayList is going to hold
         * so when we add the string it is no indication of anything is going to go bad
         * but when we run this this is going to be a runtime error because we added and invalid member
         *
         * The problem is this problem is not showing up until runtime
         * we have some potential warnings but that is it
         *
         * Before in Java 1.5 this was the only way to write it and there were no generics
         * when you write new code you should not not use this raw type  because when your program is getting a lot
         * more complex it is getting more harder to tracking this things
         *
         *
         */

       ArrayList items = new ArrayList();//this arrayList is a raw type!!
        items.add(1);
        items.add(2);
        items.add(3);
       // items.add("marcell");//so this is valid to add a string type
        items.add(4);
        items.add(5);

        printDoubled(items);


        System.out.println("-------------------------------------------------------------");

        /*THIS IS AN ARRAYLIST USING GENERICS
        * so here there is specified what kind of data type is going to go into the ArrayList
        * and if try to add a not appropriate type it is going to appear as an error so you can correct it!!
        *
        * adding a type at the 2. Arraylist<brackets> is not needed because we already know it is an Integer
        * (you can do it but not needed!) and this is the best way to writing the code !
        * (using ArrayList<> without any parameter called diamond)
        * */
        ArrayList<Integer> itemsWithGenerics = new ArrayList<>();
        itemsWithGenerics.add(1);
        itemsWithGenerics.add(2);
        itemsWithGenerics.add(3);
        //itemsWithGenerics.add("marcell"); // this is not valid anymore
        itemsWithGenerics.add(4);
        itemsWithGenerics.add(5);

        printDoubledWithGenerics(itemsWithGenerics);



    }

    /**
   This method is responsible to print out the members of the arrayList and
     this is not using generics!
     */
    private static void printDoubled(ArrayList n) {
        for (Object i : n) { //the type is an Object so it is can be anything
            System.out.println((Integer) i * 2);//here also have to use casting to Integer type
        }
    }


    /**
     * this method is using the generics as well
     * so you don't have to cast to Integer because it is already known
     * @param n
     */
        private static void printDoubledWithGenerics(ArrayList<Integer> n) { //here
            for (int i : n) { //here (can be an Integer or just int and java handles it automatically)
                System.out.println(i * 2);
            }
        }
}
