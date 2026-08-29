// Bitwise Number Modifier

// Start with:
// int number = 73;

// Your program must:
// 1. Print the binary representation

// 2. Check whether bit 3 is set
// Print:
// BIT 3 : SET
// or
// BIT 3 : NOT SET

// 3. If bit 3 is NOT set → set it.

// 4. If bit 3 IS set → clear it.
// So the program should automatically decide whether to set or clear the bit.

// 5. Toggle bit 6.

// 6. Finally check bit 0 and report whether the final number is odd/even.

// Expected structure:
// ORIGINAL       : 73
// BINARY        : xxxxxxx
// BIT 3         : SET/NOT SET
// AFTER BIT 3   : xxx
// AFTER TOGGLE 6: xxx
// FINAL PARITY  : ODD/EVEN

package operators.bitwise;

public class Ques3 {
    public static void main(String[] args) {
        int number = 73;
        String bit3;
        int afterbit3 = 0;
        int toggle6 = number ^ (1 << 6);
        String parity = "";

        if ((number & (1 << 3)) == 8) {
            bit3 = "SET";
            afterbit3 = number & ~(1 << 3);
        } else {
            bit3 = "NOT SET";
            afterbit3 = number | (1 << 3);
        }

        if ((number & 1) == 1) {
            parity = "ODD";
        } else {
            parity = "EVEN";
        }

        System.out.println("ORIGNAL : " + number);
        System.out.println("BINARY  : " + Integer.toBinaryString(number));
        System.out.println("BIT 3 : " + bit3);
        System.out.println("AFTER BIT 3 : " + afterbit3);
        System.out.println("AFTER TOGGLE 6 : " + toggle6);
        System.out.println("PARITY : " + parity);

    }
}
