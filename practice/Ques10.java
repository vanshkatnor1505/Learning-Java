package practice;
// Create a Java class named BankAccount.
// Requirements
// Instance variables
// accountHolder — String
// accountNumber — long
// balance — double

// Constructors
// Create two constructors:

// No-argument constructor:
// accountHolder = "Unknown"
// accountNumber = 0
// balance = 0.0

// Parameterized constructor:
// Accept all three values.
// Initialize instance variables using this.
// Methods

// Implement these methods:
// Method    Function
// deposit(double amount)    Add money to balance
// withdraw(double amount)    Deduct money if sufficient balance exists
// displayDetails()    Display account information

// Main method

// Create two bank accounts:
// Account 1 using the no-argument constructor.
// Account 2 using the parameterized constructor with:
// Name: Vansh
// Account number: 123456
// Initial balance: ₹10,000
// Perform these operations on Account 2:
// Deposit ₹2,000.
// Withdraw ₹3,000.
// Display account details.

// Expected output
// Account Holder: Vansh
// Account Number: 123456
// Balance: 9000.0

// Rules
// Don't use static variables for account details.
// Don't directly modify the balance in main().
// Handle insufficient balance during withdrawal.
// Don't use arrays or advanced concepts yet.

class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    BankAccount() {
        accountHolder = "Unknown";
        accountNumber = 0;
        balance = 0.0;
    }

    BankAccount(String ah, long an, double b) {
        accountHolder = ah;
        accountNumber = an;
        balance = b;

    }

    double deposit(double amount) {
            balance += amount;
        return balance;
    }

    double withdraw(double amount) {
            balance -= amount;
        return balance;
    }

    void displayDetails() {
        System.out.println(accountHolder);
        System.out.println(accountNumber);
        System.out.println(balance);
    }
}

public class Ques10 {
    public static void main(String[] args) {
        BankAccount Account1 = new BankAccount();
        BankAccount Account2 = new BankAccount("Vansh", 123456, 10000);

        Account2.deposit(2000);
        Account2.withdraw(3000);

        Account1.displayDetails();
        Account2.displayDetails();

    }
}
