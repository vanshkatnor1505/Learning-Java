// The Number Intelligence Engine
// Write a Java program that analyzes every integer from 1 to 1000 and identifies numbers satisfying different mathematical properties.

// You must use for loops.

// Part 1 — Perfect Numbers
// A number is perfect if the sum of its proper divisors equals the number itself.

// Example:
// 6 → divisors: 1, 2, 3
// 1 + 2 + 3 = 6
// Your program must find all perfect numbers from 1 to 1000.

// Expected:
// PERFECT NUMBERS:
// 6
// 28
// 496

// Part 2 — Prime Numbers
// Find the total number of prime numbers between 1 and 1000.
// You don't need to print every prime.
// Print:
// TOTAL PRIMES : xxx

// Part 3 — Armstrong Numbers
// Find every 3-digit Armstrong number between 100 and 999.

// A 3-digit number is Armstrong if:
// abc → a³ + b³ + c³ = abc

// For example:
// 153
// 1³ + 5³ + 3³
// = 1 + 125 + 27
// = 153

// Print:
// ARMSTRONG NUMBERS:
// 153
// 370
// 371
// 407

// Part 4 — Digit Intelligence
// For every number from 1 to 1000, determine its digit sum.
// Find:
// A. Number with the largest digit sum
// Print:
// LARGEST DIGIT SUM NUMBER : xxx
// DIGIT SUM                : xxx

// B. Number with the smallest digit sum
// Print:
// SMALLEST DIGIT SUM NUMBER : xxx
// DIGIT SUM                 : xxx

// If multiple numbers have the same sum, keep the first one encountered.

package loops.forloop;

public class Ques2 {
    public static void main(String[] args) {
        int count = 0;


        // Perfect numbers
        System.out.println("PERFECT NUMBERS");
        for (int i = 1; i <= 1000; i++) {
            int sum = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum == i) {
                System.out.println(i);
            }
        }

        // Prime numbers
        for (int l = 1; l <= 1000; l++) {

            boolean isPrime = true;

            if (l < 2) {
                isPrime = false;
            }

            for (int k = 2; k * k <= l; k++) {
                if (l % k == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }

        }

        System.out.println("ARMSTRONG NUMBERS : ");
        for (int m = 100; m < 1000; m++) {

            int temp = m;
            int Armstrongsum = 0;

            for (int i = 1; i < 4; i++) {
                int digit = temp % 10;
                Armstrongsum += digit * digit * digit;
                temp /= 10;
            }

            if (Armstrongsum == m) {
                System.out.println(m);
            }
        }

        int largestSum = 0;
        int largestNumber = 0;

        int smallestSum = 99;
        int smallestNumber = 0;

        for (int i = 1; i <= 1000; i++) {

            int temp = i;
            int digitSum = 0;

            for (; temp != 0; temp /= 10) {
                int digit = temp % 10;
                digitSum += digit;
            }

            if (digitSum > largestSum) {
                largestSum = digitSum;
                largestNumber = i;
            }

            if (digitSum < smallestSum) {
                smallestSum = digitSum;
                smallestNumber = i;
            }
        }
        System.out.println("PRIME NUMBERS : " + count);
        System.out.println("LARGEST SUM IS " + largestSum);
        System.out.println("SMALLEST SUM IS " + smallestSum);

    }
}