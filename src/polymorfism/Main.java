package polymorfism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Media movie = new Book("test", false);

        System.out.println(movie.loanDays());


        // Object
        //   I
        // Media
        //   I
        // Movie




    }
}
