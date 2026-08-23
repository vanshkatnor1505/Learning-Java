// NUMBER SEQUENCE DETECTIVE

// GIVEN ::::
// int number = 1;

// Build a program that repeatedly asks the user for the next number in a sequence.
// The hidden sequence is:
// 2 → 5 → 10 → 17 → 26 → 37 → ...

// Your program must determine whether the user's entered number follows the pattern.
// The pattern
// 2 → 5   = +3
// 5 → 10  = +5
// 10 → 17 = +7
// 17 → 26 = +9
// 26 → 37 = +11
// The difference increases by 2 every time.

// Rules

// Start with:
// int expected = 2;
// int difference = 3;
// int correct = 0;
// int wrong = 0;

// Repeatedly ask:
// ENTER NEXT NUMBER:
// If the user enters the expected number
// Print:
// CORRECT

// Then:
// increase correct
// calculate the next expected number
// increase the difference by 2


// If the user enters the wrong number
// Print:
// WRONG
// EXPECTED : 17

// Then:
// increase wrong
// do NOT advance the sequence

// So if the expected number is 17 and they enter 20:
// WRONG
// EXPECTED : 17
// The next question should still expect 17.


// Termination rules
// The program continues until either:

// Condition 1
// The user enters:
// -1
// This means:
// USER QUIT

// Condition 2
// The user makes 3 wrong answers.
// Then:
// GAME OVER
// TOO MANY MISTAKES

// Condition 3
// The user gets 5 correct answers.
// Then:
// SEQUENCE MASTER
// YOU GOT 5 CORRECT

// Final Summary
// Before terminating, print:
// ===== FINAL RESULT =====
// CORRECT : x
// WRONG   : x

//  The real challenge

// Your loop has three possible stopping conditions:
// user enters -1
//        OR
// wrong == 3
//        OR
// correct == 5

// And there's another subtle piece:
// A wrong answer must not change the expected sequence.

package loops.dowhileloop;

public class Ques5 {
    
}
