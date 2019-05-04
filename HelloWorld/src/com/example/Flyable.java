package com.example;

public interface Flyable {

    public void fly();

    public default void flyAvay(){
        System.out.println("Obiekt po prostu odleciał");
    }
}
