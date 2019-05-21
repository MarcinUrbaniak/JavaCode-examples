package zadanie_56;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile liczb trójkątnych mamy wyszukać? Podaj liczbę: ");
        int n;
        n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n ; i++) {
            System.out.println("Liczba trójkątna #" + i + " wynosi: " + Triangle.triangle(i));
        }



    }
}
