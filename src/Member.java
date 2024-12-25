import java.util.*;
import java.io.*;
class Member extends User {
    private String email;
    private String phoneNumber;
    private List<Book> borrowedBooks;

    public Member(String userID, String name, String email, String phoneNumber) {
        super(userID, name);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailable(true);
        } else {
            System.out.println("This book was not borrowed by this member.");
        }
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public void displayOptions() {
        System.out.println("Member Options: ");
        System.out.println("1. Search Books\n2. View Borrowed Books\n0. Logout");
    }
}