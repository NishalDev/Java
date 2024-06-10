package Exception;


import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBookByIsbn(String isbn) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new BookNotFoundException("Book with ISBN " + isbn + " not found");
    }

    public void displayBooks() {
        for (Book book : books) {
            book.displayDetails();
        }
    }
}
