package Java_Coursework;

// Account class
class Account {
    private String name;
    private String accountNumber;
    private double balance;

    // Constructor with name and account number (balance defaults to 0)
    public Account(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Constructor with name, account number, and balance
    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Not enough balance.");
        }
    }

    // toString method
    public String toString() {
        return "Name: " + name + "\n" +
               "Account Number: " + accountNumber + "\n" +
               "Balance: Rs. " + balance;
    }
}

// Main class
public class Transactions {
    public static void main(String[] args) {
        // Account with all details
        Account a1 = new Account("Sita Sharma", "A1", 300);

        // Account with just name and number (balance = 0)
        Account a2 = new Account("Ram Karki", "A2");

        // Show accounts
        System.out.println("Account 1:\n" + a1 + "\n");
        System.out.println("Account 2:\n" + a2 + "\n");

        a1.withdraw(8000);
        a2.deposit(1970);

        // Show updated info
        System.out.println("After Transactions:");
        System.out.println("Account 1:\n" + a1 + "\n");
        System.out.println("Account 2:\n" + a2 + "\n");
    }
}
