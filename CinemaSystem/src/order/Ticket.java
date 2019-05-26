package order;

import cinema.*;
import communication.Order;

public class Ticket {

    private TicketType ticketType;
    private TicketStatus ticketStatus;
    private Place placeInCinema;
    private Cinema cinema;
    private Seance seance;

    public Ticket(TicketType ticketType, TicketStatus ticketStatus, Place placeInCinema, Cinema cinema, Seance seance) {
        if(placeInCinema.getPlaceStatus() == PlaceStatus.WOLNE) {
            this.ticketType = ticketType;
            this.ticketStatus = ticketStatus;
            this.placeInCinema = placeInCinema;
            this.placeInCinema.setPlaceStatus(PlaceStatus.ZAJETE);
            this.cinema = cinema;
            this.seance = seance;
        }

    }
    public static Ticket buyTicket(CinemaSystem cinemaSystem) {
        System.out.println("Witamy w super systemie rezerwacji i zakupu biletów do kina");
        Cinema cinema = Order.selectCinema(cinemaSystem);
        Seance seance = Order.selectSeance(cinema);
        TicketType ticketType = Order.selectTicketType();
        Places places = seance.getPlacesInSeance();

        Place place = getPlace(places);

        Ticket ticket = new Ticket(ticketType, TicketStatus.KUPIONY, place, cinema, seance);
        System.out.println("Bilet kupiony/zarezerwowany");

        return ticket;
    }

    private static Place getPlace(Places places) {
        int[] newTab = Order.orderPlace();
        boolean isPlaceInSeance = places.setPlaceInSeance(newTab[0], newTab[1]);

        while (!isPlaceInSeance) {
            newTab = Order.orderPlace();
            isPlaceInSeance = places.setPlaceInSeance(newTab[0], newTab[1]);
        }

        return new Place(newTab[0], newTab[1]);
    }


    public static Ticket bookTicket(CinemaSystem cinemaSystem){
        Ticket ticket = Ticket.buyTicket(cinemaSystem);
        ticket.setTicketStatus(TicketStatus.ZAREZERWOWANY);

        return ticket;
    }

    public static void cancelTicket(Ticket ticket, Tickets tickets) {

        if (tickets.getTickets().contains(ticket)) {
            int ticketId = tickets.getTickets().indexOf(ticket);
            tickets.getTickets().get(ticketId).setTicketStatus(TicketStatus.ANULOWANY);
            tickets.getTickets().get(ticketId).getPlaceInCinema().setPlaceStatus(PlaceStatus.WOLNE);
            System.out.println("Bilet anulowany");
        } else {
            System.out.println("Nie mamy w systemie zarezerwowanego lub kupionego biletu.");

        }
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public Place getPlaceInCinema() {
        return placeInCinema;
    }

    public void setPlaceInCinema(Place placeInCinema) {
        this.placeInCinema = placeInCinema;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Seance getSeance() {
        return seance;
    }

    public void setSeance(Seance seance) {
        this.seance = seance;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketType=" + ticketType +
                ", ticketStatus=" + ticketStatus +
                ", placeInCinema=" + placeInCinema +
                ", cinema=" + cinema +
                ", seance=" + seance +
                '}';
    }
}
