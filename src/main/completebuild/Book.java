package main.completebuild;

public class Book {

    private int id;
    private String title;
    private String author;
    private int year;
    private boolean borrowed;

    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.borrowed = false;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return !borrowed;
    }

    public boolean borrow(){

        if (borrowed){
            return false;
        }
        borrowed = true;

        return true;

    }

}
