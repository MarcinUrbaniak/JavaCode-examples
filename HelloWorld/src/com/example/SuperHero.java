package com.example;

public class SuperHero implements Flyable, Swimable {

    @Override
    public void fly() {
        System.out.println("Bohater potrafi latać");
    }

    @Override
    public void swim() {
        System.out.println("Bohater potrafi pływać");
    }
}
