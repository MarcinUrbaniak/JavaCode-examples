package zadanie_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie_14 {

    public static void main(String[] args) throws IOException {

        double r, measurment;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program oblicza objętość kuli. Podaj promień kuli: ");
        r = Double.parseDouble(br.readLine());

        measurment = 4 * Math.PI * r * r * r/3;


        System.out.println("Objętość kuli o promieniu r =");
        System.out.printf("%2.2f", r);
        System.out.println(" wynosi ");
        System.out.printf("%2.2f", measurment);



    }
}
