// Smart ATM Denominations

// GIVEN ::::
// int withdrawal = 5850;
// int balance = 15000;
// The ATM has these notes available:
// ₹2000
// ₹500
// ₹200
// ₹100
// ₹50

// The withdrawal is valid only when:

// withdrawal > 0
// withdrawal <= balance

// if amount cannot be devided in notes
// Withdrawal rejected
// Reason : INVALID DENOMINATION

package conditional;

public class Ques2 {
    public static void main(String[] args) {
        int withdrawal = 4000;
        int balance = 15000;

        boolean approved = (withdrawal % 50 == 0) && withdrawal > 0 && withdrawal <= balance;

        if(approved){
            int remainder  ;
            int notes;

            if (withdrawal / 2000 > 0) {
                remainder = withdrawal % 2000;
                notes = withdrawal/2000;
                System.err.println("2000 notes : " + notes);   

                withdrawal = remainder;
            }
            if (withdrawal / 500 > 0) {
                remainder = withdrawal % 500;
                notes = withdrawal/500;
                System.err.println("500 notes : " + notes); 

                withdrawal = remainder;
            }
            if (withdrawal / 200 > 0) {
                remainder = withdrawal % 200;
                notes = withdrawal/200;
                System.err.println("200 notes : " + notes); 

                withdrawal = remainder;
            }
            if (withdrawal / 100 > 0) {
                remainder = withdrawal % 100;
                notes = withdrawal/100;
                System.err.println("100 notes : " + notes); 

                withdrawal = remainder;
            }
            if (withdrawal/50 > 0) {  
                notes = withdrawal/50;
                System.err.println("50 notes : " + notes); 
            }
        }
        else{
            if (!(withdrawal % 50 == 0)) {
                System.out.println("Withdrawal rejected");
                System.out.println("Reason : INVALID DENOMINATION");
            }
            else if (!(withdrawal > 0)) {
                System.out.println("Withdrawal rejected");
                System.out.println("Reason : INVALID AMOUNT");
            }
            else if (!(withdrawal <= balance)) {
                System.out.println("Withdrawal rejected");
                System.out.println("Reason : NOT ENOUGH BALANCE");
            }
        } 
    }
}
