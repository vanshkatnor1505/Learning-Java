package operators.relational;

// Find the Impossible State

// GIVEN :: 
// int a = 10;
// int b = 20;
// int c = 30;

// CREATE THIS CONDITIONS :::
// Condition 1
// a is smaller than b, and b is smaller than c.

// Condition 2
// a is greater than c.

// Condition 3
// a, b, and c are all equal.

// Condition 4
// Exactly one of these is true:
// a > b
// b > c
// c > a

// RESTRICTIONS :::
// You can only use:
// >, <, >=, <=, ==, !=
// &&, ||, !

public class Ques3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        boolean condition1 = a < b && b < c;
        boolean condition2 = a > c;
        boolean condition3 = a == b && b == c;
        boolean condition4 = (a > b && !(b > c) && !(c > a)) || (!(a > b) && (b > c) && !(c > a)) || (!(a > b) && !(b > c) && (c > a));

        System.out.println(condition1);
        System.out.println(condition2);
        System.out.println(condition3);
        System.out.println(condition4);
        
    }
}
