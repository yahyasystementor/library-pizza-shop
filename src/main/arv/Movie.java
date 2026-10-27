package main.arv;

public class Movie extends TimedMedia {

    public Movie(String title, String creator, String genre, int year, boolean borrowed, int runtime) {
        super(title, creator, genre, year, borrowed, runtime);
    }

    public static void main(String[] args) {
        Media media = new Movie("Pippi", "Astrid", "Barn", 1980, false, 33);

        media.setBorrowed(true);
    }
}
