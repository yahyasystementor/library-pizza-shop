package spotify;

public class Spotify {
    public static void main(String[] args) {
        Wrapped wrapped = new Wrapped();

        wrapped.addSong("Blinding Lights", "The Weeknd");
        wrapped.addSong("Starboy", "The Weeknd");
        wrapped.addSong("Save Your Tears", "The Weeknd");
        wrapped.addSong("Die For You", "The Weeknd");
        wrapped.addSong("Shape of You", "Ed Sheeran");
        wrapped.addSong("Bad Habits", "Ed Sheeran");
        wrapped.addSong("Perfect", "Ed Sheeran");
        wrapped.addSong("As It Was", "Harry Styles");
        wrapped.addSong("Watermelon Sugar", "Harry Styles");
        wrapped.addSong("Sign of the Times", "Harry Styles");

        wrapped.printReport();
    }
}
