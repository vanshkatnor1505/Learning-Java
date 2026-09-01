// Array + For Loop

// Now we're introducing the thing that makes arrays actually powerful.

// Given:

// int[] numbers = {12, 7, 25, 4, 18, 9, 31};

// Write a program that prints:

// 12
// 7
// 25
// 4
// 18
// 9
// 31


package arrays;

public class Ques2 {
    public static void main(String[] args) {
        int[] numbers = {12,7,25,4,18,9,31};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("INDEX " + i + " : " + numbers[i]);
        }
    }
    
}
