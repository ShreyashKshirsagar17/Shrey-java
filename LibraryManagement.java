package MatrixRotation;

//Program 3: Library Management System
//Demonstrates Classes, Arrays, Searching

import java.util.Scanner;

class Book {
 int bookId;
 String title;
 String author;
 boolean issued;

 Book(int bookId, String title, String author) {
     this.bookId = bookId;
     this.title = title;
     this.author = author;
     this.issued = false;
 }

 void issueBook() {
     if (!issued) {
         issued = true;
         System.out.println("Book issued successfully.");
     } else {
         System.out.println("Book is already issued.");
     }
 }

 void returnBook() {
     if (issued) {
         issued = false;
         System.out.println("Book returned successfully.");
     } else {
         System.out.println("Book was not issued.");
     }
 }

 void display() {
     System.out.println("--------------------------------");
     System.out.println("Book ID   : " + bookId);
     System.out.println("Title     : " + title);
     System.out.println("Author    : " + author);
     System.out.println("Status    : " + (issued ? "Issued" : "Available"));
 }
}

public class LibraryManagement {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     Book[] books = {
         new Book(1, "Java Programming", "James Gosling"),
         new Book(2, "Data Structures", "Mark Allen"),
         new Book(3, "Database Systems", "Korth")
     };

     int choice;
     do {
         System.out.println("\n===== LIBRARY MENU =====");
         System.out.println("1. Display Books");
         System.out.println("2. Issue Book");
         System.out.println("3. Return Book");
         System.out.println("4. Exit");
         System.out.print("Enter choice: ");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 for (Book b : books) {
                     b.display();
                 }
                 break;

             case 2:
                 System.out.print("Enter Book ID to issue: ");
                 int issueId = sc.nextInt();
                 for (Book b : books) {
                     if (b.bookId == issueId) {
                         b.issueBook();
                     }
                 }
                 break;

             case 3:
                 System.out.print("Enter Book ID to return: ");
                 int returnId = sc.nextInt();
                 for (Book b : books) {
                     if (b.bookId == returnId) {
                         b.returnBook();
                     }
                 }
                 break;

             case 4:
                 System.out.println("Exiting Library System.");
                 break;

             default:
                 System.out.println("Invalid choice.");
         }
     } while (choice != 4);

     sc.close();
 }
}
