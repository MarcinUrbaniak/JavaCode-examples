package com.example;

public class TV {

    private String modelName;
    private long serialNumber;
    private float inches;
    private Manufacturer manufacturer;


    public TV(String modelName, long serialNumber, float inches, Manufacturer manufacturer) {
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.inches = inches;
        this.manufacturer = manufacturer;
    }

    public TV(String modelName, long serialNumber, float inches) {
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.inches = inches;
    }
}
