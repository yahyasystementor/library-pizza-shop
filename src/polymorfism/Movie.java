package polymorfism;

public class Movie extends TimedMedia implements Borrowable{

    boolean anotherRandomName;

    public Movie(String title, boolean borrowed) {
        super(title, borrowed);
    }

    @Override
    public int loanDays(){
        return 14;
    }

    @Override
    public boolean isAvailable(){
        System.out.println("Is this available");
        return true;
    }


    @Override
    public void borrow() {
        System.out.println("Movie borrowing");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning Item");
    }
}

