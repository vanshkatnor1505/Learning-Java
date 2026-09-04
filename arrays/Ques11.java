// THE ARRAY DETECTIVE

// You are given an array containing integers.
// int[] numbers = {
//     10, 4, 7, 10, 3, 8, 4, 15,
//     7, 2, 8, 10, 6, 3, 15, 9,
//     2, 11, 6, 7, 4
// };

// Your program must analyze the array and determine:

// 1. First unique element
// Find the first element that occurs exactly once.

// Expected:
// FIRST UNIQUE       : 9

// 2. Most frequent element
// Find the element with the highest frequency.

// Expected:
// MOST FREQUENT      : 10
// FREQUENCY          : 3

// If multiple elements have the same highest frequency, choose the one that appears first in the original array.

// 3. Second most frequent DISTINCT element
// Find the second-highest frequency among distinct values.
// For this array:
// 10 -> 3
// 4  -> 3
// 7  -> 3
// 3  -> 2
// 8  -> 2
// 15 -> 2
// 2  -> 2
// 6  -> 2
// 9  -> 1
// 11 -> 1

// The highest frequency is 3.
// The second-highest distinct frequency is 2.

// If multiple values have that frequency, choose the one appearing first.
// Expected:
// SECOND FREQUENT   : 3
// FREQUENCY          : 2

// 4. Most frequent EVEN element
// Find the even number occurring most frequently.
// Expected:
// MOST FREQUENT EVEN : 4
// FREQUENCY          : 3

// Again, ties → first appearance wins.

// 5. Most frequent ODD element
// Find the odd number occurring most frequently.
// Expected:
// MOST FREQUENT ODD  : 7
// FREQUENCY          : 3

// 6. Frequency report
// Finally print every distinct element once, in its original order:
// 4  -> 3
// 7  -> 3
// 10 -> 3
// 3  -> 2
// 8  -> 2
// 15 -> 2
// 2  -> 2
// 6  -> 2
// 9  -> 1
// 11 -> 1

package arrays;

public class Ques11 {
    public static void main(String[] args) {
        int[] numbers = {
                10, 4, 7, 10, 3, 8, 4, 15,
                7, 2, 8, 10, 6, 3, 15, 9,
                2, 11, 6, 7, 4
        };

        // First unique element
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count ++;
                }
            }
            if (count == 1) {
                System.out.println("FIRST UNIQUE : " + numbers[i]);
                break;
            }
            else{
                count = 0;
            }
            
        }
    }
}
