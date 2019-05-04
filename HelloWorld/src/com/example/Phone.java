package com.example;

public class Phone {

    private String number;
    private String owner;
    private String type;
    private String model;
    private float color;

    public Phone() {

    }


    public Phone(String number) {
        this.number = number;
    }

    public Phone(String number, String owner) {
        this(number);
        this.owner = owner;
    }

    public Phone(String number, String owner, String type, String model, String color) {
        this.number = number;
        this.owner = owner;
        this.type = type;
        this.model = model;
        this.color = Float.valueOf(color);
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(float color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", owner='" + owner + '\'' +
                ", type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
