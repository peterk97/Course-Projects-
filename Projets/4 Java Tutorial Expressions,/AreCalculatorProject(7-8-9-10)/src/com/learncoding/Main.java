package com.learncoding;

public class Main {

    public static void main(String[] args) {
 // Formula of rechteangle or circle
       AreaCalculator.area(5);
       AreaCalculator.area(-1);

        AreaCalculator.area(5,4);
        AreaCalculator.area(-1,4);

// minutes to years
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
        MinutesToYearsDaysCalculator.printYearsAndDays(-561600);


// Equal or not !!
        IntEqualityPrinter.printEqual(1,1,1);
        IntEqualityPrinter.printEqual(2,1,1);
        IntEqualityPrinter.printEqual(1,2,1);
        IntEqualityPrinter.printEqual(1,1,2);
        IntEqualityPrinter.printEqual(1,1,-1);

// Playing cat !!
        System.out.println(PlayingCat.isCatPlaying(true,10));
        System.out.println(PlayingCat.isCatPlaying(false,36));
        System.out.println( PlayingCat.isCatPlaying(false,35));




    }
}
