import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name) {
        this.name = name;
        borrowedBooks = new ArrayList<>();
    }

    public int countBooksInCollection() {
        return this.borrowedBooks.size();
    }

    public void addBookToCollection(Book book) {
        this.borrowedBooks.add(book);
    }
}
