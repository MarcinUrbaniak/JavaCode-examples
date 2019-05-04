package com.computer;

public class Computer {

    public String model = "XPS";
    private String computerName = "Personal";
    private Ram ram;
    private HardDrive hardDrive = new HardDrive();


    public Computer() {
        this.ram = new Ram();
        //this.hardDrive = new HardDrive();
        System.out.println("Konstruktor 'Computer' został wywołany");
    }
}
