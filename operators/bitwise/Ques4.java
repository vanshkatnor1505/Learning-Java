// Sequential Bit Manipulation

// Start with:
// int number = 45;

// Perform these operations in this exact order:
// Set bit 1
// Clear bit 3
// Toggle bit 5
// Check bit 2

// Check whether the final number is odd/even

// Print the number after every modification:
// ORIGINAL       : 45
// AFTER SET 1    : xxx
// AFTER CLEAR 3  : xxx
// AFTER TOGGLE 5 : xxx
// BIT 2          : SET/NOT SET
// FINAL PARITY   : ODD/EVEN
// Rules

// You have to actually update number:
// number = ...

package operators.bitwise;

public class Ques4 {
    public static void main(String[] args) {
        int number = 45;

        System.out.println("ORIGNAL : " + number);
        System.out.println(Integer.toBinaryString(number));

        number = number | (1 << 1);
        System.out.println("AFTER SET 1 : " + number);
        System.out.println(Integer.toBinaryString(number));

        number = number & ~(1 << 3);
        System.out.println("CLEAR 3 : " + number);
        System.out.println(Integer.toBinaryString(number));

        number = number ^ (1 << 5);
        System.out.println("ATER TOGGLE 5 : " + number);
        System.out.println(Integer.toBinaryString(number));

        if ((number & (1 << 2)) == 4) {
            System.out.println("BIT 2 : SET");

        } else {
            System.out.println("BIT 2 : NOT SET");
        }

        if ((number & (1 << 0)) == 1) {
            System.out.println("PARITY : ODD");
        }
        else{
            System.out.println("PARITY : EVEN");
        }
    }
}
