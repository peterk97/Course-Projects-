package com.peterkoncz;

public class Hamburger {

   private String name;
   private String meat;
   private String breadRollType;
   private double price;

    public double getPrice() {
        return price;
    }

   private String addition1Name;
   private double addition1Price;

   private String addition2Name;
   private double addition2Price;

   private String addition3Name;
   private double addition3Price;

   private String addition4Name;
   private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }


    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }


    public double itemizeHamburger(){
        double temp = this.price;
        if (addition1Name != null){
            temp += addition1Price;
        }
        if (addition2Name != null){
            temp += addition2Price;
        }

        if (addition3Name != null){
            temp += addition3Price;
        }

        if (addition4Name != null){
            temp += addition4Price;
        }
        System.out.println(toString());
        return temp;
    }

//This method is not included in the real solution it is just for debugging purpose
    @Override
    public String toString() {
        return "{" + this.name + " : " + this.meat + " : " + this.breadRollType + "} " + this.price + "$";
    }
}
