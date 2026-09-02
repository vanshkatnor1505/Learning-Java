// Sum + Average

// Now we're moving from accessing array elements to processing them.

// Given:
// int[] numbers = {12, 7, 25, 4, 18, 9, 31};

// Calculate and print:
// SUM     : 106
// AVERAGE : 15.142857...


package arrays;

public class Ques4 {
    public static void main(String[] args) {
        int[] numbers = {12,7,25,4,18,9,31};
        int sum = 0;
        float average;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        average = (float) sum/numbers.length;

        System.out.println("SUM       : " + sum);
        System.out.println("AVERAGE   : " + average);
        
    }
}
