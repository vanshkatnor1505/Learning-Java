// PIN Authentication System
// Create a Java program that simulates a simple PIN authentication system.

// GIVEN :::
// int correctPin = 1234;

// The user must enter the PIN using Scanner.

// Rules
// The program must ask the user for the PIN at least once.
// If the entered PIN is correct:
// ACCESS GRANTED
// and the program should stop asking for the PIN.

// If the PIN is incorrect:
// INCORRECT PIN
// The user gets a maximum of 3 attempts.

// If all 3 attempts are incorrect:
// ACCOUNT LOCKED
// Display the current attempt number when asking for the PIN.

// You may use variables such as:
// int correctPin = 1234;
// int enteredPin;
// int attempts = 0;


package loops.dowhileloop;
import java.util.*;

public class Ques1 {
    public static void main(String[] args) {
        int correctPin = 1234;
        int attempts = 1;

        Scanner sc = new Scanner(System.in);
        

        do{
            System.out.print("ENTER YOUR PIN : ");
            int enteredPin = sc.nextInt();

            if (enteredPin == correctPin) {
                System.out.println("ENTERED PIN IS CORRECT");
                break;
            }
            else{
                System.out.println("PIN IS INCORRECT ");
                System.out.println("REMAINING ATTEMPTS : " + (3 - attempts));

                if ((2-attempts) == 0) {
                    System.out.println("ACCESS BLOCKED");
                }
            }

            attempts ++;
        }while((3 - attempts) >= 0);

        sc.close();
    }
}
