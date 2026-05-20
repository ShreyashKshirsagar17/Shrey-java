package MatrixRotation;
//Program 2: Bank Account Management System
//Demonstrates Encapsulation, Methods, Menu-Driven Program

import java.util.Scanner;

class BankAccount {
 private int accountNumber;
 private String holderName;
 private double balance;

 BankAccount(int accountNumber, String holderName, double balance) {
     this.accountNumber = accountNumber;
     this.holderName = holderName;
     this.balance = balance;
 }

 void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited successfully.");
     } else {
         System.out.println("Invalid amount.");
     }
 }

 void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawal successful.");
     } else {
         System.out.println("Insufficient balance.");
     }
 }

 void display() {
     System.out.println("\nAccount Number : " + accountNumber);
     System.out.println("Holder Name    : " + holderName);
     System.out.println("Balance        : ₹" + balance);
 }
}

public class BankManagement {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     BankAccount account = new BankAccount(1001, "Shreyash", 5000);

     int choice;
     do {
         System.out.println("\n===== BANK MENU =====");
         System.out.println("1. Display Account");
         System.out.println("2. Deposit");
         System.out.println("3. Withdraw");
         System.out.println("4. Exit");
         System.out.print("Enter choice: ");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 account.display();
                 break;

             case 2:
                 System.out.print("Enter amount to deposit: ");
                 double dep = sc.nextDouble();
                 account.deposit(dep);
                 break;

             case 3:
                 System.out.print("Enter amount to withdraw: ");
                 double wit = sc.nextDouble();
                 account.withdraw(wit);
                 break;

             case 4:
                 System.out.println("Thank you for using banking system.");
                 break;

             default:
                 System.out.println("Invalid choice.");
         }
     } while (choice != 4);

     sc.close();
 }
}