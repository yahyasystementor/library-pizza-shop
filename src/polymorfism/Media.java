package polymorfism;

public abstract class Media {
    private String title;


    public Media(String title,  boolean borrowed) {
        this.title = title;
    }


    public abstract int loanDays();


}
