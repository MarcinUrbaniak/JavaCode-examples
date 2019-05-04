package com.computer;

public class Ram {

    private String producer;
    private int sizeOfMemory;
    public static int licznik = 0;


    public Ram() {
        System.out.println("Konstruktor 'Ram' zostałwywołany");
        licznik++;

    }

    public static int memorySize(){
        return 1024;
    }

}
