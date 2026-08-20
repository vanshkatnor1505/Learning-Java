// The Number Lock

// GIVEN :: 
// int number = 58372;

// TO DO ::
// The lock is considered VALID only if all of the following rules are satisfied.

// Rule 1 — First and last digit
// The first digit must be greater than the last digit.

// Rule 2 — Middle digit
// The middle digit must be strictly between the second and fourth digits.
// In other words, either:
// second > third > fourth
// or:
// second < third < fourth

// Rule 3 — Digit sum
// The sum of all five digits must be greater than 20 but less than 30.

// Rule 4 — No duplicate adjacent digits
// These must all be true:
// first != second
// second != third
// third != fourth
// fourth != fifth

// Rule 5 — Exactly two even digits
// The number must contain exactly two even digits.
// Not at least two.
// Not exactly two distinct even values.
// Exactly two positions containing even digits.

// Rule 6 — Secret checksum
// Calculate:
// (first × fifth) + (second × fourth)
// The checksum must be divisible by 7.

// EXPECTED OUTPUT ::
// Your program should calculate and display:
// NUMBER       : 58372
// DIGIT SUM    : ?
// EVEN DIGITS  : ?
// CHECKSUM     : ?
// VALID        : true/false

package conditional;

public class Ques4 {
    public static void main(String[] args) {
        int  number = 12345;
        boolean exactlyTwoEven = false;
        

        int first = (number/10000);
        int second = (number/1000)%10;
        int third = (number/100)%10;
        int fourth = (number/10)%10;
        int fifth = (number)%10;

        int checksum = (first * fifth) + (second * fourth) ;
        boolean valid = false;

        int sum = (first + second + third + fourth + fifth);

        if ((first % 2 == 0 && second % 2 == 0 && third % 2 != 0 && fourth % 2 != 0 && fifth % 2 != 0) || (first % 2 == 0 && second % 2 != 0 && third % 2 == 0 && fourth % 2 != 0 && fifth % 2 != 0) || (first % 2 == 0 && second % 2 != 0 && third % 2 != 0 && fourth % 2 == 0 && fifth % 2 != 0) || (first % 2 == 0 && second % 2 != 0 && third % 2 != 0 && fourth % 2 != 0 && fifth % 2 == 0) ) {
            exactlyTwoEven = true;
        }
        else if ((first % 2 != 0 && second % 2 == 0 && third % 2 == 0 && fourth % 2 != 0 && fifth % 2 != 0) || (first % 2 != 0 && second % 2 == 0 && third % 2 != 0 && fourth % 2 == 0 && fifth % 2 != 0) ||  (first % 2 != 0 && second % 2 == 0 && third % 2 != 0 && fourth % 2 != 0 && fifth % 2 == 0)) {
            exactlyTwoEven = true;
        }
        else if ((first % 2 != 0 && second % 2 != 0 && third % 2 == 0 && fourth % 2 == 0 && fifth % 2 != 0) || (first % 2 != 0 && second % 2 != 0 && third % 2 == 0 && fourth % 2 != 0 && fifth % 2 == 0) ) {
            exactlyTwoEven = true;
        }
        else if ((first % 2 != 0 && second % 2 != 0 && third % 2 != 0 && fourth % 2 == 0 && fifth % 2 == 0)) {
            exactlyTwoEven = true;
        }
        

        if ((first > fifth) && ((second > third &&  third > fourth) || (second < third && third < fourth)) && (sum > 20 && sum < 30) && (first != second && second != third && third != fourth && fourth != fifth) && exactlyTwoEven && checksum % 7 == 0 ) {
            valid = true;
        }
        System.out.println("NUMBER      : " + number);
        System.out.println("DIGIT SUM   : " +  sum);
        System.out.println("CHECK SUM   : " + checksum);
        System.out.println("VALID       : " + valid);
    }
}
