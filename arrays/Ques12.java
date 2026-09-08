// THE MAXIMUM SUBARRAY SUM

// Given:
// int[] numbers = {-2, 3, -1, 5, -6, 4, 2, -1, 3};


// in this particular question subarray is resticted to three elements only.

// A subarray means a contiguous portion of the array.

// For example:
// {3, -1, 5}
// is a subarray.

// But:
// {3, 5}
// is NOT a subarray because -1 was skipped.

// Your job:
// Find the contiguous subarray having the largest sum.

// Your output should contain:

// MAX SUM      : ?
// START INDEX  : ?
// END INDEX    : ?
// SUBARRAY     : ?

package arrays;

public class Ques12 {
    public static void main(String[] args) {
        int[] numbers = { -2, 3, -1, 5, -6, 4, 2, -1, 3 };
        int index = 0;
        int n = 0;
        int sum = 0;
        int prevsum = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (index < (numbers.length - 2) && n < numbers.length) {
                for (int j = 0; j < 3; j++) {
                    sum += numbers[index];
                    index++;
                }

                if (sum >= prevsum) {
                    prevsum = sum;
                    sum = 0;
                    index = n;
                    n += 1;
                } else {
                    index = n;
                    sum = 0;
                    n += 1;
                }
            }
        }

        System.out.println(prevsum);

    }
}
