package Java_Coursework;

// Book class with required instance data and methods
class Book {
    private String title;
    private String author;
    private String publisher;
    private int copyrightDate;

    // Constructor
    public Book(String title, String author, String publisher, int copyrightDate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyrightDate = copyrightDate;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getCopyrightDate() {
        return copyrightDate;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setCopyrightDate(int copyrightDate) {
        this.copyrightDate = copyrightDate;
    }

    // toString method (multi-line description)
    public String toString() {
        return "Title: " + title + "\n"
             + "Author: " + author + "\n"
             + "Publisher: " + publisher + "\n"
             + "Copyright: " + copyrightDate;
    }
}

// Main class to test Book objects
public class BookShelf {
    public static void main(String[] args) {
        Book book1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "Warner Business Books", 1997);
        Book book2 = new Book("Atomic Habits", "James Clear", "Penguin Random House (Avery)", 2018);
        Book book3 = new Book("Seto Dharti", "Parijat", "Ratna Pustak Bhandar", 1959);

        // Print info
        System.out.println("Books on the shelf:\n");
        System.out.println(book1 + "\n");
        System.out.println(book2 + "\n");
        System.out.println(book3 + "\n");

        // Update book2
        book2.setPublisher("Penguin Books");
        book2.setCopyrightDate(2020);

        // Print updated book2
        System.out.println("Updated book info:\n");
        System.out.println(book2);
    }
}
