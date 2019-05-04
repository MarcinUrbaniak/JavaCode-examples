package com.example.person;

public enum Profession {

    PROGRAMISTA(4),
    ANALITYK(6),
    SPRZEDAWCA(3),
    LOGISTYK(8);

    private final double salaryAdition;


    Profession(double salaryAdition) {
        this.salaryAdition = salaryAdition;

    }

    public double getSalaryAdition() {
        return salaryAdition;
    }
}
