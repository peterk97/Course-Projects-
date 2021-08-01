package com.company;

import java.util.ArrayList;


class IntClass {//create an integer class is a lots of code !! use built in function!
    private int integer;

    public IntClass(int integer) {
        this.integer = integer;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }
}



public class Main {

    public static void main(String[] args) {
	// write your code here
        //a little array and arraylist recap
        int[] myIntArray = new int[10]; // int array
        String[] myStringArray = new String[10]; // String array

        ArrayList<String> myStringArrayList = new ArrayList<String>(); // String ArrayList
        myStringArrayList.add("Peti");
class IntClass {//create an integer class is a lots of code !! use built in function!
    private int integer;

    public IntClass(int integer) {
        this.integer = integer;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }
}
        //ArrayList<int> intArraylist = new ArrayList<int>();
        //this is cannot work because arrayList only can accept objects not primitive types!
        ArrayList<IntClass> intArraylist = new ArrayList<IntClass>();
        intArraylist.add(new IntClass(12)); // too long and messy solution !
        //built in classes !!
        Integer integer = new Integer(12);
        Double doubleValue = new Double(10.34);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i<=10; i++){
            intArrayList.add(Integer.valueOf(i));  // this is autoboxing to convert an int to an Integer
        }
        for (int i = 0; i<=10; i++){
            System.out.println(i + " --> " + intArrayList.get(i).intValue()); //this is unboxing to convert the Integer value back into an int !!
        }
        //shorter version to doing this becasue Java know this automatically and  do it on the background
         Integer myIntValue = 56;  //Integer.valueOf(56);
        int myInt = myIntValue; // myIntValue.getValue();

        //annother example for auto and unboxing !!
        ArrayList<Double> doubleList = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl+=0.5){
            doubleList.add(dbl);   //doubleList.add(Double.valueOf(dbl));
        }

        for (int i = 0; i<doubleList.size();i++){
            double value = doubleList.get(i);  //double value = doubleList.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }







    }
}
