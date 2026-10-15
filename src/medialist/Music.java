package medialist;

public class Music extends Media{

    private String artist;

    public Music(String title, String artist) {
        super(title);
        this.artist = artist;
    }


    @Override
    public void play() {
        System.out.println("Playing music..");
    }

    @Override
    public String getDescription(){
        return "Song by: " + artist;
    }

}
