import cinema.*;
import communication.Order;
import movie.Movie;
import order.Ticket;
import order.TicketStatus;
import order.TicketType;
import order.Tickets;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Movie movie1 = new Movie("Indiana Jones", "120");
        Movie movie2 = new Movie("Powrot do przeszlosci", "180");
        Movie movie3 = new Movie("Avengers", "90");

        Places places = new Places(Places.generatePlaceList(3,3));

        LocalDateTime startMovieTime1 = LocalDateTime.parse("2019-05-25T12:00:00");
        LocalDateTime startMovieTime2 = LocalDateTime.parse("2019-05-25T14:00:00");
        LocalDateTime startMovieTime3 = LocalDateTime.parse("2019-05-25T15:00:00");


        Seance seance1 = new Seance(movie1, startMovieTime1,places,50);
        Seance seance2 = new Seance(movie2, startMovieTime2,places,65);
        Seance seance3 = new Seance(movie3, startMovieTime3,places,75);


        List<Seance> seanceList = new ArrayList<>();

        seanceList.add(seance1);
        seanceList.add(seance2);
        seanceList.add(seance3);

        Repertory repertory1 = new Repertory(seanceList);

        Cinema cinema1 = new Cinema(repertory1);


        Place place1 = new Place(2,2);
        Ticket ticket1 = new Ticket(TicketType.NORMALNY, TicketStatus.KUPIONY, place1, cinema1, seance1 );






        List<Ticket> ticketList = new ArrayList<>();
        ticketList.add(ticket1);

        Tickets tickets = new Tickets(ticketList);

        Order order = new Order();
        //order.orderPlace();


        places.setPlaceInSeance(2,2);

        System.out.println(places);












    }

}
