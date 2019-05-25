package communication;
import cinema.Place;
import cinema.Places;
import order.Ticket;

import java.util.Scanner;

public class Order {

    private Scanner scanner;
    private int row, placeInRow;
    private Ticket ticket;


    public Place orderPlace(){
        System.out.println("Witamy w super systemie rezerwacji i zakupu biletów do kina");
        System.out.println("Podaj rząd:");

        Scanner scanner = new Scanner(System.in);

        row = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj nr miejsca: ");
        placeInRow = Integer.parseInt(scanner.nextLine());

        Place place = new Place(row, placeInRow);

        return place;
    }





    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getPlaceInRow() {
        return placeInRow;
    }

    public void setPlaceInRow(int placeInRow) {
        this.placeInRow = placeInRow;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
