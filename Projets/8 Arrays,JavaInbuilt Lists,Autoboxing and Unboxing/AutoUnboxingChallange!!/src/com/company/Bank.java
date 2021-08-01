package com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;

 //constructor
    public Bank() {
        this.branches = new ArrayList<Branch>();
    }
//getter
    public ArrayList<Branch> getBranches() {
        return branches;
    }

    //Create branches!
    public boolean createBranch (Branch branch){
        branches.add(branch);
        System.out.println("Branch Added !");
        return true;
    }


//Find
    private int find (Branch branch){
        return branches.indexOf(branch);
    }

    public void findCustomer (int branch,String name){
        branches.get(branch-1).findCustomer(name);
    }

//count branches
    private int count (){
        int num = 0;
        for (int i = 0; i < branches.size();i++){
           // System.out.println(branches.get(i));
            num++;
        }
        return num;
    }

// if (branch <= count()) {
//        branches.get(branch - 1).addCustomer(new Customer(name, money));
//    }

   public void addCustomer (int branch, String name,double money){
        if (branch > count() || branch == 0) {
            System.out.println("Branch not found!");
        }else{
            branches.get(branch - 1).addCustomer(new Customer(name, money));
        }
   }

   public void removeCustomer (int branch, String name){
       if (branch > count() || branch == 0) {
           System.out.println("Branch not found!");
       }else {
           branches.get(branch - 1).remove(name);
       }
   }

    public void listCustomers(int branch){
        if (branch > count() || branch == 0) {
            System.out.println("Branch not found!");
        }else {
            getBranches().get(branch - 1).printList();
        }
    }

// find branch



//customer things
    public void addMoney (int branch, String name, double ammounth){
        if (branch > count() || branch == 0) {
            System.out.println("Branch not found!");
        }else {
            branches.get(branch - 1).addMoney(name, ammounth);
        }
    }

    public void withdraw (int branch, String name, double ammounth) {
        if (branch > count() || branch == 0) {
            System.out.println("Branch not found!");
        }else {
            branches.get(branch - 1).withdraw(name, ammounth);
        }
    }


 }





