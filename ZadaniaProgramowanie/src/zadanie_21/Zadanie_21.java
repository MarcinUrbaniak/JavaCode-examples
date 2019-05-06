package zadanie_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie_21 {
    public static void main(String[] args) throws IOException {

        /**
         * Napisz program, który sprawdza dla trzech boków trójkąta a, b i c wprowadzonych z klawiatury,
         * czy tworzą one trójkąt prostokątny (zakładamy, że a > 0, b > 0, c > 0).”
         *
         */

        int a, b, c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("a = ");
        a = Integer.parseInt(br.readLine());
        System.out.println("b = ");
        b = Integer.parseInt(br.readLine());
        System.out.println("c = ");
        c = Integer.parseInt(br.readLine());

        if (a*a + b*b == c*c){
            System.out.println("Boki tworzą trójkąt prostokątny");
        } else {
            System.out.println("Boki nie tworzą trójkąta prostokątnego");
        }

    }
}
