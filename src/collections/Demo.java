package collections;


import java.util.*;

public class Demo {
    public static void main(String[] args) {

        Map<String,Song> spotifyWrapped = new HashMap<>();

        spotifyWrapped.put("slot1", new Song("Levels", "Avicii", 203));
        spotifyWrapped.put("slot2", new Song("Levels", "Avicii", 203));

        //System.out.println("Slot 1: " + spotifyWrapped.get("slot1"));
        //System.out.println("Finns slot 2 " + spotifyWrapped.containsKey("slot2"));


        for (Map.Entry<String, Song> entry : spotifyWrapped.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


























        /*

        List<Song> playlist = new ArrayList<>();

        playlist.add(new Song("Levels", "Avicii", 203));
        playlist.add(new Song("Dancing queen", "ABBA", 231));
        playlist.add(new Song("Dancing on my own", "Robyn", 287));
        playlist.add(new Song("Screaming in the shower", "Yahya", 100));

        System.out.println(playlist.size());

        playlist.add(new Song("Levels1", "Avicii1", 203));

        System.out.println(playlist.size());







        Set<String> artists = new HashSet<>();

        for (Song song : playlist) {
           artists.add(song.getArtist());
        }

        System.out.println("Låtar: " + playlist.size());
        System.out.println("Artists: " + artists.size());


        Song kopia = new Song("Levels", "Avicii", 203);

        System.out.println("Finns den här låten redan?: " + playlist.contains(kopia));




         */



















    }
}
