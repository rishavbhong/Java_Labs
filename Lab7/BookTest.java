// Base class Book
class Book {
    protected int bookID;
    protected String title;
    protected String author;
    protected double price;

    // Constructor for the Book class
    public Book(int bookID, String title, String author, double price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Book Created: " + title);
    }

    // Method to display the details of the book
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

// Subclass Periodical (extends Book)
class Periodical extends Book {
    private String period;  // weekly, monthly, etc.

    // Constructor for the Periodical class
    public Periodical(int bookID, String title, String author, double price, String period) {
        super(bookID, title, author, price); // Call the Book class constructor
        this.period = period;
    }

    // Method to modify the price of the periodical
    public void modifyPrice(double newPrice) {
        this.price = newPrice;
        System.out.println("Price updated to: $" + price);
    }

    // Method to modify the period of the periodical
    public void modifyPeriod(String newPeriod) {
        this.period = newPeriod;
        System.out.println("Period updated to: " + period);
    }

    // Overridden method to display the updated details of the periodical
    @Override
    public void displayBookDetails() {
        super.displayBookDetails();
        System.out.println("Period: " + period);
    }
}

// Main class to test the functionality
public class BookTest {
    public static void main(String[] args) {
        // Create an instance of Periodical (a subclass of Book)
        Periodical periodical = new Periodical(101, "Tech Trends", "John Doe", 15.99, "Monthly");

        // Display initial details of the periodical
        System.out.println("Initial Periodical Details:");
        periodical.displayBookDetails();

        // Modify the price and period
        System.out.println("\nModifying Periodical Details...");
        periodical.modifyPrice(18.99);  // Update price
        periodical.modifyPeriod("Weekly");  // Update period

        // Display updated details of the periodical
        System.out.println("\nUpdated Periodical Details:");
        periodical.displayBookDetails();
    }
}
