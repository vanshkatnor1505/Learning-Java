// Bitwise Number Analyzer

// Write a Java program that takes an integer:
// int number = 29;

// and prints:
// NUMBER       : 29
// BINARY       : 11101
// ODD/EVEN     : ODD
// BIT 0        : 1
// BIT 1        : 0
// BIT 2        : 1
// BIT 3        : 1
// BIT 4        : 1

// Rules
// You must use bitwise operators to determine whether the number is odd/even.
// You must use bit masking to determine the value of each bit.
// Don't use % 2 for odd/even.
// Don't use loops yet.
// For this question, manually handle bits 0 through 4.

package operators.bitwise;

public class Ques1 {
    public static void main(String[] args) {
        int number = 29;
        String oddeven = "ODD";

        int bit0 = number & 1;
        int bit1 = (number & (1 << 1)) >> 1;
        int bit2 = (number & (1 << 2)) >> 2;
        int bit3 = (number & (1 << 3)) >> 3;
        int bit4 = (number & (1 << 4)) >> 4;
        int bit5 = (number & (1 << 5)) >> 5;


        if (bit0 == 0) {
            oddeven = "EVEN";
        }

        System.out.println("NUMBER    : " + number);
        System.out.println("BINARY    : " + Integer.toBinaryString(number));
        System.out.println("ODD/EVEN  : " + oddeven);
        System.out.println("BIT 0     : " + bit0);
        System.out.println("BIT 1     : " + bit1);
        System.out.println("BIT 2     : " + bit2);
        System.out.println("BIT 3     : " + bit3);
        System.out.println("BIT 4     : " + bit4);
        System.out.println("BIT 5     : " + bit5);

    }
}
