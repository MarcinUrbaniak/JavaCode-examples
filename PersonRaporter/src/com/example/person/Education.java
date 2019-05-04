package com.example.person;

public enum Education {
    PODSTAWOWE(1),
    SREDNIE(1),
    WYZSZE(1),
    PODYPLOMOWE(1);


    private final double salaryAdition;

    Education(double salaryAdition) {
        this.salaryAdition = salaryAdition;
    }

    public double getSalaryAdition() {
        return salaryAdition;
    }
}
