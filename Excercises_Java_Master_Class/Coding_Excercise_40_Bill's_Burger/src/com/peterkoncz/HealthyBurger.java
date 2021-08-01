package com.peterkoncz;

public class HealthyBurger extends Hamburger{

   private String healthyExtra1Name;
   private double healthyExtra1Price;

   private String healthyExtra2Name;
   private double healthyExtra2Price;



    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat , price, "Healthy Roll");
    }


    public void addHealthyAddition1(String name, double price){
            this.healthyExtra1Name = name;
            this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
            this.healthyExtra2Name = name;
            this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hPrice = super.itemizeHamburger();

        if (healthyExtra1Name != null){
           hPrice += this.healthyExtra1Price;
        }

        if (healthyExtra2Name != null){
            hPrice += this.healthyExtra2Price;
        }

        System.out.println(toString());
        return hPrice;
    }


}