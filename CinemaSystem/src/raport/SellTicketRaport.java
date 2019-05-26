package raport;

import order.Ticket;
import order.TicketStatus;
import order.Tickets;

import java.time.LocalDateTime;

public class SellTicketRaport {

    private Tickets tickets;
    private String month;
    private int year;


    public void ticketRaport(Tickets tickets) {
        this.tickets = tickets;

        int numberOfPurchasedTickets = 0 ;
        double priceOfPurchasedTickets = 0;
        for (Ticket ticket: this.tickets.getTickets()
             ) {
            if (ticket.getTicketStatus() == TicketStatus.KUPIONY){
                numberOfPurchasedTickets += 1;
                priceOfPurchasedTickets += ticket.getSeance().getPriceOfSeance() * ticket.getTicketType().getDiscount();
            }

        }

        System.out.println("Sprzedano " +  numberOfPurchasedTickets + " biletow na kwote " +  priceOfPurchasedTickets + " zl");

    }


    public void ticketRaportPerMontch(Tickets tickets, String month, String year){
        this.tickets = tickets;
        this.month = month;
        this.year = Integer.parseInt(year);

        String monthOfSell;
        int yearOfSell;
        boolean isBought;
        int numberOfPurchasedTickets = 0 ;
        double priceOfPurchasedTickets = 0;

        System.out.println("Raport sprzedazy za miesiac " + this.month + " " + this.year);

        for (Ticket ticket: this.tickets.getTickets()
             ) {
            monthOfSell = ticket.getSeance().getMovieStartTime().getMonth().toString();
            yearOfSell = ticket.getSeance().getMovieStartTime().getYear();
            isBought = ticket.getTicketStatus() == TicketStatus.KUPIONY;

            if(monthOfSell.equals(this.month) && yearOfSell == this.year && isBought) {
                numberOfPurchasedTickets += 1;
                priceOfPurchasedTickets += ticket.getSeance().getPriceOfSeance() * ticket.getTicketType().getDiscount();

            }
        }
        System.out.println("Sprzedano " +  numberOfPurchasedTickets + " biletow na kwote " +  priceOfPurchasedTickets + " zl");

    }
}
