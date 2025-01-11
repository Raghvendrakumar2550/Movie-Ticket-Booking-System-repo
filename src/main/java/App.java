import model.Movie;

public class App {
    public static void main(String[] args) {
        // Create some Movie objects
        Movie movie1 = new Movie();
        Movie movie2 = new Movie();
        Movie movie3 = new Movie();

        // Display details of each movie
        System.out.println("Movie 1: " + movie1.getTitle() + " (" + movie1.getYear() + ") - " + movie1.getGenre() + " - Directed by: " + movie1.getDirector());
        System.out.println("Movie 2: " + movie2.getTitle() + " (" + movie2.getYear() + ") - " + movie2.getGenre() + " - Directed by: " + movie2.getDirector());
        System.out.println("Movie 3: " + movie3.getTitle() + " (" + movie3.getYear() + ") - " + movie3.getGenre() + " - Directed by: " + movie3.getDirector());

        // Modify a movie's details using setters
        movie1.setTitle("Inception (Remastered)");
        movie1.setYear(2020);

        // Display the updated movie details
        System.out.println("\nAfter updating Movie 1:");
        System.out.println("Movie 1: " + movie1.getTitle() + " (" + movie1.getYear() + ") - " + movie1.getGenre() + " - Directed by: " + movie1.getDirector());
    }
}
