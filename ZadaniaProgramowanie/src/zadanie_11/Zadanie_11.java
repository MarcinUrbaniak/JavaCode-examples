package zadanie_11;

import java.io.*;


public class Zadanie_11 {

    public static void main(String[] args) throws IOException {



            double a, b, pole;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Program oblicza pole prostokąka.");
            System.out.println("Podaj blok a. ");
            a = Double.parseDouble(br.readLine());
            System.out.println(" Podaj bok b. ");
            b = Double.parseDouble(br.readLine());
            pole = a * b;

            System.out.println("pole = " + pole);

    }

}
