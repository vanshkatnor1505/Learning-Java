// Ternary + Operators

// Write a program with:
// int a = 12;
// int b = 7;
// int c = 12;

// Your program must determine:
// 1. Which number is largest
// Print the actual number.

// 2. Whether the largest number appears more than once
// For these values:
// 12, 7, 12

// the answer should be:
// REPEATED : YES

// For:
// 12, 7, 5
// it should be:
// REPEATED : NO

// 3. Determine the relationship between a and b
// Possible results:
// A > B
// A < B
// A = B

// 4. Determine whether the largest number is:
// POSITIVE EVEN
// POSITIVE ODD
// NEGATIVE EVEN
// NEGATIVE ODD
// ZERO

// Output for the given values:
// A           : 12
// B           : 7
// C           : 12
// LARGEST     : 12
// REPEATED    : YES
// A VS B      : A > B
// DESCRIPTION : POSITIVE EVEN

package operators.ternary;

public class Ques6 {
    public static void main(String[] args) {
        int a = 12;
        int b = 7;
        int c = 12;

        int largest = (a > b) ? a : b;
        largest = (largest > c) ? largest : c;

        String repeated = (largest == a && largest == b) ? "YES"
                : (largest == b && largest == c) ? "YES" : (largest == a && largest == c) ? "YES" : "NO";

        String relation = (a > b) ? "A > B" : (a < b) ? "A < B" : "A = B";

        String description = (largest % 2 == 0 && largest > 0) ? "POSITIVE EVEN"
                : (largest % 2 == 0 && largest < 0) ? "NEGATIVE EVEN"
                        : (largest % 2 != 0 && largest > 0) ? "POSITIVE ODD"
                                : (largest % 2 != 0 && largest < 0) ? "NEGATIVE ODD" : "ZERO";

        System.out.println("A            : " + a);
        System.out.println("B            : " + b);
        System.out.println("C            : " + c);
        System.out.println("LARGEST      : " + largest);
        System.out.println("REPEATED     : " + repeated);
        System.out.println("A VS B       : " + relation);
        System.out.println("DESCRIPTION  : " + description);

    }
}
