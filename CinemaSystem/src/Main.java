import cinema.*;
import com.sun.org.apache.xpath.internal.operations.Or;
import communication.Order;
import movie.Movie;
import order.Ticket;
import order.TicketStatus;
import order.TicketType;
import order.Tickets;
import raport.SellTicketRaport;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /**
         * Generowanie listy filmow
         */
        Movie movie1 = new Movie("Jeden Indiana Jones", "120");
        Movie movie2 = new Movie("Dwa Powrot do przeszlosci", "180");
        Movie movie3 = new Movie("Trzy Avengers", "90");

        /**
         * Generowanie listy miejsc
         */

        Places places1 = new Places(Places.generatePlaceList(10,10));
        Places places2 = new Places(Places.generatePlaceList(10,12));
        Places places3 = new Places(Places.generatePlaceList(10,14));

        /**
         * Generowanie godzin rozpoczecia seansow
         */

        LocalDateTime startMovieTime1 = LocalDateTime.parse("2019-05-25T12:00:00");
        LocalDateTime startMovieTime2 = LocalDateTime.parse("2019-05-25T14:00:00");
        LocalDateTime startMovieTime3 = LocalDateTime.parse("2019-05-25T15:00:00");

        /**
         * Generowanie listy seansow
         */
        Seance seance1 = new Seance(movie1, startMovieTime1,places1,50);
        Seance seance2 = new Seance(movie2, startMovieTime2,places2,65);
        Seance seance3 = new Seance(movie3, startMovieTime3,places3,75);
        Seance seance4 = new Seance(movie3, startMovieTime3,places3,75);
        Seance seance5 = new Seance(movie1, startMovieTime3,places3,120);
        Seance seance6 = new Seance(movie2, startMovieTime3,places3,70);


        List<Seance> seanceList1 = new ArrayList<>();
        seanceList1.add(seance1);
        seanceList1.add(seance2);
        seanceList1.add(seance3);

        List<Seance> seanceList2 = new ArrayList<>();
        seanceList2.add(seance4);
        seanceList2.add(seance5);
        seanceList2.add(seance6);

        /**
         * Tworzenie repertuaru na podstawie listy seansow
         */

        Repertory repertory1 = new Repertory(seanceList1);
        Repertory repertory2 = new Repertory(seanceList2);

        /**
         * Generowanie listy kin i dodanie repertuaru do kin
         */
        Cinema cinema1 = new Cinema("Kino Warszawa");
        Cinema cinema2 = new Cinema("Kino Kraków");
        cinema1.setRepertoryOfCinema(repertory1);
        cinema2.setRepertoryOfCinema(repertory2);

        /**
         * Generowanie CinemaSystem
         */

        List<Cinema> cinemaList = new ArrayList<>();
        cinemaList.add(cinema1);
        cinemaList.add(cinema2);
        CinemaSystem cinemaSystem = new CinemaSystem(cinemaList);

        /**
         * Generowanie listy do przechowywania biletow
         */


        List<Ticket> ticketList = new ArrayList<>();
        Tickets tickets = new Tickets(ticketList);


        /**
         * Blok odpowiadający za zakup biletu oraz dodanie biletu do listy biletow
         */

        Ticket ticket1 =  Ticket.buyTicket(cinemaSystem);
        tickets.getTickets().add(ticket1);
        Ticket ticket2 =  Ticket.buyTicket(cinemaSystem);
        tickets.getTickets().add(ticket2);
        Ticket ticket3 =  Ticket.buyTicket(cinemaSystem);
        tickets.getTickets().add(ticket3);

        /**
         * Blok odpowiadajacy za rezerwacje biletu (analogicznie jak powyzej ale TicketStatus ustawiamy na zarezerwowany
         */

        Ticket ticket4 = Ticket.bookTicket(cinemaSystem);
        tickets.getTickets().add(ticket4);

        /**
         * Blok odpowiadajacy za anulowanie zamowionego biletu
         */

        Ticket.cancelTicket(ticket1, tickets);


//        System.out.println("Wydruk biletów: ");
//        for (Ticket ticket: tickets.getTickets()
//             ) {
//            System.out.println(ticket.getCinema().getCinemaName() + " " + ticket.getTicketStatus() + " " + ticket.getSeance().getMovie().getMovieTitle());
//        }


        /**
         * Blok raportu sprzedanych biletow
         */


        SellTicketRaport sellTicketRaport = new SellTicketRaport();
        sellTicketRaport.ticketRaport(tickets);
        sellTicketRaport.ticketRaportPerMontch(tickets, "MAY","2019");






    }

}
