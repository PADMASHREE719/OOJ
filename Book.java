import java.util.*;

class Book {
    String name;
    String author;
    int price;
    int num_pages;

    // Constructor
    Book(String name, String author, int price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    // Method to set details
    void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book:");
        name = sc.nextLine();
        System.out.println("Enter the author of the book:");
        author = sc.nextLine();
        System.out.println("Enter book price:");
        price = sc.nextInt();
        System.out.println("Enter number of pages in the book:");
        num_pages = sc.nextInt();
    }

    // Method to get details
    void get_details() {
        System.out.println("Book name: " + name);
        System.out.println("Author name: " + author);
        System.out.println("Book price: " + price);
        System.out.println("Total number of pages: " + num_pages);
    }

    // toString method to display book details
    public String toString() {
        return "name= " + name + "\nauthor= " + author + "\nprice= " + price + "\npages= " + num_pages;
    }
}

class BookDemo {
    public static void main(String args[]) {
        System.out.println("Enter the number of book objects to create:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Create an array of Book objects
        Book[] books = new Book[n];

        // Loop to initialize and set details for each book
        for (int i = 0; i < n; i++) {
            System.out.println("\nEntering details for book " + (i + 1));
            books[i] = new Book("", "", 0, 0);  // Placeholder values
            books[i].set_details();
        }

        // Display the details of all books
        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails of book " + (i + 1) + ":");
            books[i].get_details();
            System.out.println(books[i].toString());
        }
    }
}
