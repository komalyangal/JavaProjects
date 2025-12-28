import java.util.ArrayList;

class Book {
    int bookID;
    String bookName;
    String author;
    String publisher;
    int quantity;

    // Constructor to initialize Book details
    public Book(int bookID, String bookName, String author, String publisher, int quantity) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

       public String toString() {
        return "BookID: " + bookID + ", BookName: " + bookName + ", Author: " + author 
            + ", Publisher: " + publisher + ", Quantity: " + quantity;
    }
}

public class ArrayListDemo {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList of Books
        ArrayList<Book> bookList = new ArrayList<>();

        // Step 2: Add books to the ArrayList
        bookList.add(new Book(1, "The Alchemist", "Paulo Coelho", "HarperOne", 10));
        bookList.add(new Book(2, "1984", "George Orwell", "Penguin", 15));
        bookList.add(new Book(3, "To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott", 12));

        // Step 3: Display the size of the ArrayList
        System.out.println("Size of ArrayList: " + bookList.size());

        // Step 4: Display all elements in the ArrayList
        System.out.println("\nAll Books in the ArrayList:");
        for (Book book : bookList) {
            System.out.println(book);
        }

        // Step 5: Remove one element from the ArrayList
        System.out.println("\nRemoving the book with ID 2...");
        bookList.removeIf(book -> book.bookID == 2);

        // Step 6: Display elements after removal
        System.out.println("\nBooks in the ArrayList after removal:");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
