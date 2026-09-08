// THE MAXIMUM SUBARRAY SUM

// Given:
// int[] numbers = {-2, 3, -1, 5, -6, 4, 2, -1, 3};

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

public class Ques13 {

    public static void main(String[] args) {

        int[] numbers = {-8, -3, -10, -2, -6};


        int currentSum = numbers[0];
        int maxSum = numbers[0];

        int currentStart = 0;
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > currentSum + numbers[i]) {
                currentSum = numbers[i];
                currentStart = i;
            } else {
                currentSum += numbers[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                startIndex = currentStart;
                endIndex = i;
            }
        }

        System.out.println("MAX SUM      : " + maxSum);
        System.out.println("START INDEX  : " + startIndex);
        System.out.println("END INDEX    : " + endIndex);

        System.out.print("SUBARRAY     : {");

        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(numbers[i]);

            if (i < endIndex) {
                System.out.print(", ");
            }
        }

        System.out.println("}");
    }
}
