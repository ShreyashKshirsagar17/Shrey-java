package MatrixRotation;

//Program 1: Student Management System
//Demonstrates Class, Object, Constructor, Methods, Array of Objects

import java.util.Scanner;

class Student {
 int rollNo;
 String name;
 double marks;

 // Constructor
 Student(int rollNo, String name, double marks) {
     this.rollNo = rollNo;
     this.name = name;
     this.marks = marks;
 }

 // Method to calculate grade
 char calculateGrade() {
     if (marks >= 90)
         return 'A';
     else if (marks >= 75)
         return 'B';
     else if (marks >= 60)
         return 'C';
     else if (marks >= 40)
         return 'D';
     else
         return 'F';
 }

 // Method to display student details
 void display() {
     System.out.println("-----------------------------");
     System.out.println("Roll No : " + rollNo);
     System.out.println("Name    : " + name);
     System.out.println("Marks   : " + marks);
     System.out.println("Grade   : " + calculateGrade());
 }
}

public class new99 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of students: ");
     int n = sc.nextInt();
     sc.nextLine();

     Student[] students = new Student[n];

     // Input student data
     for (int i = 0; i < n; i++) {
         System.out.println("\nEnter details of Student " + (i + 1));

         System.out.print("Roll No: ");
         int rollNo = sc.nextInt();
         sc.nextLine();

         System.out.print("Name: ");
         String name = sc.nextLine();

         System.out.print("Marks: ");
         double marks = sc.nextDouble();
         sc.nextLine();

         students[i] = new Student(rollNo, name, marks);
     }

     // Display student details
     System.out.println("\n===== STUDENT REPORT =====");
     for (Student s : students) {
         s.display();
     }

     sc.close();
 }
}