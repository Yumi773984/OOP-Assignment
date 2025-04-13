package Java_Coursework;
import java.util.Scanner;

public class LLBankAccounts {

    static class BankAccount {
        private String name;
        private int accountNumber;
        private double balance;
        private static int nextAccountNumber = 1; // used to assign unique account numbers

        public BankAccount(String name, double initialDeposit) {
            this.name = name;
            this.balance = initialDeposit;
            this.accountNumber = nextAccountNumber++;
        }
        
        //deposit
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposit successfull.");
            } else {
                System.out.println("Deposits cannot be negative!");
            }
        }
        
        //withdrawal
        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Withdrawal must be positive.");
            } else if (amount > balance) {
                System.out.println("You do not have sufficient balance.");
            } else {
                balance -= amount;
                System.out.println("Withdrawl successfull!");
            }
        }
        
        //add 3% interest on all accounts
        public void addInterest() {
            balance += balance * 0.03;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public void displayDetails() {
            System.out.printf("Account #%d | Name: %s | Balance: %.2f\n", accountNumber, name, balance);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount[] accounts = new BankAccount[30]; 
        int accountCount = 0; // keeps track of how many accounts are created
        int choice;

        do {
            System.out.println("----------- LL Bank Menu -----------");
            System.out.println("1. Create Your Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Add 3% Interest To All Accounts");
            System.out.println("5. Show All Accounts");
            System.out.println("6. Leave The Menu");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (accountCount >= 30) {
                        System.out.println("Max accounts has been reached");
                        break;
                    }
                    scanner.nextLine();
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the initial deposit: ");
                    double deposit = scanner.nextDouble();
                    accounts[accountCount++] = new BankAccount(name, deposit);
                    System.out.println("Account has been created.");
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    int depAcc = scanner.nextInt();
                    BankAccount accountDep = findAccount(accounts, accountCount, depAcc);
                    if (accountDep != null) {
                        System.out.print("Enter the amount to deposit: ");
                        double amt = scanner.nextDouble();
                        accountDep.deposit(amt);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the account number: ");
                    int withAcc = scanner.nextInt();
                    BankAccount accountWith = findAccount(accounts, accountCount, withAcc);
                    if (accountWith != null) {
                        System.out.print("Enter the amount to withdraw: ");
                        double amt = scanner.nextDouble();
                        accountWith.withdraw(amt);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    for (int i = 0; i < accountCount; i++) {
                        accounts[i].addInterest();
                    }
                    System.out.println("Interest added to all accounts.");
                    break;

                case 5:
                    for (int i = 0; i < accountCount; i++) {
                        accounts[i].displayDetails();
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using LL Bank.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        scanner.close();
    }

    public static BankAccount findAccount(BankAccount[] accounts, int count, int accountNumber) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }
        return null;
    }
}
