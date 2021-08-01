package com.peterkoncz;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction){
        this.name = name;
        this.transactions = new ArrayList<>();
        this.transactions.add(initialTransaction);
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Double> getTransactions(){
        return this.transactions;
    }

    public void addTransaction(double transaction){
        double availableFound = 0;
        for (Double t : this.transactions){
            availableFound += t;
        }
        if ((transaction < 0) && (availableFound < -(transaction))){
//                System.out.println("Transaction cannot be made ! " + this.name);
        }else {
            this.transactions.add(transaction);
//            System.out.println(transaction + " added to " + this.name);
        }
    }


//    @Override
//    public boolean equals(Object obj) {
//            if (this == obj){
//                return true;
//            }
//
//            if (!(obj instanceof Customer)){
//                return false;
//            }
//
//            String name = ((Customer)obj).getName();
//            return this.name.equals(name);
//    }
//
//
//    @Override
//    public String toString() {
//        return name;
//    }
}
