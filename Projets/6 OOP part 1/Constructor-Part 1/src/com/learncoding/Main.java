package com.learncoding;



public class Main {

    public static void main(String[] args) {
        BankAccount marcell = new BankAccount("Mrcell", "Marcllnekkicsia@.com.au","0567345876",100 );



//        marcell.setName("Marcell");   Constructor can set values without all to call all this !!
//        marcell.setEmail("Marcllnekkicsia@.com.au");
//        marcell.setpNumber("0567345876");

        System.out.println("Name: " + marcell.getName());
        System.out.println("email:" + marcell.getEmail());
        System.out.println("Pn: " + marcell.getpNumber());
        System.out.println("Balance: " + marcell.getBalance());

        marcell.withdraw(100);
//        marcell.deposit(1577);
//        marcell.withdraw(477);

        BankAccount peter = new BankAccount("peter", "Peter@.com");

        System.out.println("Name: " + peter.getName());
        System.out.println("email:" + peter.getEmail());
        System.out.println("Pn: " + peter.getpNumber());
        System.out.println("Balance: " + peter.getBalance());


       // VIP constructor !
        System.out.println("*************************VIP*****************************");
        System.out.println("");
        VipCustomer Peter = new VipCustomer();

        System.out.println(Peter.getName());
        System.out.println(Peter.getEmail());
        System.out.println(Peter.getCreditLimit());

        System.out.println("");
        VipCustomer Steph = new VipCustomer("Steph" , 30000);

        System.out.println(Steph.getName());
        System.out.println(Steph.getEmail());
        System.out.println(Steph.getCreditLimit());

        System.out.println("");
        VipCustomer Andras = new VipCustomer("Andras", "Andras@.com", 70000);

        System.out.println(Andras.getName());
        System.out.println(Andras.getEmail());
        System.out.println(Andras.getCreditLimit());
    }

}
