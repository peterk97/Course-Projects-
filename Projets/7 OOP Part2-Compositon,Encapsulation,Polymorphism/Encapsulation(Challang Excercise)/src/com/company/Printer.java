package com.company;

public class Printer {
    //Fields of the printer//
    private String name;
    private String model;

    private int tonerLevel = 100;

    private boolean duplexMode;
    private int numberOfPages;


    //Constructor//
    public Printer(String name, String model,int tonerLevel) {
        this.name = name;
        this.model = model;

        if (tonerLevel >=0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }

        this.duplexMode = false;
        this.numberOfPages = 0;
    }



    //Methods//
    public void isDuplexOn (boolean pickMode){
        if(pickMode){
            System.out.println("The Duplex mode is on!");
            this.duplexMode = true;
        }else{
            System.out.println("The Duplex mode is off!");
            this.duplexMode = false;
        }
    }

    public void tonerFiller (int toner) {
        if (this.tonerLevel >= 100) {
            System.out.println("Toner lvl is full");
        } else if (this.tonerLevel + toner > 100) {
            System.out.println("you must not put this much toner in the machine!");
            System.out.println("Current lvl: " + this.tonerLevel);
            System.out.println("Maximum amount to accept is: " + (100 - this.tonerLevel));
        } else {
            this.tonerLevel += toner;
            System.out.println("Toner is filled up to: " + this.tonerLevel + "%");
        }
    }

    public void printPages (int pages){

        if (this.duplexMode) {
            if ((pages*4 > 100)){
                System.out.println("You are not allowed to print this much pages!");
                System.out.println("maximum capacity with this this much toner is " + (this.tonerLevel/4) + " pages");
            }else {

                this.tonerLevel -= (pages * 4);
                if (this.tonerLevel < 4) {
                    System.out.println("Toner lvl is to low! You must refill toner!");
                } else {
                    this.numberOfPages += (pages*2);
                    System.out.println("Printed: " + (this.numberOfPages*2) + " pages");
                    this.numberOfPages = 0;
                }
            }
        }else{
        if ((pages*2 > 100)){
            System.out.println("You are not allowed to print this much pages!");
            System.out.println("maximum capacity with this this much toner is " + (this.tonerLevel/2) + " pages");
        }else {

            this.tonerLevel -= (pages * 2);
            if (this.tonerLevel < 2) {
                System.out.println("Toner lvl is to low! You must refill toner!");
            } else {
                this.numberOfPages += pages;
                System.out.println("Printed: " + this.numberOfPages + " pages");
                this.numberOfPages = 0;
            }
        }
        }
    }

    //Getters//
    public int getTonerLevel() {
        if (this.tonerLevel < 0) {
            System.out.println("Toner is empty!");
            return tonerLevel;
        } else {
            System.out.println("Toner lvl is on: " + this.tonerLevel + "%");
            return tonerLevel;
        }
    }
//    public int getNumberOfPages() {
//        return numberOfPages;
//    }
}