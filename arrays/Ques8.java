// Frequency of a Number

// Given:
// int[] numbers = {4, 7, 2, 7, 9, 7, 3, 4, 7};
// int target = 7;

// Find how many times target appears.

// Expected:
// TARGET    : 7
// FREQUENCY : 4


// And then test it with:
// int target = 4;

// Expected:
// FREQUENCY : 2

package arrays;

public class Ques8 {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 7, 9, 7, 3, 4, 7};
        int target = 7;
        int frequency = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                frequency ++;
                
            }
        }
        System.out.println("TARGET    : " + target);
        System.out.println("FREQUENCY : " + frequency);
    }
}
