package model;

public class Movie {
    private int id;
    private String title;
    private String genre;
    private int year;
    private String director;

    // Constructor
    public Movie() {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.director = director;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // Optional: Override toString() method for better representation
    @Override
    public String toString() {
        return "Movie{id=" + id + ", title='" + title + "', genre='" + genre + "', year=" + year + ", director='" + director + "'}";
    }
}
