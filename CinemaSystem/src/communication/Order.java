package communication;

import cinema.*;
import order.TicketType;


import java.util.List;
import java.util.Scanner;

public class Order {


    public static Cinema selectCinema(CinemaSystem cinemaSystem) {
        printCinemas(cinemaSystem);

        Scanner scanner = new Scanner(System.in);
        int selected = Integer.parseInt(scanner.nextLine());
        return cinemaSystem.getCinemas().get(selected);
    }

    private static void printCinemas(CinemaSystem cinemaSystem) {
        System.out.println("Wybierz kino: ");
        int select = 0;
        for (Cinema cinema : cinemaSystem.getCinemas()
        ) {
            System.out.println("(" + select + ") " + cinema.getCinemaName());
            select++;
        }
    }


    public static Seance selectSeance(Cinema cinema) {
        List<Seance> seances = cinema.getRepertoryOfCinema().getSeancesInCinema();

        printSeances(seances);

        Scanner scanner = new Scanner(System.in);
        int selected = Integer.parseInt(scanner.nextLine());
        return seances.get(selected);
    }

    private static void printSeances(List<Seance> seances) {
        System.out.println("Wybierz seans: ");
        int select = 0;
        for (Seance seance : seances
        ) {
            System.out.println("(" + select + ") " + seance.getMovie().getMovieTitle() + " " + seance.getMovieStartTime());
            select++;

        }
    }

    public static TicketType selectTicketType() {
        printTicketType();

        Scanner scanner = new Scanner(System.in);
        int select = Integer.parseInt(scanner.nextLine());

        switch (select) {
            case 0:
                return TicketType.NORMALNY;

            case 1:
                return TicketType.ULGOWY;
        }

        return TicketType.NORMALNY;
    }

    private static void printTicketType() {
        System.out.println("Wybierz rodzaj biletu");
        System.out.println("(0) Normalny");
        System.out.println("(1) Ulgowy");
    }

    public static int[] orderPlace() {
        System.out.println("Podaj rząd:");

        int[] intTab = new int[2];
        Scanner scanner = new Scanner(System.in);
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj nr miejsca: ");
        int placeInRow = Integer.parseInt(scanner.nextLine());
        intTab[0] = row;
        intTab[1] = placeInRow;
        return intTab;

    }


}
