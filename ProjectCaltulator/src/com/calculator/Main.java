package com.calculator;

public class Main {

    public static void main(String[] args) {
        SimpleCalculator calculator1 = new SimpleCalculator();

        calculator1.setNumberOne(34);
        calculator1.setNumberTwo(45);

        System.out.println(calculator1.add());

        calculator1.setNumberOne(34);
        calculator1.setNumberTwo(0);

        System.out.println(calculator1.divide());



    }
}
