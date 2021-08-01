package com.peterkoncz;
import java.util.*;


/**
 * This project will show the time difference in-between Iterations technique
 * using for for-each Iterator and ListIterator
 */
public class Main {

    public static void main(String[] args) {
	// write your code here

        List<String> list = Arrays.asList(arrayGen());



        //for loop
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < list.size();i++){
            String temp = list.get(i);
        }

        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("For loop total time: " + totalTime + " ms");


        //Code inside the for each loop is an Iterator so almost the same
//        String tmp;
//        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); tmp = iterator.next()){}
        //For Each (Enhanced For loop)
        startTime = System.currentTimeMillis();

      for (String temp : list){
            //body
      }

      totalTime = System.currentTimeMillis() - startTime;
        System.out.println("For each Loop total time: " + totalTime + " ms");

        //Iterator
        startTime = System.currentTimeMillis();

        for (Iterator<String> iterator = list.iterator(); iterator.hasNext();){
            String temp =  iterator.next();
        }

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("Iterator total time: " + totalTime + " ms");



        //List Iterator
        startTime = System.currentTimeMillis();

        for(ListIterator<String> listIterator = list.listIterator(); listIterator.hasNext();){
            String temp = listIterator.next();
        }

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("List Iterator total time: " + totalTime + " ms");



    }


    public static String[] arrayGen( ){
        String[] array = new String[10_000_000];

        for(int i = 0; i < array.length;i++){

            array[i] = "array" + i;
        }
        return array;
    }



}


