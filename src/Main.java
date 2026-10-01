import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   private static Library library = new Library("Yahyas biblotek");
   private static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
        addStartBooks();

        boolean running = true;
        while (running) {
            showMenu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1": addBook(); break;
                case "2": library.printAllBooks(); break;
                default:
                    System.out.println("Ogiltig val, try again");
            }

        }



   }



   private static void addStartBooks() {
       library.addBook(new Book("Pippi", "Astrid lindgren", 1930));
       library.addBook(new Book("Ronja rövardotter", "Astrid lindgren", 1950));
   }

   private  static void showMenu() {
       System.out.println("1. Lägg till en bok");
       System.out.println("2. Visa alla böcker");
   }

   private static void addBook(){
       System.out.println("Ange titel: " );
       String title = scanner.nextLine().trim();

       System.out.println("Författaren: " );
       String author = scanner.nextLine().trim();

       System.out.println("Utgivningsår: ");
       String year = scanner.nextLine().trim();
       int bookYear = Integer.parseInt(year);

       library.addBook(new Book(title,author,bookYear));
       System.out.println("Lade till boken: " + title);
   }

}