// NUMBER TRANSFORMATION

// GIVEN ::::
// int number = 58372;

// Using a while loop, determine:
// The reversed number
// The sum of its digits
// Whether the original number is a palindrome

// EXPECTED  OUTPUT :::
// ORIGINAL  : ...
// REVERSED  : ...
// DIGIT SUM : ...
// PALINDROME: ...

package loops.whileloop;

public class Ques5 {
    public static void main(String[] args) {
        int number = 58372;
        int sum = 0;
        int temp = number;
        int reversed = 0;
        boolean palindrome;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            reversed = (reversed * 10) + digit;
            temp /= 10;

        }
        if (number == reversed) {
            palindrome =   true;
        }else { palindrome =  false; }

        System.out.println("ORIGNAL     : " + number );  
        System.out.println("REVERSED    : " + reversed);
        System.out.println("DIGIT SUM   : " + sum);
        System.out.println("PALINDROME  : " + palindrome);

    }
}
