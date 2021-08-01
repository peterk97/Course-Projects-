package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> money;
    private double currentMoney;


//constructor
    public Customer(String name,double money) {
        this.name = name;
        this.money = new ArrayList<Double>();
        addMoney(money);
       // this.currentMoney = 0;
    }

    public double getCurrentMoney() {
        return currentMoney;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getMoney() {
        return money;
    }

    public void setMoney(ArrayList<Double> money) {
        this.money = money;
    }

    public void addMoney(double money){
        this.money.add(money);
        this.currentMoney+=money;
    }

    public void withDraw(double money){
        if (money > this.currentMoney){
            System.out.println("Transaction denied !");
        }else {
            this.money.add(-(money));
            this.currentMoney -= money;
            System.out.println(money + " withdrawed from " + name);
        }
    }

}

