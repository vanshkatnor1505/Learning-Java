// ATM Transaction Menu
// Build a simple ATM menu using do-while + Scanner.

// Starting state
// int balance = 10000;

// The program repeatedly displays:
// ===== ATM MENU =====
// 1. Check Balance
// 2. Deposit
// 3. Withdraw
// 4. Exit

// Ask the user to enter a choice.
// Rules

// Option 1 — Check Balance
// Print:
// CURRENT BALANCE : 10000


// Option 2 — Deposit
// Ask:
// ENTER DEPOSIT AMOUNT:
// Rules:
// Amount must be greater than 0.
// If valid, add it to the balance.
// Otherwise:
// INVALID DEPOSIT

// Option 3 — Withdraw
// Ask:
// ENTER WITHDRAWAL AMOUNT:
// Withdrawal is valid only when:
// amount > 0
// amount <= balance
// amount % 50 == 0

// If valid:
// WITHDRAWAL SUCCESSFUL
// and update the balance.

// Otherwise print an appropriate reason:
// INVALID AMOUNT
// or
// INSUFFICIENT BALANCE
// or
// INVALID DENOMINATION

// Option 4 — Exit
// Print:
// THANK YOU FOR USING THE ATM
// and terminate the program.

// Invalid menu choice
// If the user enters something other than 1–4:
// INVALID CHOICE
// Then show the menu again.

// Main Challenge
// The menu must continue appearing until the user chooses 4.
// Therefore your do-while should conceptually behave like:

// SHOW MENU
//    ↓
// GET CHOICE
//    ↓
// PROCESS CHOICE
//    ↓
// CHOICE == 4 ?
//    ├── YES → STOP
//    └── NO  → SHOW MENU AGAIN

package loops.dowhileloop;
import java.util.*;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======== ATM MENU ========");
        System.out.println("1. CHECK BALANCE");
        System.out.println("2. DEPOSIT");
        System.out.println("3. WITHDRAW");
        System.out.println("4. EXIT");
        
        int num = sc.nextInt();
        sc.close();
    }
}
