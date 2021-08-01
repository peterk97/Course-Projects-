package com.peterkoncz;

import java.util.ArrayList;

public class Account {
    private int balance;
    private String name;
    private ArrayList<Integer> transaction;

    public Account(String name){
        this.name = name;
        this.balance = 0;
        this.transaction = new ArrayList<Integer>();
    }

    public int getBalance(){
        return this.balance;
    }


    @Override
    public String toString() {
        return "Account{" +
                "transaction=" + transaction +
                '}';
    }

    public void deposit(int amount){
        if (amount > 0){
            transaction.add(amount);
            this.balance+=amount;
            System.out.println("Deposited " + amount + "$ in your account, your balance is: " + this.balance);
        }else {
            System.out.println("Cannot deposit negative numbers!");
        }
    }

    public void withdraw (int amount) {
        int withD = -amount;
        if (amount > 0) {
            this.transaction.add(withD);
            this.balance += withD;
            System.out.println("Withdraw " + withD + "$ from your account, your balance is: " + this.balance);
        }else {
            System.out.println("Cannot withdraw negative numbers!");
        }
    }

  public void calculateBalance (){
        this.balance = 0;
        for (int i : this.transaction){
            this.balance+= i;
        }
      System.out.println("Calculated balance is " + this.balance);
  }



}
