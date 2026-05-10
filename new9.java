package MatrixRotation;

//Runtime Polymorphism Example
//Class name: New9

class Employee {
 void salary() {
     System.out.println("Employee salary");
 }
}

class Manager extends Employee {
 @Override
 void salary() {
     System.out.println("Manager salary is 80000");
 }
}

class Developer extends Employee {
 @Override
 void salary() {
     System.out.println("Developer salary is 60000");
 }
}

public class new9 {
 public static void main(String[] args) {
     Employee e1 = new Manager();    // Upcasting
     Employee e2 = new Developer();  // Upcasting
     Employee e3 = new Employee();

     e1.salary();   // Manager salary is 80000
     e2.salary();   // Developer salary is 60000
     e3.salary();   // Employee salary
 }
}