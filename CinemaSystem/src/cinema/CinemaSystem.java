package cinema;

import java.util.List;
import java.util.Objects;

public class CinemaSystem {

    List<Cinema> cinemas;


    public CinemaSystem(List<Cinema> cinemas) {
        this.cinemas = cinemas;
    }

    public List<Cinema> getCinemas() {
        return cinemas;
    }

    public void setCinemas(List<Cinema> cinemas) {
        this.cinemas = cinemas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CinemaSystem that = (CinemaSystem) o;
        return Objects.equals(cinemas, that.cinemas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cinemas);
    }

    @Override
    public String toString() {
        return "CinemaSystem{" +
                "cinemas=" + cinemas +
                '}';
    }
}
