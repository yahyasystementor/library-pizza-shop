package medialist;

public class Main {
    public static void main(String[] args) {




        // Movies
        Media movie1 = new Movie("movie1", 2);
        Movie movie2 = new Movie("movie2", 2);


        // AudioBook
        AudioBook audioBook1 = new AudioBook("Audio1", "Yahya");
        AudioBook audioBook2 = new AudioBook("Audio2", "Yahya");

        // Music
        Music music1 = new Music("Music1", "Yahya");
        Music music2 = new Music("Music2", "Yahya");





        Media[] media = new Media[6];

        // Movies
        media[0] = movie1;
        media[1] = movie2;


        // AudioBook
        media[2] = audioBook1;
        media[3] = audioBook2;

        // Music
        media[4] = music1;
        media[5] = music2;


        ((Movie) movie1).showTrailer();


        for (int i = 0;i < media.length; i++) {
            media[i].showInfo();
            media[i].play();
        }












    }
}
