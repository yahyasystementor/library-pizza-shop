package test.completebuild;

import main.completebuild.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {




    @Test
    void borrowBookShouldMakeBookUnavailable(){
        // Arrange
        Book book = new Book("1", "Pippi långstrump", 1945,"Astrid Lindgren" );

        // Act
        boolean success = book.borrow();

        //Assert
        assertTrue(success);
        assertFalse(book.isAvailable());

    }


}
