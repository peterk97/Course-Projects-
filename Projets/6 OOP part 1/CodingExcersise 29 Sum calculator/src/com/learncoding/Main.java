package com.learncoding;

public class Main {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        SimpleCalculator marci = new SimpleCalculator();


        calculator.setFirstNumber(5);
        calculator.setSecondNumber(4);

        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5);
        calculator.setSecondNumber(3);

        System.out.println("division = " + calculator.getDivisionResult());
        System.out.println("multiply = " + calculator.getMultiplicationResult());

        marci.setFirstNumber(78);
        marci.setSecondNumber(66);
        System.out.println(marci.getAdditionResult());





    }
}
