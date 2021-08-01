package com.company;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;

//constructor
    public Branch() {
        this.customers = new ArrayList<Customer>();
    }
//getter
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
//add
    public boolean addCustomer (Customer customer){
            if (find(customer.getName())>=0){
                System.out.println("Already on file!");
                return false;
            }else {
                customers.add(customer);
                System.out.println(customer.getName() + " Customer added!");
                return true;
            }
        }
 //remove
        public boolean remove (String name){
            if (find(name) >= 0){
                customers.remove(find(name));
                System.out.println(name + " removed!");
                return true;
            }else{
                System.out.println("Customer could not find!");
                return false;
            }
        }

 //find
        private int find (Customer customer){
        return this.customers.indexOf(customer);
        }

        private int find (String name){
           for (int i = 0; i< customers.size(); i++){
               if (customers.get(i).getName().equals(name)){
                   return i;

               }
           }
            return -1;
        }


        public boolean findCustomer (String name){
          if (find(name) >= 0){
              System.out.println(customers.get(find(name)).getName() +  " found!");
              System.out.println("Current balance: " + customers.get(find(name)).getCurrentMoney());
              System.out.println("Account record: " + customers.get(find(name)).getMoney());
              return true;
          }else{
              System.out.println(name + " customer cannot find !");
              return false;
          }
        }


//print methods
        public void printList (){
          for (int i = 0; i< customers.size(); i++){
              System.out.println("Account Name: " + customers.get(i).getName());
              System.out.println("Balance: " + customers.get(i).getCurrentMoney() + "$");
          }

        }
    private void printBalanceRecord (String name){
        if (find(name)>=0) {
            System.out.println(name + "'s balance record is :" + getCustomers().get(find(name)).getMoney());
        }else {
            System.out.println("Customer cannot find!");
        }
    }


 //customer things to do

    public void addMoney (String name,double money){
        if (find(name) >=0 ){
            customers.get(find(name)).addMoney(money);
            System.out.println(money + " added to " + name + "'s account!");
        }else{
            System.out.println("Customer cannot find!");
        }
    }

    public void withdraw (String name, double money){
        if (find(name) >= 0){
            customers.get(find(name)).withDraw(money);
        }else {
            System.out.println("Customer cannot find!");
        }
    }


}
