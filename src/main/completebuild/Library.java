package main.completebuild;

import java.util.*;

public class Library {

    private List<Book> books = new ArrayList<>();
    private Map<String, Book> booksById = new HashMap<>();
    private List<Loan> loanHistory =  new ArrayList<>();


    public boolean addBook(Book book){
        if (booksById.containsKey(book.getId())){
            return false;
        }
        books.add(book);
        booksById.put(book.getId(), book);
        return true;
    }

    public Book getBookById(String id){
        return booksById.get(id);
    }

    public List<Book> getSortedBooks(){
        List<Book> sortedBooks = new ArrayList<>(books);
        Collections.sort(sortedBooks);
        return sortedBooks;
    }

    public boolean borrow(String id, String borrower){
        Book book = getBookById(id);
        if (book == null){
            return false;
        }
        if (!book.borrow()){
            return false;
        }
        Loan loan = new Loan(book, borrower);

        loanHistory.add(loan);
        return true;


    }



}
