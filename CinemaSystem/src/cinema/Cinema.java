package cinema;


import java.util.Objects;

public class Cinema {


    private String cinemaName;
    private Repertory repertoryOfCinema;

    public Cinema(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public Repertory getRepertoryOfCinema() {
        return repertoryOfCinema;
    }

    public void setRepertoryOfCinema(Repertory repertoryOfCinema) {
        this.repertoryOfCinema = repertoryOfCinema;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(cinemaName, cinema.cinemaName) &&
                Objects.equals(repertoryOfCinema, cinema.repertoryOfCinema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cinemaName, repertoryOfCinema);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "cinemaName='" + cinemaName + '\'' +
                ", repertoryOfCinema=" + repertoryOfCinema +
                '}';
    }
}
