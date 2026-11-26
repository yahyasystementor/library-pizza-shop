package main.completebuild;

public class Book implements Comparable<Book>{

    private String id;
    private String title;
    private String author;
    private int year;

    private Status status;


    public Book(String id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.status = Status.AVAILABLE;
    }



    public String getId() {
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
        return status == Status.AVAILABLE;
    }

    public boolean borrow(){

        if (status !=  Status.AVAILABLE) {
            return false;
        }
        status = Status.BORROWED;

        return true;
    }

    @Override
    public int compareTo(Book other){
        return getTitle().compareToIgnoreCase(other.getTitle());
    }


    @Override
    public String toString(){
        return id + " | " +  title + " | " + author + " | " + status;
    }

}
