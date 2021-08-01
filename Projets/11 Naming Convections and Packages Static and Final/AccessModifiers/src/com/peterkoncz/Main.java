package com.peterkoncz;


/**
 * This project is about the access modifiers
 * and it is demonstrate it with a bank account example
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Account petersAccount = new Account("Peter");
        petersAccount.deposit(1000);
        petersAccount.withdraw(500);
        petersAccount.withdraw(-12);
        petersAccount.deposit(-12);
        petersAccount.calculateBalance();


        //if you expose fields is always bad because anyone can modify them directly
        //all you need to do is change the fields to private
//        petersAccount.balance = 5000;
//        petersAccount.transaction.add(4500);

        petersAccount.calculateBalance();
    }
}
