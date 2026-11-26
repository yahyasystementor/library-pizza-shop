package main.completebuild;

public class Utility {


    public static void showCatalog(Library library){
        for (Media media : library.getSorted()){
            System.out.println(media);
        }
    }
    public static void showPrints(Library library){
        System.out.println("Lån lyckades: " + library.borrow("1", "Yahya"));
        System.out.println("Lån lyckades: " + library.borrow("1", "Linus"));
        System.out.println("Lån lyckades: " + library.borrow("2", "Arezo"));
        System.out.println("Alla lånetagare "  + library.getBorrowers());
    }

}
