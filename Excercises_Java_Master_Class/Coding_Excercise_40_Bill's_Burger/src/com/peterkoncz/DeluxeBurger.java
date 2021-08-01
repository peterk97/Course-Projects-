package com.peterkoncz;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe Burger", "Beef", 19.10, "White Bread");
       super.addHamburgerAddition1("Drink",0);
       super.addHamburgerAddition2("Chips",0);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No additional items can be added to the Deluxe Burger !");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No additional items can be added to the Deluxe Burger !");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No additional items can be added to the Deluxe Burger !");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No additional items can be added to the Deluxe Burger !");
    }

    //This method is not part of the solution this is only for debugging purpose !
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "ADD : {Drink : Chips}";
    }


}
