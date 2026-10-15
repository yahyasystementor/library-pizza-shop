package arv;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Media> mediaList = new ArrayList<>();

        mediaList.add(new Book("Pippi", "Astrid", "Barn", 1980, false, 33));
        mediaList.add(new Movie("Pippi", "Yahya", "Barn", 1980, false, 2));
        mediaList.add(new AudioBook("Pippi", "Elias", "Barn", 1980, false, 2));



        for (Media media : mediaList) {
            System.out.println(media.title);
            System.out.println(media.creator);
        }







    }
}
