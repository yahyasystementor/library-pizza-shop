package main.medialist;

public class AudioBook extends Media{

    private String narrator;

    public AudioBook(String title, String narrator) {
        super(title);
        this.narrator = narrator;
    }


    @Override
    public void play() {
        System.out.println("Playing AudioBook..");
    }

    @Override
    public String getDescription(){
        return "AudioBook narrated by: " + narrator;
    }



}
