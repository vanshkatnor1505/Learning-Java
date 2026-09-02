// The Classic Array Problem

// Now we're going after something slightly more interesting.
// Given:
// int[] numbers = {12, 45, 7, 89, 23, 56, 89, 34};

// Find:
// LARGEST        : 89
// SECOND LARGEST : 56

// for
// int[] numbers = {20, 20, 20};

// Expected:
// LARGEST        : 20
// SECOND LARGEST : NO SECOND LARGEST

package arrays;

public class Ques7 {
    public static void main(String[] args) {

        int[] numbers = { 10, 5, 20, 8, 20, 15, 3 };

        int largest = numbers[0];
        int secondlargest = numbers[0];

        boolean hasSecondLargest = false;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                secondlargest = largest;
                largest = numbers[i];
                hasSecondLargest = true;
            }

            else if (numbers[i] < largest &&
                    (!hasSecondLargest || numbers[i] > secondlargest)) {
                secondlargest = numbers[i];
                hasSecondLargest = true;
            }
        }

        System.out.println("LARGEST        : " + largest);

        if (hasSecondLargest) {
            System.out.println("SECOND LARGEST : " + secondlargest);
        } else {
            System.out.println("SECOND LARGEST : NO SECOND LARGEST");
        }
    }
}