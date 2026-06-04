package work1;

class BankAccount {

    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(10000);

        acc.deposit(5000);
        acc.withdraw(3000);
        acc.checkBalance();
    }
}
