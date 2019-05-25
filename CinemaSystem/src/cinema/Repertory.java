package cinema;



import java.util.List;

public class Repertory {

    List<Seance> seancesInCinema;


    public Repertory(List<Seance> seancesInCinema) {
        this.seancesInCinema = seancesInCinema;
    }

    public List<Seance> getSeancesInCinema() {
        return seancesInCinema;
    }

    public void setSeancesInCinema(List<Seance> seancesInCinema) {
        this.seancesInCinema = seancesInCinema;
    }

    @Override
    public String toString() {
        return "Repertory{" +
                "seancesInCinema=" + seancesInCinema +
                '}';
    }
}
