package com.peterkoncz;

/**
 * This is a Coding exercise from java Master class 44 Banking
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
      Bank bank = new Bank("National Australian Bank");

      bank.addBranch("Adelaide");

      bank.addCustomer("Adelaide","Tim",50.05);
      bank.addCustomer("Adelaide","Mike",175.34);
      bank.addCustomer("Adelaide","Percy",220.12);

     bank.addCustomerTransaction("Adelaide","Tim",44.22);
     bank.addCustomerTransaction("Adelaide","Tim",12.44);
     bank.addCustomerTransaction("Adelaide","Mike",1.65);

      bank.addCustomerTransaction("Adelaide","Mike",-173);

      bank.listCustomers("Adelaide",true);
      bank.listCustomers("Adelaide",false);












    }
}
