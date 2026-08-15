package operators.assignment;

// Assignment Operator Constraint Challenge

// GIVEN ::: 
// int a = 17;
// int b = 5;

// EXPECTED OUTPUT :::
// a = 3
// b = 2

// CONDITION :: your solution must contain:
// exactly one a += b;
// exactly one b -= a;
// exactly one a *= b;
// exactly one b /= a;
// exactly one a %= b;

public class Ques4 {
    public static void main(String[] args) {
        int a = 17;
        int b = 5;

        a /= b;
        b -= a;

        System.out.println(a);
        System.out.println(b);
    }
}
