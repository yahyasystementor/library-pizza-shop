package main.completebuild;

import static main.completebuild.Utility.showCatalog;
import static main.completebuild.Utility.showPrints;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();


        library.addMedia(new Book("1", "Pippi långstrump",  1945, "Astrid Lindgren"));
        library.addMedia(new Book("2", "Pippi långstrump",  1945,"Astrid Lindgren"));
        library.addMedia(new Book("3", "Sagan om ringen",  1950, "Tolkien"));
        library.addMedia(new Book("4", "Emil i lönneberga", 1945,"Astrid Lindgren" ));
        library.addMedia(new Book("5", "Javautveckling ", 1980,"Linus Båge" ));


        System.out.println("Katalog före lån");
        showCatalog(library);
        showPrints(library);
        System.out.println("Katalog efter lån");
        showCatalog(library);








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
7-Refacotor, loggning, felsökning DONE
8- Nätverk, Client & Server


 */