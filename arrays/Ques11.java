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
// MOST FREQUENT EVEN : 10
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
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("FIRST UNIQUE : " + numbers[i]);
                break;
            } else {
                count = 0;
            }

        }

        // Most frequent element
        int num = 0;
        int frequency = 0;
        int prevcount = 0;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    frequency++;
                }
            }
            if (frequency > prevcount) {
                prevcount = frequency;
                num = numbers[i];
                frequency = 0;

            } else {
                frequency = 0;
            }

        }
        System.out.println("MOST FREQUENT : " + num);
        System.out.println("FREQUENCY : " + prevcount);


        // Second most frequent DISTINCT element
        int num3 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    frequency3++;
                }
            }
            if (frequency3 > frequency4) {
                if (frequency3 > frequency4 && frequency3 < prevcount) {
                    frequency4 = frequency3;
                    num3 = numbers[i];
                }

                frequency3 = 0;

            } else {
                frequency3 = 0;
            }

        }
        System.out.println("SECOND LARGEST FREQUENCY : " + frequency4);
        System.out.println("SECOND FREQUENT NUMBER : " + num3);


        // Most frequent EVEN element
        int frequenteven = 0;
        int fefrequency = 0;
        int feprevcount = 0;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    fefrequency++;
                }
            }
            if (fefrequency > feprevcount  && numbers[i] % 2 == 0) {
                feprevcount = fefrequency;
                frequenteven = numbers[i];
                fefrequency = 0;

            } else {
                fefrequency = 0;
            }

        }
        System.out.println("MOST FREQUENT EVEN NUMBER: " + frequenteven);
        System.out.println("MOST FREQUENT EVEN FREQUENCY : " + feprevcount);

        // most frequent odd 
        int frequentodd = 0;
        int fofrequency = 0;
        int foprevcount = 0;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    fofrequency++;
                }
            }
            if (fofrequency > foprevcount  && numbers[i] % 2 != 0) {
                foprevcount = fofrequency;
                frequentodd = numbers[i];
                fofrequency = 0;

            } else {
                fofrequency = 0;
            }

        }
        System.out.println("MOST FREQUENT ODD NUMBER : " + frequentodd);
        System.out.println("MOST FREQUENT ODD FREQUENCY : " + foprevcount);


        // Frequency report
        int[] previous = new int[numbers.length];
        System.out.println("FRERQUENCY REPORT : ");
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

            System.out.println(number + "  ->  " + count);

            previous[i] = number;

        }
    }
}
