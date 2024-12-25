import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding some books
        library.addBook(new Book("Java Programming", "Author A", "12345", "Programming"));
        library.addBook(new Book("Data Structures", "Author B", "67890", "Computer Science"));

        // Registering members
        library.registerMember(new Member("001", "John Doe", "john@example.com", "1234567890"));
        library.registerMember(new Member("002", "Jane Smith", "jane@example.com", "0987654321"));

        // Library Console Menu
        Scanner scanner = new Scanner(System.in);
        int choice;
        User currentUser = new Admin("000", "Admin"); // Example admin login
        do {
            currentUser.displayOptions();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre = scanner.nextLine();
                    library.addBook(new Book(title, author, ISBN, genre));
                }
                case 2 -> {
                    System.out.print("Enter ISBN of book to remove: ");
                    String ISBN = scanner.nextLine();
                    library.removeBook(ISBN);
                }
                case 3 -> library.listBooks();
                case 4 -> {
                    System.out.print("Enter Member ID: ");
                    String memberID = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    library.registerMember(new Member(memberID, name, email, phoneNumber));
                }
                case 5 -> library.listMembers();
                case 6 -> library.generateReports();
                case 0 -> System.out.println("Logging out...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
