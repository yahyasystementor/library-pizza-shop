package polymorfism;

public class Book extends Media {

    public Book(String title, boolean borrowed) {
        super(title, borrowed);
    }


    @Override
    public int loanDays() {
        return 28;
    }

}
