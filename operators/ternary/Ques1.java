// Write a program with:
// int number = 27;

// Using only a ternary operator for the actual decision, determine:
// Whether the number is positive or negative
// Whether it is even or odd

// Print:
// NUMBER : 27
// SIGN   : POSITIVE
// PARITY : ODD

package operators.ternary;

public class Ques1 {
    public static void main(String[] args) {
        int number = 27;
        String sign = (number > 0) ? "POSITIVE" : "NEGATIVE";
        String parity = (number % 2 == 0) ? "EVEN" : "ODD";
        
        System.out.println("NUMBER   : " + 27);
        System.out.println("SIGN     : " + sign);
        System.out.println("PARITY   : " + parity);
    }
}
