// Reverse Traversal

// Now let's see if you actually understand the relationship between:

// length
// last index
// i--

// Given:

// int[] numbers = {12, 7, 25, 4, 18, 9, 31};

// Print the array in reverse order:

// 31
// 9
// 18
// 4
// 25
// 7
// 12


package arrays;

public class Ques3 {
    public static void main(String[] args) {
        int[] numbers = {12,7,25,4,18,9,31};

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("INDEX " + i + " : " + numbers[i]);
        }
    }    
}
