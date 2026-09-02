// Maximum & Minimum

// Now we're stepping it up.

// Given:
// int[] numbers = {42, 17, 89, 3, 56, 91, 24, 8};

// ASSUMTION :
// array can contain negative and positive values and also zero. 

// Find:
// LARGEST  : 91
// SMALLEST : 3

package arrays;

public class Ques6 {
    public static void main(String[] args) {
        int[] numbers = {10, 5};
        int largest = numbers[0];
        int smallest = numbers[0]; 


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("LARGEST  : " + largest);
        System.out.println("SMALLEST : " + smallest);
    }    
}
