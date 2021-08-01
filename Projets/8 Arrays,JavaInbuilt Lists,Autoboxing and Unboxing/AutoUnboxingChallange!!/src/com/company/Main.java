package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
      //  Branch branch = new Branch();


        Bank bank = new Bank();
        bank.createBranch(new Branch());
        bank.createBranch(new Branch());
        bank.createBranch(new Branch());

     //   bank.list();


       bank.addCustomer(1,"Marci",500);
       bank.addCustomer(2,"Peti",500);
       bank.addCustomer(2,"Steph",600);
      // bank.listCustomers(1);
      //bank.listCustomers(2);

        bank.addMoney(1,"Marci",500);
        bank.withdraw(2,"Steph", 55);

        bank.removeCustomer(2,"Peti");
        bank.listCustomers(2);


        bank.addCustomer(3,"Juli", 90000);
        bank.listCustomers(3);

      // bank.addprivateCustomer(1,"Peti");
      // bank.listCustomers(1);

//        bank.addCustomer(2,"Andris");
//        bank.addCustomer(2,"Steph");

        //bank.listCustomers(2);
       // bank.findCustomer(1,"Marci");
        //bank.findCustomer(2,"Steph");
        //bank.listCustomers(2);
//        bank.removeCustomer(2,"Andris");
//        bank.listCustomers(2);
//        bank.addMoney(1,"Marci",1500);
//        bank.withdraw(1,"Marci",200);
//        bank.findCustomer(1,"Marci");
//        bank.findCustomer(1,"Peti");

    }
}
