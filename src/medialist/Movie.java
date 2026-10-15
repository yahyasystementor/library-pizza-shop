package medialist;

public class Movie extends Media {
    private int duration;

    public Movie(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    @Override
    public void play() {
        System.out.println("Playing a movie..");
    }

    @Override
    public String getDescription(){
        return "Movie with a duration of: " + duration;
    }

    public void showTrailer(){
        System.out.println("Showing trailer...");
    }


}
