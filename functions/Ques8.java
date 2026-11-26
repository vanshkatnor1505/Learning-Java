/*
 Todo: Write a Java program to calculate the sum of digits of a number using recursion.

For example:
Input:
Enter a number: 12345

Expected output:
Sum of digits: 15
 */

package functions;

public class Ques8 {
    int submission = 0;

    int sum(int n) {

        if (n > 0) {
            submission = submission + (n % 10);
            return sum(n / 10);
        }

        else {
            return submission;
        }

    }

    public static void main(String[] args) {
        Ques8 s1 = new Ques8();

        int a = s1.sum(1234);

        System.out.println(a);
    }
}
