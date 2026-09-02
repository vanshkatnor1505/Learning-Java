// Find the First Occurrence

// Given:
// int[] numbers = {4, 7, 2, 9, 7, 3, 7, 4};
// int target = 7;

// Find the index of the first occurrence of target.

// Expected:
// TARGET          : 7
// FIRST OCCURRENCE: INDEX 1

// If the target doesn't exist, print:
// TARGET          : 10
// FIRST OCCURRENCE: NOT FOUND

package arrays;

public class Ques9 {
    public static void main(String[] args) {
        int[] numbers = { 4, 7, 2, 9, 7, 3, 7, 4 };
        int target = 4;
        int index = 0;
        boolean occurrence = false;

        System.out.println("TARGET            : " + target);
        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                index = i;
                occurrence = true;
                System.out.println("FIRST OCCURRENCE  : INDEX " + index);
                break;
            }

        }
        if (!occurrence) {
            System.out.println("FIRST OCCURRENCE  : NOT FOUND ");
        }
    }
}
