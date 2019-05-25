package order;

import cinema.*;

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
