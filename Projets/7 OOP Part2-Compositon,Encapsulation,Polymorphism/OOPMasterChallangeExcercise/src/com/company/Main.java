package com.company;

public class Main {

    public static void main(String[] args) {

        BaseBurger hamburger = new BaseBurger("Hamburger", "white","Beef",5.50);
        hamburger.fullPrice();
        hamburger.addition1("Lettuce");
        hamburger.addition2("Fasz");
        hamburger.addition3("Tomato");
        System.out.println("Hamburger full price is " + hamburger.fullPrice());

        HealthyBurger healthyBurger = new HealthyBurger("Beef", 6.50);
        healthyBurger.addition1("salad");
        healthyBurger.extraHealthy1("avocado");
        System.out.println("Healthy full price is  " + healthyBurger.fullPrice());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addition2("Salad");
        System.out.println("Deluxe ful price is " + deluxeBurger.fullPrice());



    }
}