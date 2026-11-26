package main.completebuild;

public class Main {
    public static void main(String[] args) {

        Book book = new Book(1, "Pippi långstrump", "Astrid Lindgren", 1945);

        System.out.println(book.getTitle());

        System.out.println("Ledig " + book.isAvailable());



    }
}
/*
TODO
1-Klasser och objekt DONE
2-TDD DONE
3-ENUM



 */