package main.completebuild;

public abstract class Media implements Borrowable,Comparable<Media>{

    private String id;
    private String title;
    private int year;

    private Status status;

    public Media(String id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.status = Status.AVAILABLE;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public boolean isAvailable() {
        return status == Status.AVAILABLE;
    }

    public abstract int loanDays();


    @Override
    public int compareTo(Media o) {
        return this.getTitle().compareTo(o.getTitle());
    }

    @Override
    public boolean borrow(){

        if (!isAvailable()) {
            return false;
        }
        status = Status.BORROWED;
        return true;
    }

}
