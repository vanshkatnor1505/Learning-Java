package operators.assignment;

// Running Balance
// Given ::: int balance = 5000;

// During the day:

// Deposit 2000
// Spend 750
// Deposit 1500
// Spend 300
// Spend 1200

// Use assignment operators to update balance.        


public class Ques1 {
    public static void main(String[] args) {

        int balance = 5000;

        // Transactions 
        balance += 2000;
        balance -= 750;
        balance += 1500;
        balance -= 300;
        balance -= 1200; 


        System.out.println(balance);
    }
}
