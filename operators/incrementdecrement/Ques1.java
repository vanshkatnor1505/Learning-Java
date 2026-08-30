// Increment/Decrement — Q1

// Write a Java program:
// int x = 10;

// Perform these operations in order:
// Post-increment x
// Pre-increment x
// Post-decrement x
// Pre-decrement x

// After each operation, print the value of x.
// Expected structure:
// INITIAL : 10
// AFTER x++ : ?
// AFTER ++x : ?
// AFTER x-- : ?
// AFTER --x : ?



package operators.incrementdecrement;

public class Ques1 {
    public static void main(String[] args) {
        int x = 10;
        int a = x++;
        int b = ++x;
        int c = x--;
        int d = --x;

        System.out.println("INITIAL    : " + x);
        System.out.println("AFTER x++  : " + a);
        System.out.println("AFTER ++x  : " + b);
        System.out.println("AFTER x--  : " + c);
        System.out.println("AFTER --x  : " + d);
    }
    
}
