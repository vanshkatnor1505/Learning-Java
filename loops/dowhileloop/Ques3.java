// Digit Analyzer with do-while

// GIVEN ::::
// int number = 58372;

// Build a program using a do-while loop that processes the digits of the number and determines:

// Required output
// NUMBER        : 58372
// DIGIT COUNT   : 5
// DIGIT SUM     : 25
// LARGEST DIGIT : 8
// SMALLEST DIGIT: 2
// Requirements

// Inside the do-while, you must:
// Extract each digit.
// Count the digits.
// Calculate the digit sum.
// Find the largest digit.
// Find the smallest digit.



// Important twist
// This time, the number may be 0.

// For:
// int number = 0;
// your program should produce:
// NUMBER        : 0
// DIGIT COUNT   : 1
// DIGIT SUM     : 0
// LARGEST DIGIT : 0
// SMALLEST DIGIT: 0

 
package loops.dowhileloop;


public class Ques3 {
    public static void main(String[] args) {
        int number = 12345;
        int count = 0;
        int temp = number;
        int sum = 0;
        int largest = 0;
        int smallest = 9;

        do{
            int digit = temp % 10;
            sum += digit;

            if (digit > largest) {
                largest = digit;
            }
            if(digit < smallest){
                smallest = digit;
            }

            temp /= 10;
            count ++;

        }while (temp > 0); 
            
        
        
        System.out.println("NUMBER          : " + number);
        System.out.println("DIGIT COUNT     : " + count);
        System.out.println("DIGIT SUM       : " + sum);
        System.out.println("LARGEST DIGIT   : " + largest);
        System.out.println("SMALLEST DIGIT  : " + smallest);
    }
}
