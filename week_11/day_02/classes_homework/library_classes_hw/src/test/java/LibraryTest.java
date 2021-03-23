import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Borrower borrower;

    @Before
    public void before() {
        library = new Library(2);
        book1 = new Book("Filth", "Irvine Welsh", "Crime");
        book2 = new Book("Trainspotting", "Irvine Welsh", "Dark Comedy");
        book3 = new Book("Harry Potter 1", "J.K. Rowling", "Kids");
        book4 = new Book("Harry Potter 2", "J.K. Rowling", "Kids");
        book5 = new Book("Harry Potter 3", "J.K. Rowling", "Kids");
        borrower = new Borrower("Mark");
    }

    @Test
    public void canCountTotalBooksInLibrary() {
        assertEquals(0, library.countTotalBooks());
    }

    @Test
    public void canAddBookToLibraryStock() {
        library.addBookToStock(book1);
        assertEquals(1, library.countTotalBooks());
    }

    @Test
    public void canCheckNotOverCapacity() {
        library.addBookToStock(book1);
        library.addBookToStock(book2);
        library.addBookToStock(book3);
        assertEquals(2, library.countTotalBooks());
    }

    @Test
    public void canRemoveBookFromLibraryStock() {
        library.addBookToStock(book1);
        library.addBookToStock(book2);
        library.removeBookFromStock();
        assertEquals(1, library.countTotalBooks());
    }

    @Test
    public void canLendBookToBorrower() {
        library.addBookToStock(book1);
        library.addBookToStock(book2);
        library.lendBookToBorrower(borrower);
        assertEquals(1, library.countTotalBooks());
        assertEquals(1, borrower.countBooksInCollection());
    }
}
