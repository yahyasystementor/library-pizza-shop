package main.polymorfism;

public class Main {
    public static void main(String[] args) {

        Borrowable newItem = new Movie("Pippi", false);


        newItem.borrow();
        newItem.returnItem();
        newItem.isAvailable();
    }
}





        /*

        Media movie = new Book("test", false);

        System.out.println(movie.loanDays());


        // Object
        //   I
        // Media
        //   I
        // Movie




         */
