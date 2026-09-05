// write a Java program that starts with:

// int x = 10;
// and performs this exact sequence:
// int a = x++ + ++x;
// int b = --x + x--;
// int c = x++ + x++ + ++x;

// Then print:
// A : ?
// B : ?
// C : ?
// FINAL X : ?

package operators.incrementdecrement;

public class Ques2 {
    public static void main(String[] args) {
        int x = 10;
        int a = x++ + ++x;
        int b = --x + x--;
        int c = x++ + x++ + ++x;
        

        System.out.println("A        : " + a);
        System.out.println("B        : " + b);
        System.out.println("C        : " + c);
        System.out.println("FINAL X  : "  + x);

    }
}
