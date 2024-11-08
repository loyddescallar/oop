public class Book {
    // Step 1: Private attributes
    private int bookNumber;
    private String title;
    private String author;
    private double price;

    // Step 2: Constructor to initialize the attributes
    public Book(int bookNumber, String title, String author, double price) {
        this.bookNumber = bookNumber;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Step 3: Getter and Setter for bookNumber
    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        if (bookNumber > 0) {
            this.bookNumber = bookNumber;
        } else {
            System.out.println("Invalid book number.");
        }
    }

    // Step 4: Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Invalid title.");
        }
    }

    // Step 5: Getter and Setter for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Invalid author name.");
        }
    }

    // Step 6: Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price.");
        }
    }

    // Step 7: Optional method to display book information
    public void displayBookInfo() {
        System.out.println("Book Number: " + bookNumber);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating an instance of the Book class
        Book book1 = new Book(101, "La Solidaridad", "Graciano Lopez Jaena", 10.99);

        // Displaying initial book information
        book1.displayBookInfo();

        // Using setters to modify attributes
        book1.setTitle("1984");
        book1.setAuthor("Graciano Lopez Jaena");
        book1.setPrice(12.99);

        // Displaying updated book information
        System.out.println("\nUpdated Book Info:");
        book1.displayBookInfo();
    } // <-- Make sure the main method is properly closed
} // <-- And ensure the class is properly closed with a closing brace
