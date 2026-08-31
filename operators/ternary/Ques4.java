// Grade + Result Engine

// Write a Java program with:
// int marks = 83;

// Your program must determine both grade and result using ternary operators.
// Grade rules
// 90–100 → A
// 80–89  → B
// 70–79  → C
// 60–69  → D
// Below 60 → F
// Result rules
// marks >= 40 → PASS
// marks < 40  → FAIL

// Print:
// MARKS  : 83
// GRADE  : B
// RESULT : PASS

package operators.ternary;

public class Ques4 {
    public static void main(String[] args) {
        int marks = 83;

        char grade = (marks >= 90) ? 'A' : (marks >= 80) ? 'B' : (marks >= 70) ? 'C' : (marks >= 60) ? 'D' : 'F';

        String result = (marks >= 40) ? "PASS" : "FAIL";

        System.out.println("MARKS  : " + marks);
        System.out.println("GRADE  : " + grade);
        System.out.println("RESULT : " + result);
    }
}
