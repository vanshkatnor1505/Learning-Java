// Find the Largest Number

// Create a method:
// public static int findLargest(int a, int b, int c)

// Requirements:
// Accept three integers.
// Determine which number is the largest.
// Return the largest number.
// Do not print anything inside the method.

// Test it with at least these cases:

// Input
// findLargest(10, 25, 15)
// findLargest(50, 20, 30)
// findLargest(5, 5, 2)
// findLargest(-10, -3, -7)

// Expected output
// 25
// 50
// 5
// -3

package functions;

public class Ques5 {
    public static int largest(int a, int b, int c) {

        if (a >= b && a >= c) {
            return a;
        } else if (b >= c && b >= a) {
            return b;
        } else {
            return c;
        }

    }

    public static void main(String[] args) {
        System.out.println(largest(10, 25, 15));
        System.out.println(largest(50, 20, 30));
        System.out.println(largest(5, 5, 2));
        System.out.println(largest(-10, -3, -7));
    }
}
