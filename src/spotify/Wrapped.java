package spotify;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Wrapped {

    private final List<Song> songs = new ArrayList<>();

    public void addSong(String title, String artist) {
        songs.add(new Song(artist, title));
    }

    public void printReport() {
        System.out.println("SPOTIFY WRAPPED");
        System.out.println();
        System.out.println("Songs listened to: " + songs.size());
        System.out.println();

        System.out.println("All songs:");
        for (Song song : songs) {
            System.out.println(song.getTitle());
        }

        System.out.println();
        System.out.println("Artists listened to:");
        for (String artist : getArtists()) {
            System.out.println(artist);
        }

        System.out.println();
        Map<String, List<Song>> byArtist = getSongsByArtist();
        for (String artist : getArtists()) {
            System.out.println("Songs by " + artist + ":");
            for (Song song : byArtist.get(artist)) {
                System.out.println(song.getTitle());
            }
        }

        System.out.println();
        System.out.println("Total artists: " + getArtists().size());
        System.out.println("Total songs: " + songs.size());
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
            result.computeIfAbsent(artist, key -> new ArrayList<>()).add(song);
        }
        return result;
    }
}
