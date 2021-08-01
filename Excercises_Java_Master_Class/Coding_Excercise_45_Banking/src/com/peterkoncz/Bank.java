package com.peterkoncz;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank (String name){
        this.name = name;
        this.branches = new ArrayList<>();
    }


    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.newCustomer(customerName,initialTransaction);
            }
        return false;
        }

        public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
            Branch branch = findBranch(branchName);
           if (branch != null){
               Customer customer = branch.findCustomer(customerName);
               if (customer != null){
                   customer.addTransaction(transaction);
                 //  System.out.println(transaction + " added to " + customer.getName() + " in branch " + branchName);
                   return true;
               }
           }
           // System.out.println(customerName + " or branch name " + branchName + " does not exist !");
           return false;
        }


        public boolean addBranch(String name){
            Branch branch = new Branch(name);
            if (findBranch(name) == null){
                branches.add(branch);
                //System.out.println(name + " branch added to " + this.name + " bank !");
                return true;
            }else{
               // System.out.println(name + " branch cannot be added to " + this.name + " bank !");
                return false;
            }
        }

//    public boolean addBranch(String name){
//       Branch branch = new Branch(name);
//       if (branches.contains(branch)){
//           System.out.println(name + " branch cannot be added !");
//           return false;
//       }else {
//           System.out.println(name + " branch added !");
//           return branches.add(branch);
//       }
//    }

    public boolean listCustomers(String branchName, boolean listTransactions){
         Branch branch = findBranch(branchName);
         if (branch != null){
             System.out.println("Customer details for branch " + branchName);
             if (listTransactions){
                     // finish this part of the code to print names and transactions based on the challenge
                 for (Customer c : branch.getCustomers()){
                     System.out.println("Customer: " + c.getName() + "[" + (branch.getCustomers().indexOf(c)+1) + "]");
                     System.out.println("Transactions");
                     for (double d : c.getTransactions()){
                         System.out.println("[" + (c.getTransactions().indexOf(d)+1) + "]" + " Amount " + d);
                     }
                 }

             }else {
                 for (Customer c : branch.getCustomers()){
                     System.out.println("Customer: " + c.getName() + "[" + (branch.getCustomers().indexOf(c)+1) + "]");
                 }
             }
             return true;
         }
         return false;
    }


    private Branch findBranch(String name){
        for (Branch branch : this.branches){
            if (branch.getName().equals(name)){
                return branch;
            }
        }
        return null;
    }




}







