package zadanie_52;


import java.util.Scanner;


public class Trinomial {


    /**
     * „Napisz zgodnie z zasadami programowania obiektowego program,
     * który oblicza pierwiastki równania kwadratowego ax2+bx+c = 0 z wykorzystaniem instrukcji wyboru switch ... case.
     * Klasa powinna zawierać trzy metody:
     * <p>
     * czytaj_dane() — metoda jest odpowiedzialna za wczytanie danych do programu
     * oraz obsłużenie sytuacji, kiedy a = 0. Zmienne a, b i c to liczby rzeczywiste wprowadzane z klawiatury.
     * <p>
     * przetwórz_dane() — metoda odpowiada za wykonanie niezbędnych obliczeń.
     * <p>
     * wyświetl_wynik() — metoda jest odpowiedzialna za wyświetlenie wyników na ekranie monitora.
     * Dla zmiennych a, b, c, x1 oraz x2 należy przyjąć format wyświetlania ich z dwoma miejscami po przecinku.”
     */

    private double a, b, c, delta, x1, x2;

    private int numberOfElements;

    public void readData() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a: ");
        a = Double.parseDouble(scanner.nextLine());

        if (a == 0) {
            System.out.println("Niedozwolona wartość współczynnika a");
            System.exit(1);
        } else {

            System.out.println(" Podaj b: ");
            b = Double.parseDouble(scanner.nextLine());

            System.out.println(" Podaj c: ");
            c = Double.parseDouble(scanner.nextLine());

        }


    }

    public void calculateData() {
        delta = b * b - 4 * a * c;

        if (delta < 0) numberOfElements = 0;
        if (delta == 0) numberOfElements = 1;
        if (delta > 0) numberOfElements = 2;

        switch (numberOfElements) {
            case 1:
                x1 = -b / (2 - a);
                break;
            case 2: {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
            }
            break;
        }

    }

    public void showData() {
        System.out.println(" Dla wprowadzonych liczb: ");
        System.out.printf(" a = " + "%2.2f", a);
        System.out.printf(" b = " + "%2.2f", b);
        System.out.printf(" c = " + "%2.2f", c);

        switch (numberOfElements) {
            case 0:
                System.out.println(" Brak pierwiastkow rzeczywistych");
                break;
            case 1:
                System.out.printf(" Trójmian ma jeden pierwiastek x1 " + "%2.2f\n", x1);
                break;
            case 2:
                System.out.printf(" Trójmian ma dwa pierwiastki x1 = " + "%2.2f\n", x1);
                System.out.printf(" i x2 = " + "%2.2f", x2);


        }


    }
}
