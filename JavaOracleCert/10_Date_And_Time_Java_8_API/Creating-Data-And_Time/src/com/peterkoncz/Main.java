package com.peterkoncz;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        //some methods we can use to create dates
        //these methods only available from java 8 before that you could use date, and calendar
        LocalDate localDate = LocalDate.of(2025, Month.DECEMBER,1);

        LocalTime localTime = LocalTime.of(10,30);

        System.out.println(localDate);
        System.out.println(localTime);
        //you can join theme
        System.out.println(LocalDateTime.of(localDate,localTime));


        //before java8
        System.out.println(new Date());

        //to specify use calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(2045, Calendar.JANUARY,6);
        Date oldDate = calendar.getTime();

        System.out.println(oldDate);




    }
}
