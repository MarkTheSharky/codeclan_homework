import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before() {
        borrower = new Borrower("Mark");
        library = new Library(5);
        book = new Book("Filth", "Irvine Welsh", "Crime");
    }

    @Test
    public void CanCountBooksInCollection() {
        assertEquals(0, borrower.countBooksInCollection());
    }

    @Test
    public void canAddBookToCollection() {
        borrower.addBookToCollection(book);
        assertEquals(1, borrower.countBooksInCollection());
    }
}
