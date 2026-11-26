package main.completebuild;

public class Main {
    public static void main(String[] args) {

        Book book = new Book(1, "Pippi långstrump", "Astrid Lindgren", 1945);

        System.out.println(book);


        boolean success = book.borrow();

        if (success){
            Loan loan = new Loan(book, "Yahya");

            System.out.println(loan);
        }
        System.out.println(book);




    }
}
/*
TODO
1-Klasser och objekt DONE
2-TDD DONE
3-ENUM DONE
4-Objektsamverkan



 */