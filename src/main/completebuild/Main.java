package main.completebuild;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        library.addBook(new Book("1", "Pippi långstrump", "Astrid Lindgren", 1945));
        library.addBook(new Book("2", "Pippi långstrump", "Astrid Lindgren", 1945));
        library.addBook(new Book("3", "Sagan om ringen", "Tolkien", 1950));
        library.addBook(new Book("4", "Emil i lönneberga", "Astrid Lindgren", 1945));
        library.addBook(new Book("5", "Javautveckling ", "Linus Båge", 1980));


        System.out.println("Katalog före lån");
        for (Book book: library.getSortedBooks()){
            System.out.println(book);
        }

        System.out.println("Lån lyckades: " + library.borrow("1", "Yahya"));
        System.out.println("Lån lyckades: " + library.borrow("1", "Linus"));
        System.out.println("Lån lyckades: " + library.borrow("2", "Arezo"));


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
4-Objektsamverkan
5-Collection
6-Arv, Interface och polymorfism



 */