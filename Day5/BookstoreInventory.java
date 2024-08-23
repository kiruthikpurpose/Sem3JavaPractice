import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;
    private int copies;

    // Constructor
    public Book(String title, String author, double price, int copies) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.copies = copies;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
        System.out.println("Number of Copies: " + copies);
    }
}

public class BookstoreInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Book[] books = new Book[3];

            for (int i = 0; i < books.length; i++) {
                System.out.println("Enter details for book " + (i + 1) + ":");

                System.out.print("Enter book title: ");
                String title = scanner.nextLine();

                System.out.print("Enter book author: ");
                String author = scanner.nextLine();

                System.out.print("Enter book price: ");
                double price = scanner.nextDouble();

                System.out.print("Enter number of copies: ");
                int copies = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over

                books[i] = new Book(title, author, price, copies);
            }

            System.out.println("\nBooks in the inventory:");
            for (Book book : books) {
                book.displayDetails();
                System.out.println(); // Add a blank line between books
            }
        } finally {
            scanner.close(); // Ensure the scanner is closed
        }
    }
}
