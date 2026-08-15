package operators.assignment;

// State Mutation Puzzle

// GIVEN :::
// int a = 8;
// int b = 3;

// REQUIRED ::: 
// a = 24
// b = 5

// no third variable allowed only assignemnt operators can be used.
public class Ques3 {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;

        System.out.println(a *= 3);
        System.out.println(b += 2);
    }
}
