package spotify;

import java.util.*;

public class Wrapped {

    private List<Song> songs = new ArrayList<>();

    public void addSong(String title, String artist) {
        songs.add(new Song(title, artist));
    }

    public void printReport() {
        System.out.println("SPOTIFY WRAPPED");
        System.out.println("Songs listened to " + songs.size());

        System.out.println();

        Map<String, List<Song>> byArtist = getSongsByArtist();

        System.out.println("Artists listened to ");
        for (String artist : getArtists()) {
            System.out.println(artist);


            for (Song song : byArtist.get(artist)) {
                System.out.println(" " + song.getTitle());
            }
        }



    }

    public Set<String> getArtists() {
        Set<String> artists = new HashSet<>();
        for (Song song : songs) {
            artists.add(song.getArtist());
        }
        return artists;
    }




    public Map<String, List<Song>> getSongsByArtist() {
        Map<String, List<Song>> result = new HashMap<>();
        for (Song song : songs) {
            String artist = song.getArtist();
            List<Song> list = result.getOrDefault(artist, new ArrayList<>());
            list.add(song);
            result.put(artist, list);        }
        return result;
    }

}
