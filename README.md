# Object-Oriented-Programming-Project
# Library Management System

## Overview
The Library Management System is a Java-based application that demonstrates the core principles of Object-Oriented Programming (OOP). It allows users to manage a library's collection of books, register members, and handle book loans. The project includes both admin and member roles, along with advanced reporting features.

---

## Features

### Core Features
1. **Book Management**:
   - Add, remove, and search for books by title, author, or genre.
   - List all books in the library.
2. **Member Management**:
   - Register new members.
   - View all registered members.
3. **Loan Management**:
   - Issue books to members.
   - Return borrowed books.
4. **Reports**:
   - Generate reports for the most borrowed books.
5. **Roles**:
   - Admin and member roles with role-specific options.

---

## OOP Principles Applied
1. **Encapsulation**:
   - Classes have private fields with public getters and setters.
2. **Inheritance**:
   - `User` is an abstract superclass with `Admin` and `Member` subclasses.
3. **Polymorphism**:
   - Role-based options are implemented using method overriding.
4. **Abstraction**:
   - `User` is an abstract class providing a template for specific user types.
5. **Collections**:
   - Lists and maps are used to manage books, members, and loan records.

---

## Class Structure
1. **Book Class**:
   - Represents a book with fields like `title`, `author`, `ISBN`, `genre`, and availability.
2. **User Abstract Class**:
   - Base class for `Admin` and `Member`.
3. **Admin Class**:
   - Admin role with permissions to add/remove books and generate reports.
4. **Member Class**:
   - Member role with options to borrow/return books and view their borrowed books.
5. **Library Class**:
   - Central class managing books, members, loans, and reports.

---

## Usage
1. **Start the Program**:
   - Run the `LibraryManagementSystem` class.
2. **Login as Admin**:
   - Access options to manage books, members, and generate reports.
3. **Add Books**:
   - Use the "Add Book" option and provide book details (title, author, ISBN, genre).
4. **Register Members**:
   - Use the "Register Member" option and provide member details.
5. **Issue Books**:
   - Provide the book's ISBN and the member's ID.
6. **Return Books**:
   - Enter the ISBN of the book being returned.

---

## Example Interaction
- **Admin Menu Options**:
  ```
  Admin Options:
  1. Add Book
  2. Remove Book
  3. List All Books
  4. Register Member
  5. List All Members
  6. Generate Reports
  0. Logout
  ```
- **Member Menu Options**:
  ```
  Member Options:
  1. Search Books
  2. View Borrowed Books
  0. Logout
  ```

---

## Setup Instructions
1. **Prerequisites**:
   - Java Development Kit (JDK) 8 or higher.
2. **Compile and Run**:
   - Use any IDE (e.g., IntelliJ, Eclipse) or compile via terminal:
     ```bash
     javac LibraryManagementSystem.java
     java LibraryManagementSystem
     ```
3. **Dependencies**:
   - No external dependencies; uses standard Java libraries.

---

## Future Enhancements
1. **Fine Calculation**:
   - Implement a system to calculate fines for overdue books.
2. **Persistent Storage**:
   - Save and load data using file I/O or a database.
3. **Enhanced Search**:
   - Add fuzzy search capabilities for better book searches.
4. **Graphical User Interface (GUI)**:
   - Replace the console menu with a user-friendly GUI.

---

## Author
Ibrahim

