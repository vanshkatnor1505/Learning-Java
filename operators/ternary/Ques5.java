// The One-Liner Trap

// Write a program with:
// int a = 15;
// int b = 25;
// int c = 10;

// Using ternary operators only, determine:
// 1. Largest number
// 2. Smallest number
// 3. Whether the largest number is even or odd
// 4. Whether all three numbers are equal

// Print:
// A              : 15
// B              : 25
// C              : 10
// LARGEST        : 25
// SMALLEST       : 10
// LARGEST PARITY : ODD
// ALL EQUAL      : NO

package operators.ternary;

public class Ques5 {
    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        int c = 10;

        int largest = (a > b) ? a : b;
        largest = (largest > c) ? largest : c;

        int smallest = (a < b) ? a : b;
        smallest = (smallest < c) ? smallest : c;

        String parity = (largest % 2 == 0) ? "EVEN" : "ODD";

        String allequal = (a != b) ? "NO" : (b != c) ? "NO" : (a != c) ? "NO" : "YES";

        System.out.println("A                : " + a);
        System.out.println("B                : " + b);
        System.out.println("C                : " + c);
        System.out.println("LARGEST          : " + largest);
        System.out.println("SMALLEST         : " + smallest);
        System.out.println("LARGEST PARITY   : " + parity);
        System.out.println("ALL EQUAL        : " + allequal);
    }
}
