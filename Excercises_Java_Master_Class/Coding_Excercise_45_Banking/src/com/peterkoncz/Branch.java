package com.peterkoncz;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public boolean newCustomer(String name, double initialTransaction){
        Customer customer = new Customer(name, initialTransaction);
        if (findCustomer(name) == null){
            customers.add(customer);
           // System.out.println(name + " added to " + this.name + " branch !");
            return true;
        }else {
           // System.out.println(name + " cannot be added to " + this.name + " branch !");
            return false;
        }
    }

//    public boolean newCustomer(String name, double initialTransaction){
//        Customer customer = new Customer(name, initialTransaction);
//        if (customers.contains(customer)){
//            System.out.println(name + " cannot be added");
//            return false;
//        }
//        System.out.println(name + " added!");
//        customers.add(customer);
//        return true;
//    }

    public boolean addCustomerTransaction(String name, double transaction){
        Customer customer = findCustomer(name);
        if (customer != null){
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    public Customer findCustomer(String name){
        for (Customer customer : customers){
            if (customer.getName().equals(name)){
                return customer;
            }
        }
        return null;
    }


//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj){
//            return true;
//        }
//        if (!(obj instanceof Branch)){
//            return false;
//        }
//        return this.name.equals(((Branch)obj).getName());
//    }


//    @Override
//    public String toString() {
//        return this.name + " " + this.customers;
//    }
}
