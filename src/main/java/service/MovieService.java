// src/main/java/service/MovieService.java
package service;

import dao.MovieDAO;
import dao.MovieDAOImpl;
import model.Movie;
import java.util.List;

public class MovieService {

    private MovieDAO movieDAO;

    // Constructor initializes the MovieDAO
    public MovieService() {
        movieDAO = new MovieDAOImpl();
    }

    // Add a new movie to the database
    public void addMovie(Movie movie) {
        movieDAO.addMovie(movie);
    }

    // Get a movie by its ID
    public Movie getMovieById(int movieId) {
        return movieDAO.getMovieById(movieId);
    }

    // Get a list of all movies
    public List<Movie> getAllMovies() {
        return movieDAO.getAllMovies();
    }

    // Update the details of an existing movie
    public void updateMovie(Movie movie) {
        movieDAO.updateMovie(movie);
    }

    // Delete a movie by its ID
    public void deleteMovie(int movieId) {
        movieDAO.deleteMovie(movieId);
    }
}
