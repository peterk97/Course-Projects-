package com.peterkoncz;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/**
 * THis is The Java master class Coding Exercise 40 from section 7 (OOP part2) Bill's Burger
 * this challenge puts together the concepts were learned during this section
 * Composition, Encapsulation, Polymorphism !
 */
public class Main {

    public static void main(String[] args) {
	// write your code here

        Hamburger hamburger = new Hamburger("Hamburger","Beef",11.50,"White");
        System.out.println(hamburger.itemizeHamburger());

        hamburger.addHamburgerAddition1("tomato",0.5);
        hamburger.addHamburgerAddition2("lettuce",0.8);
        hamburger.addHamburgerAddition3("cheese",1.9);
        hamburger.addHamburgerAddition4("cucumber",1);



        System.out.println(hamburger.itemizeHamburger());
        System.out.println();



        Hamburger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("tomato",2);
        deluxeBurger.addHamburgerAddition2("tomato",2);
        deluxeBurger.addHamburgerAddition3("tomato",2);
        deluxeBurger.addHamburgerAddition4("tomato",2);

        System.out.println(deluxeBurger.itemizeHamburger());
        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("Chicken",16);
        healthyBurger.addHamburgerAddition1("tomato",2.3);
        healthyBurger.addHealthyAddition1("healthy1",0.5);
        healthyBurger.addHealthyAddition2("healthy2",0.5);
        System.out.println(healthyBurger.itemizeHamburger());




    }

}

 


