package main.medialist;

public abstract class Media {

    private String title;
    private int year;

    public Media(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void showInfo() {
        System.out.println("This is the media class");
    }

    public abstract void play();

    public abstract String getDescription();




}
