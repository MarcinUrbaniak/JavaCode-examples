package com.calculator;

public class SimpleCalculator implements Calculator {

    private double numberOne;
    private double numberTwo;


    public SimpleCalculator() {
    }

    public SimpleCalculator(double numberOne, double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

    @Override
    public double add() {
        return this.numberOne + this.numberTwo;
    }

    @Override
    public double substract() {
        return this.numberOne - this.numberTwo;
    }

    @Override
    public double multiply() {
        return this.numberOne * this.numberTwo;
    }

    @Override
    public double divide() {
        if (this.numberTwo == 0){
            return 0;
        }
        return numberOne / numberTwo;
    }
}


