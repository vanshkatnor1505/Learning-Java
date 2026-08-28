// Bit Control Panel

// Start with:
// int number = 42;

// Your program must perform these operations using bitwise operators:
// 1. Set bit 0
// 2. Clear bit 3
// 3. Toggle bit 5
// 4. Check whether bit 2 is set

// Then print:

// ORIGINAL       : 42
// AFTER SET 0   : xxx
// AFTER CLEAR 3 : xxx
// AFTER TOGGLE 5: xxx
// BIT 2 SET?    : YES/NO


package operators.bitwise;

public class Ques2 {
    public static void main(String[] args) {
        int number = 42;

        int set0 = number | 1;
        int clear3 = number & ~(1 << 3);
        int toggle5 = number ^ (1 << 5);

        int bit2 = (number & (1 << 2)) >> 2;
        String bit2set = "";

        if (bit2 == 1) {
            bit2set = "YES";
        }
        else{
            bit2set = "NO";
        }

        System.out.println("NUMBER          : " + number);
        System.out.println("AFTER SET 0     : " + set0);
        System.out.println("AFTER CELAR 3   : " + clear3);
        System.out.println("AFTER TOGGLE 5  : " + toggle5);
        System.out.println("BIT 2 SET ?     : " + bit2set);
    }
}
