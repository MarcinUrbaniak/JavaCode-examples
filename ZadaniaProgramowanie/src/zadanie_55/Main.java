package zadanie_55;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Factorial factorial = new Factorial();
        int n;

        System.out.println("Podaj liczbę: ");
        n = Integer.parseInt(scanner.nextLine());

        //factorial.factorial(n);

        System.out.println("Silnia dla liczny " + n + " wynosi " + factorial.factorial(n));

    }
}
