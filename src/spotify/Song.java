package spotify;

public class Song {
    String artist;
    String title;

    public Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return artist + " - " + title;
    }






}
