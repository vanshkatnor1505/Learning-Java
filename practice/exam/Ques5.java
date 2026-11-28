/*
* Create a Java program to calculate the power of a number using recursion
 */

package practice.exam;

public class Ques5 {
    int power(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {

        Ques5 obj = new Ques5();

        System.out.println("Result: " + obj.power(2, 3));
    }

}
