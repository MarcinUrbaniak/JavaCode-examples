package com.computer;

public class Main {
    public static void main(String[] args) {

        Computer computer1 = new Computer();

        System.out.println(computer1.model);

        int i = Ram.memorySize();
        i++;
        System.out.println("Rozmiar pamięci: " +i);



        int j = Ram.memorySize();

        System.out.println("Rozmiar pamięci j: "+ j);


        Ram ram1 = new Ram();
        int k = Ram.licznik;

        System.out.println(k);




    }
}
