package polymorfism;

public class Movie extends TimedMedia{
    public Movie(String title, boolean borrowed) {
        super(title, borrowed);
    }

    @Override
    public int loanDays(){
        return 14;
    }
}

