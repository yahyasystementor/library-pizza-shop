package spotify;

import java.util.*;

public class Spotify {
    public static void main(String[] args) {


        List<Song> songs = new ArrayList<>();

        songs.add(new Song("Blinding Lights", "The Weeknd"));
        songs.add(new Song("Starboy", "The Weeknd"));
        songs.add(new Song("Save Your Tears", "The Weeknd"));
        songs.add(new Song("Die For You", "The Weeknd"));
        songs.add(new Song("Shape of You", "Ed Sheeran"));
        songs.add(new Song("Bad Habits", "Ed Sheeran"));
        songs.add(new Song("Perfect", "Ed Sheeran"));
        songs.add(new Song("As It Was", "Harry Styles"));
        songs.add(new Song("Watermelon Sugar", "Harry Styles"));
        songs.add(new Song("Sign of the Times", "Harry Styles"));

        Wrapped wrapped = new Wrapped(songs);
        wrapped.printReport();


        /*



        // Låtar
        List<String> edSheeranSongs = new ArrayList<>();
        edSheeranSongs.add("Shape of You");
        edSheeranSongs.add("Die For You");
        edSheeranSongs.add("Blinding Lights");
        edSheeranSongs.add("Someone You Loved");


        List<String> yahyaSheeranSongs = new ArrayList<>();
        yahyaSheeranSongs.add("As It Was");
        yahyaSheeranSongs.add("Stay");
        yahyaSheeranSongs.add("Perfect");

        List<String> davidSheeranSongs = new ArrayList<>();
        davidSheeranSongs.add("Flowers");
        davidSheeranSongs.add("Save Your Tears");
        davidSheeranSongs.add("Counting Stars");

        // Artister


        Set<String> artists = new HashSet<>();
        artists.add("Ed Sheeran");
        artists.add("David Sheeran");
        artists.add("Yahya Sheeran");





        // Låtar och Artister
        Map<String, List<String>> songsByArtist = new HashMap<>();

        songsByArtist.put("Ed Sheeran", edSheeranSongs);
        songsByArtist.put("David Sheeran", davidSheeranSongs);
        songsByArtist.put("Yahya Sheeran", yahyaSheeranSongs);



        // Vår wrapped

        System.out.println("SPOTIFY WRAPPED!");
        int totalSongs = 0;
        totalSongs = edSheeranSongs.size() + davidSheeranSongs.size() + yahyaSheeranSongs.size();

        System.out.println(totalSongs);
        System.out.println();

        System.out.println("Artists listned to");
        for (String artist : artists ) {
            System.out.println(artist);
        }

        System.out.println();

        for (String artist : artists) {
            System.out.println("Songs by artist: "  + artist + ":");

            for (String song : songsByArtist.get(artist)) {
                System.out.println(" " + song);
            }
            System.out.println();
        }

         */
    }
}
