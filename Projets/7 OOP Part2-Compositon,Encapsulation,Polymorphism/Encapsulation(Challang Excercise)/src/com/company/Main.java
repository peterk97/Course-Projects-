package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer("Marcells printer", "Sony",80);
//        System.out.println(printer.getNumberOfPages());
//         System.out.println("Toner lvl is on: " + printer.getTonerLevel() + "%");


        printer.tonerFiller(10);
        printer.printPages(60);
        printer.getTonerLevel();
//        printer.printPages(24);
//        printer.getTonerLevel();
//        printer.tonerFiller(30);

        printer.isDuplexOn(true);


        printer.tonerFiller(20);
        printer.printPages(10);
        printer.getTonerLevel();
//        printer.printPages(24);
//        printer.getTonerLevel();
//        printer.tonerFiller(30);


        //PrinterSolution//
        PrinterSolution printerSolution = new PrinterSolution(50, false);
        System.out.println("initial page count = " +printerSolution.getPagesPrinted());
        int pagesPrinted = printerSolution.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printerSolution.getPagesPrinted());
        pagesPrinted = printerSolution.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printerSolution.getPagesPrinted());



    }
}
