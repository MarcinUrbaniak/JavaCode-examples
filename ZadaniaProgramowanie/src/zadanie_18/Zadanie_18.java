package zadanie_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie_18 {

    public static void main(String[] args) throws IOException {

/**
 * „Napisz program, który oblicza pole prostokąta. Wartości boków a i b wprowadzamy z klawiatury.
 * W programie należy przyjąć, że zmienne a, b oraz pole są typu double (rzeczywistego).
 * Dodatkowo w program wbuduj obsługę sytuacji wyjątkowych.”
 *
 *
 */

        double a, b, area;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        try {


            System.out.println("Podaj długość boku a: ");
            a = Double.parseDouble(br.readLine());
            System.out.println("Podaj długość boku b: ");
            b = Double.parseDouble(br.readLine());

            area = a * b;

        System.out.println("Pole prostokąta to: " + area);
        }
        catch (NumberFormatException e){
            System.out.println("Nie podano liczby " );
        }


    }
}
