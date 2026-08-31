// ATM Transaction Engine

// GIVEN :: 
// int balance = 12750;
// int withdrawal = 4850;
// int dailyLimit = 10000;
// boolean cardActive = true;
// boolean pinCorrect = true;
// boolean accountBlocked = false;

// Rules

// A withdrawal is approved only when:

// Card is active
// PIN is correct
// Account is not blocked
// Withdrawal is greater than 0
// Withdrawal does not exceed the balance
// Withdrawal does not exceed the daily limit

// If approved:
// Withdrawal Approved
// and update the balance.
// Otherwise:
// Withdrawal Rejected
// and do not modify the balance.

// If the transaction is rejected, determine why.
// Possible reasons:
// CARD INACTIVE
// INVALID PIN
// ACCOUNT BLOCKED
// INVALID AMOUNT
// INSUFFICIENT BALANCE
// DAILY LIMIT EXCEEDED

package conditional;

public class Ques1 {
    public static void main(String[] args) {
        int balance = 8500;
        int withdrawal = 3000;
        int dailyLimit = 10000;

        boolean cardActive = true;
        boolean pinCorrect = true;
        boolean accountBlocked = false;

        boolean approved = cardActive && pinCorrect && !accountBlocked && withdrawal > 0 && withdrawal <= balance
                && withdrawal <= dailyLimit;

        if (approved) {
            balance -= withdrawal;
            System.out.println("WITHDRAWL APPROVED :: " + approved);
            System.out.println("BALANCE  :: " + balance);

        } else {

            String reason = "";

            if (!cardActive) {
                reason = "CARD INACTIVE";
            } else if (!pinCorrect) {
                reason = "INVALID PIN";
            } else if (accountBlocked) {
                reason = "ACCOUNT IS BLOCKED";
            } else if (withdrawal <= 0) {
                reason = "INVALID AMOUNT";
            } else if (withdrawal > balance) {
                reason = "NOT ENOUGH BALANCE";
            } else if (withdrawal > dailyLimit) {
                reason = "DAILY LIMIT EXCEED";
            }

            System.out.println("WITHDRAWL DENIED REASON : " + reason);
        }

    }
}
