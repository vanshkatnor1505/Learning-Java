// Digit Processing

// GIVEN ::::
// int number = 58372;

// Using a while loop, calculate:

// The number of digits
// The sum of all digits

package loops.whileloop;

public class Ques3 {
    public static void main(String[] args) {
        int number =  58372;
        int count = 0;
        int sum = 0;

        while (number !=0) {
            int digit = number % 10;
            sum += digit;
            count ++;
            number = number / 10;
        }
        
        System.out.println("COUNT : " + count);
        System.out.println("SUM   : " + sum);
    }    
}
