// Write a program for:

// int n = 10;
// Find and print all numbers from 1 to n that are prime, but you must also print their position among the prime numbers.

// Expected for n = 10:
// PRIME #1 : 2
// PRIME #2 : 3
// PRIME #3 : 5
// PRIME #4 : 7

// TOTAL PRIMES : 4

// For:
// int n = 30;

// it should automatically find all primes up to 30.

package loops.forloop;

public class Ques10 {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;

        for (int i = 2; i <= n; i++) {

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count ++;
                System.out.println("Prime #" + count + " : " + i);
            }
        }

    }
}
