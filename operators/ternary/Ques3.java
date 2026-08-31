// Zero Enters the Chat

// Now fix the weakness from Q1.

// Given:
// int number = 0;

// Determine its sign using a ternary operator.
// Your output should be:
// NUMBER : 0
// SIGN   : ZERO

// Your program must correctly handle all three cases:
// positive → POSITIVE
// negative → NEGATIVE
// zero     → ZERO

package operators.ternary;


public class Ques3 {
    public static void main(String[] args) {
        int number = 0;
        String sign = (number > 0) ? "POSITIVE" : (number == 0) ? "ZERO" : "NEGATIVE";
        System.out.println("NUMBER : " + number);
        System.out.println("SIGN   : " + sign);
    }
}
