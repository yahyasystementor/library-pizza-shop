package main.completebuild;

public class Movie extends Media {

    private String director;
    private int durationMinutes;

    public Movie(String id, String title, int year, String director, int durationMinutes) {
        super(id, title, year);
        this.director = director;
        this.durationMinutes = durationMinutes;
    }


    public String getDirector() {
        return director;
    }

    @Override
    public int loanDays(){
        return 7;
    }


    @Override
    public String toString(){
        return getId() + " | " +  getTitle() + " | " + getDirector() + " | " + durationMinutes + " | "  + getStatus();
    }
}
