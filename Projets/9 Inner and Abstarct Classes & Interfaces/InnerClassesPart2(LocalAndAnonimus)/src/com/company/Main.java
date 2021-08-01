package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
//one example when you want to use a local class might be useful is as a comparator, when trying to sort objects.
// to demonstrate we will create a button class and attach a listener to it so the code will execute when you hit the button

        //local class that implements that on click listener interface, and assign an instance of it to our button
        class ClickListener implements Button.OnClickListener{
            public ClickListener() {// constructor
                System.out.println("I've been attached"); //point when listener has been connected to the button (Constructor called)
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }
        //so that is how local class that we've defined within the main method
        //we than need to attache it to our button field, which was initialized up like a private field
        btnPrint.setOnClickListener(new ClickListener());// so this will automatically respond when  the button is clicked and
                                                          // the unclick method would actually be invoked for us

        listen();


    }

    private static void listen(){
        boolean quit = false;
        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
