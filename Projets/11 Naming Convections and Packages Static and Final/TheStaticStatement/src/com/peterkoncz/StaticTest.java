package com.peterkoncz;

public class StaticTest {
    //private int numInstances = 0;
    private static int numInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

//    public int getNumInstances() {
//        return numInstances;
//    }
    // make more secence if you use a static method for a static variable
    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
