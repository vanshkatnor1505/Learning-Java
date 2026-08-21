// GIVEN :::
// int number = 58372;

// Using a while loop, determine 
// the largest digit 
// smallest digit 
// Digit count
// Digit sum 
// Reversed number
// palindrome

// EXPECTED OUTPUT :::
// NUMBER    : 58372
// COUNT     : 5
// SUM       : 25
// LARGEST   : 8
// SMALLEST  : 2
// REVERSED  : 27385
// PALINDROME: false

package loops.whileloop;

public class Ques6 {
    public static void main(String[] args) {
        int number = 58372;
        int sum = 0;
        int temp = number;
        int reversed = 0;
        int largest = 0;
        int smallest = 9;
        int count = 0;
        

        while (temp != 0) {
            int digit = temp % 10;
            if (digit > largest) {
                largest = digit;
            }
            if (digit < smallest) {
                smallest =  digit;
            }
            sum += digit;
            count ++;
            reversed = (reversed * 10) + digit;
            temp /= 10;

        }
        boolean palindrome = number == reversed;

        System.out.println("ORIGNAL     : " + number ); 
        System.out.println("COUNT       : " + count ); 
        System.out.println("DIGIT SUM   : " + sum);
        System.out.println("LARGEST     : " + largest);
        System.out.println("SMALLEST    : " + smallest);
        System.out.println("REVERSED    : " + reversed);
        System.out.println("PALINDROME  : " + palindrome);


    }
}
