import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import dao.MovieDAOImpl;
import model.Movie;
import java.util.List;

class MovieDAOTest {

    MovieDAOImpl movieDAO = new MovieDAOImpl();

    @Test
    void getMovieById_validId_shouldReturnMovie() {
        Movie movie = movieDAO.getMovieById(1);
        assertNotNull(movie, "Movie should not be null for a valid ID");
    }

    @Test
    void getAllMovies_shouldReturnNonEmptyList() {
        List<Movie> movies = movieDAO.getAllMovies();
        assertTrue(movies.size() > 0, "Movies list should not be empty");
    }

    @Test
    void deleteMovie_invalidId_shouldReturnFalse() {
        boolean status = movieDAO.deleteMovie(2); // Assuming 2 is an invalid movie ID
        assertFalse(status, "Deleting a non-existing movie should return false");
    }
}
