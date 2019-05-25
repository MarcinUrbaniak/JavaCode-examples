package movie;

import java.util.Objects;

public class Movie {

    String movieTitle;
    String movieDuration;


    public Movie(String movieTitle, String movieDuration) {
        this.movieTitle = movieTitle;
        this.movieDuration = movieDuration;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(String movieDuration) {
        this.movieDuration = movieDuration;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(movieTitle, movie.movieTitle) &&
                Objects.equals(movieDuration, movie.movieDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieTitle, movieDuration);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieTitle='" + movieTitle + '\'' +
                ", movieDuration='" + movieDuration + '\'' +
                '}';
    }
}
