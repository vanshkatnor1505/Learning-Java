// SUM of n numbers

// GIVEN ::::
// int number = 1;
// int sum = 0;

// Using only a while loop, calculate the sum of all integers from 1 through 10.

package loops.whileloop;

public class Ques2 {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;

        while (number <= 10) {
            sum += number;
            number ++;
        }
        
        System.out.println("SUM IS : " + sum);
    }
}
