package com.company;

import java.util.Iterator;

public class Main {


    //This project is about Interfaces

    public static void main(String[] args) {

       // ITelephone petersPhone = new DeskPhone(1234556);
        DeskPhone marcellsPhone = new DeskPhone(5678); //This is valid as well!

        ITelephone petersPhone;
        petersPhone = new DeskPhone(23456);
        petersPhone.powerOn();
        petersPhone.callPhone(23456);
        petersPhone.answer();


        petersPhone = new MobilPhone(3456); // I could re assigned it because used the ITelephone petersPhone
        petersPhone.powerOn();
        petersPhone.callPhone(3456);
        marcellsPhone.answer();


        //marcellsPhone = new MobilPhone(456); this is not correct becausee used the other type of phone 

    }





}
