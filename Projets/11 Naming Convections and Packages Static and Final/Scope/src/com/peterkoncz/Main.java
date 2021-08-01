package com.peterkoncz;

/**
 * This project is all about scopes and it shows how scopes work
 * and how they separate variables from each other like private var or a local var still works with a same name
 * and they do not effect each other
 * also how access modifiers can change and effect vars and classes
 */
public class Main {

    public static void main(String[] args) {


        String privateVar = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance private var is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar); //this example shows even though there is same named variable in int the ScopeCheck class that is private
                                         //so we can create another var with a same name and they do not effect each other

        scopeInstance.timesTwo();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass(); // this si how to create an innerclass!!
        innerClass.timesTwo();
    }
}
