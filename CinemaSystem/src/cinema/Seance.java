package cinema;

import movie.Movie;

import java.time.LocalDateTime;



public class Seance {

    Movie movie;
    LocalDateTime movieStartTime;
    Places placesInSeance;
    double priceOfSeance;


    public Seance(Movie movie, LocalDateTime movieStartTime, Places placesInSeance, double priceOfSeance) {
        this.movie = movie;
        this.movieStartTime = movieStartTime;
        this.placesInSeance = placesInSeance;
        this.priceOfSeance = priceOfSeance;
    }



    public Places getPlacesInSeance() {
        return placesInSeance;
    }

    public void setPlacesInSeance(Places placesInSeance) {
        this.placesInSeance = placesInSeance;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public LocalDateTime getMovieStartTime() {
        return movieStartTime;
    }

    public void setMovieStartTime(LocalDateTime movieStartTime) {
        this.movieStartTime = movieStartTime;
    }

    public double getPriceOfSeance() {
        return priceOfSeance;
    }

    public void setPriceOfSeance(Double priceOfSeance) {
        this.priceOfSeance = priceOfSeance;
    }


    @Override
    public String toString() {
        return "Seance{" +
                "movie=" + movie +
                ", movieStartTime=" + movieStartTime +
                ", placesInSeance=" + placesInSeance +
                ", priceOfSeance=" + priceOfSeance +
                '}';
    }
}
