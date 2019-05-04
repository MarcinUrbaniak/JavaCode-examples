package com.example;

public class Car {

    private Engine engine;
    private SteeringWheel steeringWheel = new SteeringWheel();
    private static Manufacturer manufacturer = new Manufacturer();

    public Car() {
        System.out.println("Konstruktor 'Car' został wywołany");
        this.engine = new Engine();
    }
}
