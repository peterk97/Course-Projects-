package com.company;

public class HealthyBurger extends BaseBurger{
    private final double ALLADDITIONPRICE = 2.50;

        private String healthy1;
        private String healthy2;

        private double hPrice;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "Brown", meat, price);
    }

    //additionals

    public void extraHealthy1 (String name){
        this.healthy1 = name;
    }

    public void extraHealthy2 (String name){
        this.healthy2 = name;
    }

    //TotalPrice count;


    @Override
    public double fullPrice() {
        double hamPrice = super.fullPrice();

        if(healthy1 != null){
            System.out.println(healthy1 + " added on " + ALLADDITIONPRICE);
            hamPrice += ALLADDITIONPRICE;
        }
        if(healthy2 != null){
            System.out.println(healthy2 + " added on " + ALLADDITIONPRICE);
            hamPrice += ALLADDITIONPRICE;
        }
        return hamPrice;
    }
}
