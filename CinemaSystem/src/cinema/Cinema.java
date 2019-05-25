package cinema;



public class Cinema {

    Repertory repertoryOfCinema;

    public Cinema(Repertory repertoryOfCinema) {
        this.repertoryOfCinema = repertoryOfCinema;
    }

    public Repertory getRepertoryOfCinema() {
        return repertoryOfCinema;
    }

    public void setRepertoryOfCinema(Repertory repertoryOfCinema) {
        this.repertoryOfCinema = repertoryOfCinema;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "repertoryOfCinema=" + repertoryOfCinema +
                '}';
    }
}
