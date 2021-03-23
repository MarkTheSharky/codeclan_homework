import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int countTotalBooks() {
        return this.books.size();
    }

    public void addBookToStock(Book book) {
        if (this.books.size() < this.capacity) {
            this.books.add(book);
        }
    }

    public Book removeBookFromStock() {
        return this.books.remove(0);
    }

    public void lendBookToBorrower(Borrower borrower) {
        if (this.countTotalBooks() > 0) {
            Book bookBorrowed = this.removeBookFromStock();
            borrower.addBookToCollection(bookBorrowed);
        }
    }
}
