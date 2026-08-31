// Maximum of Three

// Given:
// int a = 25;
// int b = 72;
// int c = 48;

// Find the largest number using only ternary operators.

// Print:
// A       : 25
// B       : 72
// C       : 48
// LARGEST : 72


package operators.ternary;

public class Ques2 {
    public static void main(String[] args) {
        int a = 25;
        int b = 72;
        int c = 48;
        int largest = (a > b) ? a : b;
        largest = (largest > c) ? largest : c;

        System.out.println("A       : " + a);
        System.out.println("B       : " + b);
        System.out.println("C       : " + c);
        System.out.println("LARGEST : " + largest);
    }
}
