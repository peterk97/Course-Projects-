package com.learncoding;

public class VipCustomer {
    private String name;
    private String email;
    private double creditLimit;

    public VipCustomer() {
        this("default name", "default email", 50000);
    }

    public VipCustomer(String name, double creditLimit) {
        this(name,"unknown@email", creditLimit);
    }

    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
