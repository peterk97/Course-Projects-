package com.company;

import java.util.Calendar;

public class BaseBurger {

    private final double ALLADDITIONPRICE = 2.50;

    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private String add1Name;
    private String add2Name;
    private String add3Name;
    private String add4Name;

    //Constructor
    public BaseBurger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    //Additions
    public void addition1 (String name){
        this.add1Name = name;
    }
    public void addition2 (String name){
        this.add2Name = name;
    }
    public void addition3 (String name){
        this.add3Name = name;
    }
    public void addition4 (String name){
        this.add4Name = name;
    }

    //price count method
    public double fullPrice(){
        double hamPrice = this.price;
        System.out.println(this.name + " Hamburger in " + this.breadRollType + " Roll and " + this.meat + " is " + this.price);
        if (add1Name != null){
            System.out.println(add1Name + " added for " + ALLADDITIONPRICE );
            hamPrice +=ALLADDITIONPRICE;
        }
        if (add2Name != null){
            System.out.println(add2Name + " added for " + ALLADDITIONPRICE );
            hamPrice +=ALLADDITIONPRICE;
        }
        if (add3Name != null){
            System.out.println(add3Name + " added for " + ALLADDITIONPRICE );
            hamPrice +=ALLADDITIONPRICE;
        }
        if (add4Name != null){
            System.out.println(add4Name + " added for " + ALLADDITIONPRICE );
            hamPrice +=ALLADDITIONPRICE;
        }
        return hamPrice;
    }

}
