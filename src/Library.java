import java.util.*;
import java.io.*;
class Library {
    private List<Book> books;
    private List<Member> members;
    private Map<String, Integer> borrowCount;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        borrowCount = new HashMap<>();
    }

    // Book Management
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String ISBN) {
        books.removeIf(book -> book.getISBN().equals(ISBN));
    }

    public void searchBooks(String query) {
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(query.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(query.toLowerCase()) ||
                    book.getGenre().toLowerCase().contains(query.toLowerCase())) {
                System.out.println(book);
            }
        }
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Member Management
    public void registerMember(Member member) {
        members.add(member);
    }

    public Member findMember(String memberID) {
        for (Member member : members) {
            if (member.userID.equals(memberID)) {
                return member;
            }
        }
        return null;
    }

    public void listMembers() {
        for (Member member : members) {
            System.out.println(member);
        }
    }

    // Reports
    public void generateReports() {
        System.out.println("Most Borrowed Books:");
        borrowCount.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(5)
                .forEach(entry -> System.out.println("ISBN: " + entry.getKey() + ", Count: " + entry.getValue()));
    }

    public void issueBook(String ISBN, String memberID) {
        Book bookToIssue = null;
        for (Book book : books) {
            if (book.getISBN().equals(ISBN) && book.isAvailable()) {
                bookToIssue = book;
                break;
            }
        }

        Member member = findMember(memberID);

        if (bookToIssue != null && member != null) {
            member.borrowBook(bookToIssue);
            borrowCount.put(ISBN, borrowCount.getOrDefault(ISBN, 0) + 1);
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book or Member not found, or Book is unavailable.");
        }
    }

    public void returnBook(String ISBN, String memberID) {
        Member member = findMember(memberID);
        if (member != null) {
            for (Book book : member.getBorrowedBooks()) {
                if (book.getISBN().equals(ISBN)) {
                    member.returnBook(book);
                    System.out.println("Book returned successfully.");
                    return;
                }
            }
        }
        System.out.println("Book not found in member's borrowed list.");
    }
}