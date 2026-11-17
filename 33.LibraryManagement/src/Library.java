import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    String name;
    int yearOpened;
    ArrayList<Book> books;

    Library(String name, int yearOpened) {
        this.name = name;
        this.yearOpened = yearOpened;
        this.books = new ArrayList<>();
    }

    void addBook(Scanner scanner) {
        System.out.print("Enter a title of book: ");
        String title = scanner.nextLine();
        System.out.print("Enter number of pages in a book: ");
        int numPages = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter author name of a book: ");
        String author = scanner.nextLine();

        Book book = new Book(title, numPages, author);
        this.books.add(book);
        System.out.println("Added a new book!");
    }

    void removeBook(Scanner scanner) {
        System.out.print("Enter an index of a book:");
        int index = scanner.nextInt();
        if (index < 0) {
            System.out.println("Index cannot be negative!");
        } else if (index >= this.books.size()) {
            System.out.println("Index out of range!");
        } else {
            this.books.remove(index);
            System.out.println("Removed item at index " + index + " successfully!");
        }
    }

    void displayLibrary () {
        System.out.println("Library:");
        for (int i = 0; i < this.books.size(); i++) {
            System.out.println(i + ") " + this.books.get(i));
        }
    }
}
