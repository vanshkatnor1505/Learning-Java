// Write the code for:

// int x = 20;
// int a = ++x - x++;
// int b = x-- + --x;
// int c = x++ - --x + ++x;

// Print:
// A       : ?
// B       : ?
// C       : ?
// FINAL X : ?

// Rules
// Don't modify the expressions.
// Don't manually calculate the values in your code.
// Let Java evaluate them.
// Before running it, calculate what you think the output will be.

package operators.incrementdecrement;

public class Ques3 {
    public static void main(String[] args) {
        int x = 20;
        int a = ++x - x++;
        int b = x-- + --x;
        int c = x++ - --x + ++x;

        System.out.println("A        : " + a);
        System.out.println("B        : " + b);
        System.out.println("C        : " + c);
        System.out.println("FINAL X  : " + x);
    }
}
