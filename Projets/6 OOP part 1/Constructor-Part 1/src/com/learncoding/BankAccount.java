package com.learncoding;



public class BankAccount {
    private final String currency = " $";
    private String name;
    private String email;
    private String pNumber;
    private double balance;

    public BankAccount (){
        this("Default name", "Default email" , "Default Pn", 0);
        System.out.println("Empty constructor called");
    }
    public BankAccount(String name, String email, String pNumber, double balance){
        System.out.println("Account constructor with parameters called");
        this.name = name;
        this.email = email;
        this.pNumber = pNumber;
        this.balance = balance;
    }

    public BankAccount(String name, String email) {
       this(name, email,"default Pn", 0);
    }

    // Set methods !
    public void setName (String name){
        this.name = name;
    }
    public void setEmail (String email){
        this.email = email;
    }
    public void setpNumber (String pNumber){
        this.pNumber = pNumber;
    }
    public void setBalance (double balance){
        this.balance = balance;
    }

    //Get methods !
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getpNumber(){
        return pNumber;
    }
    public double getBalance(){
        return balance;
    }


    //deposit and withdraw
    public void deposit (double deposit){
        balance += deposit;
        System.out.println("You deposited: " + deposit + currency);
        System.out.println("Your current balance is: " + balance + currency);
    }
    public void withdraw (double withdraw){

        if(balance - withdraw < 0){
            System.out.println("Only " + balance + currency + " avelable");
        }else {
            balance -= withdraw;
            System.out.println("You withdrawed: " + withdraw + currency);
            System.out.println("Your current balance is: " + balance + currency);
        }
    }


}
