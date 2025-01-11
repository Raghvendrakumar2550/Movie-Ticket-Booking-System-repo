package dao;

import model.Movie;
import java.util.List;

public interface MovieDAO {
    void addMovie(Movie movie);
    Movie getMovieById(int movieId);
    List<Movie> getAllMovies();
    void updateMovie(Movie movie);
    boolean deleteMovie(int movieId);
}
