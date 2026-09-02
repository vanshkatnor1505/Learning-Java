// Count Occurrences of EVERY Element

// Now we're stepping up.
// Given:
// int[] numbers = {4, 7, 2, 7, 9, 7, 3, 4, 2};

// Produce:
// 4 -> 2
// 7 -> 3
// 2 -> 2
// 9 -> 1
// 3 -> 1

package arrays;

public class Ques10 {
    public static void main(String[] args) {

        int[] numbers = { 4, 7, 2, 7, 9, 7, 3, 4, 2 };
        int[] previous = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            int number = numbers[i];
            boolean alreadyFound = false;

            for (int k = 0; k < i; k++) {

                if (previous[k] == number) {
                    alreadyFound = true;
                    break;
                }
            }

            if (alreadyFound) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < numbers.length; j++) {

                if (numbers[j] == number) {
                    count++;
                }
            }

            System.out.println(number + " -> " + count);

            previous[i] = number;
        }
    }
}