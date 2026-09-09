// Frequency Battle. 😈

// int[] numbers = {
//     5, 2, 8, 5, 3, 2, 5, 8, 9, 3, 2, 8
// };

// Find:
// MOST FREQUENT NUMBER FREQUENCY
// LEAST FREQUENT NUMBER FREQUENCY

package practice;

public class Ques8 {
    public static void main(String[] args) {
        int[] numbers = { 5, 2, 8, 5, 3, 2, 5, 8, 9, 3, 2, 8 };
        int largestfreq = 0;
        int smallestfreq = Integer.MAX_VALUE;
        int mostfrequent = 0;
        int leastfrequent = 0;
        int[] previous = new int[numbers.length];

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

            previous[i] = number;
            if (count < smallestfreq) {
                smallestfreq = count;
                leastfrequent = numbers[i];
            }

            if (count > largestfreq) {
                largestfreq = count;
                mostfrequent = numbers[i];
            }

        }

        System.out.println("LARGEST FREQEUNCY        : " + largestfreq);
        System.out.println("MOST FREQUENT NUMBER     : " + mostfrequent);
        System.out.println("SMALLEST FREQEUNCY       : " + smallestfreq);
        System.out.println("LEAST FREQUENT NUMBER    : " + leastfrequent);
    }
}
