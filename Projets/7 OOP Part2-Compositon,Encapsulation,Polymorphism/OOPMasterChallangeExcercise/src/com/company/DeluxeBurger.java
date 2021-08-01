package com.company;

public class DeluxeBurger  extends BaseBurger{

    public DeluxeBurger() {
        super("Deluxe Burger","White", "bacon and susage", 14.90);
        super.addition1("Drink");
        super.addition2("Chips");
    }

    //Prevent to be able to add more additional items with overriding methods

    @Override
    public void addition1(String name) {
        System.out.println("Item cannot be added to a Deluxe Burger");
    }

    @Override
    public void addition2(String name) {
        System.out.println("Item cannot be added to a Deluxe Burger");
    }

    @Override
    public void addition3(String name) {
        System.out.println("Item cannot be added to a Deluxe Burger");
    }

    @Override
    public void addition4(String name) {
        System.out.println("Item cannot be added to a Deluxe Burger");
    }
}
