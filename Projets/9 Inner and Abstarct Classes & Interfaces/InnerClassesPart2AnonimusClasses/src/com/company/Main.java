package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");
    public static void main(String[] args) {
	//anonymous classes
        //it is also a local class but it's got no name !
        //they have to be declared and instantiated at te same time, because they haven't got a name and used what a local class is only used once!
        // this is very common let's say fot touching event handlers to buttons in a user interface for example if you programming android apps
        //so the code actually execute it might be different depending on the button can be quiet handy


        //THIS IS THE LOCAL CLASS FROM THE OTHER PROJECT TO SEE THE DIFFERENCE 
//        class ClickListener implements Button.OnClickListener{
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());


        btnPrint.setOnClickListener(new Button.OnClickListener() {//the main difference from local class we are not creating a separate class
                                                                   // like at the local class project and this has no name
            @Override                                                // there is no name there because it's been there and then within the brackets
            public void onClick(String title) {// and we overrode the on click method  to ensure that we implemented the interface correctly
                System.out.println(title + " was Clicked");
            }
        });
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
