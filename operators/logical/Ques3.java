// ATM Transaction Validator

// GIVEN ::::
// int balance = 8500;
// int withdrawal = 3000;
// int dailyLimit = 10000;

// boolean cardActive = true;
// boolean pinCorrect = true;
// boolean accountBlocked = false;


// RULES ::::
// A withdrawal is valid when:
// The card is active.
// The PIN is correct.
// The account is not blocked.
// The withdrawal amount is greater than 0.
// The withdrawal does not exceed the current balance.
// The withdrawal does not exceed the daily limit.
// If the withdrawal is approved, actually subtract it from the balance.

// EXPECTED OUTPUT ::::
// Withdrawal Approved : true/false
// Remaining Balance   : ...

package operators.logical;

public class Ques3 {
    public static void main(String[] args) {
        int balance = 8500;
        int withdrawal = 3000;
        int dailyLimit = 10000;

        boolean cardActive = true;
        boolean pinCorrect = true;
        boolean accountBlocked = false;

        boolean approved = cardActive && pinCorrect && !accountBlocked && withdrawal > 0 && withdrawal <= balance && withdrawal <= dailyLimit ;

        if (approved == true) {
            balance -= withdrawal;
        }

        System.out.println("WITHDRAWL APPROVED :: " + approved);
        System.out.println("REMAINING BALANCE  :: " + balance);
    }
}
