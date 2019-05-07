package zadanie_51;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * „Napisz zgodnie z zasadami programowania obiektowego program, który oblicza pole prostokąta.
 * Klasa powinna zawierać trzy metody:”
 *
 */

public class RectangleField  {

    double a, b, field;

    public void readData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj długość boku a: ");
        a = Double.parseDouble(br.readLine());
        System.out.println("Podaj długość boku b: ");
        b = Double.parseDouble(br.readLine());

    }

    public void calculateField(){
        field = a * b;

    }

    public void showResult(){
        System.out.println("Pole prostokąta o bokach " + a + ", " + b + " wynosi: " + field);
    }

}
