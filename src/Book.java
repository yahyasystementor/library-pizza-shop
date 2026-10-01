public class Book {

    private static final String ADMINUSERNAME = "yahya";


    private String title;
    private String author;
    private int year;
    private boolean borrowed;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.borrowed = false;
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

    public boolean isBorrowed() {
        return borrowed;
    }

    public void borrow() {
        if(borrowed) {
            System.out.println("Redan utlånad: " + title);
            return; // Do we need a return here
        }
        borrowed = true;
        System.out.println("Lånade ut: " + title);
    }

    public void returnBook() {
        if(!borrowed) {
            System.out.println("Bokan var inte utlånad");
            return;
        }
        borrowed = false;
        System.out.println("Återlämnad");
    }


}
