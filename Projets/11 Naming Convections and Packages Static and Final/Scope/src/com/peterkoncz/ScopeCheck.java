package com.peterkoncz;

public class ScopeCheck {

    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck(){
        System.out.println("ScopeCheck created, publicVar = " + publicVar + " : privateVar = " + privateVar);
    }

    public int getPublicVar(){
        return publicVar;
    }
    public int getPrivateVar(){
        return privateVar;
    }

    public void timesTwo(){
        int privateVar = 2;// even though there is another var with the same name this method use it's own local variable
        for (int i =0;i<10;i++){//this variable exist just in here
            System.out.println(i + " times two is " + i * privateVar);
        }
    }


    //INNER CLASS
    public class InnerClass{
        //public int privateVar = 3; //if this isn't available it is going to use the enclosing class's privateVar!!

        public InnerClass() {
            System.out.println("InnerClass created, privatVar is " + privateVar);
        }

        public void timesTwo(){
            ScopeCheck.this.timesTwo(); //you also can call the same method from outer class
           // int privateVar = 2; // if this is not available it is going to use the privateVar field (3)
            for (int i =0;i<10;i++){ //this. here refers to the InnerClass's variable //ScopeCheck.this.privateVar refers to the outerClass privateVar
                System.out.println(i + " times two is " + i * privateVar);
            }
        }
    }



}
