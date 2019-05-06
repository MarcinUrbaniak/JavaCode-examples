package zadanie_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Zadanie_17 {

    public static void main(String[] args) throws IOException {

        /**
         „Napisz program, który oblicza sumę, różnicę, iloczyn i iloraz dla dwóch liczb x i y wprowadzanych z klawiatury.
         W programie należy założyć, że zmienne x i y są typu float (rzeczywistego).
         Dla zmiennych x, y, suma, różnica, iloczyn i iloraz należy przyjąć format ich wyświetlania na ekranie z dokładnością
         do dwóch miejsc po przecinku.”
         */

        float x, y, sum, difference, ratio, quotient;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj x: ");
        x = Float.parseFloat(br.readLine());

        System.out.println("Podaj y: ");

        y = Float.parseFloat(br.readLine());


        sum = x + y;
        difference = x - y;
        ratio = x * y;
        quotient = x/y;

        System.out.printf("Suma wynosi " + "%2.2f\n", sum);
        System.out.printf("Różnica wynosi " + "%2.2f\n", difference);
        System.out.printf("Iloczyn wynosi " + "%2.2f\n", ratio);
        System.out.printf("Iloraz wybosi " + "%2.2f\n", quotient);



    }
}
