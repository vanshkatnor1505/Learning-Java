package operators.relational;

// Final Relational Challenge

// GIVEN :::
// int a = 12;
// int b = 18;
// int c = 15;

// EXPECTED RESULT ::
// result should be true only if:

// a is the smallest of the three
// c is between a and b
// a, b, and c are all different


public class Ques4 {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        int c = 25;

        boolean result = (a < b && a < c) && (a < c && c < b) && (a != b && b != c && c != a);
        System.out.println("RESULT : " + result);
    }
}
