package Exception;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

        library.addBook(book1);
        library.addBook(book2);

        try {
            // Attempt to find a book by a valid ISBN
            Book foundBook = library.findBookByIsbn("1234567890");
            System.out.println("Book found: ");
            foundBook.displayDetails();

            // Attempt to find a book by an invalid ISBN
            library.findBookByIsbn("1111111111");
        } catch (BookNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Library book search completed.");
        }

        // Display all books in the library
        library.displayBooks();
    }
}
