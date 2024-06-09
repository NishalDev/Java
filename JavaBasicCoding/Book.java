    public class Book {
    private String title;
    private String author;
    public static void main(String[] args){
        Book book = new Book("1984", "George Orwell");
        book.displayDetails();
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

  
    
}
