package main.completebuild;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();


        library.addBook(new Book("1", "Pippi långstrump",  1945, "Astrid Lindgren"));
        library.addBook(new Book("2", "Pippi långstrump",  1945,"Astrid Lindgren"));
        library.addBook(new Book("3", "Sagan om ringen",  1950, "Tolkien"));
        library.addBook(new Book("4", "Emil i lönneberga", 1945,"Astrid Lindgren" ));
        library.addBook(new Book("5", "Javautveckling ", 1980,"Linus Båge" ));



        System.out.println("Katalog före lån");
        for (Book book: library.getSortedBooks()){
            System.out.println(book);
        }

        System.out.println("Lån lyckades: " + library.borrow("1", "Yahya"));
        System.out.println("Lån lyckades: " + library.borrow("1", "Linus"));
        System.out.println("Lån lyckades: " + library.borrow("2", "Arezo"));


        System.out.println("Alla lånetagare "  + library.getBorrowers());

        System.out.println("Katalog efter lån");
        for (Book book: library.getSortedBooks()){
            System.out.println(book);
        }









    }
}
/*
//TODO
//1-Klasser och objekt DONE
2-TDD DONE
3-ENUM DONE
4-Objektsamverkan DONE
5-Collection DONE
6-Arv, Interface och polymorfism DONE
7-Refacotor, loggning, felsökning



 */