// Number Guessing Game
// Build a number-guessing program using do-while.

// GIVEN ::::
// int secretNumber = 73;

// The user has to guess the number.

// RULES ::::
// Ask the user to enter a guess.

// If the guess is greater than the secret number:
// TOO HIGH

// If the guess is smaller than the secret number:
// TOO LOW

// If the guess is correct:
// CORRECT!

// The user gets a maximum of 5 attempts.
// After every incorrect guess, display the number of attempts remaining.

// If all 5 attempts are exhausted without finding the number:
// GAME OVER
// THE NUMBER WAS : 73

// If the user finds it, also display:
// YOU FOUND IT IN X ATTEMPTS

package loops.dowhileloop;

import java.util.*;

public class Ques2 {
    public static void main(String[] args) {
        int secretNum = 15;
        int attempt = 1;
        int guess;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("ENTER YOUR GUESS : ");
            guess = sc.nextInt();

            if (guess == secretNum) {
                System.out.println("YOU GUESSED IT RIGHT NUMBER IS : " + secretNum);
            } else if (guess > secretNum) {
                System.out.println("NUMBER IS TO HIGH THAN SECRET NUM");
            } else if (guess < secretNum) {
                System.out.println("NUMBER IS TO LOW THAN SECRET NUM");
            }

            System.out.println("ATTEMPTS LEFT : " + (5 - attempt));

            attempt++;

            if ((6 - attempt) == 0) {
                if (guess == secretNum) {
                    System.out.println("YOU GUESSED IT RIGHT NUMBER IS : " + secretNum);
                } else {
                    System.out.println("GAME OVER YOU USED ALL ATTEMPTS");
                    System.out.println("NUMBER WAS " + secretNum);
                }
                break;
            }
        } while ((guess != secretNum));

        sc.close();
    }
}
