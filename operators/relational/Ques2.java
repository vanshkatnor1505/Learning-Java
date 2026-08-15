package operators.relational;

// Boundary Collision

// GIVEN ::: int score = 85;

// RULES :: 
// score < 40   → failed
// score >= 40  → passed
// score >= 75  → distinction

// RESTRICTIONS ::: cannot use if 


public class Ques2 {
    public static void main(String[] args) {
        int score = 85;

        boolean failed = score < 40;
        boolean passed = score >= 40;
        boolean distinction = score >= 75;

        System.out.println("FAILED      : " + failed);
        System.out.println("PASSED      : " + passed);
        System.out.println("DISTINCTION : " + distinction);
    }
}
